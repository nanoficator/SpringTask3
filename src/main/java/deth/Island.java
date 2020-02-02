package deth;

import org.springframework.beans.factory.annotation.Autowired;

public class Island {
    public Oak oak3;

    @Autowired
    void setOak(Oak oak) {
        this.oak3 = oak;
    }
}
