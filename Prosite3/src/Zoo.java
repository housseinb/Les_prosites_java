public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrcages = 25; // constante pour le nombre maximum de cages
    private int nbrAnimal = 0;

    public Zoo() {
        System.out.println("zoo created");
        this.animals = new Animal[nbrcages];
    }

    public Zoo(String name, String city, int age) {
        System.out.println("zoo created");
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrcages];
    }

    public void displayZoo() {
        System.out.println("zoo name: " + this.name);
        System.out.println("zoo city: " + this.city);
        System.out.println("zoo cages: " + nbrcages);
        System.out.println("animals in zoo: " + nbrAnimal);
    }

    @Override
    public String toString() {
        return "zoo name='" + name + "', city='" + city + "', cages=" + nbrcages;
    }
    //nouveate Prosite 3
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("plain");
            return false;
        }
        if (searchAnimal(animal.getname()) != -1) {
            System.out.println("animal deja existe");
            return false;
        }
        animals[nbrAnimal] = animal;
        nbrAnimal++;
        return true;
    }


    public void afficheranimal() {
        if (nbrAnimal == 0) {
            System.out.println("empty");
        } else {
            System.out.println("zoo:");
            for (int i = 0; i < nbrAnimal; i++) {
                System.out.println("- " + animals[i]);
            }
        }
    }

    public int searchAnimal(String name) {
        for (int i = 0; i < nbrAnimal; i++) {
            if (animals[i].getname().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(String name) {
        int j = searchAnimal(name);
        if (j == -1) {
            return false;
        }
        for (int i = j; i < nbrAnimal - 1; i++) {
            animals[i] =animals[i + 1];
        }
        animals[nbrAnimal-1] = null;
        nbrAnimal--;
        return true;
    }

    public boolean isZooFull() {
        return nbrAnimal >=nbrcages;
    }

    public static Zoo compareZoo(Zoo z1, Zoo z2) {
        return (z1.nbrAnimal >= z2.nbrAnimal) ? z1 : z2;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public int getNbrAnimal() {
        return nbrAnimal;
    }
}
