import java.util.Scanner;
public class Launcher { // (1)
    public static void main(String[] args) { // (2)
        System.out.println("Salut L'Ami"); // (3)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ecrire la commande: ");
        String scan = scanner.next();
        String  quit_variable = "quit";
        if (scan.equals(quit_variable))
        {
            
        }
        else
        {
            System.out.println("Unknown Command");
        }
    }
}