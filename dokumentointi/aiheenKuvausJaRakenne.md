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

**Luokkakaaviot**
* ![Luokkakaavio](MaarittelyvaiheenLuokkakaavio.JPG)

![Alt text](http://yuml.me/diagram/scruffy;dir:TB;scale:80/class/ "Edit Later")
