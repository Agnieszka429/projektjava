import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.print("Podaj cm:");
        int cm;
        Scanner in = new Scanner(System.in);
        cm = in.nextInt();
        final double cm_na_cale = 2.54;
        final int cale_na_feety = 12;
        int wynik_w_calach =  (int) (cm / cm_na_cale);
        int wynik_w_feetach =  (int) wynik_w_calach / cale_na_feety;
        int reszta = wynik_w_calach % cale_na_feety;


        System.out.print("Wynik w stopach: " + wynik_w_feetach + " Wynik w calach: "+ reszta);





    }
}