package deth;

import org.springframework.beans.factory.annotation.Autowired;

public class Chest {
    public Rabbit rabbit5;

    @Autowired
    void setRabbit(Rabbit rabbit) {
        this.rabbit5 = rabbit;
    }
}
