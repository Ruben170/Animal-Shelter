package Classes;

import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Animals.Gender;

import java.io.Serializable;
import java.util.*;

public class Reservation implements Serializable {
    private List<Animal> Animals = new ArrayList<Animal>();

    public void setAnimals(List<Animal> animals) {
        Animals = animals;
    }

    public List<Animal> getAnimals() {
        return Animals;
    }


    public void newCat(String name, Gender gender, String badhabits){
        this.Animals.add(new Cat(name, gender, badhabits));
    }

    public void newDog(String name, Gender gender){
        this.Animals .add(new Dog(name, gender));
    }
}
