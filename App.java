package com.javatenta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // System.out.println(bondalizer("James", "Bond"));

        // System.out.println(findName(null, null));
        // System.out.println(checkAge(0));
        // System.out.println(getMinMax(null));
        // System.out.println(showTotal(null));
        // System.out.println(whoLikes(null));
    }

    // FRÅGA 1:
    // Bondalizer. I denna metod så skall du returnera det klassiska James Bond
    // hälsningsfrasen.
    // Som ingående argument skickar vi in ett för och ett efternamn.
    // Metoden skall returnera en sträng som ser ut som:
    // "My name is efternamn, förnamn efternamn!"

    public static String bondalizer(String first, String last) {
        String greeting = "My name is " + last + ", " + first + " " + last + "!";
        return greeting;
    }

    // FRÅGA 2:
    // I den här uppgiften så skall vi skapa en metod som skall leta efter ett namn
    // i listan.
    // Den ingående parametern names är en text array med namn.
    // Den ingående parametern name är ett namn som vi skall leta efter i listan.
    // Metoden skall returnera true om namnet finns i listan, annars false.

    public static boolean findName(List<String> names, String name) {
        // Kontrollera om listan är null eller tom
        if (names == null || names.isEmpty()) {
            return false;
        }

        // Loopa igenom listan och jämför varje namn med det sökta namnet
        for (String n : names) {
            if (n.equals(name)) {
                return true; // Namnet hittades
            }
        }

        // Namnet hittades inte i listan
        return false;
    }

    public static void Lista () {
        // Create a list of names
        List<String> names = new ArrayList<>();
        names.add("Kalle");
        names.add("Anna");
        names.add("Test");

        // Call the findName method with the list and a name to search for
        String searchName = "Alice";
        boolean found = findName(namesList, searchName);

        if (found) {
            System.out.println(searchName + " is in the list.");
        } else {
            System.out.println(searchName + " is not in the list.");
        }

    // Fråga 3:
    // På den lokala biografen så visas ibland filmer med 15 årsgräns.
    // För att få köpa biljett så måste man ange sin ålder vid biljettköp.
    // I denna funktion skickar vi in ålder som argument,
    // är åldern 15 år eller äldre så skall funktionen returnera true, annars false.

    
    public static boolean CheckAge(int age) {
        if (age >= 15) {
            return true; // Åldern är 15 år eller äldre
        } else {
            return false; // Åldern är yngre än 15 år
        }
    }

    // Fråga 4:
    // I den lokala dartklubben håller vi reda på medlemmarnas poäng.
    // På föreningens hemsida vill vi visa högsta och lägsta poängen för
    // medlemmarna.
    // Det ingående argumentet scores är en lista med nummer.
    // Som return vill vi ha en lista med enbart två element,
    // det första elementet är det högsta poängen och det andra elementet är det
    // lägsta poängen.

    public static List<Integer> getMinMax(List<Integer> scores) {
        if (scores == null || scores.isEmpty()) {
            return null; // Om listan är tom eller null returnerar vi null
        }
    
        int maxScore = Collections.max(scores); // Högsta poäng
        int minScore = Collections.min(scores); // Lägsta poäng
    
        List<Integer> result = new ArrayList<>();
        result.add(maxScore);
        result.add(minScore);
    
        return result;
    }
    
  
    

      // Fråga 5:
    // I denna uppgift ska du skapa en funktion som räknar ihop det totala beloppet utav alla produkter i en kundvagn. 
    // Den ingående parametern cart är en array med produkter. 
    // Varje produkt är ett object med namn, antal och pris. 
    // Är det fler av samma produkt så skall antalet multipliceras med priset. 
    // Du kan se produkt klassen längre ner i denna fil.

    public static int showTotal(ArrayList<Cart> produkter) {
        return 0;
    }


    // FRÅGA 6:
    // I denna övning så skall vi skapa en funktion för att skriva ut en textsträng
    // brevid en gilla knapp på en bild på en webbsida.
    // Den ingående parametern likes är en text array med namn på de som klickat på
    // gilla knappen.
    // Är det inget namn så skall texten "Ingen har gillat bilden" skrivas ut.
    // Har en person gillat så ska personens namn i singular skrivas ut som; "Janne
    // har gillat bilden".
    // Upp till 4 namn skall skrivas ut i strängen, med ett , och innan sista
    // namnet;
    // "Janne, Kalle och Pelle har gillat bilden"
    // Vid fler namn än fyra skall så skall en siffra skrivas ut för att visa hur
    // många som har gillat utöver de 4 utskrivna namnen.
    // "Janne, Kalle, Pelle, Anna och 5 till har gillat bilden"

    public static String whoLikes(List<String> names) {

        return "";
    }

}
}

/**
 * Produkt
 */
class Cart {
    String prodName;
    int inCart;
    int price;

    Cart(String prodName, int inCart, int price) {
        this.prodName = prodName;
        this.inCart = inCart;
        this.price = price;
    }
}
