import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String name;
    static int age;
    static String email;
    static String adress;
    static String phone;
    static double height;
    static double weight;
    static boolean hasDriversLicense;
    static boolean hasPets;
    static int petCount;


//    BONUS
    static LocalDate birthday;

    public static void main(String[] args) {
        while (true) {
            printMenu();
            System.out.print("Maak je keuze: ");
            int startKeuze = scanner.nextInt();
            scanner.nextLine();
            if (startKeuze == 0) {
                System.out.println("Afsluiten. Tot ziens!");
                scanner.close();
                return;
            } else if (startKeuze == 1) {
                setName();
            } else if (startKeuze == 2) {
                setAge();
            } else if (startKeuze == 3) {
                setEmail();
            } else if (startKeuze == 4) {
                setAdress();
            } else if (startKeuze == 5) {
                setPhone();
            } else if (startKeuze == 6) {
                setHeight();
            } else if (startKeuze == 7) {
                setWeight();
            } else if (startKeuze == 8) {
                setDriversLicense();
            } else if (startKeuze == 9) {
                setPets();
            } else if (startKeuze == 10) {
//                setBirthday();
            } else if (startKeuze == 11) {
                printProfile();
            } else {
                System.out.println("Onbekende optie. Kies een nummer uit het menu.");
            }

//            Schrijf hier de if-statements waarin je de juiste methode aanroept.

            System.out.println();

        }
    }

    private static void printMenu() {
        System.out.println("======================================");
        System.out.println("Welkom bij de app van " + name);
        System.out.println("Kies een optie:");
        System.out.println(" 0  - Afsluiten");
        System.out.println(" 1  - Vul naam in");
//        Vul hier het menu aan

        System.out.println(" 2  - Vul leeftijd in");
        System.out.println(" 3  - Vul e-mail in");
        System.out.println(" 4  - Vul adres in");
        System.out.println(" 5  - Vul telefoonnummer in");
        System.out.println(" 6  - Vul lengte in (cm)");
        System.out.println(" 7  - Vul gewicht in (kg)");
        System.out.println(" 8  - Heb je een rijbewijs?");
        System.out.println(" 9 - Heb je huisdieren?");
        System.out.println(" 10 - Vul verjaardag in (bonus)");
        System.out.println(" 11 - Toon profiel");
    }


    private static void setName() {
        System.out.print("Voer je volledige naam in: ");
        String input = scanner.nextLine().trim();
        if(input.length() > 0) {
            name = input;
            System.out.println("Naam opgeslagen: " + name);
        } else {
            System.out.println("Ongeldige naam. Niet opgeslagen.");
        }
    }

//        Schrijf hier de andere methodes

    private static void setAge() {
        System.out.print("Voer je leeftijd in jaren (bijv. 20): ");
        int input = scanner.nextInt();
        scanner.nextLine();
        if (input >= 0 && input <= 120) {
            age = input;
            System.out.println("Leeftijd opgeslagen: " + age);
        }
        if (input < 0 || input > 120) {
            System.out.println("Ongeldige leeftijd. Niet opgeslagen.");
        }
    }

    private static void setEmail() {
        System.out.print("Voer je e-mailadres in: ");
        String input = scanner.nextLine();
        if (input.contains("@")) {
            email = input;
            System.out.println("E-mail opgeslagen: " + email);
        } else{
            System.out.println("Ongeldig e-mailadres. Niet opgeslagen.");
        }
    }

    private static void setAdress() {
        System.out.print("Voer je adres/woonplaats in: ");
        String s = scanner.nextLine().trim();
        if (s.length() > 0) {
            adress = s;
            System.out.println("Adres opgeslagen: " + adress);
        }else{
            System.out.println("Adres niet opgeslagen (leeg).");
        }
    }

    private static void setPhone() {
        System.out.print("Voer je telefoonnummer in (alleen cijfers): ");
        String input = scanner.nextLine().trim();
        int len = input.length();
        if (len >= 6 && len <= 15) {
            phone = input;
            System.out.println("Telefoonnummer opgeslagen.");
        }else {
            System.out.println("Ongeldig telefoonnummer. Gebruik alleen cijfers (6-15). Niet opgeslagen.");
        }
    }

    private static void setHeight() {
        System.out.print("Voer je lengte in centimeters (bijv. 180): ");
        double input = scanner.nextDouble();
        scanner.nextLine();
        if (input >= 50 && input <= 300) {
            height = input;
            System.out.println("Lengte opgeslagen: " + height + " cm");
        }
        if (input < 50 || input > 300) {
            System.out.println("Ongeldige lengte. Niet opgeslagen.");
        }
    }

    private static void setWeight() {
        System.out.print("Voer je gewicht in kg (bijv. 72.5): ");
        double w = scanner.nextDouble();
        scanner.nextLine();
        if (w > 0 && w <= 500) {
            weight = w;
            System.out.println("Gewicht opgeslagen: " + weight + " kg");
        }
        if (w <= 0 || w > 500) {
            System.out.println("Ongeldig gewicht. Niet opgeslagen.");
        }
    }

    private static void setDriversLicense() {
        System.out.print("Heb je een rijbewijs? (ja/nee): ");
        String input = scanner.nextLine().trim().toLowerCase();
        if (input.equals("ja")) {
            hasDriversLicense = true;
            System.out.println("Rijbewijs: ja");
        }else{
            System.out.println("Rijbewijs niet gezet op 'ja'. (gebruik 'ja' voor ja)");
        }
    }

    private static void setPets() {
        System.out.print("Heb je huisdieren? (ja/nee): ");
        String input = scanner.nextLine().trim().toLowerCase();
        if (input.equals("ja")) {
            hasPets = true;
            System.out.print("Hoeveel huisdieren heb je (heel getal): ");
            int c = scanner.nextInt();
            scanner.nextLine();
            petCount = c;
            System.out.println("Huisdieren: ja, aantal = " + petCount);
        } else {
            hasPets = false;
            petCount = 0;
            System.out.println("Huisdieren: nee");
        }
    }

    private static void printProfile() {
        System.out.println(); // witruimte
        System.out.println("----- PROFIEL -----");
        if(name != null) {
            System.out.println("Naam: " + name);
        } else {
            System.out.println("Naam: niet ingevuld");
        }
//        Vul hier de conditionele prints in voor alle variabelen
        if (age > 0) {
            System.out.println("Leeftijd: " + age);
        }else {
            System.out.println("Leeftijd: niet ingevuld");
        }
        if (email != null) {
            System.out.println("E-mail: " + email);
        }else {
            System.out.println("E-mail: niet ingevuld");
        }
        if (adress != null) {
            System.out.println("Adres: " + adress);
        }else{
            System.out.println("Adres: niet ingevuld");
        }
        if (phone != null) {
            System.out.println("Telefoon: " + phone);
        }else {
            System.out.println("Telefoon: niet ingevuld");
        }
        if (height > 0) {
            System.out.println("Lengte: " + height + " cm");
        }else {
            System.out.println("Lengte: niet ingevuld");
        }
        if (weight > 0) {
            System.out.println("Gewicht: " + weight + " kg");
        }else {
            System.out.println("Gewicht: niet ingevuld");
        }
        if (hasDriversLicense) {
            System.out.println("Rijbewijs: ja");
        }else {
            System.out.println("Rijbewijs: nee");
        }
        if (hasPets) {
            System.out.println("Huisdieren: ja (aantal: " + petCount + ")");
        } else {
            System.out.println("Huisdieren: nee");
        }
        System.out.println("-------------------");
    }


}
