package view;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import enums.Filiere;
import enums.Grade;
import enums.Niveau;
import enums.Specialite;
import interfaces.Iview;

public abstract class ViewIMPL<T> implements Iview<T> {
    protected Scanner scanner;

public Scanner getScanner() {
    return scanner;
}

public  void setScanner(Scanner scanner) {
    this.scanner = scanner;
}

public Niveau askNiveau(){
    int pos;
    do {
        System.out.println("\n1.......................L1");
        System.out.println("2........................L2");
        System.out.println("3..........................L3\n");
        pos=scanner.nextInt();
    } while (pos<1 || pos>3);
    return Niveau.values()[pos-1];
   
}


public Grade askgrade(){
    int pos;
    do {
        System.out.println("\n1.......................Licence");
        System.out.println("2........................master");
        System.out.println("3..........................doctorat\n");
        pos=scanner.nextInt();
    } while (pos<1 || pos>3);
    return Grade.values()[pos-1];
   
}

public Specialite askSpecialite(){
    int pos;
    do {
        System.out.println("\n1.......................JAVA");
        System.out.println("2........................algo");
        System.out.println("3..........................php");
        System.out.println("4............................MATH\n");
        pos=scanner.nextInt();

    } while (pos<1 || pos>4);
    return Specialite.values()[pos-1];
   
}


public Filiere askFILIERE(){
    int pos;
    do {
        System.out.println("\n1.......................IAGE");
        System.out.println("2........................MAIE");
        System.out.println("3..........................GLRS");
        System.out.println("4.............................CDSD");
        System.out.println("5...............................TTL\n");
        pos=scanner.nextInt();
    } while (pos<1 || pos>5);
    return Filiere.values()[pos-1];
   
}

  public static LocalDate formatDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(date, formatter);
    }


    
   public static LocalTime formatTime(   String heure ){
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:MM"); 
   return LocalTime.parse(heure, formatter);
}


    public String askString(){
        scanner.nextLine();
        System.out.println("input :");
        return scanner.nextLine();
    }
}
