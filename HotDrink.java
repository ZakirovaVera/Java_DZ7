public class HotDrink extends Drink {
    
    private Integer temperatura;

    public HotDrink(String name, Integer volume, Integer temperatura){
        this.name = name;
        this.volume = volume;
        this.temperatura = temperatura;
    }

    public String getName(){
        return name;
    }

}
