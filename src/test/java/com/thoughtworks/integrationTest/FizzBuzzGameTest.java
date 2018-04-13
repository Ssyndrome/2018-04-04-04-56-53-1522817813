package com.thoughtworks.integrationTest;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import com.thoughtworks.FizzBuzzGame;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class FizzBuzzGameTest {
    @Test
    public void should_return_Fizz_when_have_3() {
        FizzBuzzGame game = new FizzBuzzGame();
        String expectedResult = "Fizz";
        String result = game.getStr(3);
        assertThat(result, equalTo(expectedResult));
    }

    @Test
    public void should_return_Buzz_when_have_5() {
        FizzBuzzGame game = new FizzBuzzGame();
        String expectedResult = "Buzz";
        String result = game.getStr(5);
        assertThat(result, equalTo(expectedResult));
    }

    @Test
    public void should_return_Whizz_when_have_7() {
        FizzBuzzGame game = new FizzBuzzGame();
        String expectedResult = "Whizz";
        String result = game.getStr(7);
        assertThat(result, equalTo(expectedResult));
    }

    @Test
    public void should_return_BuzzWhizz_when_have_5_7() {
        FizzBuzzGame game = new FizzBuzzGame();
        String expectedResult = "BuzzWhizz";
        String result = game.getStr(70);
        assertThat(result, equalTo(expectedResult));
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_have_3_5_7() {
        FizzBuzzGame game = new FizzBuzzGame();
        String expectedResult = "FizzBuzzWhizz";
        String result = game.getStr(3*5*7);
        assertThat(result, equalTo(expectedResult));
    }

    @Test
    public void should_return_Fizz_when_have_35() {
        FizzBuzzGame game = new FizzBuzzGame();
        String expectedResult = "Fizz";
        String result = game.getStr(35);
        assertThat(result, equalTo(expectedResult));
    }
}
