package com.controller;

import com.model.FizzBuzzModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by brallan on 01/07/16.
 */
@Controller
public class FizzBuzzController {

    private FizzBuzzModel fizzBuzzModel;

    public FizzBuzzController() {
        fizzBuzzModel = new FizzBuzzModel();
    }

    @RequestMapping(value = "/play", method = RequestMethod.GET)
    @ResponseBody
    public String play(@RequestParam("number") int pNumber) {
        return fizzBuzzModel.play(pNumber);
    }
}
