import java.util.Scanner;
public class Launcher { // (1)
    public static void main(String[] args) { // (2)
        System.out.println("Salut L'Ami"); // (3)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ecrire la commande: ");
        String scan = scanner.next();
        String  quit_variable = "quit";
        String fibo_variable = "fibo";
        while(!scan.equals(quit_variable) && !scan.equals(fibo_variable))
        {
            System.out.println("Unknown Command");
            System.out.print("Ecrire la commande: ");
            scan = scanner.next();

        }
        if(scan.equals(fibo_variable))
        {
            System.out.print("Quel est ton nombre: ");
            int nombre = scanner.nextInt();
            int i = 0;
            int fibo = 0;
            if(nombre == 0)
            {
                System.out.print("0");
            }
            if(nombre == 1)
            {
                System.out.print("1");
            }
            else if(nombre != 0 || nombre != 1)
            {
                for(i = 0;i <= nombre; i++) {
                    fibo +=i;
                }
                System.out.print(fibo);
            }
        }
    }
}