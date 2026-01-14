//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;

public class Main {

    public static double squareRoot(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Nie można obliczyć pierwiastka z liczby ujemnej.");
        }
        if (a == 0 || a == 1) {
            return a;
        }

        double x0 = a / 2.0;
        double x1 = (x0 + a / x0) / 2.0;

        while (Math.abs(x1 - x0) >= 0.0001) {
            x0 = x1;
            x1 = (x0 + a / x0) / 2.0;
        }

        return x1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę, z której chcesz obliczyć pierwiastek kwadratowy: ");
        double liczba;

        // Sprawdzenie poprawności wejścia
        if (scanner.hasNextDouble()) {
            liczba = scanner.nextDouble();

            try {
                double wynik = squareRoot(liczba);
                System.out.printf("Pierwiastek kwadratowy z %.4f to %.5f%n", liczba, wynik);
            } catch (IllegalArgumentException e) {
                System.out.println("Błąd: " + e.getMessage());
            }

        } else {
            System.out.println("Nie podałeś poprawnej liczby.");
        }

        scanner.close();
    }
}
