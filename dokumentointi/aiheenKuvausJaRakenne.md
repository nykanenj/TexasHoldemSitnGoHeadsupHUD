**Aihe:** Toteutetaan Texas Holdem Headsup SitnGo pelejä varten oleva HUD, eli Head-Up Display.

**Taustatietoa:** Texas Holdem Headsup on 1v1 pelimuoto. SitnGo on turnaustyyppinen pelimuoto, pelaajat ostavat itsensä sisään ja saavat saman määrän alkuchippejä. Alkupanoksen koko kasvaa koko ajan ajan edetessä, voittaja saa tyypillisesti 1,8 kertaa sisäänostosumma. Olemassa on jo vastaavia ohjelmia, muttei mitään näin spesifiä.

**Käyttäjät:** Texas Holdem Headsup SitnGo pelejä pelaavat. Pelaajat voisivat käyttää tätä aputyökaluna pelinsä kehittämisessä.

**Toiminnot:**
* Käsien lukeminen tekstitiedostoista yksinkertaiseen tietokantaan käseittäin
  * Tulee lukea vain uudet tekstitiedostot, ei saa tuoda vanhaa tietoa toiseen kertaan tietokantaan
* Erilaisen statistiikan / mittareiden laskeminen
  * preflop fold prosentti
  * preflop call prosentti
  * preflop raise prosentti
  * preflop fold-to-raise prosentti
  * preflop call-to-raise prosentti
  * preflop reraise prosentti
* Ylläolevien mittareiden laskeminen kaikille streeteille, flopille, turnille ja riverille, sekä myös muiden mittareiden laskeminen kuten donk-bet ja check-raise prosentit
* Statistiikan esittäminen graafisena muotona
* Pelaajan tyypillisimpien heikkouksien indikoiminen statistiikan perusteella.

**Jatkolaajennusmahdollisuuksia:**
* Grafinen preflop käsivahvuustaulukko preflop käsirangen suunnittelun avuksi
* Käyttäjälle mahdollisuus luoda itse omia indikaattoreita?

**Ensimmäinen Luokkakaavio**

![Luokkakaavio](MaarittelyvaiheenLuokkakaavio.JPG)

**Versio 2 Luokkakaavio**

![Luokkakaavio2](LuokkakaavioViikko3.JPG)


**Versio 3 Luokkakaavio**

![Luokkakaavio3](Luokkakaavio3.png)

**Versio 4 Luokkakaavio**

![Luokkakaavio4](Luokkakaavio4.png)

**Rakennekuvaus**

Viimeisimpään luokkakaavioon on tullut paljon muutoksia, ylimääräisiä luokkia on poistettu paljon ja ohjelman rakenne on selkeytynyt. Ohjelmaa ajettaessa HeadsupHUD toimii main luokkana. HeadsupHUD luokka luo Handreaderin, HudGUI:n ja HandHistoryTextToObjectConverterin. Handreader lukee käsihistoriatiedot tekstitiedostosta, converter muuttaa tiedot objektimuotoon, jolloin tietoa pystyy käsittelemään ja hakemaan statistiikkaa tiedosta. Objektit tallennetaan Datastorageen. Tietoa halutaan hakea pelaajan, position, ja streetin mukaan, joten datastoragen "alta" löytyy luokka jokaiselle osa-alueelle. HudGUI pääsee hakemaan statistiikkaa Datastoragesta.

**Sekvenssikaavio 1: Kaiken statistiikan haku tietyltä pelaajalta**

![Sekvenssikaavio1](AllStats.png)

**Sekvenssikaavio 2: Kasihistorianlataaminen**

![Sekvenssikaavio2](Kasihistorianlataaminen.png)

![Alt text](http://yuml.me/diagram/scruffy;dir:TB;scale:80/class/ "Edit Later")
