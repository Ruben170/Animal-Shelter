package Animals;

import java.sql.Date;
import java.time.LocalDateTime;

public class Animal {
    public String Name;
    public Gender Gender;
    public Reservor reservedBy;

    //Get Set Name
    public String getName() {
        return Name;
    }

    private void setName(String name) {
        Name = name;
    }

    //Get Set Gender
    public Animals.Gender getGender() {
        return Gender;
    }

    private void setGender(Animals.Gender gender) {
        Gender = gender;
    }

    //Get Set Reservor
    public Reservor getReservedBy() {
        return reservedBy;
    }

    private void setReservedBy(Reservor reservedBy) {
        reservedBy = reservedBy;
    }

    public Animal(String name, Gender gender){
        this.Name = name;
        this.Gender = gender;
    }

    public boolean Reserve(String reservedBy){
        if (this.reservedBy == null){
            this.reservedBy = new Reservor(reservedBy, LocalDateTime.now());
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String reserved = "Not Reserved";
        if (this.reservedBy != null){
            reserved = "Reserved by"+ this.reservedBy.Name + ".";
        }
        return String.format("%s %s %s",this.Name, this.Gender, reserved);
    }
}
