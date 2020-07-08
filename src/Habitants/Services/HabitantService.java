package Habitants.Services;

import Habitants.Habitant;
import datas.Bien;
import datas.Bijou;

import java.util.ArrayList;

public
class HabitantService {


    public
    HabitantService() {


    }

    private static
    int getRedCount(Habitant habitant) {

        int count = 0;
        for (Bien bien : habitant.getBiens()) {

            if (bien instanceof Bijou) {

                if (((Bijou) bien).getBijouClr().equals("rouge")) {

                    count++;
                }
            }
        }


        return count;
    }


    public static
    Habitant sortByRed(ArrayList<Habitant> habitants) {

        if (habitants.size() > 1) {
            Habitant tempHab = habitants.get(0);

            for (int i = 1; i < habitants.size(); i++) {

                if (getRedCount(habitants.get(i)) > getRedCount(tempHab)) {

                    tempHab = habitants.get(i);
                }
            }

            return tempHab;
        }

        return null;
    }
}
