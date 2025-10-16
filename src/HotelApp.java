import java.util.Scanner;
public class HotelApp {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your plate number: ");
        Valet valet = new Valet(scanner.nextLine());

        System.out.print("Please enter the room number: ");
        HouseKeeping houseKeeping = new HouseKeeping(scanner.nextInt());

        System.out.print("Please enter the amount of luggage you have. ");
        Cart cart = new Cart(scanner.nextInt());

        FrontDesk frontDesk = new FrontDesk(houseKeeping, cart, valet);
    }
}
