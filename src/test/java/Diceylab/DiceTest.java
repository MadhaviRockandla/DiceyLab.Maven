package Diceylab;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    public void rollDiceTest1() {
        Dice dice = new Dice(1);
        int result = dice.rollDice();
        Assert.assertFalse(result == 0);

    }

    @Test
    public void rollDiceTest2() {
        Dice dice = new Dice(2);
        int result = dice.rollDice();
        Assert.assertTrue(result >= 2 && result <= 12);

    }

    @Test
    public void rollDiceTest3() {
        Dice dice = new Dice(5);
        int result = dice.rollDice();
        Assert.assertTrue(result >= 5 && result <= 30);

    }
}