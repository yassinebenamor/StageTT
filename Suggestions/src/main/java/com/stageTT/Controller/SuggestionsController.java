package com.stageTT.Controller;

import com.stageTT.Entity.Suggestions;
import com.stageTT.Services.SuggestionsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class SuggestionsController {

    @Autowired
    private SuggestionsServices suggestionsServices;

    public void Initializer()
    {
        suggestionsServices.addSuggestions(new Suggestions(1,"Underweight","Avoid intensive sport"));
        suggestionsServices.addSuggestions(new Suggestions(2,"Underweight","You need to eat more equilibrated food, try proteins calorie , eat fruits as much as you can"));
        suggestionsServices.addSuggestions(new Suggestions(3,"Normal","You've got the perfect weight although keep practicing sport and all your good habits"));
        suggestionsServices.addSuggestions(new Suggestions(4,"Overweight","You've got an Overweight , you need to change your habits"));
        suggestionsServices.addSuggestions(new Suggestions(5,"Overweight","reduce eating junk food and limit sugary snacks and high calories food"));
    }
    @GetMapping("/suggestions")
    public List<String> getSuggestions(@RequestParam float imc)
    {
        return suggestionsServices.getSuggestions(imc);
    }
}
