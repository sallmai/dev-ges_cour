import java.util.Scanner;

import entites.Cour;
import entites.Professeur;
import services.ServicesCour;
import services.ServicesProfesseur;
import view.ViewCour;
import view.ViewProfesseur;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        ServicesProfesseur servicesProfesseur = new ServicesProfesseur();
        ServicesCour servicesCour = new ServicesCour();

        ViewCour viewCour = new ViewCour(servicesCour, servicesProfesseur);
        ViewProfesseur viewProfesseur = new ViewProfesseur(servicesProfesseur, servicesCour);
        viewCour.setScanner(scanner);
        viewProfesseur.setScanner(scanner);
        int choix;
        do {
            choix = menu();
            switch (choix) {
                case 1:
                    servicesProfesseur.save(viewProfesseur.saisir());
                    break;

                case 2:
                    viewProfesseur.afficher(servicesProfesseur.show());
                    break;

                case 3:
                    servicesCour.save(viewCour.saisir());
                    break;

                case 4:
                    viewCour.afficher(servicesCour.show());
                    break;
                case 5:
                    Professeur prof=servicesProfesseur.getByString(viewProfesseur.askString());
                    if (prof!=null) {
                       for (Cour cour : prof.getCours()) {
                        System.out.println(cour);
                       }
                    }
                    break;

                default:
                    break;
            }

        } while (choix != 6);

    }

    public static int menu() {
        System.out.println("\n1- Ajouter un Professeur");
        System.out.println("2- Lister les Professeurs");
        System.out.println("3- Créer un Cours ");
        System.out.println("4- Lister Tous les cours");
        System.out.println("5- Lister les les cours d’un professeur");

        System.out.println("6-   quitter");
        return scanner.nextInt();
    }

    public static int rep() {
        int rep;
        do {
            System.out.println("voulez vous continuez");
            System.out.println("1........oui");
            System.out.println("2.........non");
            rep = scanner.nextInt();
        } while (rep < 1 || rep > 2);

        return rep;
    }

}
