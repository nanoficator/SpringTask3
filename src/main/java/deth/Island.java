package deth;

import org.springframework.beans.factory.annotation.Autowired;

public class Island {
    public Oak oak3;

    @Autowired
    public Island() {
        this.oak3 = new Oak();
    }
}
