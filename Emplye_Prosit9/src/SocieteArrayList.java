import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>{

    private List<Employe> employes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe e) {employes.add(e);}

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : employes) {
            if (e.getNom().equals(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe t) {return employes.contains(t);}

    @Override
    public void supprimerEmploye(Employe t) {employes.remove(t);}

    @Override
    public void displayEmploye() {
        for (Employe e : employes) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {Collections.sort(employes);}

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(employes,new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                int departCompare=e1.getNom_depart().compareToIgnoreCase(e2.getNom_depart());
                if (departCompare!=0) return departCompare;
                return Integer.compare(e1.getGrade(),e2.getGrade());
            }

        });
    }
}