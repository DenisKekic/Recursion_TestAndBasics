import java.util.Scanner;

public class TestDriverRecursionBasics {
    public static void main(String[] args){
        System.out.println("Geben Sie die dicke des Baumes an:");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        Recursion_TestAndBasics rtb = new Recursion_TestAndBasics();
        rtb.baumfaellen(x);

        double ergebnis = rtb.Fakultaet(x);
        System.out.println(ergebnis);

        String text = "Baum";
        String text2 = rtb.Wortumdrehen(text);
        System.out.println(text2);
    }
}
