import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean TraingleJava (int a, int b, int c){
        boolean redFlag;
        if ((a >= b+c ) || (b >= a+c) || (c >= a+b)) {
            System.out.println("Nie ma mozliwosci stworzenia trojkata");
            redFlag = false;
        }
        else if ((a <= 0) || (b<=0) || (c <=0)){
            System.out.println("Podane liczby nie mogą być 0 lub ujemne");
            redFlag = false;
        }
        else {
            System.out.println("Z podanych liczb mozemy utworzyc trojkat");
            redFlag = true;
        }
        return redFlag;

    }

    public static void main(String[] args) {
System.out.println("Podaj zmienna a");
Scanner a = new Scanner(System.in);
int bok1 = a.nextInt();
System.out.println("Podaj zmienna b");
int bok2 = a.nextInt();
System.out.println("Podaj zmienna c");
int bok3 = a.nextInt();

if ((TraingleJava(bok1,bok2,bok3) == false)){
    System.out.println("Podaj zmienna a");
    bok1 = a.nextInt();
    System.out.println("Podaj zmienna b");
     bok2 = a.nextInt();
    System.out.println("Podaj zmienna c");
     bok3 = a.nextInt();
    TraingleJava(bok1,bok2,bok3);
}

    }
}