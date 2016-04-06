panas-programs\tsMuxeR panas-programs\meta.meta panas-programs\sup
java -jar panas-programs\BDSup2Sub.jar -o panas-programs\sup\tsSubs.idx "panas-programs\sup\Catfish (2010).sup"
"panas-programs\SubtitleCreator\SubtitleCreator" "D:\download\Catfish (2010)\Catfish (2010).srt" -p1 -iVTS_01_0.IFO -vpl "D:\download\Catfish (2010)\Catfish (2010).idx"
rename "D:\download\Catfish (2010)\Catfish (2010).idx" "Catfish (2010)2.idx"
rename "D:\download\Catfish (2010)\Catfish (2010).sub" "Catfish (2010)2.sub"
"panas-programs\SubtitleCreator\SubtitleCreator" "D:\download\Catfish (2010)\Catfish (2010).srt" -p2 -iVTS_01_0.IFO -vpl "D:\download\Catfish (2010)\Catfish (2010).idx"
rename "D:\download\Catfish (2010)\Catfish (2010).idx" "Catfish (2010)1.idx"
rename "D:\download\Catfish (2010)\Catfish (2010).sub" "Catfish (2010)1.sub"
"panas-programs\SubtitleCreator\SubtitleCreator" "D:\download\Catfish (2010)\Catfish (2010).srt" -p3 -iVTS_01_0.IFO -vpl "D:\download\Catfish (2010)\Catfish (2010).idx"
rename "D:\download\Catfish (2010)\Catfish (2010).idx" "Catfish (2010)3.idx"
rename "D:\download\Catfish (2010)\Catfish (2010).sub" "Catfish (2010)3.sub"
rename SubtitleCreator\Data\Settings.xml Settings-shadow.xml
rename SubtitleCreator\Data\Settings-plain.xml Settings.xml
"panas-programs\SubtitleCreator\SubtitleCreator" "D:\download\Catfish (2010)\Catfish (2010).srt" -p1 -iVTS_01_0.IFO -vit "D:\download\Catfish (2010)\Catfish (2010).idx"
rename "D:\download\Catfish (2010)\Catfish (2010).idx" "Catfish (2010)4.idx"
rename "D:\download\Catfish (2010)\Catfish (2010).sub" "Catfish (2010)4.sub"
"panas-programs\SubtitleCreator\SubtitleCreator" "D:\download\Catfish (2010)\Catfish (2010).srt" -p2 -iVTS_01_0.IFO -vit "D:\download\Catfish (2010)\Catfish (2010).idx"
rename "D:\download\Catfish (2010)\Catfish (2010).idx" "Catfish (2010)5.idx"
rename "D:\download\Catfish (2010)\Catfish (2010).sub" "Catfish (2010)5.sub"
rename SubtitleCreator\Data\Settings.xml Settings-plain.xml
rename SubtitleCreator\Data\Settings-shadow.xml Settings.xml
"C:\Program Files\MKVToolNix\mkvmerge.exe" -o  "D:\download\Hector and the Search for Happiness (2014) [1080p]\Catfish (2010)-PanaSubtitler.mkv" "D:\download\Catfish (2010)\Catfish (2010).mp4" panas-programs\sup\tsSubs.idx "D:\download\Catfish (2010)\Catfish (2010)1.idx" "D:\download\Catfish (2010)\Catfish (2010)2.idx" "D:\download\Catfish (2010)\Catfish (2010)3.idx" "D:\download\Catfish (2010)\Catfish (2010)4.idx" "D:\download\Catfish (2010)\Catfish (2010)5.idx" "D:\download\Catfish (2010)\Catfish (2010).srt"
del "D:\download\Catfish (2010)\Catfish (2010)1.idx"
del "D:\download\Catfish (2010)\Catfish (2010)1.sub"
del "D:\download\Catfish (2010)\Catfish (2010)2.idx"
del "D:\download\Catfish (2010)\Catfish (2010)2.sub"
del "D:\download\Catfish (2010)\Catfish (2010)3.idx"
del "D:\download\Catfish (2010)\Catfish (2010)3.sub"
del "D:\download\Catfish (2010)\Catfish (2010)4.idx"
del "D:\download\Catfish (2010)\Catfish (2010)4.sub"
del "D:\download\Catfish (2010)\Catfish (2010)5.idx"
del "D:\download\Catfish (2010)\Catfish (2010)5.sub"
rmdir /Q /S panas-programs\sup
