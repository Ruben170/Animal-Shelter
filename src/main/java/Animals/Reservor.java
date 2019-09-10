package Animals;

import java.time.LocalDateTime;

public class Reservor {
    public String Name;
    public LocalDateTime ReservedAt;

    //Get Set Name
    public String getName() {
        return Name;
    }

    private void setName(String name) {
        Name = name;
    }

    //Get Set DateTime ReservedAt
    public LocalDateTime getReservedAt() {
        return ReservedAt;
    }

    private void setReservedAt(LocalDateTime reservedAt) {
        ReservedAt = reservedAt;
    }

    public Reservor(String name, LocalDateTime reservedAt){
        this.Name = name;
        this.ReservedAt = reservedAt;
    }
}
