public class Valet implements HotelService{
    private final String plateNumber;

    public Valet(String plateNumber){
        this.plateNumber = plateNumber;
    }

    public void pickUpVehicle(String plateNumber){
        System.out.println("Picking Up Vehicle "+ plateNumber + ".");
    }

    @Override
    public void executeService(){
        pickUpVehicle(plateNumber);
    }
}
