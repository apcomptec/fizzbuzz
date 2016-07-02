package com.model;

/**
 * Created by brallan on 01/07/16.
 */
public class FizzBuzzModel {

    public String play(int pNumber) {
        String evaluation = "";

        if(pNumber % 3 != 0 && pNumber % 5 != 0) {
            evaluation = Integer.toString(pNumber);
        }
        else {
            if(pNumber % 3 == 0) {
                evaluation += "Fizz";
            }

            if(pNumber % 5 == 0) {
                evaluation += "Buzz";
            }
        }

        return evaluation;
    }
}
