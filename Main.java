import Machines.VendingMachine;
import Products.Drink;

public class Main {
    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine(111);
        vendingMachine.makeDrink("чай", 250, 50, 60);
        Drink drink = vendingMachine.getDrink();
        System.out.println(drink);
        
        vendingMachine.makeDrink("вода", 300, 100);
        Drink voda = vendingMachine.getDrink();
        System.out.println(voda);

    }

}