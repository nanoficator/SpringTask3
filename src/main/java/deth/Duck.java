package deth;

import org.springframework.beans.factory.annotation.Autowired;

public class Duck {
    public Egg egg7;

    @Autowired
    void setEgg(Egg egg) {
        this.egg7 = egg;
    }
}
