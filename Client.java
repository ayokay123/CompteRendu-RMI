import java.rmi.Naming;
import java.util.Scanner;


public class Client {

    public static void main(String[] args) {
        try {
            MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            Scanner sc = new Scanner(System.in);
            System.out.println("donner votre solde: ");
            double a = sc.nextDouble();
            System.out.println(service1.lireSolde(a));
            
            System.out.println("donner montant debiter: ");
            double d = sc.nextDouble();
            a = service1.debiter(a, d);
            System.out.println(service1.lireSolde(a));
            
  
            System.out.println("donner montant crediter: ");
            double c = sc.nextDouble();
            a= service1.crediter(a, c);
            System.out.println(service1.lireSolde(a));

        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.toString());
        }
    }

}