package Animals;

import java.time.LocalDateTime;

public class Dog extends Animal {
    public LocalDateTime LastWalk;

    public Dog(String name, Animals.Gender gender) {
        super(name, gender);
    }

    //Get Set Date Time LastWalk

    public LocalDateTime getLastWalk() {
        return LastWalk;
    }

    private void setLastWalk(LocalDateTime lastWalk) {
        LastWalk = lastWalk;
    }

    /*public boolean NeedsWalk(){
        if(LocalDateTime.now() - 10 > 10){

        }
    }*/
}
