package com.lallen.kata;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import org.junit.Before;

import static junit.framework.Assert.assertEquals;

public class CoinChangerTest {
    private CoinChanger coinChanger;

    private ArrayList<Integer> expectChange(int... numbers) {
        ArrayList<Integer> change = new ArrayList<Integer>();
        for (int number : numbers){
            change.add(number);
        }
        return change;
    }

    @Before
    public void setUp() throws  Exception {
       coinChanger = new CoinChanger();
    }

    @Test
    public void givesChangeFor1() throws Exception {
        assertEquals(expectChange(1), coinChanger.giveChange(1));
    }

    @Test
    public  void  givesChangeFor2() throws Exception {
        assertEquals(expectChange(1, 1), coinChanger.giveChange(2));
    }

    @Test
    public void givesChangeFor3()throws Exception {
        assertEquals(expectChange(1,1,1), coinChanger.giveChange(3));
    }

    @Test
    public void givesChangeFor4() throws Exception {
        assertEquals(expectChange(1,1,1,1), coinChanger.giveChange(4));
    }

    @Test
    public void givesChangeFor5() throws Exception {
        assertEquals(expectChange(5), coinChanger.giveChange(5));
    }

    @Test
    public  void givesChangeFor6() throws  Exception {
        assertEquals(expectChange(5,1), coinChanger.giveChange(6));
    }

    @Test
    public void givesChangeFor7() throws Exception {
        assertEquals(expectChange(5,1,1), coinChanger.giveChange(7));
    }

    @Test
    public void givesChangeFor8() throws Exception {
        assertEquals(expectChange(5,1,1,1), coinChanger.giveChange(8));
    }

    @Test
    public void givesChangeFor9() throws Exception {
        assertEquals(expectChange(5,1,1,1,1), coinChanger.giveChange(9));
    }

    @Test
    public void givesChangeFor10() throws Exception {
        assertEquals(expectChange(10), coinChanger.giveChange(10));
    }

    @Test
    public void givesChangeFor11() throws Exception {
        assertEquals(expectChange(10,1), coinChanger.giveChange(11));
    }

    @Test
    public void givesChangeFor12() throws Exception {
        assertEquals(expectChange(10,1,1), coinChanger.giveChange(12));
    }

    @Test
    public void givesChangeFor13() throws Exception {
        assertEquals(expectChange(10,1,1,1), coinChanger.giveChange(13));
    }

    @Test
    public void givesChangeFor14() throws Exception {
        assertEquals(expectChange(10, 1,1,1,1), coinChanger.giveChange(14));
    }

    @Test
    public void givesChangeFor15() throws Exception {
        assertEquals(expectChange(10, 5), coinChanger.giveChange(15));
    }

    @Test
    public  void givesChangeFor16() throws Exception {
        assertEquals(expectChange(10,5,1), coinChanger.giveChange(16));
    }

    @Test
    public void givesChangeFor17() throws Exception {
        assertEquals(expectChange(10, 5,1,1), coinChanger.giveChange(17));
    }

    @Test
    public void givesChangeFor18() throws Exception {
        assertEquals(expectChange(10, 5,1,1,1), coinChanger.giveChange(18));
    }

    @Test
    public void givesChangeFor19() throws Exception {
        assertEquals(expectChange(10, 5, 1, 1, 1, 1), coinChanger.giveChange(19));
    }

    @Test
    public void givesChangeFor20() throws Exception {
        assertEquals(expectChange(10,10), coinChanger.giveChange(20));
    }

    @Test
    public void givesChangeFor21() throws Exception {
        assertEquals(expectChange(10,10,1), coinChanger.giveChange(21));
    }

    @Test
    public  void  givesChangeFor22() throws Exception {
        assertEquals(expectChange(10,10,1,1), coinChanger.giveChange(22));
    }

    @Test
    public void givesChangeFor23() throws Exception {
        assertEquals(expectChange(10, 10,1,1,1), coinChanger.giveChange(23));
    }

    @Test
    public void givesChangeFor24() throws Exception {
        assertEquals(expectChange(10,10,1,1,1,1), coinChanger.giveChange(24));
    }

    @Test
    public void givesChangeFor25() throws Exception {
        assertEquals(expectChange(25), coinChanger.giveChange(25));
    }

    @Test
    public void givesChangeFor76() throws Exception {
        assertEquals(expectChange(25,25,25,1), coinChanger.giveChange(76));
    }

}