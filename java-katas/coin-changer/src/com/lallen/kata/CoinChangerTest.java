package com.lallen.kata;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CoinChangerTest {

    @Test
    public void givesChangeFor1() throws Exception {
        CoinChanger coinChanger = new CoinChanger();
        assertEquals(1, coinChanger.giveChange(1));
    }

}
