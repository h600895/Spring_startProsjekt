# DAT108 - Oblig 4

# TODO

Påmeldingsside:

- [x] Har felter for Fornavn, Etternavn, Mobil, Passord, Passord repetert, og kjønn
- [x] Påmeldingsknapp for innsending av skjema
- [x] Ved suksessfull påmelding skal man bli logget inn med mobilnummer som brukernavn
- [ ] Alle felter er obligatoriske og skal valideres som beskrevet nedenfor
- [ ] Ved suksessfull påmelding skal man få en bekreftelse på at man er påmeldt, med informasjonen man er meldt på med.

Deltagerliste:

- [x] Siden har en liste over deltagere og en knapp for å logge ut
- [x] For å kunne se deltagerlisten må man være innlogget som en påmeldt deltager. Siden skal sikres mot uautorisert tilgang.
- [x] Uautorisert tilgang sender deg til innloggingssiden
- [x] Listen av deltagere skal være sortert stigende på fornavn, så etternavn.
- [x] Innlogget deltager er uthevet med grønn bakgrunn
- [x] Trykk på Logg ut skal logge ut brukeren og ta deg tilbake til innloggingssiden.

Innloggingsside:

- [x] Siden har et skjema med bokser for Mobil og Passord, og en knapp for å logge inn.
- [x] Vellykket innlogging sender deg videre til deltagerlisten
- [x] Ved ulike feilsituasjoner skal man sendes tilbake til innloggingssiden med feilmelding i rødt
- Eksempler på feilmeldinger:
  - [x] Forsøk på requester som krever at du er innlogget når du ikke er det
  - [x] Ugyldig info ved innlogging
  - [ ] Andre relevante feil

Validering:

- [ ] Validering av input ved påmelding skal skje BÅDE hos klient og på tjener
- [ ] Validering i nettleser gir brukeren umiddelbar tilbakemelding mens det tastes, feks styrke på passord
- [ ] Validering i tjener sikrer at mottatt data er gyldig
- [X] FORNAVN: 2-20 tegn, kan inneholde bokstaver (inkl. æøåÆØÅ), bindestrek og mellomrom. Første tegn skal være stor bokstav.
- [X] ETTERNAVN: 2-20 tegn, kan inneholde bokstaver, bindestrek (ikke mellomrom). Første tegn skal være stor bokstav
- [ ] MOBIL: Eksakt 8 siffer. Må være unikt, altså kan ikke samme nummer være brukt før.
- [ ] PASSORD: Bestem krav til passord selv, styrke på passord skal angis med farge mens man skriver, sistenevnte kun på klientsiden.
- [ ] REPETERT PASSORD: Må være helt likt passord.
- [X] KJØNN: Sjekkboks for mann eller kvinne.
- [ ] Data valideres på klienten før de sendes til tjeneren. Man skal kunne se "live" om dataen er gyldig eller ikke. Rød ramme er ugyldig, grønn ramme er gyldig. For passord har man gul ramme hvis gyldig men svakt passord, og grønn ramme hvis gyldig og sterkt passord.
