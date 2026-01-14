import java.util.Scanner;

import static java.lang.System.in;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
public static void squareRoot (double a) {
    double tablica [] = new double[100];
    double b = a/2;
   tablica [0] = (b + a/b)/2;
    for ( int i=1; i < 100; i++){

        tablica [i] = (tablica [i-1] + (a/tablica [i-1]))/2;
     if (Math.abs (tablica[i] - tablica[i-1]) < 0.0001){
         System.out.println("Wynik to:"+tablica [i]);
         break;
     }
    }


}

    public static void main(String[] args) {
        System.out.println("Podaj zmienna a");
        Scanner drukarka = new Scanner(in);
        double a = drukarka.nextDouble();
        squareRoot(a);



    }
}