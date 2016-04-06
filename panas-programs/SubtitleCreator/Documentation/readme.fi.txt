Asentaminen:
Asentaminen on yksinkertaista - riitt��, kun suoritat setup.exe-ohjelman ja seuraat ohjeita.

Vaatimukset:
Ota huomioon, ett� (ilmaisen) .NET v2 framework'in on oltava asennettuna PC:lle (http://www.microsoft.com/downloads/details.aspx?displaylang=fi&FamilyID=0856eacb-4362-4b0d-8edd-aab15c5e04f5), ja n�yt�n v�himm�isresoluutio 800x600. Lis�ksi voidaksesi k�ytt�� DVD:n esin�ytt�ominaisuuksia on DirectX:n oltava asennettuna.

TEHT�V�
- CHG_COLCON -asetusten kirjoittaminen "Muokkaa SUP:ia"-ikkunassa.
- Taustakuvien tuonti - tarkasta n�ytt�suhdeasetukset

MUUTOSLOKI (EP�T�YDELLINEN):

Versio 2.XX:
Korjatut virheet:
*Korjattu virhe muunnoksessa SRT:st� SUP:iksi. SC:n muodostaessa tekstityst� kiinte��n taustakuvaan  vasemman yl�kulman pikseli ei ollut asetettu oikean v�riseksi. T�m�n pit�isi nyt olla kunnossa.
*Apua"valikon K�ytt�ohje-komento toimii Acrobat Reader 8:ssa.

Versio 2.2:
* "K�yt� oletusv�riasetuksia" -valintaruutu  "Muokkaa SUP:ia"-ikkunassa on tyhj�, avattaessa uutta v�ripalettia tai VobSub-tiedosto on auki, koska se tyhjent�� paletin. (SUP-tiedostoa avattaessa se ei ole tyhj�).
* IDX-tiedoston avaaminen vaihtaa tarvittaessa liittym�n automaattisesti PAL- tai NTSC-muotoon.
* HDSUP-tekstityksen koko vaihdetaan riippuen PAL- tai NTSC- tilasta  "Muokkaa SUP:ia"-ikkunan toimintatavan asetuksista.
* "Muokkaa SUP:ia"-ikkunassa korjattu NTSC- tai PAL- tavan vaihto, jossa oli virheit�.
* NTSC/PAL-asetukset toimivat samalla tavalla p��ikkunassa ja "Muokkaa SUP:ia"-ikkunassa...
* Viimeksi k�ytetty profiili ladataan k�ynnistett�ess� oletuksena uudelleen.
* Korjattu virhe, jonka johdosta VobSubtiedostoa ei voinut k�ytt�� synkronointiin samalla tavalla kuin SUP-tiedostoja..
* Profiilinhallinta k�ynnistyy aktiiviseen profiiliin.
* "Varoita virheist�" voidaan nyt ottaa k�ytt��n vain, kun virheiden korostus on sallittu.
* Sup-tiedostonimet olivat aina v�liaikaishakemistossa etusijalla. T�m� oli virhe Velho-ikkunassa, joka on nyt korjattu.
* Palautettu VobSub (.idx) -tiedostojen k�ytt�mahdollisuus DVD-julkaisuvelhossa.
* Lis�tty DVD-julkaisuvelhoon uusi valintaruutu, joka sallii DVD:n v�rien pakottamisen SC:n ensisijaisiin v�reihin.

Versio 2.2.2:
Uudet ominaisuudet:
* Manusse lis�si mahdollisuuden lukea HD SUP:eja
* PAL-NTSC-n�ytt�muodon vaihdon j�lkeen v�lkkymiset�isyys s��det��n automaattisesti.
* CHG_COLCON -ohjeiden kirjoitusmahdollisuus, jossa voi k�ytt�� lis�v�ri� sanan korostamiseen, esim. karaokeen, k�ytt�en <k>word</k>.
* CHG_COLCON -ohjeiden lukumahdollisuus  ikkunassa "Muokkaa SUP:ia" - toimi ainakin mpucoder'in esimerkiss�
* HD-SUP-tiedostojen tuontimahdollisuus (demuxattu k�ytt�en EVODemux'ia). HD-SUP-tiedostot muunnetaan lennossa vakio-SUP-tiedostoiksi. Silloin niit� voidaan k�sitell� normaaleina SUP-tiedostoina.

Virheiden korjauksia:
* Tuhottaessa tekstityksi� "Muokkaa Sup'ia tai VobSub'ia"-valikossa valinta siirtyy poistamisen j�lkeen seuraavaan, ei ensimm�iseen.
* "Tiedosto -> Tallenna VobSub nimell�..." ja "Tiedosto -> Tallenna SUP nimell�..." valikot on korjattu.
* (minor) Laajennettu "Tallenna SUP nimell�..." ja "Tallenna VobSub nimell�..." k�ytt�ytymist�.
* DVD -velho ei lukenut oikeita IFO-tiedostoja (tekstityksen asetukset eiv�t olleet oikein, aika luettu v��rin)
* VobSub tallenna nimell� - valitettu, ettei kirjoita

Versio 2.1
Uudet ominaisuudet:
* SC voi nyt vied�/tuoda v�ripaletteja SUP-tiedostojen mukana. Tuetut muodot ovat .IFO, .clb (PgcEdit) ja .mxp (Muxman). SC:n ja PgcEdit:in v�lill� voi my�s kopioida/liitt�� v�ripaletin.
* VobSub-tiedostojen (sub/idx) luku ja kirjoitus tapahtuu samoin kuin SUP-tiedostojen, ja VobSub-tiedosto voidaan luoda suoraan srt- tai sub- tekstitiedostosta. Voidaan my�skin avata SUP-tiedosto ja kirjoittaa se sub/idx-tiedostoksi tai p�invastoin (avaa VobSub-tiedosto (sub/idx)ja kirjoitetaan se SUP-tiedostoksi). Jos Sinulla on vobsub-tiedosto (.sub) ilman kytketty� .idx-tiedostoa (tai idx on poikki), voit k�ytt�� SubtitleCreatoria muodostamaan uuden. Mene "Ty�kalut->Muokkaa SUP:ia". Avaa IFO-tiedostosi, jos sellainen on (v�ripaletin takia), avaa sub-tiedosto ja tallenna se sub-muodossa, jolloin SubtitleCreator muodostaa automaattisesti vastaavan idx-tiedoston. Voit jopa k�ytt�� VobSub-tiedostoja DVD-julkaisuvelhon kanssa ja luoda niit� k�ytt�en komentoriviliittym��. T�ll� hetkell� voidaan ainoastaan VobSub-sy�tt�tiedostoja purkaa k�ytt�m�ll� VSRip'i�, sis�lt�v�t ne useampia virtoja tai sitten ei. My�skin tekstitysvirran lis��minen onnistuu olemassa olevan VobSub-tiedoston loppuun.
* Lis�tty Google-k��nn�sty�kalu tekstitysten automaattiseen k��nt�miseen
* Lis�tty optinen merkintunnistus (OCR) k�ytt�en Microsoft Office 2003:a, muuntamaan SUP SRT-muotoon.
* Mahdollisuus peitt�� tai k�tke� rautakoodatut DVD-tekstitykset peitt�m�ll� ne l�pin�kym�tt�m�ll� (mustalla) taustalla. Manuaalisen kappaleen vaihdon j�lkeen on odotettava, kunnes ensimm�inen tekstitys ilmestyy, ennekuin se n�kyy (tekstityksill� ei ole lopetusaikaa, mutta ne t�ytyy k�ynnist��).
* Lis�tty DVD-velhoon tuki wav- ja mpa-tiedostoille
* Etuk�teen asetetun v�ripaletin automaattinen k�ytt��notto, kun alkuper�isell� DVD:ll� ei ole tekstitysvirtoja. Siten v�ltet��n musta/vihre�t tekstitykset.
* Lis�tty kolme uutta komentonappulaa: yksitt�isen tekstin fontin asettaminen sek� fontin suurentaminen ja pienent�minen

Virheiden korjauksia:
* Muodostetut VobSub-tiedostot ovat nyt yhteensopivia Philips DVP-5960 SAP:in kanssa. Siit� kiitokset FitzGerald'ille
* SC ei kaadu en�� ristiriitaisessa tilanteessa <font "#0000FF">T�m� on sininen</font> tagissa
* Ei-merkkauksen automaattinen korvaus < ja > kera <s lt/>, <s gt/> tai &lt; ja &gt;
* Korjattu manuaalinen valinta - tilanteessa, jossa kielt� ei ole asetettu, valitaan nykyiseen k�ytt�liittym��n kuuluva kieli
* Ei en�� poikkeusta toistettaessa kahden tekstityksen SRT/SUB-overlaytiedostoa.
* Profiilien pystyasemointi tallennetaan ja palautetaan oikein
* DVD-julkaisuverhon lopputuloksessa audiovirrat olivat joskus sekaisin.
* V��r�n tekstitystiedoston muodostamaa poikkeusta ei ladata automaattisesti ohjelman k�ynnistyess�.
* Avattaessa ja kirjoitettaessa SUP-tiedostoa jotkut kestoajat olivat hieman muuttuneet. N�in ei pit�isi en�� k�yd�.
* Tekstityst� k��nnett�ess� ("Ty�kalut"-valikossa)ikkuna voidaan skaalata oikein, lukea IFO ja tallentaa se, vaikkei se olisikaan t�ydellinen (ei saa valita "Poista v�lit luettaessa" - t�ytyy korjata)
* "N�yt� todellinen tulos"-asetus palautetaan oikein k�ynnistyksess�.
* K�ytett�ess� DVD-julkaisuvelhoa voidaan SRT-tiedostoja k�ytt��, vaikka ne eiv�t olisi samassa hakemistossa kuin alkuper�isen DVD:n tiedostot.
* Joitakin pieni� k�ytt�liittym�n laajennuksia

Versio 2.0.6
- Lis�tty ranskankielinen k�ytt�opas

Versio 2.0.5
- Korjattu Viivefunktio SUP-muokkauksessa
- Korjattu DVD sunkronointilistan valikko (joskus tekstityksi� ei oltu lajiteltu oikein)
- P�ivitetty asetuksia, joten v�lkkymisarvojen pit�isi olla herkemm�t arvot.

Versio 2.0.4
- Muutamia korjauksia Kirjoita SUP-funktioon ja muistiin kirjoitukseen virheen korjaamiseksi SUP:n uudelleenkirjoituksessa.
- Lis�tty mahdollisuus valita kieli DVD-velhossa
 
Versio 2.0.1
- Korjattu virhe tekstitysten poistamisessa
- Poistettu vanhempaa dokumentaatiota
- K�ytt�ohjeen osittainen p�ivitys yhdell� viimeisen version ruudunkaappauskuvalla
- Joitakin korjauksia ranskankieliseen k��nn�kseen

Versio 2.0.0
- Graafista k�ytt�liittym�� on laajennettu Outlookin n�k�isell� ty�kalupalkilla ja jakajalla.
- Tekstitysoverlayn k�ytett�vyytt� on parannettu; toistettaessa ei pit�isi en�� n�ky� nykimist�
- Korjattu SUP-tiedostojen muokkauksessa pieni virhe, joka aiheutti SUP:in siirtymisen yhden pikselin verran alasp�in 

Versio 2.0.0, SubtitleCreator'in RC1 eroaa monin tavoin edellisest� versiosta 1.9.2. Koska se on julkaisukandidaatti, arvostaisimme kommentteja ja virheraportteja (voit j�tt�� ne SubtitleCreatorin foorumiin, t�nne tai kirjoittaa meille yksityisviestin (tekstitysoverlay-asioista manusse&users.sourceforge.net , minulle lopuista): 
- Manusse j�rjesti tekstitysoverlayn DVD:n p��lle, joka olikin eniten pyydetty ominaisuus! T�ll�in voidaan n�hd� lopputulos, ennenkuin poltetaan ne DVD:lle, eik� siin� viel� kaikki: voit jopa todella katsoa DVD:si uusien tekstitysten kanssa. Lis�ominaisuutena voit kytke� ne alkuper�isiin tekstityksiin. Suotimen nykyisen version testausta on laajennettu PowerDVD:hen, joten muidenkin DVD-soittimien pit�isi my�s toimia. Voit poistaa ominaisuuden k�yt�st� "Asetukset"-valikossa. 
T�m� tarkoittaa itse asiassa sit�, ett� CLVSD.ax:n t�ytyy olla rekister�ityn� j�rjestelm�ss� k�ytt�en "regsvr32 path\CLVSD.ax". Sit� voi my�skin etsi� X:\WINDOWS\SYSTEM32-kansiosta.
- Puoliautomaattinen tekstitysten lis�ys Valikko s�ilytt�en, k�ytt�ll� ainoastaan ilmaisohjelmia: The DVD-velhoa ("Ty�kalut"valikko, tai CTRL-W) on laajennettu runsaasti. Se mahdollistaa SUP-tekstitystiedoston luomisen alussa, jonka j�lkeen velho demultiplexoi sen Sinulle (PgcDemux hoitaa), multiplexoi sen uudelleen (MuxMan hoitaa), ja lopuksi lis�� sen valmiin DVD:n rakenteeseen s�ilytt�en valikot (VobBlanker'in viimeinen versio v2.1.1.0 RC1 hoitaa).
T�ss� lyhyt opas, kuinka se toimii: 
1) Avaa velho(CTRL-W), 
2) Valitse jokin tiedosto alkuper�iselt� DVD:lt�, paina seuraava (jos originaali sis�lt�� tekstityksi�, ne puretaan nyt)
3) Valitse uusi tekstitys ja sen kieli: p��ikkuna avautuu uudelleen, jolloin voit valita profiilin, tekstityksen asettelun ja korjata virheit� (klikkaa CTRL-Z menn�ksesi seuraavaan virheeseen).
4) K�yt� "Synkronointi"-valikkoa avaamaan yhden tekstityksen alkuper�isen puretun SUP:in tiedostoista: valitse vastaavat parit (l�helt� alkua ja loppua: kaksoisklikkaa l�yt��ksesi l�himm�n tekstin toisesta ikkunasta) ja paina "Synkronoi". 
5) Luo SUP ja palaa DVD-velhoon
6) Paina "Aloita" ja anna SC:n tehd� loput(se kutsuu PgcDemux'in, MuxMan'in ja VobBlanker'in)

- Lis�tty k��nn�sty�kalu SUP:in (kielen) k��nt�miseksi SRT-muotoon ("Ty�kalut"-valikko): Se on viel� teht�v� manuaalisesti, mutta ainakin aikatiedot kopioidaan alkuper�isest� SUP-tiedostosta. 
- Lis�tty Viimeksi eniten k�ytetyt-lista.
- Ohjelma toimii .NET2 framework:in alaisena. Paha puoli on, ett� se on asennettava, jos sit� ei ole, mutta on se sen arvoistakin... se vain n�ytt�� paljon paremmalta.
- Siin� on my�skin tuki Closed Caption-tekstityksille, vaikka onkin viel� kehitt�j�ns� XXX:n testattavana. Koska en itse niit� k�yt�, en my�sk��n pysty testaamaan...
- Lis�ksi on monta lis�yst� ja pikku korjausta, esim. se avaa oletuksena viimeksi k�ytetyn tekstitystiedoston, se tallentaa ikkunan aseman ja koon (tallentaessasi asetukset), se k�ytt�� oletuksena Heathcliff'in render�intialgoritmia (n�ytt�� paljon paremmalta!), ja muitakin, jotka olen unohtanut... 
- Viimeisen� mutta ei v�hiten t�rke�n�: nykyinen versio on compiloitu ja luotu avoimen l�hdekoodin SharpDevelop IDE:ll�, joka on hyv� vaihtoehto VS2005:lle (erityisesti, koska se on ilmainen ja sill� on samanlainen look-and-feel, eli n�ytt�� samalta ja tuntuu samalta) Ainoastaan debuggaus on vaikeampaa, mutta loppujen lopuksi se on todella upea, ja senkin voit ladata SourceForge'sta.  

Tehty:
- Monikielisyyden tuki

Virheiden korjauksia:
- Korjattu SC:n virhe luettaessa tekstitystiedostoja, joissa on tyhji� (tai pahasti muuntuneita) rivej�. Korjattu my�s virhe, joka raportoi virheest� kelvollisessa tekstityksess�. 
- Korjattu the initial subtitle position selected in the DVD wizard (was one too low by default)
- Korjattu Kehysnopeuden muunnos-ty�kalu kieliss�, joissa k�ytet��n pilkkua (,) pisteen (.) asemesta muodostamaan j�rjellisi� numeroita
- Ohitetaan SUB-tiedoston rivit, jotka eiv�t ala "{". Jos kehysnopeus on eritelty, sit� k�ytet��n.  

  
Versio 1.9.2
- Manusse k��nsi SC:n ranskaksi. K��nn�s julkaistaan pian.
- Nyt on mahdollista rajoittaa ikkunan kokoa 800x600 -n�yt�ille. T�ss� tapauksessa pit�� poistaa k�yt�st� "N�yt� DVD:n synkronisaatio"-ominaisuus asetusikkunassasill� sille ei ole en�� tilaa.
- Ikkunan muokkaus on mahdollista
- Yksinkertainen mahdollisuus poistaa rivinvaihdot, jos lopputulos ei mahdu tekstitysikkunaan
- Lis�tty linkki ohjelman kotisivulle (uusien versioiden etsinn�n helpottamiseksi)

Virheiden korjauksia:
- XML-asetuksissa ja profiilitiedostoissa tehdyiss� muutoksissa ja uudemman version kyvyss� lukea vanhoja asetuksia ja profiileja on vanhemmassa versiossa havaittu yhteensopimattomuuksia, joiden pit�isi olla korjattu t�h�n versioon.
- Korjattu SUP-muokkausta, koska hyviss� SUP-tiedostoissa suoritetut v�rin vaihdot eiv�t n�y uusissa
- Korjattu <L> suurille fonteille, joka sai usein aikaan sen, etteiv�t ne mahtuneet tekstitysikkunaan
- DVD -velhoa on laajennettu, joten nyt sit� voi k�ytt�� demuxaamaan automaattisesti (k�ytt�en PgcDemux'ia), muxaukseen (k�ytt�en Muxman'ia), ja korvaamaan alkuper�iset IFO:t (k�ytt�en BatchUpdateIfo:a)
- Korjattu pieni virhe, joka vaihtoi "..." muotoon ". . . "

Versio 1.9.1
Uudet ominaisuudet:
* Lis�tty Heathcliff'in v�lkkym�tt�myyssuodin, jonka pit�isi mahdollistaa parempi kontrasti tavallisessa televisiossa erityisesti suuremmilla fonteilla. Lis�ksi se n�ytt�� persialaisen fontin liitosviivat oikein.
* Lis�tty "Apua"-valikkoon linkki nabe3net'in japaninkieliseen SC:hen ja k�ytt�oppaaseen
* [Pyynn�st�] Tuki pystysuuntaisille fonteille (vaakan�ytt�, oikealta vasemmalle), katso profiili 4 - esimerkkin� japanilainen fontti
* [Pyynn�st�] SUP-tiedostoihin voidaan asettaa viive
* [Pyynn�st�] Ikkunakoon muutos sallittu
* [Pyynn�st�] "Asetukset"-valikossa voidaan poistaa ty�kaluvihjeet k�yt�st�
* [Pyynn�st�] "Asetukset"-valikossa voi ottaa k�ytt��n ylim��r�isten asettelukehysten n�ytt�misen
* [Pyynn�st�] Lis�tty komentorivi-liittym�, eli esim. kirjoittamalla komento "SubtitleCreator test.srt -p1 -iVTS_01_0.IFO" muuntaa tiedoston test.srt k�ytt�en profiilia 1 ja viimeist� IFO-tiedostoa luomaan tiedoston test.sup.
* Luotu muoto profiilien hallintaan.
* A-B -toistoa k�ytet��n luomaan tekstityksi� DVD:lle, jolla sellaisia ei ole: Tapauksessa, ettei yht��n tekstityst� ole, mutta sellainen halutaan luoda tyhj�st�, voit luoda uuden tiedoston (CTRL-N)ja k�ynnist�� DVD:n. Kun se py�rii, voit painaa A-B -nappulaa merkit�ksesi uuden tekstityksen alkukohdan (ensimm�inen painallus, tai CTRL-A) ja lopun (toinen painallus), jolloin DVD kertaa n�iden paikkojen v�lill�, kunnes painat kolmannen kerran. Koska painalluksen sek� tekstityksen alku- ja loppuaikojen v�lill� on tyypillinen viive, voit m��ritell� n�m� viiveet Settings.xml-tiedostossa.
* Taustakuvan vaihto pit�� taustan mustana: t�m� siksi, ett� IFO:n lukemisen j�lkeen formaatti pit�isi asettaa oikeaksi (jos ikkunointi ei tehnyt jo muutosta, kuten tapahtuu esim. WinDVD:ss�, jolloin pit�isi k�ytt�� 1:1 -muotoa).

Virheiden korjauksia:
* Korjattu ", ...":n korvaus ",. ..":ll�
* Musiikkisymboli on korjattu uudelleen: k�yt� <s M/> n�ytt��ksesi kaksoisnuotin tekstityksess�
* Korjattu DVD:n vierityspalkin p�ivitys

Versio 1.9.0
Uudet ominaisuudet:
* Monia lis�yksi� DVD-julkaisuvelhoon - toiset ulkoisia, toiset sis�isi� - IFO-tiedostojen parempaa k�sittely� varten
* Lis�tty mahdollisuus muuttaa rivien et�isyytt� (rivin korkeus).
* "Muokkaa SUP:ia"-ty�kalussa voi k�ytt�� context-valikkoa poistamaan valittuna olevan tekstityksen.
* Olen lis�nnyt "Apua"-valikkoon linkkej� tekstitysten lataussivuille.
* Synkronointi voidaan nyt tehd� k�ytt�m�ll� toisia tekstitys-tekstitiedostoja.
* Asetusten tallennus on erotettu Profiilien tallentamisesta - asetukset tallennetaan Settings.xml- ja Profiles.xml-tiedostoihin. Lis�ksi ne on  tallennettu pysyv�sti (voidaan poistaa asennusta poistettaessa), joten muutokset on tallennettu p�ivitysten v�lill�. SC k�ytt�� kansiota C:\Documents and Settings\K�ytt�j�nimi\Application Data\SubtitleCreator\, jos mahdollista. Muuten oletuksena on ohjelmakansio.
* Lis�tty koodisivun vaihtomahdollisuus, joten alueellisia asetuksia ei tarvitse vaihtaa Config-valikossa, eli jos k�yt�t normaalisti englantia mutta haluat joskus lis�t� esim. romaniankielisi� tekstityksi� voit asettaa koodauksen It�/Keski-Eurooppa, jolloin kirjaimet n�kyv�t oikein. Jos koodisivuja puuttuu, kerro minulle siit�, tai lis�� ne itse Settings.xml:��n.
* Pikapolun lis�ys n�ytt�� nyt kuvauksen m��rittelyn asemesta (plus hymi�-pikapolun).
* Muutettu hieman "Ajan muuttaminen"-ikkunaa - voit k�ytt�� yl�s/alas-nuolta ajan lis�miseen/v�hent�miseen 100 ms:lla.
* Uusi tekstityksen tallentamismahdollisuus ennen ohjelmasta poistumista (jolloin voi tallentaa sen k�ytt�en olemassaolevaa nime�, tai peruuttaa ja palata ohjelmaan).
* Profiilivalikkoa on laajennettu, joten nyt voit poistaa profiileja: jos vaihdat profiilia ja painat "Tallenna", ohjelma kysyy profiilin uutta nime�.
* Vaihdettu oletusv�ripaletti MuxMan'in ja PgcDemux'in k�ytt�m��n oletuspalettiin.
* Lis�tty tekstityksen keston tarkastus (jos merkki�/sekunnissa ylitt�� Settings.xml-tiedostossa:ss� m��ritellyn enimm�isluvun, tausta muuttuu vihre�ksi - mit� vihre�mpi, sit� suurempi virhe).
* Lis�tty poistomahdollisuus ladattaessa kuulovammaisten tekstityst�, esimerkiksi teksti [HEARING IMPAIRED] tai (HEARING IMPAIRED).
* Lis�tty mahdollisuus j�tt�� valitsematta tekstitys, jossa on merkint� http, www tai @ (voit my�s tehd� sen ladattaessa).
* Tekstitysten jakaminen muuttaa ajan suhteessa alimerkkijonojen pituuteen.
* Lis�tty mahdollisuus n�ytt�� ainoastaan tekstitykset, joissa on jonkinlainen ongelma (kestossa, jolloin k�ytet��n sinist� taustaa, tai pituudessa). Molemmat virheet n�ytt�v�t tekstin punaisella fontilla.
* M��riteltyjen IFO-v�rien asettaminen Settings.xml-tiedostossa (ei viel� mahdollisuutta m��rittelyyn valikossa).
* Lis�tty mahdollisuus vet�� ja pudottaa tekstitystiedostoja listan�ytt��n (paina SHIFT korvataksesi nykyisen tiedoston, paina CTRL lis�t�ksesi vedetyn tiedoston, ja jollet k�yt� mit��n muuttujaa, se k�ytt�� tiedostovalikon "Liit� tekstitykset"-k�sky�).
* Lis�tty pikan�pp�in F2, joka muokkaa valittua tekstityst� (F2 tekstille, CTRL-F2 alkuajalle ja ALT-F2 loppuajalle).
* Toisen tekstityksen latauksen j�lkeen on mahdollista m��ritell� sen viive AVI-tiedoston kestoon (avaamalla AVI-tiedosto).
* Liitetty ohjelman asennuksen purku.
* Lis�tty varoitus (valinnainen) tekstityksen kesto- tai pituusvirheist� ennen niiden muuntamista SUP-tiedostoksi.
* Asetettu listan�yt�n ty�kaluvihje n�ytt�m��n valittujen tekstitysten varoitusviestit (liian suuri pituus tai liian lyhyt kesto).

Virheiden korjauksia:
* Nimetty valikoita uudelleen, muutettu asetusten paikkoja CoNS:IN palautteen pohjalta. V�hennetty DVD-velhon teksti�, lis�tty ty�kalupalkki, lis�tty Peruuta-n�pp�in "Poista profiili"-viestiin, ja paljon muuta...
* Korjattu Ukendt:in raportoima NTSC:hen vaihtamisen ja asetusten tallennuksen virhe

Versio 1.8.7
Virheiden korjauksia:
* Viimeinkin l�ydetty Application.DoEvents(), joka piirt�� ikkunan uudelleen taustateht�vi� ajettaessa.
* Poistettaessa valinta "Korosta liian pitk�t tekstitykset" poistettu context-valikon katseleminen-funktio.
* Virhe korjattu SUP-tekstitysten muokkauksessa ja automaattinen asemointi-ty�kalussa.

Versio 1.8.6
Uudet ominaisuudet:
* Voit tallentaa/poistaa nykyiset asetukset ja luoda uusia profiileita (profiili sis�lt�� m��ritellyn fontin ja muut muotoiluasetukset).
* DVD-julkaisuvelho antaa mahdollisuuden lis�t� tekstityksen yksinkertaiselle DVD:lle (ilman valikkoa), ainakin jos PgcDemux ja MuxMan on asennettu.

P�ivityksi� ja virheiden korjauksia:
* Automaattinen tekstityksen asettelu korjattu.
* Vaakasuuntainen asettelu - keskell�, oli poikki, ja on nyt korjattu.
* Aika-arvojen muokkaus on helpottunut: voit k�ytt�� yl�s/alas-nuolia v�hent��ksesi/lis�t�ksesi aikaa 100 ms askelin, siirrett�ess� ylihypp��  merkit ':' ja ','.
* Lis�tty listan�ytt��n oikean nappulan k�ytt�mahdollisuuden, jolloin vot siirty� seuraavaan liian pitk��n tekstiin.
* Nimetty uudelleen "Show actual output (no AA)" muotoon "Show actual output", kuvan k�ytt�ess� viel� anti-alias-muotoa, mutta ei luota hassuun ikkunan AA:han, joka ei kuitenkaan sovi DVD:lle, koska DVD sallii tekstityksiin vain nelj� v�ri�.
* Nimetty uudelleen  "Check subtitle length" muotoon "Show too long subtitles"

Versio 1.8.5
Uudet ominaisuudet:
* Lis�tty "valitse/�l� valitse kaikki tekstitykset" Listan�yt�n context-valikkoon
* Lis�tty "Poista katkenneet linkit" Listan�yt�n context-valikkoon
* Lis�tty uusi (pyydetty) kuvasuhde 2.21:1
* Lis�tty "Etsi"-funktio Muokkaa SUP:ia-ikkunaan
* Lis�tty ty�kalupalkki Muokkaa SUP:ia-ikkunaan
* Lis�tty SUP:in aseman automaattinen asettelu ( SUP-tekstityksen automaattinen asemointi valitulle tekstitysalueelle)

Virheiden korjauksia:
* Virhe joidenkin DVD-soittimien kanssa (rivit vapisevat, koska parillisia ja parittomia bittikarttarivej� on eri m��r�, and due to unrecognized end of line sequence 00)
* Korjattu ajan lis�yksen tai kehysnopeusmuutoksen j�lkeinen p�ivitys
* Kun k�ytet��n Tiedosto-valikon k�sky� "Tallenna SUP nimell�...",tiedosto kirjoitetaan nyt automaattisesti yht� hyvin.
* Korjattu taustan latausvirhe (4:3 -suhde NTSC-muodossa)
* Korjattu tekstityksen ajan lis�yksen tai kehysnopeusmuutoksen virhe, joka ei p�ivitt�nyt listan aikoja.
* Nimetty uudelleen "Insert shortcut" muotoon "Insert autotext"


Versio 1.7b3 Beta
- Lis�tty SUP-ty�kalu, jonka avulla voit vaihtaa olemassa olevan SUP:in ja esin�yt�n
- Vaihdettu SUP-tiedoston tekstityksen pystysuuntainen sijainti (kaikki tekstitykset tai ainoastaan valittu)
- Vaihda haluamasi v�ri (kaikki tai valittu). 
- SUP:in tallentaminen bittikartoiksi (bmp, png, jpg) k�ytt�en nelj�� bitti� pikselill�
- SUPtiedostojen lukeminen edistynytt� synkronointia varten k�ytt�� nyt uutta rutiinia, joka on paljon nopeampi
- Kun SUP:ia ei ole k�yt�ss�, voit yht� hyvin synkronoida k�ytt�en DVD:n esinytt�� normaalissa esin�ytt�ikkunassa
- Esin�ytt�ikkunassa voidaan nyt etsi� merkkijonoa (S) ja toistaa haku (A)

Versio 1.6
Ensimm�inen versio, jossa on lokin p�ivitys 
- Olen lis�nnyt yhden suuren ominaisuuden, joka mahdollistaa DVD:n toistamisen esin�ytt�ikkunassa. Se ei kuitenkaan n�yt� viel� tekstityksi� DVD:n p��ll� (mutta tekee sen Nimike-palkissa). My�skin, toistaessasi DVD:t� se siirt�� nykyist� tekstityst� mukanaan. Jos pys�yt�t elokuvan, voit valita tekstityksen ja painaa "J" hyp�t�ksesi siihen. 

Lis�ksi olen korjannut joitain virheit�, nimitt�in:
- Tekstityksen v�rin vaihtaminen muuhun kuin oletusv�reihin pit�isi nyt olla  OK.
- PAL/NTSC-valinta on taas n�kyviss� (Esin�ytt�ikkunan context-valikossa)
- Esimerkkihakemistossa on nyt my�skin NTSC.IFO-tiedosto, jossa on sama v�ripaletti kuin PAL-tiedostossa.(BTW, luen aina v�ripaletin PGC1:st�).
- SC-ikkuna ei katoa en�� (se oli ominaisuus, jonka poistin, koska se aiheutti liikaa ep�mukavuutta).
- Anti-aliasing-arvo on korjattu, eik� ole en�� riippuvainen ulkoreunan leveydest�.
- Automaattista rivink��nt�� laajennettu - ei ole viel� t�ydellinen, mutta p��sen perille.
- Kun vaihdat tekstitysikkunan paikkaa, n�et sen nyt vet�ess�si.
