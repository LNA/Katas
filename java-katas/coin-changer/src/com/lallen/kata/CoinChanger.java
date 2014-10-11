package com.lallen.kata;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CoinChanger {

    public ArrayList giveChange(int amount) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int [] coins = {25, 10, 5, 1};
        for (int coin : coins) {
            while (amount >= coin){
                result.add(coin);
                amount -= coin;
            }

        }
        return result;
    }
}