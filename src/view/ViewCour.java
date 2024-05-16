package view;

import java.util.List;

import entites.Cour;
import entites.Professeur;
import services.ServicesCour;
import services.ServicesProfesseur;

public class ViewCour  extends ViewIMPL<Cour>{

  
    private ServicesCour service;
     private ServicesProfesseur servicePR;

    public ViewCour(ServicesCour service,ServicesProfesseur servicePR) {
        this.service = service;
        this.servicePR=servicePR;
    }

    @Override
    public void afficher(List<Cour> list) {
        for (Cour cour : list) {
            System.out.println(cour);
        }
    }

    @Override
    public Cour saisir() {
        scanner.nextLine();
        String module;
        do {
            System.out.println("entrer le module ");
            module=scanner.nextLine();

        } while (service.getByString(module)!=null);
    System.out.println("le module esiste pas,donc on peut l'ajouter\n");
        Cour cour = new Cour();

        do {
            System.out.println("entrer module ");
            cour.setModule(scanner.nextLine());
        } while (cour.getModule() == null || cour.getModule().isEmpty());
        System.out.println("saisir la date dd-MM-yyyy");
        cour.setDate(formatDate(scanner.nextLine()));
        System.out.println("heure debut HH:MM??");
        cour.setHeuredb(formatTime(scanner.nextLine()));
        System.out.println("heure fin HH:MM??");
        cour.setHeurefin(formatTime(scanner.nextLine()));
        String nom;
        Professeur prof;
       
            do {
                System.out.println("Entrer le nom du prof ");
                nom = scanner.nextLine();
                prof =servicePR.getByString(nom);
                if (prof == null) {
                    System.out.println("le prof n'existe pas");
                }
            } while (prof == null);
            
             cour.setProfesseur(prof);
             prof.addCours(cour);

        return cour;
    }




    public ServicesCour getService() {
        return service;
    }

    public void setService(ServicesCour service) {
        this.service = service;
    }
    
}
