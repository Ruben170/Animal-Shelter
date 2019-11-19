import Sellable.Isellable;

public class Sellable implements Isellable {
    private String Name;
    private double Price;

    protected Sellable(String name, double price){
        this.Name = name;
        this.Price = price;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%s ,$ %s", Name, Price);
    }
}
