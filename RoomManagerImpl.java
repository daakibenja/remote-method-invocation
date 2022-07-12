import java.rmi.RemoteException;
import java.util.ArrayList;

public class RoomManagerImpl extends
        java.rmi.server.UnicastRemoteObject implements RoomManager {
    RoomType[] roomTypes = new RoomType[5];

    ArrayList<String> guests = new ArrayList<String>();

    protected RoomManagerImpl() throws RemoteException {
        super();

        roomTypes[0] = new RoomType(10, 0, "Single", 55000);
        roomTypes[1] = new RoomType(20, 1, "Double", 75000);
        roomTypes[2] = new RoomType(5, 2, "Twin", 80000);
        roomTypes[3] = new RoomType(3, 3, "Tripple", 150000);
        roomTypes[4] = new RoomType(2, 4, "Quad", 230000);

    }

    @Override
    public String[] list() throws RemoteException {
        String[] roomList = new String[roomTypes.length];

        for (int i = 0; i < roomTypes.length; i++) {
            roomList[i] = roomTypes[i].getRoomNumber()
                    + " rooms of type " + roomTypes[i].getRoomType()
                    + " are available " + " for " + roomTypes[i].getRoomPrice() + " UGX per night";

        }
        return roomList;

    }

    @Override
    public String book(int roomType, String guestName) throws RemoteException {
        this.roomTypes[roomType].setRoomNumber(roomTypes[roomType].getRoomNumber() - 1);
        this.roomTypes[roomType].setBooked(this.roomTypes[roomType].getBooked() + 1);
        this.guests.add(guestName);
        return null;
    }

    @Override
    public String[] listGuests() throws RemoteException {
        return guests.toArray(new String[guests.size()]);
    }

    @Override
    public String[] revenue() {
        double revenue = 0;
        String revenues[] = new String[5];
        for (int i = 0; i < roomTypes.length; i++) {
            revenue += roomTypes[i].getRoomPrice() * roomTypes[i].getBooked();
            revenues[i] = "Rooms of type " + roomTypes[i].getRoomType() + " Generated revenue of " + revenue
                    + " UGX";

        }
        return revenues;
    }

}
