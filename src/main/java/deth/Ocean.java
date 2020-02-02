package deth;

import org.springframework.beans.factory.annotation.Autowired;

public class Ocean {
    public Island island2;

    @Autowired
    void setIsland(Island island) {
        this.island2 = island;
    }
}
