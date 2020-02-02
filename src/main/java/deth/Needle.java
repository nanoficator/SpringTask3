package deth;

import org.springframework.beans.factory.annotation.Autowired;

public class Needle {
    public Deth deth9;

    @Autowired
    void setDeth(Deth deth) {
        this.deth9 = deth;
    }
}
