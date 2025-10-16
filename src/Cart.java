public class Cart implements HotelService{
    private final int numberOfCarts;

    public Cart(int numberOfCarts){
        this.numberOfCarts = numberOfCarts;
    }

    public void requestCart(int numberOfCarts){
        System.out.println("Handling " + numberOfCarts + " individual pieces of luggage.");
    }

    @Override
    public void executeService(){
        requestCart(numberOfCarts);
    }
}
