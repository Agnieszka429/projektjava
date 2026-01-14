import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("mysle o liczbie pomiedzy 1 a 100 (z nimi wlacznie)");
        System.out.println("czy zgadniesz jaka to liczba?");
        int liczba_usera;

        System.out.println("Podaj liczbe");
        Scanner a = new Scanner(System.in);
        liczba_usera = a.nextInt();
        System.out.println("Twoja propozycja to:" + liczba_usera);
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        System.out.println("Pomyliles sie o:" + (liczba_usera - number));
        if (liczba_usera > number) {
            System.out.println("Podana liczba jest za duża");
        } else if (liczba_usera < number) {
            System.out.println("Podana liczba jest za mała");
        } else {
            System.out.println("Brawo, zgadłes");
            return;
        }
        int liczba_usera2;
        System.out.println("Podaj liczbe 2");
        Scanner b = new Scanner(System.in);
        liczba_usera2 = b.nextInt();
        System.out.println("Twoja propozycja to:" + liczba_usera2);
        if (liczba_usera2 > number) {
            System.out.println("Podana liczba jest za duża");
        } else if (liczba_usera2 < number) {
            System.out.println("Podana liczba jest za mała");
        } else {
            System.out.println("Brawo, zgadłes");
            return;
        }

            int liczba_usera3;
            System.out.println("Podaj liczbe 3");
            Scanner c = new Scanner(System.in);
            liczba_usera3 = c.nextInt();
            System.out.println("Twoja propozycja to:" + liczba_usera3);
            if (liczba_usera3 > number) {
                System.out.println("Podana liczba jest za duża");
                System.out.println("Liczba o której pomyslalem to:" + number);
            } else if (liczba_usera3 < number) {
                System.out.println("Podana liczba jest za mała");
                System.out.println("Liczba o której pomyslalem to:" + number);
            } else {
                System.out.println("Brawo, zgadłes");


            }


        }
    }

