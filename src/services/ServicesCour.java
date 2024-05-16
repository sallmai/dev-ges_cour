package services;

import java.util.ArrayList;
import java.util.List;

import entites.Cour;

public class ServicesCour extends ServiceIMPL<Cour> {
List <Cour>cours=new ArrayList<>();
    @Override
    public boolean save(Cour data) {
        data.setId(Cour.getNbreCours());
       cours.add(data);
       System.out.println("cour ajouter");
       return true; 
    }

    @Override
    public List<Cour> show() {
        return cours;
    }

    @Override
    public Cour getByString(String chaine) {
        for (Cour cour : cours) {
            if (cour.getModule().compareToIgnoreCase(chaine)==0) {
                return cour;
            }
        }
        return null;
    }
    
}
