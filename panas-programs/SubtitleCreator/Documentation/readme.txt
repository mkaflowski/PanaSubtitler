Installation:
Installation is simple - just run setup.exe file and follow the instruction.

Requirements:
However, note that you need to have the (free) .NET v2 framework installed on your PC (http://www.microsoft.com/downloads/details.aspx?familyid=0856EACB-4362-4B0D-8EDD-AAB15C5E04F5&displaylang=en), and a minimum screen resolution of 800x600. Additionally, in order to use the DVD preview features, you need to have DirectX installed as well.

TODO
- Writing CHG_COLCON settings in the Manipulate SUP window
- Importing background images - check aspect ratio settings

CHANGE LOG (INCOMPLETE):

New features:
* Allows selection of multiple elements using Ctrl and Shift for deletion.
* Use the default settings file for storing often used user selections, e.g. in the DVD Wizard, save the location of the Temp and Output folders.
* Improved the Google translate interface, allowing you to choose more languages than before, and include a delay (to prevent Google from blocking you).
* Minor improvement: DVD Wizard now checks whether the original movie has a menu (i.e. if there is an VTS_0X_0.VOB). If not, the option to retain the menu is disabled

Bug fixes:
* There is no more an exception when closing the DVD authoring wizard immediately after having started it.


Version 2.3rc1:
New features:
* Finish translation was added by Ropsi
* Added a snapshot feature (frame grabber), so you can take a snapshot of the DVD (including subtitles)
* It's now possible to specify the color and (semi)transparency per subtitle: transparency is no longer on/off, but can take a value between 0 (transparent) and 15 (opaque)
* You can import external images (GIF or PNG, (semi-)transparent): the images can be imported using the <p>ImageName.png</p> tags. Since regular subtitles may only contain four colours, the images may look different, since the colors will be mapped to the four most useful colors in the current palette. So changing the palette may give different results too. 
* You can mix and match subtitle sources, e.g. combine a SUP file with several images and regular text. When you save it to an SRT file, all SUPs and images will be saved as images.
* You can overrule not only the subtitle position (which was already possible), but also the color and transparency. The syntax is as follows:
<w x,y,width,#Lines ci=b,f,o,a,k t=b,f,o,a />
where the first part denotes the position of the subtitle area, ci is the color index in the current palette for background, foreground, outline, antialias, and karaoke, and t its transparency.
Note that the ci... part is optional, and that the height of the subtitle area is expressed as a number of lines in the current font.
* Added an option (Format|Render method|Drop shadow) to draw subtitles with a semi-transparent drop shadow
* Added opening binary subtitles inside the main window: basically, this makes the Manipulate SUP window superfluous.
* Added support for Drag-Drop of *.idx and *.sup files. Added support for Drag-Drop of color palette (in the color box).
* Minor improvement to the title display, so that the first and last part is always retained

Bug fixes:
* Fixed a remaining bug of the SRT to SUP conversion. When SC was generating a Subtitle with a solid background, the top left pixel was not set to the right color. This should be OK now.
* The Help->Manual command is working with Acrobat Reader 8.
* Restored the possibility to generate overlapping subtitles i.e. subtitles that have an infinite duration when the end time of one subtitles is equal to the start time of the next one OR better when the end time is 0, as was possible with version 2.1.
* Added the possibility to open SUP files where some SubPics have no STP_DSP, and show them having an end time of 0. This allows to conserve this information and write it again when saving the subtitle file.
* Fixed a bug in Google translate - still didn't protect against too frequent querries, causing Google to consider SC an automatic virus or something like that.
* Fixed HD-SUP reading bugs : see http://forum.doom9.org/showpost.php?p=1086426&postcount=287 and http://forum.doom9.org/showpost.php?p=1086901&postcount=288 for details of the bugs.
* Fixed an out of memory exception bug that occured when opening HD-SUP files thanks to the help of Wackyphill. Had to add a Gc.Collect(). Bug description here: http://forum.doom9.org/showpost.php?p=1089962&postcount=313
* Fixed a bug : when adding a negative delay (.srt and .sup files) there was an exception. See following thread: http://forum.doom9.org/showthread.php?p=1088131
* Fixed MRU bug : When opening a subtitle (srt) that SC finds corrupt, there is an exception but sometimes the subtitle is put in the MRU (Most Recently Used) list. When subsequently opening SC there always occurs an exception, bec. SC was trying to open this same file. This version of SC fixes this bug. Now the corrupt file is removed from the MRU list at the next opening.
* Fixed a long subtitle bug: when filling a whole page with subtitle text, the memory buffer was too small, causing the memorywriter to crash. 
* Fixed a bug when using the DVD wizard across different hard disks
* In case of languages without spaces, e.g. Chinese, I split the string at a point without spaces.
* When opening SUP files that have more than 1 SP_DCSQT, only the first one is used. This enhances the compatibility with DVDSupEncode. See following message for details about the solved problem: http://forum.doom9.org/showpost.php?p=1076316&postcount=281

Version 2.2:
* The "Use default subtitle colors" checkbox in the Manipulate SUP form is now reset when a new palette or VobSub file is open because it resets the palette. (It is not reset when opening a SUP file).
* Opening an idx file will automatically switch the interface to PAL or NTSC if needed.
* HDSUP subpicture is resized to PAL or NTSC according to the mode in which the Manipulate SUP window is set.
* In the Manipulate SUP, fixed the NTSC or PAL mode switch that was buggy.
* NTSC/PAL settings are set the same way in the main window and Manipulate SUP...
* Last used profile will be selected by default at next startup.
* Fixed a bug that didn't allow VobSub files to be used for synchronization the same way as SUP files.
* Profile manager starts with the active Profile.
* Warn for error can now being enabled only when errors'highlighting is enabled.
* Sup file names were always preceded by the temporary directory which was an error in the Wizard window. This has been corrected.
* Restored the possibility to use VobSub (.idx) files in the DVD authoring Wizard.
* Added a new check box in the DVD Authoring Wizard that allows to force the DVD colors to SC's prefered colors.

Version 2.2.2:
New features:
* Manusse implemented an option to read HD SUPs
* After switching between PAL-NTSC, the splitter distance is automatically adjusted
* Able to write CHG_COLCON instructions, so you can use an additional color for highlighting a word, e.g. for Karaoke, using <k>word</k>.
* Able to read CHG_COLCON instructions in Manipulate SUP - at least, test on mpucoder's example worked
* Able to import HD-SUP files (demuxed using EVODemux). HD-SUP files are converted to standart SUP files on the fly. They can then be processed as standart SUP files.

Bug fixes:
* When deleting subpics in the "Manipulate Sup and VobSub" menu, the selection goes to the next subtitles and not to the first one after the deletion.
* The "File -> Save VobSub as ..." and "File -> Save SUP as ..." menus have been fixed.
* (minor) Improved behaviour of Save SUP as and Save VobSub as
* DVD Wizard doesn't read the proper IFO file anymore (subtitles are not properly set, time is read wrong)
* VobSub save as - complaint is reported that it doesn't write

Version 2.1
New features:
* SC can now export/import color palettes with SUP files. The formats supported are .IFO, .clb (PgcEdit) and .mxp (Muxman). You can also copy/paste palette between SC and PgcEdit.
* Read and write VobSub files (sub/idx) the same way as sup files and create a VobSub file directly from a srt or sub (text) file. It can also open a sup file and write it to a sub/idx file or do the opposite (Open a VobSub (sub/idx) file and write it to a sup file). If you have a vobsub file (.sub) without the associated .idx file (or the idx is broken), you can use SubtitleCreator to generate a new one. Go to Tools->Manipulate Sup. Open your IFO file if you have it (just for the color palette), open your sub file and save it as sub, SubtitleCreator will automatically generate the corresponding idx file for you. You can even use VobSub files with the DVD authoring wizard and create them using the Command Line Interface. For the moment, can only input VobSub files extracted using VSRip, wether they include mutiple streams or not. Also allows to add your subtitle stream at the end of an existing VobSub file.
* Added tool to invoke Google translate to automatically translate subtitles
* Using Microsoft Office 2003, implementation of OCR to convert SUP to SRT.
* Support for covering or concealing hard-coded subtitles in a DVD by overlaying them with a non-transparent (black) background. After a manual chapter switch, you have to wait till the first subtitle arrives before it becomes effective (subtitles have no stop time, but need to start).
* Added support in the DVD wizard for wav and mpa files
* Automatic selection of the prefered palette when there is no existing subtitle stream in the original DVD. This will avoid black/green subtitles.
* Added three new command buttons: set the font for a single subtitle, increase and decrease fonts

Bug fixes:
* Generated VobSub output files are now compatible with Philips DVP-5960 SAP thanks to FitzGerald
* SC no longer crashes upon encountering the <font "#0000FF">This is in blue</font> tag
* Automatic replacement of non-markup < and > with <s lt/>, <s gt/> or &lt; and &gt;
* Fixed selection of manual when no culture is set, select the language that belongs to the current GUI culture
* No more exception when playing a 2 subs SRT/SUB file with overlay.
* The vertical position of the profiles is now correctly saved and retrieved
* In the result of the DVD authoring wizard audio streams were sometimes mixed.
* An incorrect subtitle file generating an exception will not be automatically reloaded at startup.
* When opening a sup file and writing it, some sup durations were slightly changed. This should not be the case anymore.
* When translating subtitles (in the tools menu), you can now properly scale the window, read an IFO, and save it, even if it was not complete (requires to unselect Clean up spaces during load - must be fixed)
* The "Show actual output" setting is now correctly restored at startup.
* When using the DVD authoring wizard, SRT files can now be used even if they are not in the same Directory as the original DVD files.
* Some small GUI improvements

Version 2.0.6
- Added French manual to release 

Version 2.0.5
- Fixed the delay function in the SUP manipulation
- Fixed the DVD synchronization list menu (sometimes, the subtitles wouldn't be correctly sorted)
- Updated the settings, so the splitter controls should have a more sensible value.

Version 2.0.4
- Applied some fixes to WriteSUP function and the memory writer to fix a bug when re-writing SUPs.
- Added an option to save your preferred language in the DVD wizard
 
Version 2.0.1
- Fixed a bug when deleting subtitles
- Removed some older documentation
- Partial update of the manual with one screenshot of the latest version
- Some fixes in the French translation 

Version 2.0.0
- The GUI interface has been improved, with an outlook like toolbar and a splitter.
- The subtitle overlay has been improved from a performance perspective; you shouldn't notice any hick-ups during playback 
anymore
- Fixed a small bug whem manipulating SUP files, which contained a small bug that caused the SUP to move one pixel down 

Version 2.0.0, RC1 of SubtitleCreator differs in many ways from the previous version 1.9.2. As it's a release candidate, we would appreciate your comments and bug reports (you can leave them at the SubtitleCreator forum, here, or write us a private message (to manusse&users.sourceforge.net for subtitle overlay issues, to me for the rest): 
- Manusse managed to overlay the subtitles on top of the DVD, which was the most requested feature! This allows you to see the results before you burn the DVD: even better, you can actually even watch your DVD, with the new subtitles added on top. Optionally, you can even combine them with the original subtitles. The current version of the filter has been tested extensively with PowerDVD, although other DVD players might work too. You can turn the option off in the Settings menu. 
This actually means that you need to have CLVSD.ax registered on your system using "regsvr32 path\CLVSD.ax". You can also look for it in the C:\WINDOWS\SYSTEM32 folder. 
- Semi-automatic addition of a subtitle while retaining the menu, using only freeware tools: The DVD wizard (Tools menu, or CTRL-W) has been improved a lot. It allows you to create a SUP subtitle file at the start, after which the wizard will demultiplex it for you (depends on PgcDemux), multiplex it again with the new subtitle (depends on MuxMan), and finally, add it to the existing DVD to keep the menu (depends on the latest version of VobBlanker, v2.1.1.0 RC1).
Just a quick guide how it works: 
1) Open the wizard (CTRL-W), 
2) Select any file from the original DVD, press next (if the original contains subtitles, they will now be extracted)
3) Select the new subtitle language and subtitle: the main window will appear again, and you can select a Profile, position the subtitle, and do some editing of errors (press CTRL-Z to go to the next error).
4) Use the Synchronize menu to open one of the extracted original subtitle SUP files: select matching pairs left and right (near the beginning and end: double-click to find the nearest subtitle in the other window) and press synchronize. 
5) Create the SUP and return to the DVD wizard form
6) Press Start to let SC do the rest (it will call PgcDemux, MuxMan and VobBlanker)

- Added a translator tool to translate from SUP to SRT (Tools menu): It's still a manual job, but at least all the time information is copied from the original SUP file. 
- Added a Most Recently Used file list.
- It runs under the .NET2 framework. The downside is that you need to install it if you haven't, but it is worth it... it just looks much better.
- It also features support for Closed Captions, although this is still under testing by its developer XXX. As I don't use them, I couldn't really test them...
- In addition, there are many more small additions and bug fixes, e.g. it opens by default your last subtitle file, it saves the window position and size (when you save your settings), it by default uses Heathcliff's rendering algorithm (much better looking!), and others I forgot about... 
- Last but not least, the current version has been compiled and created on the open source SharpDevelop IDE, which is a great alternative to VS2005 (especially since it's free and has a similar look-and-feel). Only debugging is harder, but the rest, it's really great, and you can download it from SourceForge too.  

To do
- Multi-language support

Bug fixes:
- Fixed SC error when reading subtitle files that contain empty (or badly formatted) lines. Also fixed that an error reports the correct subtitle. 
- Fixed the initial subtitle position selected in the DVD wizard (was one too low by default)
- Fixed the frame rate conversion tool for locales that use a , instead of a . to represent rational numbers
- Skip lines in SUB files which do not start with "{". In case the Framerate is specified, it is used.  

  
Version 1.9.2
- Manusse translated SC to French, which will be released very soon
- Now possible to decrease the size of the window for 800x600 monitors. In this case, you should turn of the "Show DVD synchronziation" feature in the settings window, as there is no room for it anymore.
- Edit window now available
- Simple option to remove all line breaks if the result doesn't fit the subtitle window
- Added a link to the home site (to facilitate looking for new versions)

Bug fixes:
- Due to changes in the XML settings and profile files, and the fact that newer version read the old settings and profiles, the previous version experienced incompatibility issues, which should have been resolved in this version.
- Fixed SUP manipulation, such that changing the SUP colors or position still results in good SUP files
- Fixed <L> for large fonts, which often caused it to move outside the subtitle window
- DVD Wizard has been improved, and can be used to automatically demux (using PgcDemux), mux (using Muxman), and replace the original IFO's (using BatchUpdateIfo)
- Fixed small bug that caused "..." to be changed to ". . . "

Version 1.9.1
New features:
* Included Heathcliff's anti-flicker filter, which should be able to give a better contrast on normal televisions, especially for larger fonts. Additionally, it displays Persian fonts' ligatures correctly.
* Added link in Help menu to nabe3net's Japanese version of SC including a guide in Japanese
* [On request] Support for vertical fonts (vertical display, right to left), see profile 4 for an example of a Japanese font
* [On request] You can set the delay for SUP files
* [On request] Allow resizing of the window
* [On request] In the settings menu, you can disable tooltips
* [On request] In the settings menu, you can enable to display additional positioning frames
* [On request] Added command line interface, e.g. "SubtitleCreator test.srt -p1 -iVTS_01_0.IFO" will convert test.srt using profile 1 and the last IFO file to create test.sup.
* Created a form to manage the profiles.
* Implemented A-B repeat to create subtitles for DVDs without any existing subtitles: in case you don't have any subtitles, and are willing to create them from scratch, you can start a new file (CTRL-N) and open the DVD. While it plays, you can press the A-B button to mark the beginning (first press, or CTRL-A) and end (second press) of the new subtitle, and the DVD will keep repeating between these two points untill you press it for a third time. Because there will be a typical delay between your key press and the start and end times you want for the subtitles, you can specify these delays in the Settimgs.xml file.
* Changing the background picture now keeps the background black: the idea is that after reading the IFO, the format should be set correctly (if the screenshot didn't do the translation for you already, which happens for example with WinDVD, in which case you should use 1:1 format).

Bug fixes:
* Fixed replacement of ", ..." with ",. .."
* Music symbol is repaired again: use <s M/> to display a double note music symbol in your subtitles
* Fixed update of DVD scrollbar

Version 1.9.0
New features:
* Many improvements in the DVD Author wizard - some visible, many internal to better process the IFO files
* Added an option to change the distance between lines (line height).
* In the Manipulate SUP tool, you can use the context menu to delete the currently selected subtitle.
* In the help menu, I've added links to subtitle download sites.
* Synchronize can now also be done using other subtitle text files.
* Saving settings is separated from saving the profiles - the results are stored in Settings.xml and Profiles.xml respectively. Additionally, they are stored permanently (can be deleted during uninstall), so the changes are saved between updates. SC uses the following folder, C:\Documents and Settings\John Doe\Application Data\SubtitleCreator\, if possible. Else, it defaults to the program's folder.
* Added the option to switch the code page so you don't need to change your Regional settings in the Config panel, e.g. if you normally use English but sometimes need to add Romanian subtitles, you can set the encoding to East/Central European, so the characters show up correctly. If there are code pages missing, let me know, or else add them to the Settings.xml file yourself.
* Inserting a shortcut now displays a description, instead of the definition (plus included a smiley shortcut).
* Changed the behaviour of the Shift time dialog a little - you can use the up/down arrows to increment/decrement by 100ms.
* New option to change text changes before exiting the program (so you have a chance to save the file using the existing name, or cancel and return to the program).
* Profile menu has been improved, so you can now delete profiles: if you change the profile and press save, it will ask for a new name for the profile.
* Changed the default color palette to the default used by MuxMan and PgcDemux.
* Added a check for subtitle duration (if the char/sec exceeds a specified maximum, specified in the Settings.xml file, color the background green - the more green, the higher the error).
* Added an option to remove text for the hearing impaired during load, i.e. text [HEARING IMPAIRED] or (HEARING IMPAIRED).
* Added an option to deselect all subtitles with http or www or @ references (you can also set it during load).
* Splitting of subtitles now adjusts the time proportional to the length of the substrings.
* Added an option to only show those subtitles that contain some kind of problem (either duration, which uses blue backgrounds, or length). Both of these errors will use red font for text.
* Set prefered IFO colours in Settings.xml file (no option to specify them from the menu yet).
* Added the option to drag and drop subtitle files in the listview (press SHIFT for replacing the current file, press CTRL for adding the dragged file, and if you don't use any modifier, it will use the state of the Join subtitles item in the Files menu).
* Added shortcut F2, which will edit the currently selected subtitle (F2 for text, CTRL-F2 for start time, ALT-F2 for end time).
* After loading a second subtitle, you now have the option to set its delay to the duration of an AVI file (by opening the AVI file).
* Included an uninstaller for the application.
* Added an (optional) warning for subtitle (duration/length) errors before converting it to a SUP file.
* Set the listview's tooltip to display the selected subtitles warning message (too long length or too short duration).

Bug fixes:
* Renaming of menus, moving options around, based on feedback from CoNS. Reduced the text in the DVD wizard, added tooltips, added a no button to the Delete profile message, and many more...
* Fixed bug reported by Ukendt after changing to NTSC and saving settings


Version 1.8.7
Bug fixes:
* At last, found Application.DoEvents(), which repaints my window when needed while running background tasks.
* When unchecking the Highlighting of too long subtitles, disabled the context menu's lookup function.
* Bug fix with respect to the manipulation of SUP subtitles and the auto-position tool.

Version 1.8.6
New features:
* You can save/delete your current settings and create new profiles (a profile contains your prefered font and other formatting settings).
* A DVD Authoring Wizard allows you to add a subtitle to a simple DVD (without a menu), at least if you have PgcDemux and MuxMan installed.

Upgrades and bug fixes:
* Automatic subtitle positioning has been fixed.
* Vertical alignment - middle, was broken, and has been fixed.
* Editing time values has now become easier: you can use the up/down arrows to increase/decrease the time with 100ms increments, and moving around skips ':' and ','.
* Added a right-click option to the listview, so you can jump to the next subtitle that is too long
* Renamed "Show actual output (no AA)" to "Show actual output", as the picture still uses anti-aliasing, but doesn't rely on fancy windows AA, which cannot be equaled by a DVD anyways, as a DVD only allows four colors for subtitles.
* Renamed "Check subtitle length" to "Show too long subtitles"

Version 1.8.5
New features:
* Added (un-)select all subtitles to the listView's context menu
* Added remove line breaks to the listView's context menu
* Added a new (requested) aspect ratio of 2.21:1
* Added search function to the Manipulate SUP window
* Added tooltips to the Manipulate SUP window
* Added auto-adjust SUP position (automatically position the SUP in the currently selected subtitle text area)

Bug fixes:
* Bug with some DVD players (shaky lines, due to unequal number of even/odd bitmap lines, and due to unrecognized end of line sequence 00)
* Fixed update after shifting time or frame rate conversions
* When using the "Save SUP as..." function in File menu, the file is now automatically written as well.
* Fixed a bug when loading a background (4:3 in NTSC mode)
* Fixed shift subtitle time and frame rate conversion bug, which didn't update the times in the list.
* Renamed "Insert shortcut" to "Insert autotext"


Version 1.7b3 Beta release
- Added the SUP tools tab, which allows you to change an existing SUP plus preview
- Change the vertical position of a subtitle in the SUP file (all subtitles or only the selected one)
- Change the colors you wish to use (all or selected). 
- Saving of SUP to Bitmaps (bmp, png, jpg) using 4 bits per pixel
- Reading SUP files for advanced synchronization now uses the new SUP reading routine, which is much faster
- When no SUP is available, you can synchronize as well using the DVD preview option in the normal preview window
- In the preview window, you can now search for a string (S) and repeat the search (A)

Version 1.6
First version with a change log update. 
- I've added one major new feature, which allows you to play a DVD in the preview window. However, it doesn't show you the subtitle positioned on top of the DVD yet (but it will in the title bar). Also, when you play a DVD, it will move the current subtitle with it. And if you pause the movie, you can select a subtitle and press "J" to jump to it. 

Additionally, I've fixed some bugs, notably:
- Changing subtitle colors to non-default values should be OK now.
- PAL/NTSC switch is visible again (in the Preview window's context menu)
- The examples directory now also contains an NTSC.IFO file, with the same color palette as the PAL one (BTW, I always read the color palette in PGC1).
- The SC window doesn't disappear anymore (it was a feature that I removed, as it caused too much confusion).
- Anti-aliasing is a fixed value, and no longer depends on the outline width.
- Automatic line wrapping has been improved - not perfect yet, but I am getting there.
- When you reposition the subtitle window, you now can see it when dragging.
