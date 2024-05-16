package entites;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Cour {
    private int id;
    private String module;
    private Professeur professeur;

    private static int nbreCours;

    private LocalDate date;
    private LocalTime heuredb;
    private LocalTime heurefin;

    List<SeanceCour> seanceCours = new ArrayList<>();
    List<Classe> classes = new ArrayList<>();

    public Cour(int id, String module, Professeur professeur, LocalDate date, LocalTime heuredb, LocalTime heurefin) {
        this.id = id;
        this.module = module;
        this.professeur = professeur;
        this.date = date;
        this.heuredb = heuredb;
        this.heurefin = heurefin;
    }

    public Cour() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    public static int getNbreCours() {
        return ++nbreCours;
    }

    public static void setNbreCours(int nbreCours) {
        Cour.nbreCours = nbreCours;
    }

    public List<SeanceCour> getSeanceCours() {
        return seanceCours;
    }

    public void addSeanceCours(SeanceCour seanceCour) {
        seanceCours.add(seanceCour);
    }

    public List<Classe> getClasses() {
        return classes;
    }

    public void addClasses(Classe classe) {
        classes.add(classe);
    }

    @Override
    public String toString() {
        return "Cour [id=" + id + ", module=" + module + ", professeur=" + professeur + "]";
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHeuredb() {
        return heuredb;
    }

    public void setHeuredb(LocalTime heuredb) {
        this.heuredb = heuredb;
    }

    public LocalTime getHeurefin() {
        return heurefin;
    }

    public void setHeurefin(LocalTime heurefin) {
        this.heurefin = heurefin;
    }

    public void setSeanceCours(List<SeanceCour> seanceCours) {
        this.seanceCours = seanceCours;
    }

    public void setClasses(List<Classe> classes) {
        this.classes = classes;
    }

}