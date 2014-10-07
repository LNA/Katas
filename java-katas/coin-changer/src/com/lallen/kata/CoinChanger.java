package com.lallen.kata;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CoinChanger {

    public ArrayList<Integer> giveChange(int amountToChange) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int count = amountToChange;
        for(int i=0 ; i < count; i++ ) {

            while (count >= 25) {
                result.add(25);
                count = count - 25;
            }

            while  (count >= 10) {
                result.add(10);
                count = count - 10;
            }
            if  (count >= 5) {
                result.add(5);
                count = count - 5;
            }

            if (count >= 1) {
                result.add(1);
            }

        }
        return result;
    }
}