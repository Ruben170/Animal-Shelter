package Animals;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Dog extends Animal {

    private Timestamp LastWalk;
    private double price;

    private static int dogCount = 0;

    public Dog(String name, Animals.Gender gender) {
        super(name, gender);

        LastWalk = new Timestamp(System.currentTimeMillis());
        price = calculcatePrice();
    }

    //Get Set Date Time LastWalk

    public boolean needsWalk() {
        long now = System.currentTimeMillis();

        return now - LastWalk.getTime() > 86400000;
    }

    @Override
    public String toString() {
        return super.toString() + ", time since last walk: " + LastWalk.toString();
    }


    //Calculate price of dog

    private double calculcatePrice() {
        double Price = 500;
        Price -= dogCount++ * 50;

        if (Price < 50) {
            Price = 50;
        }

        return Price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
