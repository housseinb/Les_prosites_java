package tn.esprit.gestionaire.entities;

public class Penguin extends Aquatic {
    protected float swimmingDepth;

    public Penguin() { super(); }

    public Penguin(String f, String n, int a, boolean m, String habitat, float swimmingDepth) {
        super(f, n, a, m, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + " Swimming depth: " + swimmingDepth + " m";
    }
}
