# Personalia applicatie

## Inleiding

In deze les hebben we gewerkt met variabelen, if-statements, methodes en de Scanner.
Met deze bouwblokken kan een eenvoudige applicatie worden gemaakt die informatie opslaat en teruggeeft aan de gebruiker.

In deze opdracht ga je een applicatie maken die jou personalia opslaat. We hebben alvast een beginnetje voor je gemaakt. De start code kun je vinden in `src.Main.java`

## Opdrachtbeschrijving

Er staat al een korte applicatie voor je klaar in `src.Main.java`. In deze applicatie kun je je naam invullen en wordt dat opgeslagen. We willen echter meer informatie opslaan en we willen ook ons profiel kunnen printen. Aan jou de taak om de applicatie verder af te maken.

De applicatie slaat de volgende gegevens van jou op:

- name (String) - volledige naam van de student.
    - **Contraint**: Moet langer dan 0 zijn.
    - **Voorbeeld**: "Jan Jansen".

- age (int) - leeftijd in hele jaren.
    - **Contraint**: Tussen de 0 en 120.
    - **Voorbeeld**: 20.

- email (String) - e‑mailadres.
    - **Contraint**: Moet een '@' bevatten
    - **Voorbeeld**: "jan.jansen@example.com".

- adress (String) - adres of woonplaats
    - **Contraint**: Mag niet leeg zijn (lengte > 0).
    - **Voorbeeld**: "Oudeweg 12, Amsterdam".

- phone (String) - telefoonnummer (in de applicatie verwacht als string met cijfers).
    - **Contraint**: Lengte tussen 6 en 15 tekens.
    - **Voorbeeld**: "0612345678".

- height (double) - lengte in centimeters.
    - **Contraint**: Tussen 50.0 en 300.0 (cm).
    - **Voorbeeld**: 180.0

- weight (double) - gewicht in kilogrammen.
    - **Contraint**: Tussen dan 0 en 500.0 (kg).
    - **Voorbeeld**: 72.5



- hasDriversLicense (boolean) - heeft een rijbewijs of niet.
    - **Contraint**: Alleen true (ja) of false (nee).
    - **Voorbeeld**: true

- hasPets (boolean) - heeft huisdieren of niet.
    - **Contraint**: Alleen true (ja) of false (nee).
    - **Voorbeeld**: true

- petCount (int) - aantal huisdieren.
    - **Contraint**: Als hasPets == false moet petCount 0 zijn.
    - **Voorbeeld**: 2

## Stappenplan
### Stap 1
Maak methodes voor alle variabelen, door er `set` voor te zetten, zoals `public static setName()`. 

#### Stap 1.1
Voor name, age, email, adres, phone, height en weight hebben deze methodes ze zelfde structuur. 
  - Als eerst print je wat je van de gebruiker wilt weten.
  - Daarna gebruik je de juiste scanner methode (b.v. `nextLine()` of `nextInt()`) om de input van de gebruiker op te vragen.
  - Vervolgens check je (met een if-statment) of de input aan de **constraint** voldoet.
  - Als laatste sla je de input op in de variabele (of niet, als het niet aan de constraint voldoet)

#### Stap 1.2
Voor hasDriverLicense werkt het iets anders.
- Vraag als eerste "Heb je een rijbewijs? (ja/nee): "
- Vervolgens gebruik je de scanner om de input van de gebruiker op te halen. De verwachting is dat dit de String "ja" of "nee" is.
- Als de input "ja" is, dan mag je de `hasDriversLicense` variabele op `True` zetten. Bij elk ander antwoord mag de variable op `False` komen te staan.

#### Stap 1.4
Voor hasPets en petCount maken we één methode.
- Vraag als eerst "Heb je huisdieren? (ja/nee): "
- Vervolgens gebruik je de scanner om de input van de gebruiker op te halen. De verwachting is dat dit de String "ja" of "nee" is.
- Als het antwoord ja is, doe je de volgende stappen:
  - Vraag de gebruiker hoeveel huisdieren deze heeft.
  - Gebruik de scanner om deze tweede input van de gebruiker op te vragen
  - Zet de tweede input van de gebruiker als waarde voor `petCount` en zet `hasPets` op True
- Als het antwoord nee (of iets anders dan ja)  is, zet je `hasPets`op False en `petCount` op 0

> Tip: zorg er bij elke input voor dat je de gebruiker laat weten of het succesvol was of niet. (door te printen "... is opgeslagen" of "... is niet opgeslagen")

### Stap 2
Maak de `printProfile` af. 
We hebben voor deze methode al een beginnetje gemaakt. Je ziet dat de naam geprint wordt, maar alleen als deze is ingevuld. Is de naam nog niet ingevuld, dan wordt er "Naam: niet ingevuld" geprint. 

Doet hetzelfde voor de andere variabelen. print ze als ze zijn ingevuld en print "[itemnaam]: niet ingevuld" als het nog niet is ingevuld. 

Voor "driversLicense" en "pets" mag je checken of het True of False is en mag je printen "[itemnaam]: ja" of "[itemnaam]": nee". 

Bij pets mag je ook de petCount in de print zetten, bijvoorbeeld "Huisdieren : ja (aantal 3)"

### Stap 3
De `printMenu()` methode laat nu nog maar 2 opties zien, vul deze aan met printstatments voor je eigen opties. 

In de main methode staat nu: 

```java
if (startKeuze == 0) {
                System.out.println("Afsluiten. Tot ziens!");
                scanner.close();
                return;
            } else if (startKeuze == 1) {
                setName();
            }
//            Schrijf hier de if-statements waarin je de juiste methode aanroept.

                    System.out.println();

        }
```

Vul dit aan met if-statments voor `startKeuze == 2`, `startKeuze == 3`, etc. Roep in die if-statements de juiste methode aan, zoals `setAge()` of `setEmail()`. 


## Voorbeeld output

```text
======================================
Welkom bij de app van Donald
Kies een optie:
 0  - Afsluiten
 1  - Vul naam in
 2  - Vul leeftijd in
 3  - Vul e-mail in
 4  - Vul adres in
 5  - Vul telefoonnummer in
 6  - Vul lengte in (cm)
 7  - Vul gewicht in (kg)
 8  - Heb je een rijbewijs?
 9 - Heb je huisdieren?
 10 - Vul verjaardag in (bonus)
 11 - Toon profiel
Maak je keuze: 3
Voer je e-mailadres in: d.trump@covfefe.com
E-mail opgeslagen: d.trump@covfefe.com

```

## BONUS

Voeg een extra optie toe om een geboortedatum in te vullen. Deze mag je in de variabele `static LocalDate birthday;` opslaan. Er bestaat geen `scanner.getLocalDate()` methode, dus je zult op het internet opzoek moeten hoe je dit kunt oplossen. Probeer dit zonder AI te doen.

      