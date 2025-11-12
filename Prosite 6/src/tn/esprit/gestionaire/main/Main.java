package tn.esprit.gestionaire.main;
import tn.esprit.gestionaire.entities.Animal;
import tn.esprit.gestionaire.entities.Zoo;
import tn.esprit.gestionaire.entities.Aquatic;
import tn.esprit.gestionaire.entities.Terrestrial;
import tn.esprit.gestionaire.entities.Dolphin;
import tn.esprit.gestionaire.entities.Penguin;

public class Main {
    public static void main(String[] args){
        Zoo myZoo = new Zoo("zefzefezff", "gterrgeg");

        Dolphin d1 = new Dolphin("dscczefqcq", "edazdqsx", 8, true, "zefzefcx", 30f);
        Penguin p1 = new Penguin("zefzdcfsqc", "Pingu", 5, false, "zfefzcqsxc", 15f);
        Penguin p2 = new Penguin("gergrgg", "ezfzefzdf", 7, false, "efzrgtt", 22f);

        myZoo.addAquaticAnimal(d1);
        myZoo.addAquaticAnimal(p1);
        myZoo.addAquaticAnimal(p2);

        System.out.println("=== test swim() ===");
        myZoo.displayAquaticAnimalsSwim();

        System.out.println("profondeur max pingouin: " + myZoo.maxPenguinDepth());
        myZoo.countAquaticTypes();

        System.out.println("test equals: " + p1.equals(p2));

    }
}