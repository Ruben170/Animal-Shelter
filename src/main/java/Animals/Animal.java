package Animals;

import Sellable.Isellable;

import java.io.Serializable;
import java.sql.Timestamp;


public abstract class Animal implements Isellable, Serializable {
    public String Name;
    public Gender Gender;
    public Reservor reservor;

    @Override
    public String getName() {
        return Name;
    }

    public Animal(String name, Gender gender){
        this.Name = name;
        this.Gender = gender;
    }

    public boolean Reserve(String reservedBy){
        if (reservor == null){
            Timestamp TimeMilli = new Timestamp(System.currentTimeMillis());
            this.reservor = new Reservor(reservedBy, TimeMilli);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String reserved = "Not Reserved";
        if (this.reservor != null){
            reserved = "Reserved by "+ reservor.Name + ".";
        }
        return String.format("%s %s %s %s",this.Name, this.Gender, reserved, getPrice());
    }
}
