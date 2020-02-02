package deth;

import org.springframework.beans.factory.annotation.Autowired;

public class Rabbit {
    public Duck duck6;

    @Autowired
    void setDuck(Duck duck) {
        this.duck6 = duck;
    }
}
