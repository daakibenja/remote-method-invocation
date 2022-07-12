import java.io.Serializable;

public class RoomType implements Serializable {
    private int roomType;
    private int roomNumber;
    private double roomPrice;
    private String category;
    private int booked;

    // We have 10 rooms of type 0 which are single rooms that costs 55,000 UGX a
    // night
    public RoomType(int roomNumber, int roomType, String category, int roomPrice) {
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.roomPrice = roomPrice;
        this.category = category;
    }

    public int getRoomType() {
        return roomType;
    }

    public int getBooked() {
        return booked;
    }

    public void setBooked(int booked) {
        this.booked = booked;
    }

    public String getCategory() {
        return category;
    }

    public void setRoomType(int roomType) {
        this.roomType = roomType;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(int roomPrice) {
        this.roomPrice = roomPrice;
    }

}
