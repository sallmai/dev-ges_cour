package entites;

import java.time.LocalDate;
import java.time.LocalTime;



public class SeanceCour {
    private int id;
    private LocalDate date;
    private LocalTime heuredb;
    private LocalTime heurefin;

    private static int nbreSeanceCours;
    private Cour cour;
    
    public SeanceCour(int id, LocalDate date, LocalTime heuredb, LocalTime heurefin, Cour cour) {
        this.id = id;
        this.date = date;
        this.heuredb = heuredb;
        this.heurefin = heurefin;
        this.cour = cour;
    }
    public SeanceCour() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
   
    public Cour getCour() {
        return cour;
    }
    public void setCour(Cour cour) {
        this.cour = cour;
    }

    public static int getNbreSeanceCours() {
        return ++nbreSeanceCours;
    }
    public static void setNbreSeanceCours(int nbreSeanceCours) {
        SeanceCour.nbreSeanceCours = nbreSeanceCours;
    }
    @Override
    public String toString() {
        return "SeanceCour [id=" + id + ", date=" + date + ", heuredb=" + heuredb + ", heurefin=" + heurefin + ", cour="
                + cour + "]";
    }


   
}
