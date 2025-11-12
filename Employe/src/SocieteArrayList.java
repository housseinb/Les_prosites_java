import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {
    private ArrayList<Employe> employes;

    public SocieteArrayList() {
        this.employes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe emp : employes) {
            if (emp.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        if (employes.remove(employe)) {
            System.out.println("Employé supprimé: " + employe.getNom());
        } else {
            System.out.println("Employé non trouvé: " + employe.getNom());
        }
    }

    @Override
    public void displayEmploye() {
        if (employes.isEmpty()) {
            System.out.println("Aucun.");
        } else {
            for (Employe emp : employes) {
                System.out.println(emp);
            }
        }
    }

    @Override
    public void trierEmployeeParId() {
        Collections.sort(employes);
    }

    @Override
    public void trierEmployeeParNomDepartementEtGrade() {
        Collections.sort(employes, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                int compareDepartement = e1.getNomDepartement().compareTo(e2.getNomDepartement());
                if (compareDepartement != 0) {
                    return compareDepartement;
                }

                int compareGrade = Integer.compare(e1.getGrade(), e2.getGrade());
                if (compareGrade != 0) {
                    return compareGrade;
                }

                return e1.getNom().compareTo(e2.getNom());
            }
        });
    }

    @Override
    public List<Employe> rechercherParDepartement(String nomDepartment) {
        List<Employe> resultats = new ArrayList<>();
        for (Employe emp : employes) {
            if (emp.getNomDepartement().equalsIgnoreCase(nomDepartment)) {
                resultats.add(emp);
            }
        }
        return resultats;
    }

    public ArrayList<Employe> getEmployes() {
        return employes;
    }
}