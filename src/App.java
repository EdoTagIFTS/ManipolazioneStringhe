import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una stringa: ");
        String str = scanner.nextLine();

        scanner.close();

        System.out.println("La stringa contiene " + StringLength(str) + " caratteri");

        System.out.println("La stringa in maiuscolo è: " + ToUpper(str));

        System.out.println("La stringa in maiuscolo è: " + ToLower(str));

        System.out.println("Il primo carattere della stringa è: " + FirstChar(str));
    }

    public static int StringLength(String str){
        int len = str.length();
        return len;
    }

    public static String ToUpper(String str){
        String str1 = str.toUpperCase();
        return str1;
    }

    public static String ToLower(String str){
        String str1 = str.toLowerCase();
        return str1;
    }

    public static char FirstChar(String str){
        char c = str.charAt(0);
        return c;
    }
}
