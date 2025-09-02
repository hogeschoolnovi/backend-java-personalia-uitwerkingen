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

    public static void main(String[] args) {
        printMenu();
        setName();
        setAge();
        setEmail();
        setAdress();
        setPhone();
        setHeight();
        setWeight();
        printProfile();
        System.out.println("Afsluiten. Tot ziens!");
    }

    private static void printMenu() {
        System.out.println("======================================");
        System.out.println("Welkom bij de profiel app");
        System.out.println("Deze app zal het volgende uitvoeren:");
        System.out.println(" 1  - Vul naam in");
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
        name = input;
        System.out.println("Naam opgeslagen: " + name);
    }

    private static void setAge() {
        System.out.print("Voer je leeftijd in jaren (bijv. 20): ");
        int input = scanner.nextInt();
        scanner.nextLine();
        age = input;
        System.out.println("Leeftijd opgeslagen: " + age);
    }

    private static void setEmail() {
        System.out.print("Voer je e-mailadres in: ");
        String input = scanner.nextLine();
        email = input;
        System.out.println("E-mail opgeslagen: " + email);
    }

    private static void setAdress() {
        System.out.print("Voer je adres/woonplaats in: ");
        String input = scanner.nextLine().trim();
        adress = input;
        System.out.println("Adres opgeslagen: " + adress);
    }

    private static void setPhone() {
        System.out.print("Voer je telefoonnummer in (alleen cijfers): ");
        String input = scanner.nextLine().trim();
        phone = input;
        System.out.println("Telefoonnummer opgeslagen.");
    }

    private static void setHeight() {
        System.out.print("Voer je lengte in centimeters (bijv. 180): ");
        double input = scanner.nextDouble();
        scanner.nextLine();
        height = input;
        System.out.println("Lengte opgeslagen: " + height + " cm");
    }

    private static void setWeight() {
        System.out.print("Voer je gewicht in kg (bijv. 72,5): ");
        double input = scanner.nextDouble();
        scanner.nextLine();
        weight = input;
        System.out.println("Gewicht opgeslagen: " + weight + " kg");
    }

    private static void calculateBMI(){
        double BMI = weight / ((height/100) * (height/100));
        System.out.println("Je BMI is " + BMI);
    }

    private static void printProfile() {
        System.out.println();
        System.out.println("----- PROFIEL -----");
        System.out.println("Naam: " + name);
        System.out.println("Leeftijd: " + age);
        System.out.println("E-mail: " + email);
        System.out.println("Adres: " + adress);
        System.out.println("Telefoon: " + phone);
        System.out.println("Lengte: " + height + " cm");
        System.out.println("Gewicht: " + weight + " kg");
        calculateBMI();
        System.out.println("-------------------");
    }
}