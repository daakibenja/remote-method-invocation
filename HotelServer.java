
import java.rmi.Naming;
import java.rmi.Remote;

public class HotelServer {
    public HotelServer() {
        try {
            // The server creates RoomManagerImpl object

            RoomManager rm = new RoomManagerImpl();
            // It binds (registers) to the rmiregistry

            Naming.rebind("rmi://localhost:1099/RoomManagerService", (Remote) rm);
            System.out.println("Server is ready");
        } catch (Exception e) {
            System.out.println("Trouble: _" + e);
        }
    }

    public static void main(String args[]) {
        new HotelServer();
    }
}
