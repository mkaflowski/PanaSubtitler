Asentaminen:
Asentaminen on yksinkertaista - riittää, kun suoritat setup.exe-ohjelman ja seuraat ohjeita.

Vaatimukset:
Ota huomioon, että (ilmaisen) .NET v2 framework'in on oltava asennettuna PC:lle (http://www.microsoft.com/downloads/details.aspx?displaylang=fi&FamilyID=0856eacb-4362-4b0d-8edd-aab15c5e04f5), ja näytön vähimmäisresoluutio 800x600. Lisäksi voidaksesi käyttää DVD:n esinäyttöominaisuuksia on DirectX:n oltava asennettuna.

TEHTÄVÄ
- CHG_COLCON -asetusten kirjoittaminen "Muokkaa SUP:ia"-ikkunassa.
- Taustakuvien tuonti - tarkasta näyttösuhdeasetukset

MUUTOSLOKI (EPÄTÄYDELLINEN):

Versio 2.XX:
Korjatut virheet:
*Korjattu virhe muunnoksessa SRT:stä SUP:iksi. SC:n muodostaessa tekstitystä kiinteään taustakuvaan  vasemman yläkulman pikseli ei ollut asetettu oikean väriseksi. Tämän pitäisi nyt olla kunnossa.
*Apua"valikon Käyttöohje-komento toimii Acrobat Reader 8:ssa.

Versio 2.2:
* "Käytä oletusväriasetuksia" -valintaruutu  "Muokkaa SUP:ia"-ikkunassa on tyhjä, avattaessa uutta väripalettia tai VobSub-tiedosto on auki, koska se tyhjentää paletin. (SUP-tiedostoa avattaessa se ei ole tyhjä).
* IDX-tiedoston avaaminen vaihtaa tarvittaessa liittymän automaattisesti PAL- tai NTSC-muotoon.
* HDSUP-tekstityksen koko vaihdetaan riippuen PAL- tai NTSC- tilasta  "Muokkaa SUP:ia"-ikkunan toimintatavan asetuksista.
* "Muokkaa SUP:ia"-ikkunassa korjattu NTSC- tai PAL- tavan vaihto, jossa oli virheitä.
* NTSC/PAL-asetukset toimivat samalla tavalla pääikkunassa ja "Muokkaa SUP:ia"-ikkunassa...
* Viimeksi käytetty profiili ladataan käynnistettäessä oletuksena uudelleen.
* Korjattu virhe, jonka johdosta VobSubtiedostoa ei voinut käyttää synkronointiin samalla tavalla kuin SUP-tiedostoja..
* Profiilinhallinta käynnistyy aktiiviseen profiiliin.
* "Varoita virheistä" voidaan nyt ottaa käyttöön vain, kun virheiden korostus on sallittu.
* Sup-tiedostonimet olivat aina väliaikaishakemistossa etusijalla. Tämä oli virhe Velho-ikkunassa, joka on nyt korjattu.
* Palautettu VobSub (.idx) -tiedostojen käyttömahdollisuus DVD-julkaisuvelhossa.
* Lisätty DVD-julkaisuvelhoon uusi valintaruutu, joka sallii DVD:n värien pakottamisen SC:n ensisijaisiin väreihin.

Versio 2.2.2:
Uudet ominaisuudet:
* Manusse lisäsi mahdollisuuden lukea HD SUP:eja
* PAL-NTSC-näyttömuodon vaihdon jälkeen välkkymisetäisyys säädetään automaattisesti.
* CHG_COLCON -ohjeiden kirjoitusmahdollisuus, jossa voi käyttää lisäväriä sanan korostamiseen, esim. karaokeen, käyttäen <k>word</k>.
* CHG_COLCON -ohjeiden lukumahdollisuus  ikkunassa "Muokkaa SUP:ia" - toimi ainakin mpucoder'in esimerkissä
* HD-SUP-tiedostojen tuontimahdollisuus (demuxattu käyttäen EVODemux'ia). HD-SUP-tiedostot muunnetaan lennossa vakio-SUP-tiedostoiksi. Silloin niitä voidaan käsitellä normaaleina SUP-tiedostoina.

Virheiden korjauksia:
* Tuhottaessa tekstityksiä "Muokkaa Sup'ia tai VobSub'ia"-valikossa valinta siirtyy poistamisen jälkeen seuraavaan, ei ensimmäiseen.
* "Tiedosto -> Tallenna VobSub nimellä..." ja "Tiedosto -> Tallenna SUP nimellä..." valikot on korjattu.
* (minor) Laajennettu "Tallenna SUP nimellä..." ja "Tallenna VobSub nimellä..." käyttäytymistä.
* DVD -velho ei lukenut oikeita IFO-tiedostoja (tekstityksen asetukset eivät olleet oikein, aika luettu väärin)
* VobSub tallenna nimellä - valitettu, ettei kirjoita

Versio 2.1
Uudet ominaisuudet:
* SC voi nyt viedä/tuoda väripaletteja SUP-tiedostojen mukana. Tuetut muodot ovat .IFO, .clb (PgcEdit) ja .mxp (Muxman). SC:n ja PgcEdit:in välillä voi myös kopioida/liittää väripaletin.
* VobSub-tiedostojen (sub/idx) luku ja kirjoitus tapahtuu samoin kuin SUP-tiedostojen, ja VobSub-tiedosto voidaan luoda suoraan srt- tai sub- tekstitiedostosta. Voidaan myöskin avata SUP-tiedosto ja kirjoittaa se sub/idx-tiedostoksi tai päinvastoin (avaa VobSub-tiedosto (sub/idx)ja kirjoitetaan se SUP-tiedostoksi). Jos Sinulla on vobsub-tiedosto (.sub) ilman kytkettyä .idx-tiedostoa (tai idx on poikki), voit käyttää SubtitleCreatoria muodostamaan uuden. Mene "Työkalut->Muokkaa SUP:ia". Avaa IFO-tiedostosi, jos sellainen on (väripaletin takia), avaa sub-tiedosto ja tallenna se sub-muodossa, jolloin SubtitleCreator muodostaa automaattisesti vastaavan idx-tiedoston. Voit jopa käyttää VobSub-tiedostoja DVD-julkaisuvelhon kanssa ja luoda niitä käyttäen komentoriviliittymää. Tällä hetkellä voidaan ainoastaan VobSub-syöttötiedostoja purkaa käyttämällä VSRip'iä, sisältävät ne useampia virtoja tai sitten ei. Myöskin tekstitysvirran lisääminen onnistuu olemassa olevan VobSub-tiedoston loppuun.
* Lisätty Google-käännöstyökalu tekstitysten automaattiseen kääntämiseen
* Lisätty optinen merkintunnistus (OCR) käyttäen Microsoft Office 2003:a, muuntamaan SUP SRT-muotoon.
* Mahdollisuus peittää tai kätkeä rautakoodatut DVD-tekstitykset peittämällä ne läpinäkymättömällä (mustalla) taustalla. Manuaalisen kappaleen vaihdon jälkeen on odotettava, kunnes ensimmäinen tekstitys ilmestyy, ennekuin se näkyy (tekstityksillä ei ole lopetusaikaa, mutta ne täytyy käynnistää).
* Lisätty DVD-velhoon tuki wav- ja mpa-tiedostoille
* Etukäteen asetetun väripaletin automaattinen käyttöönotto, kun alkuperäisellä DVD:llä ei ole tekstitysvirtoja. Siten vältetään musta/vihreät tekstitykset.
* Lisätty kolme uutta komentonappulaa: yksittäisen tekstin fontin asettaminen sekä fontin suurentaminen ja pienentäminen

Virheiden korjauksia:
* Muodostetut VobSub-tiedostot ovat nyt yhteensopivia Philips DVP-5960 SAP:in kanssa. Siitä kiitokset FitzGerald'ille
* SC ei kaadu enää ristiriitaisessa tilanteessa <font "#0000FF">Tämä on sininen</font> tagissa
* Ei-merkkauksen automaattinen korvaus < ja > kera <s lt/>, <s gt/> tai &lt; ja &gt;
* Korjattu manuaalinen valinta - tilanteessa, jossa kieltä ei ole asetettu, valitaan nykyiseen käyttöliittymään kuuluva kieli
* Ei enää poikkeusta toistettaessa kahden tekstityksen SRT/SUB-overlaytiedostoa.
* Profiilien pystyasemointi tallennetaan ja palautetaan oikein
* DVD-julkaisuverhon lopputuloksessa audiovirrat olivat joskus sekaisin.
* Väärän tekstitystiedoston muodostamaa poikkeusta ei ladata automaattisesti ohjelman käynnistyessä.
* Avattaessa ja kirjoitettaessa SUP-tiedostoa jotkut kestoajat olivat hieman muuttuneet. Näin ei pitäisi enää käydä.
* Tekstitystä käännettäessä ("Työkalut"-valikossa)ikkuna voidaan skaalata oikein, lukea IFO ja tallentaa se, vaikkei se olisikaan täydellinen (ei saa valita "Poista välit luettaessa" - täytyy korjata)
* "Näytä todellinen tulos"-asetus palautetaan oikein käynnistyksessä.
* Käytettäessä DVD-julkaisuvelhoa voidaan SRT-tiedostoja käyttää, vaikka ne eivät olisi samassa hakemistossa kuin alkuperäisen DVD:n tiedostot.
* Joitakin pieniä käyttäliittymän laajennuksia

Versio 2.0.6
- Lisätty ranskankielinen käyttöopas

Versio 2.0.5
- Korjattu Viivefunktio SUP-muokkauksessa
- Korjattu DVD sunkronointilistan valikko (joskus tekstityksiä ei oltu lajiteltu oikein)
- Päivitetty asetuksia, joten välkkymisarvojen pitäisi olla herkemmät arvot.

Versio 2.0.4
- Muutamia korjauksia Kirjoita SUP-funktioon ja muistiin kirjoitukseen virheen korjaamiseksi SUP:n uudelleenkirjoituksessa.
- Lisätty mahdollisuus valita kieli DVD-velhossa
 
Versio 2.0.1
- Korjattu virhe tekstitysten poistamisessa
- Poistettu vanhempaa dokumentaatiota
- Käyttöohjeen osittainen päivitys yhdellä viimeisen version ruudunkaappauskuvalla
- Joitakin korjauksia ranskankieliseen käännökseen

Versio 2.0.0
- Graafista käyttöliittymää on laajennettu Outlookin näköisellä työkalupalkilla ja jakajalla.
- Tekstitysoverlayn käytettävyyttä on parannettu; toistettaessa ei pitäisi enää näkyä nykimistä
- Korjattu SUP-tiedostojen muokkauksessa pieni virhe, joka aiheutti SUP:in siirtymisen yhden pikselin verran alaspäin 

Versio 2.0.0, SubtitleCreator'in RC1 eroaa monin tavoin edellisestä versiosta 1.9.2. Koska se on julkaisukandidaatti, arvostaisimme kommentteja ja virheraportteja (voit jättää ne SubtitleCreatorin foorumiin, tänne tai kirjoittaa meille yksityisviestin (tekstitysoverlay-asioista manusse&users.sourceforge.net , minulle lopuista): 
- Manusse järjesti tekstitysoverlayn DVD:n päälle, joka olikin eniten pyydetty ominaisuus! Tällöin voidaan nähdä lopputulos, ennenkuin poltetaan ne DVD:lle, eikä siinä vielä kaikki: voit jopa todella katsoa DVD:si uusien tekstitysten kanssa. Lisäominaisuutena voit kytkeä ne alkuperäisiin tekstityksiin. Suotimen nykyisen version testausta on laajennettu PowerDVD:hen, joten muidenkin DVD-soittimien pitäisi myös toimia. Voit poistaa ominaisuuden käytöstä "Asetukset"-valikossa. 
Tämä tarkoittaa itse asiassa sitä, että CLVSD.ax:n täytyy olla rekisteröitynä järjestelmässä käyttäen "regsvr32 path\CLVSD.ax". Sitä voi myöskin etsiä X:\WINDOWS\SYSTEM32-kansiosta.
- Puoliautomaattinen tekstitysten lisäys Valikko säilyttäen, käyttällä ainoastaan ilmaisohjelmia: The DVD-velhoa ("Työkalut"valikko, tai CTRL-W) on laajennettu runsaasti. Se mahdollistaa SUP-tekstitystiedoston luomisen alussa, jonka jälkeen velho demultiplexoi sen Sinulle (PgcDemux hoitaa), multiplexoi sen uudelleen (MuxMan hoitaa), ja lopuksi lisää sen valmiin DVD:n rakenteeseen säilyttäen valikot (VobBlanker'in viimeinen versio v2.1.1.0 RC1 hoitaa).
Tässä lyhyt opas, kuinka se toimii: 
1) Avaa velho(CTRL-W), 
2) Valitse jokin tiedosto alkuperäiseltä DVD:ltä, paina seuraava (jos originaali sisältää tekstityksiä, ne puretaan nyt)
3) Valitse uusi tekstitys ja sen kieli: pääikkuna avautuu uudelleen, jolloin voit valita profiilin, tekstityksen asettelun ja korjata virheitä (klikkaa CTRL-Z mennöksesi seuraavaan virheeseen).
4) Käytä "Synkronointi"-valikkoa avaamaan yhden tekstityksen alkuperäisen puretun SUP:in tiedostoista: valitse vastaavat parit (läheltä alkua ja loppua: kaksoisklikkaa läytääksesi lähimmän tekstin toisesta ikkunasta) ja paina "Synkronoi". 
5) Luo SUP ja palaa DVD-velhoon
6) Paina "Aloita" ja anna SC:n tehdä loput(se kutsuu PgcDemux'in, MuxMan'in ja VobBlanker'in)

- Lisätty käännöstyökalu SUP:in (kielen) kääntämiseksi SRT-muotoon ("Työkalut"-valikko): Se on vielä tehtävä manuaalisesti, mutta ainakin aikatiedot kopioidaan alkuperäisestä SUP-tiedostosta. 
- Lisätty Viimeksi eniten käytetyt-lista.
- Ohjelma toimii .NET2 framework:in alaisena. Paha puoli on, että se on asennettava, jos sitä ei ole, mutta on se sen arvoistakin... se vain näyttää paljon paremmalta.
- Siinä on myöskin tuki Closed Caption-tekstityksille, vaikka onkin vielä kehittäjänsä XXX:n testattavana. Koska en itse niitä käytä, en myöskään pysty testaamaan...
- Lisäksi on monta lisäystä ja pikku korjausta, esim. se avaa oletuksena viimeksi käytetyn tekstitystiedoston, se tallentaa ikkunan aseman ja koon (tallentaessasi asetukset), se käyttää oletuksena Heathcliff'in renderöintialgoritmia (näyttää paljon paremmalta!), ja muitakin, jotka olen unohtanut... 
- Viimeisenä mutta ei vähiten tärkeänä: nykyinen versio on compiloitu ja luotu avoimen lähdekoodin SharpDevelop IDE:llä, joka on hyvä vaihtoehto VS2005:lle (erityisesti, koska se on ilmainen ja sillä on samanlainen look-and-feel, eli näyttää samalta ja tuntuu samalta) Ainoastaan debuggaus on vaikeampaa, mutta loppujen lopuksi se on todella upea, ja senkin voit ladata SourceForge'sta.  

Tehty:
- Monikielisyyden tuki

Virheiden korjauksia:
- Korjattu SC:n virhe luettaessa tekstitystiedostoja, joissa on tyhjiä (tai pahasti muuntuneita) rivejä. Korjattu myös virhe, joka raportoi virheestä kelvollisessa tekstityksessä. 
- Korjattu the initial subtitle position selected in the DVD wizard (was one too low by default)
- Korjattu Kehysnopeuden muunnos-työkalu kielissä, joissa käytetään pilkkua (,) pisteen (.) asemesta muodostamaan järjellisiä numeroita
- Ohitetaan SUB-tiedoston rivit, jotka eivät ala "{". Jos kehysnopeus on eritelty, sitä käytetään.  

  
Versio 1.9.2
- Manusse käänsi SC:n ranskaksi. Käännös julkaistaan pian.
- Nyt on mahdollista rajoittaa ikkunan kokoa 800x600 -näytöille. Tässä tapauksessa pitää poistaa käytöstä "Näytä DVD:n synkronisaatio"-ominaisuus asetusikkunassasillä sille ei ole enää tilaa.
- Ikkunan muokkaus on mahdollista
- Yksinkertainen mahdollisuus poistaa rivinvaihdot, jos lopputulos ei mahdu tekstitysikkunaan
- Lisätty linkki ohjelman kotisivulle (uusien versioiden etsinnän helpottamiseksi)

Virheiden korjauksia:
- XML-asetuksissa ja profiilitiedostoissa tehdyissä muutoksissa ja uudemman version kyvyssä lukea vanhoja asetuksia ja profiileja on vanhemmassa versiossa havaittu yhteensopimattomuuksia, joiden pitäisi olla korjattu tähän versioon.
- Korjattu SUP-muokkausta, koska hyvissä SUP-tiedostoissa suoritetut värin vaihdot eivät näy uusissa
- Korjattu <L> suurille fonteille, joka sai usein aikaan sen, etteivät ne mahtuneet tekstitysikkunaan
- DVD -velhoa on laajennettu, joten nyt sitä voi käyttää demuxaamaan automaattisesti (käyttäen PgcDemux'ia), muxaukseen (käyttäen Muxman'ia), ja korvaamaan alkuperäiset IFO:t (käyttäen BatchUpdateIfo:a)
- Korjattu pieni virhe, joka vaihtoi "..." muotoon ". . . "

Versio 1.9.1
Uudet ominaisuudet:
* Lisätty Heathcliff'in välkkymättömyyssuodin, jonka pitäisi mahdollistaa parempi kontrasti tavallisessa televisiossa erityisesti suuremmilla fonteilla. Lisäksi se näyttää persialaisen fontin liitosviivat oikein.
* Lisätty "Apua"-valikkoon linkki nabe3net'in japaninkieliseen SC:hen ja käyttöoppaaseen
* [Pyynnöstä] Tuki pystysuuntaisille fonteille (vaakanäyttö, oikealta vasemmalle), katso profiili 4 - esimerkkinä japanilainen fontti
* [Pyynnöstä] SUP-tiedostoihin voidaan asettaa viive
* [Pyynnöstä] Ikkunakoon muutos sallittu
* [Pyynnöstä] "Asetukset"-valikossa voidaan poistaa työkaluvihjeet käytöstä
* [Pyynnöstä] "Asetukset"-valikossa voi ottaa käyttöön ylimääräisten asettelukehysten näyttämisen
* [Pyynnöstä] Lisätty komentorivi-liittymä, eli esim. kirjoittamalla komento "SubtitleCreator test.srt -p1 -iVTS_01_0.IFO" muuntaa tiedoston test.srt käyttäen profiilia 1 ja viimeistä IFO-tiedostoa luomaan tiedoston test.sup.
* Luotu muoto profiilien hallintaan.
* A-B -toistoa käytetään luomaan tekstityksiä DVD:lle, jolla sellaisia ei ole: Tapauksessa, ettei yhtään tekstitystä ole, mutta sellainen halutaan luoda tyhjästä, voit luoda uuden tiedoston (CTRL-N)ja käynnistää DVD:n. Kun se pyörii, voit painaa A-B -nappulaa merkitäksesi uuden tekstityksen alkukohdan (ensimmäinen painallus, tai CTRL-A) ja lopun (toinen painallus), jolloin DVD kertaa näiden paikkojen välillä, kunnes painat kolmannen kerran. Koska painalluksen sekä tekstityksen alku- ja loppuaikojen välillä on tyypillinen viive, voit määritellä nämä viiveet Settings.xml-tiedostossa.
* Taustakuvan vaihto pitää taustan mustana: tämä siksi, että IFO:n lukemisen jälkeen formaatti pitäisi asettaa oikeaksi (jos ikkunointi ei tehnyt jo muutosta, kuten tapahtuu esim. WinDVD:ssä, jolloin pitäisi käyttää 1:1 -muotoa).

Virheiden korjauksia:
* Korjattu ", ...":n korvaus ",. ..":llä
* Musiikkisymboli on korjattu uudelleen: käytä <s M/> näyttääksesi kaksoisnuotin tekstityksessä
* Korjattu DVD:n vierityspalkin päivitys

Versio 1.9.0
Uudet ominaisuudet:
* Monia lisäyksiä DVD-julkaisuvelhoon - toiset ulkoisia, toiset sisäisiä - IFO-tiedostojen parempaa käsittelyä varten
* Lisätty mahdollisuus muuttaa rivien etäisyyttä (rivin korkeus).
* "Muokkaa SUP:ia"-työkalussa voi käyttää context-valikkoa poistamaan valittuna olevan tekstityksen.
* Olen lisännyt "Apua"-valikkoon linkkejä tekstitysten lataussivuille.
* Synkronointi voidaan nyt tehdä käyttämällä toisia tekstitys-tekstitiedostoja.
* Asetusten tallennus on erotettu Profiilien tallentamisesta - asetukset tallennetaan Settings.xml- ja Profiles.xml-tiedostoihin. Lisäksi ne on  tallennettu pysyvästi (voidaan poistaa asennusta poistettaessa), joten muutokset on tallennettu päivitysten välillä. SC käyttää kansiota C:\Documents and Settings\Käyttäjänimi\Application Data\SubtitleCreator\, jos mahdollista. Muuten oletuksena on ohjelmakansio.
* Lisätty koodisivun vaihtomahdollisuus, joten alueellisia asetuksia ei tarvitse vaihtaa Config-valikossa, eli jos käytät normaalisti englantia mutta haluat joskus lisätä esim. romaniankielisiä tekstityksiä voit asettaa koodauksen Itä/Keski-Eurooppa, jolloin kirjaimet näkyvät oikein. Jos koodisivuja puuttuu, kerro minulle siitä, tai lisää ne itse Settings.xml:ään.
* Pikapolun lisäys näyttää nyt kuvauksen määrittelyn asemesta (plus hymiö-pikapolun).
* Muutettu hieman "Ajan muuttaminen"-ikkunaa - voit käyttää ylös/alas-nuolta ajan lisämiseen/vähentämiseen 100 ms:lla.
* Uusi tekstityksen tallentamismahdollisuus ennen ohjelmasta poistumista (jolloin voi tallentaa sen käyttäen olemassaolevaa nimeä, tai peruuttaa ja palata ohjelmaan).
* Profiilivalikkoa on laajennettu, joten nyt voit poistaa profiileja: jos vaihdat profiilia ja painat "Tallenna", ohjelma kysyy profiilin uutta nimeä.
* Vaihdettu oletusväripaletti MuxMan'in ja PgcDemux'in käyttämään oletuspalettiin.
* Lisätty tekstityksen keston tarkastus (jos merkkiä/sekunnissa ylittää Settings.xml-tiedostossa:ssä määritellyn enimmäisluvun, tausta muuttuu vihreäksi - mitä vihreämpi, sitä suurempi virhe).
* Lisätty poistomahdollisuus ladattaessa kuulovammaisten tekstitystä, esimerkiksi teksti [HEARING IMPAIRED] tai (HEARING IMPAIRED).
* Lisätty mahdollisuus jättää valitsematta tekstitys, jossa on merkintä http, www tai @ (voit myös tehdä sen ladattaessa).
* Tekstitysten jakaminen muuttaa ajan suhteessa alimerkkijonojen pituuteen.
* Lisätty mahdollisuus näyttää ainoastaan tekstitykset, joissa on jonkinlainen ongelma (kestossa, jolloin käytetään sinistä taustaa, tai pituudessa). Molemmat virheet näyttävät tekstin punaisella fontilla.
* Määriteltyjen IFO-värien asettaminen Settings.xml-tiedostossa (ei vielä mahdollisuutta määrittelyyn valikossa).
* Lisätty mahdollisuus vetää ja pudottaa tekstitystiedostoja listanäyttöön (paina SHIFT korvataksesi nykyisen tiedoston, paina CTRL lisätäksesi vedetyn tiedoston, ja jollet käytä mitään muuttujaa, se käyttää tiedostovalikon "Liitä tekstitykset"-käskyä).
* Lisätty pikanäppäin F2, joka muokkaa valittua tekstitystä (F2 tekstille, CTRL-F2 alkuajalle ja ALT-F2 loppuajalle).
* Toisen tekstityksen latauksen jälkeen on mahdollista määritellä sen viive AVI-tiedoston kestoon (avaamalla AVI-tiedosto).
* Liitetty ohjelman asennuksen purku.
* Lisätty varoitus (valinnainen) tekstityksen kesto- tai pituusvirheistä ennen niiden muuntamista SUP-tiedostoksi.
* Asetettu listanäytön työkaluvihje näyttämään valittujen tekstitysten varoitusviestit (liian suuri pituus tai liian lyhyt kesto).

Virheiden korjauksia:
* Nimetty valikoita uudelleen, muutettu asetusten paikkoja CoNS:IN palautteen pohjalta. Vähennetty DVD-velhon tekstiä, lisätty työkalupalkki, lisätty Peruuta-näppäin "Poista profiili"-viestiin, ja paljon muuta...
* Korjattu Ukendt:in raportoima NTSC:hen vaihtamisen ja asetusten tallennuksen virhe

Versio 1.8.7
Virheiden korjauksia:
* Viimeinkin löydetty Application.DoEvents(), joka piirtää ikkunan uudelleen taustatehtäviä ajettaessa.
* Poistettaessa valinta "Korosta liian pitkät tekstitykset" poistettu context-valikon katseleminen-funktio.
* Virhe korjattu SUP-tekstitysten muokkauksessa ja automaattinen asemointi-työkalussa.

Versio 1.8.6
Uudet ominaisuudet:
* Voit tallentaa/poistaa nykyiset asetukset ja luoda uusia profiileita (profiili sisältää määritellyn fontin ja muut muotoiluasetukset).
* DVD-julkaisuvelho antaa mahdollisuuden lisätä tekstityksen yksinkertaiselle DVD:lle (ilman valikkoa), ainakin jos PgcDemux ja MuxMan on asennettu.

Päivityksiä ja virheiden korjauksia:
* Automaattinen tekstityksen asettelu korjattu.
* Vaakasuuntainen asettelu - keskellä, oli poikki, ja on nyt korjattu.
* Aika-arvojen muokkaus on helpottunut: voit käyttää ylös/alas-nuolia vähentääksesi/lisätäksesi aikaa 100 ms askelin, siirrettäessä ylihyppää  merkit ':' ja ','.
* Lisätty listanäyttöön oikean nappulan käyttömahdollisuuden, jolloin vot siirtyä seuraavaan liian pitkään tekstiin.
* Nimetty uudelleen "Show actual output (no AA)" muotoon "Show actual output", kuvan käyttäessä vielä anti-alias-muotoa, mutta ei luota hassuun ikkunan AA:han, joka ei kuitenkaan sovi DVD:lle, koska DVD sallii tekstityksiin vain neljä väriä.
* Nimetty uudelleen  "Check subtitle length" muotoon "Show too long subtitles"

Versio 1.8.5
Uudet ominaisuudet:
* Lisätty "valitse/älä valitse kaikki tekstitykset" Listanäytön context-valikkoon
* Lisätty "Poista katkenneet linkit" Listanäytön context-valikkoon
* Lisätty uusi (pyydetty) kuvasuhde 2.21:1
* Lisätty "Etsi"-funktio Muokkaa SUP:ia-ikkunaan
* Lisätty työkalupalkki Muokkaa SUP:ia-ikkunaan
* Lisätty SUP:in aseman automaattinen asettelu ( SUP-tekstityksen automaattinen asemointi valitulle tekstitysalueelle)

Virheiden korjauksia:
* Virhe joidenkin DVD-soittimien kanssa (rivit vapisevat, koska parillisia ja parittomia bittikarttarivejä on eri määrä, and due to unrecognized end of line sequence 00)
* Korjattu ajan lisäyksen tai kehysnopeusmuutoksen jälkeinen päivitys
* Kun käytetään Tiedosto-valikon käskyä "Tallenna SUP nimellä...",tiedosto kirjoitetaan nyt automaattisesti yhtä hyvin.
* Korjattu taustan latausvirhe (4:3 -suhde NTSC-muodossa)
* Korjattu tekstityksen ajan lisäyksen tai kehysnopeusmuutoksen virhe, joka ei päivittänyt listan aikoja.
* Nimetty uudelleen "Insert shortcut" muotoon "Insert autotext"


Versio 1.7b3 Beta
- Lisätty SUP-työkalu, jonka avulla voit vaihtaa olemassa olevan SUP:in ja esinäytön
- Vaihdettu SUP-tiedoston tekstityksen pystysuuntainen sijainti (kaikki tekstitykset tai ainoastaan valittu)
- Vaihda haluamasi väri (kaikki tai valittu). 
- SUP:in tallentaminen bittikartoiksi (bmp, png, jpg) käyttäen neljää bittiä pikselillä
- SUPtiedostojen lukeminen edistynyttä synkronointia varten käyttää nyt uutta rutiinia, joka on paljon nopeampi
- Kun SUP:ia ei ole käytössä, voit yhtä hyvin synkronoida käyttäen DVD:n esinyttöä normaalissa esinäyttöikkunassa
- Esinäyttöikkunassa voidaan nyt etsiä merkkijonoa (S) ja toistaa haku (A)

Versio 1.6
Ensimmäinen versio, jossa on lokin päivitys 
- Olen lisännyt yhden suuren ominaisuuden, joka mahdollistaa DVD:n toistamisen esinäyttöikkunassa. Se ei kuitenkaan näytä vielä tekstityksiä DVD:n päällä (mutta tekee sen Nimike-palkissa). Myöskin, toistaessasi DVD:tä se siirtää nykyistä tekstitystä mukanaan. Jos pysäytät elokuvan, voit valita tekstityksen ja painaa "J" hypätäksesi siihen. 

Lisäksi olen korjannut joitain virheitä, nimittäin:
- Tekstityksen värin vaihtaminen muuhun kuin oletusväreihin pitäisi nyt olla  OK.
- PAL/NTSC-valinta on taas näkyvissä (Esinäyttöikkunan context-valikossa)
- Esimerkkihakemistossa on nyt myöskin NTSC.IFO-tiedosto, jossa on sama väripaletti kuin PAL-tiedostossa.(BTW, luen aina väripaletin PGC1:stä).
- SC-ikkuna ei katoa enää (se oli ominaisuus, jonka poistin, koska se aiheutti liikaa epämukavuutta).
- Anti-aliasing-arvo on korjattu, eikä ole enää riippuvainen ulkoreunan leveydestä.
- Automaattista rivinkääntöä laajennettu - ei ole vielä täydellinen, mutta pääsen perille.
- Kun vaihdat tekstitysikkunan paikkaa, näet sen nyt vetäessäsi.
