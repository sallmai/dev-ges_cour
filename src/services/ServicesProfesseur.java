package services;

import java.util.ArrayList;
import java.util.List;

import entites.Professeur;

public class ServicesProfesseur extends ServiceIMPL<Professeur> {
    List<Professeur>professeurs=new ArrayList<>();

    @Override
    public boolean save(Professeur data) {
       data.setId(Professeur.getNbreProfesseurs());
       professeurs.add(data);
       System.out.println("prof ajouter");
       return true;
    }

    @Override
    public List<Professeur> show() {
        return professeurs;
    }

    @Override
    public Professeur getByString(String chaine) {
       for (Professeur professeur : professeurs) {
        if (professeur.getNomComplet().compareToIgnoreCase(chaine)==0) {
            return professeur;
        }
       }
       return null;
    }
    
}
