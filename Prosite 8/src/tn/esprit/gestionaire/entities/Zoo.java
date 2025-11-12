package tn.esprit.gestionaire.entities;

public class Zoo {
    private Animal[] animals;
    private Aquatic[] aquaticAnimals = new Aquatic[10];
    String name;
    String city;
    final int nbrcages;
    int currentanimal = 0;
    int currentAquatic = 0;

    public Zoo(String n, String c) {
        this(n, c, 25); // par défaut 25 cages
    }

    public Zoo(String n, String c, int capacity) {
        if (n.equals("")) {
            System.out.println("Nom du zoo invalide");
        }
        this.name = n;
        this.city = c;
        this.nbrcages = capacity;
        this.animals = new Animal[capacity];
    }

    public void DisplayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("Zoo City: " + city);
        System.out.println("Zoo NB CAGES: " + nbrcages);
        System.out.println("Animaux actuels: " + currentanimal);
    }

    // ✅ Instruction 32–34 : ajout avec exceptions
    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        if (currentanimal >= nbrcages) {
            throw new ZooFullException("Le zoo est plein, impossible d’ajouter un nouvel animal.");
        }
        if (animal == null) {
            System.out.println("Animal null ignoré.");
            return;
        }
        if (animal.age < 0) {
            throw new InvalidAgeException("Âge d’animal invalide : l’âge ne peut pas être négatif.");
        }

        animals[currentanimal++] = animal;
        System.out.println(animal.name + " ajouté avec succès !");
    }

    public void Diplay_animals() {
        for (Animal a : animals) {
            if (a != null)
                System.out.println(a);
        }
    }

    public int getCurrentAnimalCount() {
        return currentanimal;
    }


    public boolean addAquaticAnimal(Aquatic a) {
        if (currentAquatic >= aquaticAnimals.length) {
            System.out.println("Tableau des animaux aquatiques est plein !");
            return false;
        }
        aquaticAnimals[currentAquatic++] = a;
        return true;
    }

    public void displayAquaticAnimalsSwim() {
        for (Aquatic a : aquaticAnimals) {
            if (a != null) a.swim();
        }
    }

    public float maxPenguinDepth() {
        float max = 0;
        for (Aquatic a : aquaticAnimals) {
            if (a instanceof Penguin) {
                Penguin p = (Penguin) a;
                if (p.getSwimmingDepth() > max)
                    max = p.getSwimmingDepth();
            }
        }
        return max;
    }

    public void countAquaticTypes() {
        int dolphins = 0, penguins = 0;
        for (Aquatic a : aquaticAnimals) {
            if (a instanceof Dolphin) dolphins++;
            if (a instanceof Penguin) penguins++;
        }
        System.out.println("Nombre de dauphins: " + dolphins);
        System.out.println("Nombre de pingouins: " + penguins);
    }

    @Override
    public String toString() {
        return "Zoo Name: " + name + " Zoo City: " + city + " Zoo NB CAGES: " + nbrcages;
    }
}
