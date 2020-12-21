import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {

    String sayHello()throws RemoteException;
    String lireSolde(double a) throws RemoteException;
    double debiter(double a,double b) throws RemoteException;
    double crediter(double a,double b) throws RemoteException;
}
