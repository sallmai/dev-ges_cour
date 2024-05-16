package entites;

import java.util.ArrayList;
import java.util.List;

import enums.Grade;
import enums.Specialite;

public class Professeur {
    private int id;
    private String nomComplet;
    private Grade grade;
    private Specialite specialite;
    private static int nbreProfesseurs;
List<Cour>cours=new ArrayList<>();


public Professeur() {
}


public Professeur(String nomComplet, Grade grade, Specialite specialite) {
    this.nomComplet = nomComplet;
    this.grade = grade;
    this.specialite = specialite;
}


public int getId() {
    return id;
}


public void setId(int id) {
    this.id = id;
}


public String getNomComplet() {
    return nomComplet;
}


public void setNomComplet(String nomComplet) {
    this.nomComplet = nomComplet;
}


public Grade getGrade() {
    return grade;
}


public void setGrade(Grade grade) {
    this.grade = grade;
}


public Specialite getSpecialite() {
    return specialite;
}


public void setSpecialite(Specialite specialite) {
    this.specialite = specialite;
}


public static int getNbreProfesseurs() {
    return ++nbreProfesseurs;
}


public static void setNbreProfesseurs(int nbreProfesseurs) {
    Professeur.nbreProfesseurs = nbreProfesseurs;
}


public List<Cour> getCours() {
    return cours;
}


public void addCours(Cour cour) {
   cours.add(cour);
}


@Override
public String toString() {
    return "Professeur [id=" + id + ", nomComplet=" + nomComplet + ", grade=" + grade + ", specialite=" + specialite
            + "]";
}
    
}