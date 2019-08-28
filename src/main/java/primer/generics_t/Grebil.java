package primer.generics_t;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陈枫 on 2019-07-09.
 */
public class Grebil {
    private int gerbilNumber;

    public Grebil() {
        this.gerbilNumber = 0;
    }

    public void hop() {
        System.out.println(gerbilNumber++);
    }


    public static void main(String[] args) {
        ArrayList<Grebil> list = new ArrayList<Grebil>();
        list.add(new Grebil());
        list.add(new Grebil());
        list.add(new Grebil());
        list.add(new Grebil());

        for (Grebil g : list) {
            g.hop();
        }

    }
}
