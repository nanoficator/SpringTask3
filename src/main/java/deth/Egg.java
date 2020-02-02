package deth;

import org.springframework.beans.factory.annotation.Autowired;

public class Egg {
    public Needle needle8;

    @Autowired
    void setNeedle(Needle needle) {
        this.needle8 = needle;
    }
}
