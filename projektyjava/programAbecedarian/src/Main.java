//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean isAbecedarian (String slowo) {
        System.out.println("start");
        for (int i=0; i<=slowo.length()-2; i++)
        {
            System.out.println("Iteracja nr: " + i);
            if (slowo.charAt(i) < slowo.charAt(i+1))
            {
            }
            else
            {
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return true;

    }


    public static void main(String[] args) {
        String slowko = "abs";
        isAbecedarian(slowko);

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}