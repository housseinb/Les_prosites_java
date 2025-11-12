package tn.esprit.gestionaire.entities;

public class Dolphin extends Aquatic {
    protected float swimmingSpeed;

    public Dolphin() { super(); }

    public Dolphin(String f, String n, int a, boolean m, String habitat, float swimmingSpeed) {
        super(f, n, a, m, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + " Swimming speed: " + swimmingSpeed + " km/h";
    }
}
