package com.stageTT.Services;

import com.stageTT.Entity.Suggestions;
import com.stageTT.Repository.SuggestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SuggestionsServices {
    @Autowired
    private SuggestionsRepository suggestionsRepository;

    public Suggestions addSuggestions(Suggestions s)
    {
        if(suggestionsRepository.findAll().size()<5) {
            return suggestionsRepository.save(s);
        }
        return null;
    }
    public List<String> getSuggestions(float IMC)
    {
        List<String> ListSuggestions = new ArrayList<>();
        if(IMC<18.5)
        {
            for (Suggestions s : suggestionsRepository.findSuggestionsByCategory("Underweight"))
            {
                ListSuggestions.add(s.getSuggestions());
            }
        }
        if(IMC>=18.5 || IMC<24.9)
        {
            for (Suggestions s : suggestionsRepository.findSuggestionsByCategory("Normal"))
            {
                ListSuggestions.add(s.getSuggestions());
            }

        }
        else {
            for (Suggestions s : suggestionsRepository.findSuggestionsByCategory("Overweight"))
            {
                ListSuggestions.add(s.getSuggestions());
            }
        }
        return ListSuggestions;
    }
}
