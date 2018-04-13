package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    public void start(int count) {
        for (int i = 1; i <= count; i++) {
            results.add(getStr(i));
        }
    }

    public String getStr (int num){
        if((num+"").indexOf("3") != -1){
            return "Fizz";
        }
        if (num%3 == 0){
            if(num%5 == 0){
                if(num%7 == 0){
                    return "FizzBuzzWhizz";
                }else{
                    return "FizzBuzz";
                }
            }else if(num%7 == 0){
                return "FizzWhizz";
            }else{
                return "Fizz";
            }
        }else if (num%5 == 0){
            if(num%7 == 0){
                return "BuzzWhizz";
            }else {
                return "Buzz";
            }
        }else if (num%7 == 0){
            return "Whizz";
        }else {
            return ""+num;
        }
    }

    public List<String> getResults() {
        return results;
    }
}


