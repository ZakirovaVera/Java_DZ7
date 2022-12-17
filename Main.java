
public class Main {
    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine(111);
        vendingMachine.makeDrink("чай", 250, 60);
        HotDrink drink = vendingMachine.getDrink();
        System.out.println(drink.getName());

    }

}