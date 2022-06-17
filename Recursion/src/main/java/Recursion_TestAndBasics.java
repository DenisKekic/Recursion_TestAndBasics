public class Recursion_TestAndBasics {

    public static void baumfaellen(int x){
        System.out.println("hacken");
        if(x <= 1){
            System.out.println("Baum fällt");
        } else{
            baumfaellen(x-1);
        }
    }

    public static double Fakultaet(int x){
        if(x <= 1){
            return 1;
        }else{
            return x * Fakultaet(x-1);
        }
    }

    public static String Wortumdrehen(String str){
        int i = str.length();
        if(i > 0){
            char c = str.charAt(i-1);
            String y = str.substring(0, i-1);
            return c + Wortumdrehen(y);
        }else{
            return str;
        }
    }
}
