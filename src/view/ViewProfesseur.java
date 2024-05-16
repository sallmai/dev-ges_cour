package view;

import java.util.List;


import entites.Professeur;
import services.ServicesCour;
import services.ServicesProfesseur;

public class ViewProfesseur extends ViewIMPL<Professeur> {

    private ServicesProfesseur service;

    public ServicesCour getSer() {
        return ser;
    }

    public void setSer(ServicesCour ser) {
        this.ser = ser;
    }

    private ServicesCour ser;

    public ViewProfesseur(ServicesProfesseur service, ServicesCour ser) {
        this.service = service;
        this.ser = ser;
    }

    @Override
    public void afficher(List<Professeur> list) {
        for (Professeur professeur : list) {
            System.out.println(professeur);
        }
    }

    @Override
    public Professeur saisir() {
        String nom;
        do {
            scanner.nextLine();
            System.out.println("verifions si le prof existe ");
            nom = scanner.nextLine();

        } while (service.getByString(nom) != null);
        System.out.println("le prof existe pas,donc on peut l'ajouter\n");
        Professeur prof = new Professeur();
        do {
            System.out.println("entrer nom et prenom");
            prof.setNomComplet(scanner.nextLine());
        } while (prof.getNomComplet() == null || prof.getNomComplet().isEmpty());
        prof.setGrade(askgrade());
        prof.setSpecialite(askSpecialite());
        

        return prof;

    }

}
