package shakki;

import java.util.Scanner;

public class Shakkipeli {
    
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        Kentta kentta = new Kentta();
        System.out.println(kentta);
        kentta.liikuta(1, 2, 1, 4);
        System.out.println(kentta);
        kentta.liikuta(1, 4, 1, 5);
        System.out.println(kentta);
        kentta.liikuta(2, 7, 2, 6);
        System.out.println(kentta);
        kentta.liikuta(1, 5, 2, 6);
        System.out.println(kentta);
        kentta.liikuta(1, 1, 1, 4);
        System.out.println(kentta);
    }
}
