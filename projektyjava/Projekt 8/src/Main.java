import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Podaj liczbe sekund");
        int s;
        Scanner in = new Scanner(System.in);
        s = in.nextInt();
        int h;
        int m;
        int r;
        int rm;
        h = s / 3600;
        r = s % 3600;
        m = r / 60;
        rm = r % 60;
        System.out.printf("%d sekund = %d godzin, %d minut, %d sekund", s, h, m, rm);


    }
}