package tn.esprit.gestionaire.entities;

public class Aquatic extends Animal {
    protected String habitat;

    public Aquatic() {
        super();
    }

    public Aquatic(String f, String n, int a, boolean m, String habitat) {
        super(f, n, a, m);
        this.habitat = habitat;
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + " Habitat: " + habitat;
    }
}
