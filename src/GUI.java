import java.awt.EventQueue;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.prefs.Preferences;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import java.awt.Font;

public class GUI extends JFrame {

	private JPanel mainPanel;
	private JTextField tfFolderIm;
	private JTextField tfFolderEx;
	private JLabel lblExportFolder;
	private JLabel lblFileList;
	JTextArea tsFontInfo;

	String exportPath = "Drop folder to select export path";
	String mkvmergePath = "Drop folder to select export path";
	private Preferences prefs;

	private JTextField tfDropMkvmerge;
	private JLabel lblMkvmergePath;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setTitle("PanaSubtitler by Mateusz Kaflowski");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 569);
		mainPanel = new JPanel();
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		mainPanel.setLayout(null);
		setContentPane(mainPanel);

		lblFileList = new JLabel("File list");
		lblFileList.setBounds(10, 123, 133, 14);
		mainPanel.add(lblFileList);

		final JTextArea taFileList = new JTextArea();
		taFileList.setLineWrap(true);
		taFileList.setBounds(20, 148, 711, 222);
		mainPanel.add(taFileList);

		JLabel lblImportFolder = new JLabel("Drop folder or files to import");
		lblImportFolder.setBounds(10, 15, 192, 14);
		mainPanel.add(lblImportFolder);

		lblExportFolder = new JLabel("Export folder");
		lblExportFolder.setBounds(10, 71, 133, 14);
		mainPanel.add(lblExportFolder);

		tfFolderIm = new JTextField();
		tfFolderIm.setText("Drop folder to import videos");
		tfFolderIm.setBounds(10, 40, 317, 20);
		mainPanel.add(tfFolderIm);
		tfFolderIm.setColumns(10);

		// Stworzenie obiektu FileOperations
		final FileOperations fo = new FileOperations();

		// dodanie opcji drag&drop do importu
		tfFolderIm.setDropTarget(new DropTarget() {
			@Override
			public synchronized void drop(DropTargetDropEvent evt) {
				try {
					evt.acceptDrop(DnDConstants.ACTION_COPY);
					List<File> droppedFiles = (List<File>) evt
							.getTransferable().getTransferData(
									DataFlavor.javaFileListFlavor);
					for (File file : droppedFiles) {
						System.out.println("dropped: " + file.toString());

						fo.listFiles(file.toString(), ".avi", file.toString());
						fo.listFiles(file.toString(), ".mkv", file.toString());
						fo.listFiles(file.toString(), ".mp4", file.toString());
						fo.listFiles(file.toString(), ".m4v", file.toString());

						tfFolderIm.setText("dropped: " + file.toString());

						// ustawienie textu listy
						taFileList.setText("");
						for (String file1 : fo.videoFilesList) {
							taFileList.setText(taFileList.getText()
									+ file1.toString() + "\n");
						}

					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});

		taFileList.setDropTarget(new DropTarget() {
			@Override
			public synchronized void drop(DropTargetDropEvent evt) {
				try {
					evt.acceptDrop(DnDConstants.ACTION_COPY);
					List<File> droppedFiles = (List<File>) evt
							.getTransferable().getTransferData(
									DataFlavor.javaFileListFlavor);
					for (File file : droppedFiles) {
						System.out.println("dropped: " + file.toString());

						fo.listFiles(file.toString(), ".avi", file.toString());
						fo.listFiles(file.toString(), ".mkv", file.toString());
						fo.listFiles(file.toString(), ".mp4", file.toString());
						fo.listFiles(file.toString(), ".m4v", file.toString());

						tfFolderIm.setText("dropped: " + file.toString());

						// ustawienie textu listy
						taFileList.setText("");
						for (String file1 : fo.videoFilesList) {
							taFileList.setText(taFileList.getText()
									+ file1.toString() + "\n");
						}

					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});

		// export folder
		tfFolderEx = new JTextField();
		tfFolderEx.setText(exportPath);
		tfFolderEx.setColumns(10);
		tfFolderEx.setBounds(10, 92, 317, 20);
		mainPanel.add(tfFolderEx);

		// dodanie opcji drag&drop do exportu
		tfFolderEx.setDropTarget(new DropTarget() {
			@Override
			public synchronized void drop(DropTargetDropEvent evt) {
				try {
					evt.acceptDrop(DnDConstants.ACTION_COPY);
					List<File> droppedFiles = (List<File>) evt
							.getTransferable().getTransferData(
									DataFlavor.javaFileListFlavor);
					exportPath = droppedFiles.get(0).toString();

					tfFolderEx.setText(droppedFiles.get(0).toString());

					prefs.put("exPath", droppedFiles.get(0).toString());

				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});

		// button EXPORT
		JButton btnExport = new JButton("EXPORT");
		btnExport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fo.tsFontInfo = tsFontInfo.getText();

				fo.open();
				for (String file : fo.videoFilesList) {

					// subtitleconverter:
					fo.setScPath("panas-programs\\SubtitleCreator\\SubtitleCreator");
					fo.createMKV(file, exportPath);
					System.out.println(file.toString());

				}
				fo.close();

				try {
					Runtime.getRuntime().exec("cmd /c start program.bat");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.exit(0);
			}
		});
		btnExport.setBounds(343, 497, 89, 23);
		mainPanel.add(btnExport);

		tfDropMkvmerge = new JTextField();
		tfDropMkvmerge.setText("Drop MKVMerge");
		tfDropMkvmerge.setColumns(10);
		tfDropMkvmerge.setBounds(366, 40, 285, 20);
		mainPanel.add(tfDropMkvmerge);
		tfDropMkvmerge.setText(mkvmergePath);

		// dodanie opcji drag&drop do mkvmerge path
		tfDropMkvmerge.setDropTarget(new DropTarget() {
			@Override
			public synchronized void drop(DropTargetDropEvent evt) {
				try {
					evt.acceptDrop(DnDConstants.ACTION_COPY);
					List<File> droppedFiles = (List<File>) evt
							.getTransferable().getTransferData(
									DataFlavor.javaFileListFlavor);

					System.out.println(droppedFiles.get(0).toString());

					tfDropMkvmerge.setText(droppedFiles.get(0).toString());
					mkvmergePath = "\"" + droppedFiles.get(0).toString() + "\"";
					fo.setMkvmergePath(mkvmergePath);

					prefs.put("mkvmergePath", mkvmergePath);

				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});

		lblMkvmergePath = new JLabel("MKVMerge path");
		lblMkvmergePath.setBounds(366, 15, 192, 14);
		mainPanel.add(lblMkvmergePath);

		// checkBox SubtitleCreator
		final JCheckBox chckbxCreateIdxSubs = new JCheckBox(
				"Create subs with modified SubtitleCreator");
		chckbxCreateIdxSubs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fo.setIfMakeSUB(chckbxCreateIdxSubs.isSelected());
				System.out.println(chckbxCreateIdxSubs.isSelected());
			}
		});
		chckbxCreateIdxSubs.setBounds(366, 114, 285, 23);
		chckbxCreateIdxSubs.setSelected(true);
		mainPanel.add(chckbxCreateIdxSubs);

		final JCheckBox chckbxCreateSubsTS = new JCheckBox(
				"Create subs with TSMuxer and BDSup2Sub");
		chckbxCreateSubsTS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fo.makeTSMuxerSubs = chckbxCreateSubsTS.isSelected();
				tsFontInfo.setEnabled(chckbxCreateSubsTS.isSelected());
			}
		});
		chckbxCreateSubsTS.setSelected(true);
		chckbxCreateSubsTS.setBounds(366, 88, 285, 23);
		mainPanel.add(chckbxCreateSubsTS);

		tsFontInfo = new JTextArea();
		tsFontInfo.setFont(new Font("Arial", Font.PLAIN, 10));
		tsFontInfo.setBounds(10, 405, 721, 23);
		tsFontInfo.setText(fo.tsFontInfo);
		mainPanel.add(tsFontInfo);

		JLabel lblTsSubsOptions = new JLabel("TS subs options:");
		lblTsSubsOptions.setBounds(10, 381, 133, 14);
		mainPanel.add(lblTsSubsOptions);

		// wczytanie preferencji:
		prefs = Preferences.userRoot().node(this.getClass().getName());
		exportPath = prefs.get("exPath", "Drop folder to select export path");
		mkvmergePath = prefs.get("mkvmergePath", "Drop mkvmerge");
		tsFontInfo.setText(prefs.get("TSSubInfo", fo.tsFontInfoDefault));
		
		tfFolderEx.setText(exportPath);
		tfDropMkvmerge.setText(mkvmergePath);
		
		JButton btnDefault = new JButton("default");
		btnDefault.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tsFontInfo.setText(fo.tsFontInfoDefault);
				prefs.put("TSSubInfo", tsFontInfo.getText());
			}
		});
		btnDefault.setBounds(20, 439, 89, 23);
		mainPanel.add(btnDefault);
		
		JLabel lblCreateVobsubs = new JLabel("Create VobSubs");
		lblCreateVobsubs.setBounds(366, 71, 133, 14);
		mainPanel.add(lblCreateVobsubs);
		
		JButton btnSave = new JButton("save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				prefs.put("TSSubInfo", tsFontInfo.getText());
			}
		});
		btnSave.setBounds(642, 439, 89, 23);
		mainPanel.add(btnSave);
		
		JButton btnYellow = new JButton("yellow");
		btnYellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tsFontInfo.setText("font-name=\"Arial\",font-size=62,font-color=0xffFFFF33,bottom-offset=70,font-border=5,text-align=center,video-width=1440,video-height=1080,fps=23.976");
			}
		});
		btnYellow.setBounds(119, 439, 89, 23);
		mainPanel.add(btnYellow);
		fo.setMkvmergePath(mkvmergePath);
	}
}
