import java.util.Scanner;

public class GebruikersInvoer {
    public static void main(String[] args) {

//dit is een programma dat de lengte van woorden toont die zijn ingevoerd door gebruiker

        int x;
        System.out.println("Typ een tekst om de lengte te bepalen");
        Scanner tekst = new Scanner(System.in);

        String invoer = tekst.nextLine();

        System.out.println("U heeft getypt: "+invoer);
        System.out.println("De lengte van deze woord is:");

        System.out.println(invoer.length());
        System.out.println("Dank u voor het gebruik maken van de woorden teller");


    }
    }

