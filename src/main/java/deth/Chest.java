package deth;

import org.springframework.beans.factory.annotation.Autowired;

public class Chest {
    public Rabbit rabbit5;

    public Chest() {
        this.rabbit5 = new Rabbit();
    }
}