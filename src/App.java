import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una stringa: ");
        String str = scanner.nextLine();

        scanner.close();

        System.out.println("La stringa contiene " + StringLength(str) + " caratteri");

        System.out.println("La stringa in maiuscolo è: " + ToUpper(str));
    }

    public static int StringLength(String str){
        int len = str.length();
        return len;
    }

    public static String ToUpper(String str){
        String str1 = str.toUpperCase();
        return str1;
    }
}
