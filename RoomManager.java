import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RoomManager extends Remote {
    public String[] list() throws RemoteException;

    public String book(int roomType, String guestName) throws RemoteException;

    public String[] listGuests() throws RemoteException;

    public String[] revenue() throws RemoteException;
}
