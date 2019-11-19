package Animals;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Reservor implements Serializable {
    public String Name;
    public Timestamp ReservedAt;

    //Get Name
    public String getName() {
        return Name;
    }

    //Get DateTime ReservedAt
    public Timestamp getReservedAt() {
        return ReservedAt;
    }


    public Reservor(String name, Timestamp reservedAt){
        this.Name = name;
        this.ReservedAt = reservedAt;
    }
}
