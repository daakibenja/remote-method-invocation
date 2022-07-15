
/**
 * Hotel Client.java
 * Codelord codelordug@gmail.com
 */

import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class HotelClient {
    public static void main(String[] args) {

        try {
            if (args.length < 2) {// No parameters passed direct the user how to use the command
                System.out.println("Error: Expected at least 2 arguments found " + args.length);
                System.out.println("Usage: \n" +
                        "\t java HotelClient list <server address> \t-To see the avaible rooms details \n" +
                        "\t java HotelClient book <server address> <room type> <guest name> \t-To book a room \n" +
                        "\t java HotelClient guests <server address> \t-To view all registered guests \n" +
                        "\t java HotelClient revenue <server address> \t-To print the revenue breakdown based on the booked rooms and their types \n");
            } else {

                String command = args[0];
                String host = args[1];
                RoomManager rm = (RoomManager) Naming.lookup("rmi://" + host + ":1099/RoomManagerService");

                switch (command) {
                    case "list":
                        String roomList[] = rm.list();
                        for (String room : roomList) {
                            System.out.println(room);
                        }
                        break;
                    case "book":
                        int roomType = Integer.parseInt(args[2]);
                        String guestName = args[3];
                        String message = rm.book(roomType, guestName);
                        System.out.println(message);
                        break;
                    case "guests":
                        String[] guests = null;
                        guests = rm.listGuests();
                        for (String guest : guests) {
                            System.out.println(guest);
                        }
                        break;
                    case "revenue":
                        String revenues[] = rm.revenue();
                        for (String revenue : revenues) {
                            System.out.println(revenue);
                        }
                        break;
                    default:
                }

            }

        } catch (NotBoundException e) {
            System.out.println("Received Exception: ");
            System.out.println(e);
        } catch (RemoteException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("\t That's all we know, meanwhile");
            System.out.println("Eeh dangote oyeeee!!!");
        } catch (Exception e) {
            System.out.println("Received Exception: ");
            System.out.println(e);
        }
    }
}
