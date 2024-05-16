package entites;

import java.util.ArrayList;
import java.util.List;

import enums.Filiere;
import enums.Niveau;

public class Classe {
    private int id;
    private String nomClasse;
    private Filiere filiere;
    private Niveau niveau;
    private static int nbreClasse;

    List<Cour> cours = new ArrayList<>();

    public Classe() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomClasse() {
        return nomClasse;
    }

    public void setNomClasse(String nomClasse) {
        this.nomClasse = nomClasse;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }

    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    public List<Cour> getCours() {
        return cours;
    }

    public void addCours(Cour cour) {
        cours.add(cour);
    }

    public static int getNbreClasse() {
        return ++nbreClasse;
    }

    public static void setNbreClasse(int nbreClasse) {
        Classe.nbreClasse = nbreClasse;
    }

    @Override
    public String toString() {
        return "Classe [id=" + id + ", nomClasse=" + nomClasse + ", filiere=" + filiere + ", niveau=" + niveau + "]";
    }
}

