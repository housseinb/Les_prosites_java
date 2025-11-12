package tn.esprit.gestionaire.entities;

public class Terrestrial extends Animal {
    protected int nbrLegs;

    public Terrestrial() {
        super();
    }

    public Terrestrial(String f, String n, int a, boolean m, int nbrLegs) {
        super(f, n, a, m);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + " Number of legs: " + nbrLegs;
    }
}
