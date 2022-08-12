package com.stageTT.Controller;

import com.stageTT.Entity.Personne;
import com.stageTT.Services.ImcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class ImcController {
    @Autowired
    public ImcService Imcservice;

    @PostMapping("/CalculIMC")
    public float calculIMC(@RequestBody Personne personne)
    {
        return Imcservice.calculIMC(personne);
    }
}
