import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import org.apache.commons.io.FilenameUtils;

/**
 * Klasa do stworzenia pliku "program.bat" dodaj¹cego napisy idx do filmów i
 * tworz¹ce mkv w podanej œcie¿ce.
 * 
 * @author Samsung
 * 
 */
public class FileOperations {

	PrintWriter writer;
	ArrayList<String> videoFilesList;
	String mkvmergePath;
	String scPath;
	boolean ifMakeSUB;

	boolean makeTSMuxerSubs = true;
	String tsFontInfo;
	String tsFontInfoDefault;

	public FileOperations() {
		videoFilesList = new ArrayList<String>();
		ifMakeSUB = true;
		tsFontInfoDefault = "font-name=\"Arial\",font-size=62,font-color=0xffFFFF33,bottom-offset=70,font-border=5,text-align=center,video-width=1440,video-height=1080,fps=23.976";
		tsFontInfo = tsFontInfoDefault;
	}

	/**
	 * Konwersja srt->sub przy pomocy TSMuxera
	 * 
	 * @param videofile
	 */
	public void convertSRTtoSUBTS(String videofile) {
		String srtFile = FilenameUtils.removeExtension(videofile) + ".srt";
		String name = FilenameUtils.getBaseName(videofile);

		// plik meta

		String option1 = "MUXOPT --no-pcr-on-video-pid --new-audio-pes --demux --vbr  --vbv-len=500\nS_TEXT/UTF8, ";

		String option2 = "," + tsFontInfo;

		String ctext = option1 + "\"" + srtFile + "\"" + option2;

		PrintWriter writer2;
		try {
			writer2 = new PrintWriter("panas-programs\\"+name+".meta", "UTF-8");
			writer2.println(ctext);
			writer2.close();
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		// konwersja do sup

		ctext = "panas-programs\\tsMuxeR \"panas-programs\\"+name+".meta\" panas-programs\\sup";
		writer.println(ctext);
		
		ctext = "del \"panas-programs\\"+name+".meta\"";
		writer.println(ctext);

		// konwersja do sub
		srtFile = FilenameUtils.getBaseName(srtFile);
		String[] parts = srtFile.split("\\.");

		String output = "panas-programs\\sup\\tsSubs.idx";

		ctext = "java -jar panas-programs\\BDSup2Sub.jar -r 1440x1080 -S 0.8,1.0" + " -o " + output
				+ " \"panas-programs\\sup\\" + parts[0] + ".sup\"";
		writer.println(ctext);

		System.out.println(ctext);

	}

	/**
	 * Konwersja srt->sub przy pomocy SubtitleCreatora
	 * 
	 * @param videofile
	 */
	public void convertSRTtoSUB(String videofile) {
		String srtFile = FilenameUtils.removeExtension(videofile) + ".srt";
		String ctext = "\"" + scPath + "\"" + " " + "\"" + srtFile + "\""
				+ " -p1 -iVTS_01_0.IFO -vpl " + "\""
				+ FilenameUtils.removeExtension(videofile) + ".idx" + "\"";

		writer.println(ctext);

		ctext = "rename " + "\"" + FilenameUtils.removeExtension(videofile)
				+ ".idx" + "\" " + "\"" + FilenameUtils.getBaseName(videofile)
				+ "2.idx" + "\"";

		writer.println(ctext);

		ctext = "rename " + "\"" + FilenameUtils.removeExtension(videofile)
				+ ".sub" + "\" " + "\"" + FilenameUtils.getBaseName(videofile)
				+ "2.sub" + "\"";

		writer.println(ctext);

		// napis2:
		srtFile = FilenameUtils.removeExtension(videofile) + ".srt";
		ctext = "\"" + scPath + "\"" + " " + "\"" + srtFile + "\""
				+ " -p2 -iVTS_01_0.IFO -vpl " + "\""
				+ FilenameUtils.removeExtension(videofile) + ".idx" + "\"";

		writer.println(ctext);

		ctext = "rename " + "\"" + FilenameUtils.removeExtension(videofile)
				+ ".idx" + "\" " + "\"" + FilenameUtils.getBaseName(videofile)
				+ "1.idx" + "\"";

		writer.println(ctext);

		ctext = "rename " + "\"" + FilenameUtils.removeExtension(videofile)
				+ ".sub" + "\" " + "\"" + FilenameUtils.getBaseName(videofile)
				+ "1.sub" + "\"";

		writer.println(ctext);
		// ------

		// napis3:
		srtFile = FilenameUtils.removeExtension(videofile) + ".srt";
		ctext = "\"" + scPath + "\"" + " " + "\"" + srtFile + "\""
				+ " -p3 -iVTS_01_0.IFO -vpl " + "\""
				+ FilenameUtils.removeExtension(videofile) + ".idx" + "\"";

		writer.println(ctext);

		ctext = "rename " + "\"" + FilenameUtils.removeExtension(videofile)
				+ ".idx" + "\" " + "\"" + FilenameUtils.getBaseName(videofile)
				+ "3.idx" + "\"";

		writer.println(ctext);

		ctext = "rename " + "\"" + FilenameUtils.removeExtension(videofile)
				+ ".sub" + "\" " + "\"" + FilenameUtils.getBaseName(videofile)
				+ "3.sub" + "\"";

		writer.println(ctext);
		// ------

		// zmiana settingsów:
		ctext = "rename SubtitleCreator\\Data\\Settings.xml Settings-shadow.xml";
		writer.println(ctext);

		ctext = "rename SubtitleCreator\\Data\\Settings-plain.xml Settings.xml";
		writer.println(ctext);
		// -----------------

		// napis4:
		srtFile = FilenameUtils.removeExtension(videofile) + ".srt";
		ctext = "\"" + scPath + "\"" + " " + "\"" + srtFile + "\""
				+ " -p1 -iVTS_01_0.IFO -vit " + "\""
				+ FilenameUtils.removeExtension(videofile) + ".idx" + "\"";

		writer.println(ctext);

		ctext = "rename " + "\"" + FilenameUtils.removeExtension(videofile)
				+ ".idx" + "\" " + "\"" + FilenameUtils.getBaseName(videofile)
				+ "4.idx" + "\"";

		writer.println(ctext);

		ctext = "rename " + "\"" + FilenameUtils.removeExtension(videofile)
				+ ".sub" + "\" " + "\"" + FilenameUtils.getBaseName(videofile)
				+ "4.sub" + "\"";

		writer.println(ctext);
		// ------

		// napis4:
		srtFile = FilenameUtils.removeExtension(videofile) + ".srt";
		ctext = "\"" + scPath + "\"" + " " + "\"" + srtFile + "\""
				+ " -p2 -iVTS_01_0.IFO -vit " + "\""
				+ FilenameUtils.removeExtension(videofile) + ".idx" + "\"";

		writer.println(ctext);

		ctext = "rename " + "\"" + FilenameUtils.removeExtension(videofile)
				+ ".idx" + "\" " + "\"" + FilenameUtils.getBaseName(videofile)
				+ "5.idx" + "\"";

		writer.println(ctext);

		ctext = "rename " + "\"" + FilenameUtils.removeExtension(videofile)
				+ ".sub" + "\" " + "\"" + FilenameUtils.getBaseName(videofile)
				+ "5.sub" + "\"";

		writer.println(ctext);
		// ------

		// zmiana settingsów:
		ctext = "rename SubtitleCreator\\Data\\Settings.xml Settings-plain.xml";
		writer.println(ctext);

		ctext = "rename SubtitleCreator\\Data\\Settings-shadow.xml Settings.xml";
		writer.println(ctext);
		// -----------------

	}

	private void deleteSubs(String videofile) {
		String base = FilenameUtils.removeExtension(videofile);
		String ctext = "del " + base + "1.idx\"";
		writer.println(ctext);
		ctext = "del " + base + "1.sub\"";
		writer.println(ctext);

		ctext = "del " + base + "2.idx\"";
		writer.println(ctext);
		ctext = "del " + base + "2.sub\"";
		writer.println(ctext);

		ctext = "del " + base + "3.idx\"";
		writer.println(ctext);
		ctext = "del " + base + "3.sub\"";
		writer.println(ctext);

		ctext = "del " + base + "4.idx\"";
		writer.println(ctext);
		ctext = "del " + base + "4.sub\"";
		writer.println(ctext);

		ctext = "del " + base + "5.idx\"";
		writer.println(ctext);
		ctext = "del " + base + "5.sub\"";
		writer.println(ctext);

		ctext = "rmdir /Q /S panas-programs\\sup";
		writer.println(ctext);
	}

	/**
	 * Dodaje plikt .bat od stworzenia mkv z podanym filmem dodaj¹c napisy idx i
	 * srt. Polecenie zpisane do pliku po wywo³aniu close().
	 * 
	 * @param videoFile
	 *            film do stworzenia mkv
	 * @param path
	 *            œcie¿ka gdzie zostanie utworzone mkv
	 */
	public void createMKV(String videoFile, String path) {
		String subFile = FilenameUtils.removeExtension(videoFile) + "1.idx";
		String subFile2 = FilenameUtils.removeExtension(videoFile) + "2.idx";
		String subFile3 = FilenameUtils.removeExtension(videoFile) + "3.idx";
		String subFile4 = FilenameUtils.removeExtension(videoFile) + "4.idx";
		String subFile5 = FilenameUtils.removeExtension(videoFile) + "5.idx";

		String subTS = "panas-programs\\sup\\tsSubs.idx";

		String srtFile = FilenameUtils.removeExtension(videoFile) + ".srt";

		String outFile = "\""
				+ path
				+ "\\"
				+ FilenameUtils.removeExtension(FilenameUtils
						.getName(videoFile)) + "-PanaSubtitler.mkv" + "\"";

		if (new File(srtFile).exists() == true) {
			if (makeTSMuxerSubs == true)
				convertSRTtoSUBTS(videoFile);
			else
				subTS = "";

			if (ifMakeSUB == true) {
				this.convertSRTtoSUB(videoFile);
				subFile = "\"" + subFile + "\"";
				subFile2 = "\"" + subFile2 + "\"";
				subFile3 = "\"" + subFile3 + "\"";
				subFile4 = "\"" + subFile4 + "\"";
				subFile5 = "\"" + subFile5 + "\"";
			} else {
				subFile = "";
				subFile3 = "";
				subFile2 = "";
				subFile4 = "";
				subFile5 = "";
				System.out.println("Don't merge idx!");
			}
		} else
			subFile = "\"" + subFile + "\"";

		videoFile = "\"" + videoFile + "\"";

		boolean srtExist = new File(srtFile).exists();

		if (srtExist == false)
			srtFile = "";
		else
			srtFile = "\"" + srtFile + "\"";

		String ctext = "";
		if (srtExist)
			ctext = mkvmergePath + " -o " + " " + outFile + " " + videoFile
					+ " " + subTS + " " + subFile + " " + subFile2 + " "
					+ subFile3 + " " + subFile4 + " " + subFile5 + " "
					+ srtFile;
		else
			ctext = mkvmergePath + " -o " + " " + outFile + " " + videoFile;

		writer.println(ctext);

		if (ifMakeSUB == true)
			deleteSubs(videoFile);

	}

	public void open() {
		try {
			writer = new PrintWriter("program.bat", "UTF-8");
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void close() {
		writer.close();
	}

	/**
	 * Dodaje pliki video do listy videoFilesList.
	 * 
	 * @param folder
	 *            folder
	 * @param ext
	 *            rozszerzenie video
	 * @param FILE_DIR
	 *            folder
	 */
	public void listFiles(String folder, String ext, String FILE_DIR) {

		GenericExtFilter filter = new GenericExtFilter(ext);

		File dir = new File(folder);

		if (dir.isDirectory() == false) {
			System.out.println("Directory does not exists : " + FILE_DIR);
			if (!this.videoFilesList.contains(folder))
				this.videoFilesList.add(folder);
			return;
		}

		// list out all the file name and filter by the extension
		String[] list = dir.list(filter);

		if (list.length == 0) {
			System.out.println("no files end with : " + ext);
			return;
		}

		for (String file : list) {
			String temp = new StringBuffer(FILE_DIR).append(File.separator)
					.append(file).toString();
			System.out.println("file : " + temp);
			this.videoFilesList.add(temp);
		}
	}

	// inner class, generic extension filter
	public class GenericExtFilter implements FilenameFilter {

		private String ext;

		public GenericExtFilter(String ext) {
			this.ext = ext;
		}

		public boolean accept(File dir, String name) {
			return (name.endsWith(ext));
		}
	}

	public void setMkvmergePath(String mkvmergePath) {
		this.mkvmergePath = mkvmergePath;
	}

	public void setScPath(String scPath) {
		this.scPath = scPath;
	}

	public void setIfMakeSUB(boolean ifMakeSUB) {
		this.ifMakeSUB = ifMakeSUB;
	}

}
