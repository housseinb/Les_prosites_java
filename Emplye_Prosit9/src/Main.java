
public class Main {
    public static void main(String[] args) {

        SocieteArrayList societe = new SocieteArrayList();
        Employe e1 = new Employe(3, "gzefsdfq", "zegsdgsrghs", "IT", 2);
        Employe e2 = new Employe(1, "lkkzefzfef", "zegedzear", "GL", 1);
        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.trierEmployeParId();
        societe.displayEmploye();
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();
        System.out.println("recherche par nom 'gzefsdfq': " + societe.rechercherEmploye("gzefsdfq"));
        System.out.println("recherche par nom 'lkkzefzfef': " + societe.rechercherEmploye("lkkzefzfef"));
        System.out.println("recherche de l'employé e1: " + societe.rechercherEmploye(e1));
        societe.supprimerEmploye(e2);
        societe.displayEmploye();
        societe.ajouterEmploye(new Employe(6, "gzdvdsgseg", "ezfdcqsdfq", "MR", 2));
        societe.ajouterEmploye(new Employe(0, "ezgrertet", "egzegsdget", "IT", 3));
        societe.trierEmployeParId();
        societe.displayEmploye();
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

    }
}