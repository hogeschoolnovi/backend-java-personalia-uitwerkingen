# Personalia applicatie

## Inleiding

In deze les hebben we gewerkt met variabelen, if-statements, methodes en de Scanner.
Met deze bouwblokken kan een eenvoudige applicatie worden gemaakt die informatie opslaat en teruggeeft aan de gebruiker.

In deze opdracht ga je een applicatie maken die jou personalia opslaat. We hebben alvast een beginnetje voor je gemaakt. De start code kun je vinden in `src.Main.java`

## Opdrachtbeschrijving

Er staat al een korte applicatie voor je klaar in `src.Main.java`. In deze applicatie kun je je naam invullen en wordt dat opgeslagen. We willen echter meer informatie opslaan en we willen ook ons profiel kunnen printen. Aan jou de taak om de applicatie verder af te maken.

De applicatie slaat de volgende gegevens van jou op:

- name (String) - volledige naam van de student.
  - **Voorbeeld**: "Jan Jansen"

- age (int) - leeftijd in hele jaren.
  - **Voorbeeld**: 20

- email (String) - e‑mailadres.
  - **Voorbeeld**: "jan.jansen@example.com"

- adress (String) - adres of woonplaats.
  - **Voorbeeld**: "Oudeweg 12, Amsterdam"

- phone (String) - telefoonnummer (in de applicatie verwacht als string met cijfers).
  - **Voorbeeld**: "0612345678"

- height (double) - lengte in centimeters.
  - **Voorbeeld**: 180,0

- weight (double) - gewicht in kilogrammen.
  - **Voorbeeld**: 72,5


## Stappenplan

### Stap 1
Er staat al een variabele voor de scanner en de naam.
Definieer variabelen voor de andere variabelen.


### Stap 2
Maak methodes voor alle variabelen, door er `set` voor te zetten, zoals `public static setName()`.

Voor name, age, email, adres, phone, height en weight hebben deze methodes ze zelfde structuur.
- Als eerst print je wat je van de gebruiker wilt weten.
- Daarna gebruik je de juiste scanner methode (b.v. `nextLine()` of `nextInt()`) om de input van de gebruiker op te vragen.
- Vervolgens check je (met een if-statment) of de input aan de **constraint** voldoet.
- Als laatste sla je de input op in de variabele (of niet, als het niet aan de constraint voldoet)

> Tip: zorg er bij elke input voor dat je de gebruiker laat weten of het succesvol was. (door te printen "... is opgeslagen")

### Stap 3
Maak de `printProfile()` methode af.
We hebben voor deze methode al een beginnetje gemaakt. Je ziet dat de naam geprint wordt.

Maak vergelijkbare print statements voor de andere variabelen.

### Stap 4
Als laatste stap in de `printProfile()` methode, mag je de BMI van de gebruiker berekenen. Dit ga je doen door een aparte `calculateBMI()` methode te maken. In deze methode bereken je eerste het BMI van de gebruiker. Daarna print je "Je BMI is ..."

> Om het BMI van een persoon te berekenen kun je de volgende formule gebruiken:
>
> Gewicht [in kg] / (lengte [in meters] * lengte [in meters])

> Tip: Let er op dat je centimeters naar meters omrekent

## Voorbeeld output

```text
======================================
Welkom bij de profiel app
Deze app zal het volgende uitvoeren:
 1  - Vul naam in
 2  - Vul leeftijd in
 3  - Vul e-mail in
 4  - Vul adres in
 5  - Vul telefoonnummer in
 6  - Vul lengte in (cm)
 7  - Vul gewicht in (kg)
 8 - Vul verjaardag in (bonus)
 9 - Toon profiel
Voer je naam in: Donald Trump
Naam opgeslagen: Donald Trump

```

## BONUS

Voeg een extra optie toe om een geboortedatum in te vullen. Deze mag je in de variabele `static LocalDate birthday;` opslaan. Er bestaat geen `scanner.getLocalDate()` methode, dus je zult op het internet opzoek moeten hoe je dit kunt oplossen. Probeer dit zonder AI te doen.

      