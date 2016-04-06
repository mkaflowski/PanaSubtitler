Installation:
L'installation est simple - il suffit de double-cliquer sur le fichier setup.exe et de suivre les instructions.

Configuration requise:
Notez cependant que vous avez besoin du framework (gratuit) .NET v2 installé sur votre PC (http://www.microsoft.com/downloads/details.aspx?displaylang=fr&FamilyID=0856EACB-4362-4B0D-8EDD-AAB15C5E04F5), ainsi que d'une résolution d'écran d'au moins 800x600. Pour utiliser les fonctionnalités de prévisualisation de DVD, DirectX doit aussi être installé.

A FAIRE
- Ecrire les paramètres de CHG_COLCON dans la fenêtre Manipuler SUP
- Importation des images d'arrière-plan - vérifier les réglages d'apparence

LISTE DES EVOLUTIONS (INCOMPLETE):

Nouvelles fonctionnalités:
* Autorisation de sélection d'éléments multiples à l'aide des touches Ctrl et Shift afin de les supprimer.
* Utilisation du fichier de paramètres par défaut pour stoquer les choix fréquents de l'utilisateur, par ex. dans l'assistant en création de DVD, sauvegarde de l'emplacement des dossiers temporaire et de sortie.
* Amélioration de l'interface de la traduction à l'aide de Google translate, ce qui vous permet de choisir plus de langues qu'avant, et inclue un délai (ce qui empêche Google de vous bloquer).
* Amélioration mineure: l'assistant vérifie désormais si le film original possède un menu (c.a.d. si il y a un fichier VTS_0X_0.VOB). Sinon, l'option de Garder les menus est désactivée.

Corrections de bugs:
* Il n'y a plus d'exception quand on ferme l'assistant en création de DVD juste après l'avoir ouvert.


Version 2.3rc1:
Nouvelles fonctionnalités:
* Ajout de la traduction finlandaise par Ropsi
* Ajout d'une fonction de capture d'image, qui vous permet de prendre un instantané du DVD (avec les sous-titres)
* Il est désormais possible de spécifier la couleur et la (semi)transparence par sous-titre: la transparence n'est plus on ou off, mais peut prendre une valeur entre 0 (transparent) et 15 (opaque)
* Vous pouvez importer des images externes (GIF ou PNG, semi-transparentes): les images peuvent être importées en utilisant les balises <p>NomImage.png</p>. Comme les sous-titres de DVD ne peuvent pas contenir plus de 4 couleurs, les images peuvent sembler différentes, puisque les couleurs seront associées aux 4 couleurs les plus utilisées de la palette. Le changement de palette donnera aussi des résultats différents.
* Vous pouvez mélanger divers sources de sous-titres, par exemple combiner un fichier SUP avec plusieurs images et du texte. Quand vous le sauvez dans un fichier SRT, tous les SUPs et les images sont sauvés commes des images.
* Vous pouvez écraser non seulement la position du sous-titre (ce qui était déja possible), mais aussi la couleur et la transparence. La syntaxe à utiliser est la suivante:
<w x,y,largeur,#Lignes ci=b,f,o,a,k t=b,f,o,a />
où la première partie indique la position de la zone de sous-titre, ci est l'indice de couleur dans la palette actuelle pour l'arrière-plan, le premier-plan, le contour, l'antialias, et le karaoke, et t la transparence.
Notez que la partie  ci... est optionnelle, et que la hauteur de la zone de sous-titre est exprimée en nombre de lignes de la police courante.
* Ajout d'une option (Format|Méthode de rendu|Ombre portée) pour dessiner des sous-titres avec ombre portée
* Ajout de l'ouverture des fichiers de sous-titres binaires dans la fenêtre principale: en fait, cela rend la fenêtre Manipuler SUP superflue.
* Ajout du support du glisser-déposer pour les fichiers *.idx et *.sup.*. Ajout du support du glisser-déposer de la palette de couleurs (dans le menu couleurs).
* Légère amélioration de l'affichage du titre, de sorte que le début et la fin soient gardées


Corrections de bugs:
* Correction d'un bug lors de la conversion SRT vers SUP. Lors de la génération de sous-titre dont le fond n'était pas transparent, le pixel en haut à gauche était de couleur incorrecte. Ce ne devrait plus être le cas désormais.
* La commande Aide->Manuel  fonctionne avec Acrobat Reader 8.
* Restauration de la possibilité de générer des sous-titres jointifs c'est-à-dire des sous-titres qui ont une durée infinie quand la fin d'un sous-titre correspond au début du suivant OU mieux quant la fin vaut 0, comme c'était possible avec la version 2.1.
* Ajout de la possibilité d'ouvrir des fichiers SUP dont certains sous-titres n'ont pas de STP_DSP, et de les afficher comme ayant une fin valant 0. Ceci permte de conserver cette information et de la réécrire lors de la sauvegarde du fichier sous-titre.
* Correction d'un bug dans la fonction de traduction assistée par Google - mais ne permet toujours pas de se protéger contre les requêtes trop fréquentes qui amènent Google à considérer SC comme un virus ou un programme malveillant.
* Correction de 2 bugs lors de la lecture HD-SUP : voir http://forum.doom9.org/showpost.php?p=1086426&postcount=287 et http://forum.doom9.org/showpost.php?p=1086901&postcount=288 pour les détails des 2 bugs.
* Correction d'un bug d'exception mémoire qui se produisait à l'ouverture de fichiers HD-SUP grâce à l'aide de Wackyphill. Il a fallu rajouter une instruction Gc.Collect(). La description du bug se trouve ici: http://forum.doom9.org/showpost.php?p=1089962&postcount=313
* Correction d'un bug: Lors de l'ajout d'un délai négatif (fichier .srt et .sup), il y avait une exception. Voir http://forum.doom9.org/showthread.php?p=1088131.
* Correction bug MRU : Lors de l'ouverture d'un fichier (srt) que SC n'arrive pas à analyser, une exception a lieu mais malgrés tout le nom de ce fichier est mis dans la liste des MRU (derniers fichiers ouverts). Lors des ouvertures ultérieures de SC, une exception avait lieu car SC essayait d'ouvrir à nouveau le même fichier. Cette version corrige ce bug. Désormais le fichier défectueux est supprimé de la liste MRU lors de la prochaine utilisation de SC.
* Correction d'un bug avec les sous-titres longs: lors du remplissage d'une page entière avec des sous-titres textes, le tampon mémoire était trop petit, ce qui provoquait le plantage du memorywriter. 
* Correction d'un bug lors de l'utilisation du DVD wizard à travers différents disques durs.
* Dans le cas des langues sans espaces, par ex. le Chinois, je divise les chaînes de caractères à un endroit sans espaces.
* Lors de l'ouverture de fichier SUP qui ont plus d'un SP_DCSQT, seul le premier est utilisé. Ceci améliore la compatibilité avec DVDSupEncode. Voir le message suivant pour plus de détails sur le problème résolu: http://forum.doom9.org/showpost.php?p=1076316&postcount=281

Version 2.2
* La case à cocher "Couleurs de S-T par défaut" de la fenêtre Manipuler fichier SUP est réinitialisée à l'ouverture d'un nouveau fichier palette ou VobSub car ils écrasent la palette de couleurs. (Ce n'est pas le cas pour un fichier SUP).
* A l'ouverture d'un fichier idx, SubtitleCreator se configure en NTSC ou PAL automatiquement.
* Les sous-titres HD sont convertis à la résolution PAL ou NTSC suivant le mode choisi pour la fenêtre Manipulate SUP.
* Dans le menu Manipuler SUP, le basculement en mode NTSC ou PAL qui était défectueux a été corrigé.
* Le mode NTSC/PAL est désormais fixé de la même façon dans la fenêtre principale et dans la fenêtre Manipuler SUP...
* Le dernier profil utilisé sera sélectionné par défaut lors du prochain démarrage.
* Correction d'un bug empêchant les fichier VobSub d'être utilisés pour la synchronisation de la même manière que les fichiers SUP.
* Le Gestionnaire de profils démarre avec le Profil actif.
* L'affichage des erreurs avant la conversion ne peut être activé que si les affichages des erreurs en couleurs sont activés aussi.
* Dans la fenêtre de l'Assistant en Création de DVD, les noms des fichiers Sup étaient toujours précédés du répertoire temporaire ce qui était une erreur. Cela a été corrigé.
* Il est à nouveau possible d'utiliser les fichiers VobSub (.idx) avec l'Assistant Création de DVD.
* Ajout d'une nouvelle case à cocher dans l'Assistant qui permet de forcer les couleurs du DVD aux couleurs préférées par SubtitleCreator.

Version 2.2.2
Nouvelles fonctionnalités:
* Manusse a rajouté la lecture des fichiers HD-SUPs
* Peut écrire les instructions CHG_COLCON, ce qui permet d'utiliser une couleur supplémentaire pour faire ressortir un mot, par ex. pour le Karaoke, en utilisant <k>mot</k>.
* Peut lire les instructions CHG_COLCON dans le menu Manipuler SUP - au moins, testé sur l'exemple de mpucoder qui fonctionne.
* Peut importer les fichiers HD-SUP (demultiplexés à l'aide de EVODemux). Les fichiers HD-SUP sont convertis automatiquement en fichiers SUP standards. Ils peuvent être ensuite manipulés comme les fichier SUP standards.

Corrections de bugs:
* Après la suppression de sous-titres dans le menu "Manipuler Sup ou VobSub", la sélection ne se retrouve plus sur le premier sous-titre mais sur celui qui suit la suppression.
* Les menus "Fichier -> Enregistrer VobSub sous ..." et "Enregistrer SUP sous ..." ont été corrigés.
* L'Assistant en création de DVD ne lit plus le bon fichier IFO (les sous-titres ne sont pas correctement ajustés, le timing lu est faux)
* Enregistrer sous VobSub - ne fonctionne pas

Version 2.1
Nouvelles fonctionnalités:
* SC peut désormais exporter les palettes de couleurs avec les fichiers SUP. Les formats supportés sont .IFO, .clb (PgcEdit) et .mxp (Muxman). Vous pouvez aussi copier/coller la palette entre SC et PgcEdit.
* Accès aux fichier VobSub (sub/idx) de la même façon qu'aux fichier sup et création d'un fichier VobSub directement à partir d'un fichier texte srt ou sub. Il peut aussi ouvrir un fichier sup et l'enregistrer en tant que sub/idx ou le contraire (Ouvrir un fichier VobSub (sub/idx) et l'enregistrer en tant que fichier sup). Si vous avez un fichier VobSub (.sub) sans le fichier .idx associé (ou que le fichier .idx est corrompu), vous pouvez utiliser SubtitleCreator pour en générer un nouveau. Allez dans Outils -> Manipuler Sup. Ouvrez le fichier IFO si vous l'avez (pour récupérer la palette de couleur), ouvrez votre fichier sub et sauvez le comme sub, SubtitleCreator générera automatiquement le fichier idx correspondant pour vous. Vous pouvez même utiliser des fichiers VobSub avec l'Assistant en création de DVD et en créer avec l'interface en ligne de commande. Supporte en entrée pour l'instant uniquement les fichiers VobSub extraits avec VSrip, y-compris multilingues. Permet aussi de rajouter votre flux de sous-titres à la fin d'un fichier VobSub existant.
* Ajout d'un Outils qui utilise Google translate pour traduire automatiquement les sous-titres d'une langue à une autre.
* Reconnaissance Optique de Caractères pour convertir les fichiers SUP et SRT, à l'aide de Microsoft Office 2003.
* Permet de recouvrir et cacher des sous-titres de DVD incrustés en leur superposant un fond opaque (noir). Après un changement de chapitre manuel, vous devez attendre l'arrivée du premier sous-titre avant que cela fonctionne (les sous-titres n'ont pas de fin mais doivent commencer).
* Ajout du support des fichiers wav et mpa dans l'Assistant en création de DVD
* Sélection automatique de la palette de couleurs préférée quand il n'y a pas de sous-titres sur le DVD de départ. Cela devrait éviter les sous-titres verts/noirs.
* Ajout de trois nouveaux boutons: changement de la police d'un sous-titre, agrandir et diminuer les polices

Corrections de bugs:
* Grace à FitzGerald, les fichier VobSub générés sont désormais compatible avec le lecteur de salon Philips DVP-5960.
* SC ne plante plus quand il rencontre le tag <font "#0000FF">Ceci est en bleu</font>
* Remplacement automatique des symboles pris anciennement pour des balises < et > par <s lt/>, <s gt/> ou &lt; et &gt;
* Correction de la sélection du manuel utilisateur quand la culture n'est pas fixée, sélection de la langue de la culture actuelle de l'interface utilisateur.
* Plus d'exception lors de la lecture de DVD avec un fichier SRT/SUB contenant 2 sous-titres.
* La position verticale des profils est désormais correctement sauvegardée et restaurée.
* Dans le résultat de l'Assistant de Création de DVD, il arrivait que les flux audio soient mélangés.
* Un fichier de sous-titre incorrect qui génère une exception ne sera plus automatiquement chargé au démarrage.
* Lorsque SC ouvrait un fichier sup et l'enregistrait ensuite, les durées de certains sous-titres étaient légèrement modifiées. Ce ne devrait plus être le cas.
* Lors de la traduction de sous-titres (dans le menu outils), vous pouvez désormais redimensionner la fenêtre, lire un fichier IFO, et sauvegarder votre travail, même si vous n'avez pas fini (il est nécessaire de désélectionner Corriger les espaces durant le chargement - ceci reste à corriger) 
* Le paramètre "Afficher résultat réel" est désormais restauré correctement au démarrage.
* Quand on utilise l'Assistant en Création de DVD, les fichiers SRT peuvent désormais être utilisés même s'ils ne sont pas dans le même répertoire que les fichiers du DVD original.

Version 2.0.6
- Ajout du manuel utilisateur en français

Version 2.0.4
- Modification de la fonction WriteSUP ainsi que des écritures mémoire (memory writer) pour corriger un bug lors de la réécriture des SUPs.
- Ajout d'une option pour sauver votre langue préférée dans l'Assistant en création de DVD
 
Version 2.0.1
- Correction d'un bug lors de la suppression de sous-titres
- Suppression de documentation obsolète
- Mise à jour partielle de la version anglaise du manuel avec une copie d'écran de la dernière version
- Mises à jour mineures de la traduction en français 

Version 2.0.0
- L'interface utilisateur a été améliorée avec une barre d'outils à la outlook et un séparateur.
- Les performances de la superposition des sous-titres ont été améliorées; vous ne devriez plus noter de flicker lorsque vous jouez un film
- Correction d'un petit bug dans la manipulation des fichiers SUP qui causait un décalage des sous-titres d'une ligne vers le bas 

La Version 2.0.0, RC1 de SubtitleCreator est trés différente de la version précédente 1.9.2. Comme c'est une pré-version à tester, nous apprécierions vos commentaires et rapports d'erreurs (vous pouvez les laisser sur le forum SubtitleCreator, ou nous écrire un message privé (à manusse&users.sourceforge.net pour les problèmes concernant la superposition des sous-titres et à moi pour le reste): 
- Manusse à réussi à réaliser la superposition des sous-titres sur le DVD, qui était la fonction la plus réclamée! Cela vous permet de voir le résultat avant de réaliser le DVD: même mieux, vous pouvez regarder votre DVD, avec les nouveaux sous-titres en superposition. Optionellement, vous pouvez même les combiner avec les sous-titres d'origine. La version actuelle du filter DirectShow a été testée avec PowerDVD, même si d'autres logiciels de lecture de DVD peuvent convenir. Vous pouvez dévalider l'option dans le menu Paramètres.
Ceci veut dire qu'en fait vous devez avoir CLVSD.ax enregistré sur votre système par la commande "regsvr32 path\CLVSD.ax". Vous pouvez aussi le rechercher dans le répertoire C:\WINDOWS\SYSTEM32. 
- Ajout semi-automatique de sous-titres tout en gardant le menu, et cela uniquement à l'aide de graticiels: L'assistant création de DVD (menu Outils, ou CTRL-W) a été fortement amélioré. Il vous permet de créer un fichier SUP de sous-titres au début, après quoi l'assistant va démultiplexer le DVD pour vous (à l'aide de PgcDemux), puis le remultiplexer avec les nouceaux sous-titres (à l'aide de MuxMan), et finalement, restaurer les menus du DVD original (à l'aide de la dernière version de VobBlanker, v2.1.1.0 RC1).
Un rapide guide d'utilisation: 
1) Ouvrir l'assistant (CTRL-W), 
2) Sélectionner un fichier quelconque du DVD d'origine, cliquez sur suiv. (si l'original contient des sous-titres, il vont maintenant être extraits)
3) Sélectionnez la langue des nouveaux sous-titres ainsi que les sous-titres eux-même: la fenêtre principale va réapparaître, et vous pouver sékectionner un profil, la position des sous-titres, et éditer les erreurs (cliquez sur CTRL-Z pour aller à l'erreur suivante).
4) Utilisez le menu Synchroniser pour ouvrir une des fichiers sous-titres SUP d'origine: sélectionnez les paires correspondantes à gauche et à droite (près du début et de la fin: double-cliquez pour trouver le sous-titre le plus proche dans l'autre fenêtre) et cliquez sur Synchroniser. 
5) Créez le fichier SUP et retourner à la fenêtre de l'Assistant de Création de DVD
6) Cliquez sur Dém. pour laisser SC s'occuper du reste (il va appeler PgcDemux, MuxMan et VobBlanker)

- Ajout d'un outil de traduction pour traduire un SUP en SRT (menu Outils): C'est toujours un travail manuel, mais au moins toutes les informations temporelles sont copiées depuis le fichier SUP d'origine. 
- Ajout d'une liste des fichiers les plus récemment utilisés.
- Fonctionne sous le Framework .NET2. Le désavantage est que vous devez l'installer si ce n'est pas déja fait, mais ça vaut le coup... car l'interface est plus agréable.
- Ajout du support du télétexte (Closed Captions en anglais), bien que cette fonctionnalité soit toujours en tests par son développeur XXX. Comme je ne l'utilise pas moi-même, je n'ai pas pu vraiment le tester...
- De plus, il y a eu plein de petits ajouts et corrections, par exemple SC ouvre par défaut le dernier fichier sous-titres, sauvegarde la position de la fenêtre et sa taille (quand vous enregistrez vos paramètres), utilise par défaut l'algorithme de rendu de Heathcliff (aspect supérieur des sous-titres!), et d'autres que j'ai oubliés... 
- Pour finir, la version courante a été crée et compilée avec l'environnement graticiel de développement SharpDevelop, qui est un bon remplaçant de Visual Studio 2005 (surtout parce qu'il est gratuit et lui ressemble). Seul le debug des programmes est plus compliqué mais le reste est vraiment super et vous pouvez le télécharger lui-aussi sur SourceForge.  

Corrections de bugs:
- Correction de l'erreur de SC lors de la lecture des fichiers de sous-titres qui contiennent des lignes vides (ou mal formattées). Correction aussi du fait qu'une erreur s'affiche pour un sous-titre correct. 
- Correction de la position initiale des sous-titres dans l'assistant de création de DVD (elle était un trop bas par défaut)
- Correction de l'outil de conversion de fréquence trame pour les localisations qui utilisent une , au lieu du . pour représenter les nombres rationnels
- N'utilise pas les lignes des fichiers SUB qui ne commencent pas par "{". Utilisation de la fréquence trame dans le cas où elle est spécifiée.


Version 1.9.2
- SC est désormais traduit en français par Manusse (manusse&users.sourceforge.net, remplacer & par @)
- Il est désormais possible de diminuer la taille de la fenêtre pour les moniteurs 800x600. Dans ce cas, vous devez dévalider l'option "Montrer DVD synchroniser" du menu Paramètres, car il n'y a alors plus la place de l'afficher.
- Ajout du menu Editer
- Option simple pour enlever tous les sauts de ligne si le résultat ne tient pas dans la fenêtre de sous-titres
- Ajout d'un lien vers le site de SC (pour faciliter la vérification de l'existence de nouvelles versions)

Corrections de bugs:
- A cause de changements dans les fichiers XML de profils et de paramètres, et du fait que la nouvelle version lisait les anciens profils et paramètres, la version précédente était incompatible avec les précédentes, ce qui devrait être résolu dans cette version.
- Correction de la manipulation des fichiers SUP, de sorte que le changement des couleurs ou positions des SUP résulte dans des fichiers SUP valides
- Correction du <L> pour les grandes polices, qui souvent les faisait sortir de la fenêtre sous-titres
- L'expert DVD a été amélioré, et peut être utilisé pour démultiplexer (à l'aide de PgcDemux), remultiplexer (à l'aide de Muxman), et remplacer le fichier IFO original (à l'aide de BatchUpdateIfo) automatiquement.
- Correction d'un petit bug qui faisait que "..." était remplacé par ". . . "


ersion 1.9.1
Nouvelles fonctionnalités:
* Inclus le filtre anti-scintillement de Heathcliff, qui devrait donner un meilleur contraste sur les télévisions normales, surtout avec les grandes policess. De plus il permet un affichage correct des ligatures des police Perses.
* Ajouté un lien dans le menu Aide vers la version japonaise de  SC de nabe3net qui contient un guide en Japonais
* [Sur demande] Support des polices verticales (affichage vertical, droite à gauche), voir le profil 4 pour un exemple de police japonaise
* [Sur demande] Vous pouvez fixer le délai des fichier SUP
* [Sur demande] Redimensionnement possible des fenêtres
* [Sur demande] Dans le menu paramètres, vous pouvez désactiver les trucs et astuces.
* [Sur demande] Dans le menu paramètres, vous pouvez autoriser l'affichage de cadres de positionnement supplémentaires
* [Sur demande] Ajout d'une interface en ligne de commande, ex "SubtitleCreator test.srt -p1 -iVTS_01_0.IFO" convertira test.srt en utilisant le profil 1 et le fichier IFO spécifié pour créer test.sup.
* Ajout d'une fenêtre de gestion des profils.
* Ajout de la répétition A-B pour créer des sous-titres pour les DVDs sans sous-titres existants: dans le cas où vous n'avez pas de sous-titres, et vous souhaitez en créer à partir de zéro, vous pouvez ouvrir un nouveau fichier (CTRL-N) et ouvrir le DVD. Alors qu'il est en lecture, appuyez sur le bouton A-B pour marquer le début (premier appui, ou CTRL-A) et la fin (deuxième appui) du nouveau sous-titre, et le DVD relira continuellement entre ces deux points jusqu'à ce que vous appuyiez une troisième fois. Comme il y a un délai incompressible entre l'instant où vous appuyez sur la touche et les instants de début et de fin que vous souhaitez réellement pour le sous-titre, vous pouvez spécifier ces délais dans le fichier Settings.xml.
* Le changement de l'image d'arrière-plan laisse désormais l'arrière-plan en noir: l'idée est qu'après la lecture du fichier IFO, le format devrait être réglé correctement (Si la translation n'a pas déja eu lieu automatiquement, ce qui arrive par exemple avec WinDVD, auquel cas vous devriez choisir le format 1:1).

Corrections de bugs:
* Correction du remplacement de ", ..." par ",. .."
* Le symbol musical est à nouveau réparé: utilisez <s M/> pour afficher le symbole d'une double note de musique dans vos sous-titres
* Correction de la mise à jour de la barre de contrôle de DVD

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
