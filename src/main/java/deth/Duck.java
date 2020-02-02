package deth;

import config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;

public class Duck {
    public Egg egg7;

    public Duck() {
        this.egg7 = new Egg();
    }
}