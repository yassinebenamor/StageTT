package com.stageTT.Services;

import com.stageTT.Entity.Personne;
import org.springframework.stereotype.Service;

@Service
public class ImcService {

    public float calculIMC(Personne personne) {
        float taille = (float) Math.pow((float)personne.getTaille()/100,2);
        return (float) personne.getPoids()/taille;
    }
    public float calculMinPoidIdeal(Personne personne){
        float taille = (float) Math.pow(personne.getTaille()/100,2);
        return (float) (18.5*taille);
    }
    public float calculMaxPoidIdeal(Personne personne){
        float taille = (float) Math.pow(personne.getTaille()/100,2);
        return (float) (25*taille);
    }
}
