package deth;

import org.springframework.beans.factory.annotation.Autowired;

public class KoscheiTheDeathless {
    public Ocean ocean1;

    @Autowired
    void setOcean(Ocean ocean) {
        this.ocean1 = ocean;
    }
}
