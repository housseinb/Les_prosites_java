import java.util.List;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();
        Employe emp1 = new Employe(3, "zefzf", "zefzfzefzf", "Informatique", 2);
        Employe emp2 = new Employe(1, "zefzfzfrg", "zfzefzf", "Ressources Humaines", 1);

        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);

        societe.displayEmploye();
        System.out.println("Recherche 'zefzfzfrg': " + societe.rechercherEmploye("zefzfzfrg"));
        societe.trierEmployeeParId();
        societe.displayEmploye();
        societe.trierEmployeeParNomDepartementEtGrade();
        societe.displayEmploye();
        List<Employe> employesInformatique = societe.rechercherParDepartement("Informatique");
        System.out.println("Employés du département Informatique:");
        for (Employe emp : employesInformatique) {
            System.out.println(emp);
        }
        societe.supprimerEmploye(emp2);
        societe.displayEmploye();
    }
}