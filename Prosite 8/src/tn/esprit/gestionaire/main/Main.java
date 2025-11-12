package tn.esprit.gestionaire.main;

import tn.esprit.gestionaire.entities.*;

public class Main {
    public static void main(String[] args) {

        Zoo myZoo = new Zoo("zaeffffaf", "Tunis", 3);

        // Animaux de test
        Animal lion = new Animal("zefefdsf", "Simba", 5, true);
        Animal chat = new Animal("zeflzkf", "zejfzf", -2, true);
        Animal tigre = new Animal("skjqdear", "zefzf", 7, true);
        Animal elephant = new Animal("nvzjeflkf", "zefzfzfzffzfzfzf", 10, true);
        try {
            myZoo.addAnimal(lion);
        } catch (Exception e) {
            System.out.println("attontion : " + e.getMessage());
        }
        System.out.println("nombre d’animaux : " + myZoo.getCurrentAnimalCount());

        try {
            myZoo.addAnimal(chat);
        } catch (Exception e) {
            System.out.println("attontion : " + e.getMessage());
        }
        System.out.println("Nombre d’animaux : " + myZoo.getCurrentAnimalCount());

        try {
            myZoo.addAnimal(tigre);
            myZoo.addAnimal(elephant);
        } catch (Exception e) {
            System.out.println("attontion : " + e.getMessage());
        }

        System.out.println("Nombre final d’animaux : " + myZoo.getCurrentAnimalCount());
        myZoo.Diplay_animals();
    }
}
