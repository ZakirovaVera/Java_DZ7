
public class VendingMachine {
    
    private Integer id;
    private HotDrink readyDrink;

    public VendingMachine(Integer id){
        this.id = id;
    }

    public void makeDrink(String name, Integer volume, Integer temperatura){
        HotDrink drink = new HotDrink(name, volume, temperatura);
        readyDrink = drink;
    }
    public HotDrink getDrink(){
        return readyDrink;
    }
}
