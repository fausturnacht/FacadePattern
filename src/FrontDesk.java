public class FrontDesk {
    private final HouseKeeping houseKeeping;
    private final Cart cart;
    private final Valet valet;

    public FrontDesk(HouseKeeping houseKeeping, Cart cart, Valet valet){
        this.houseKeeping = houseKeeping;
        this.cart = cart;
        this.valet = valet;
        houseKeeping.executeService();
        cart.executeService();
        valet.executeService();
    }
}
