package Animals;

public class Cat extends Animal {

    private String BadHabits;

    //Get Set BadHabits
    public String getBadHabits() {
        return BadHabits;
    }

    private void setBadHabits(String badHabits) {
        BadHabits = badHabits;
    }

    public Cat(String name, Gender gender, String badHabits)
    {
        super(name, gender);
        this.BadHabits = badHabits;
    }

    @Override
    public double getPrice() {
        double Price = 350;
        Price -= BadHabits.length();

        if (Price < 35) {
            Price = 35;
        }
        return Price;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",bad habits" +this.BadHabits.toLowerCase()+ ".";
    }
}
