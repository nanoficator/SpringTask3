package deth;

import org.springframework.beans.factory.annotation.Autowired;

public class Oak {
    public Chest chest4;

    @Autowired
    void setChest(Chest chest) {
        this.chest4 = chest;
    }
}
