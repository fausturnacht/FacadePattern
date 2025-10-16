public class HouseKeeping implements HotelService{
    private final int roomNumber;

    public HouseKeeping(int roomNumber){
        this.roomNumber = roomNumber;
    }

    public void cleanRoom(int roomNumber){
        System.out.println("Cleaning Room Number "+ roomNumber +".");
    }

    @Override
    public void executeService(){
        cleanRoom(roomNumber);
    }
}
