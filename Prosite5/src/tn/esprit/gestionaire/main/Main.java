package tn.esprit.gestionaire.main;
import tn.esprit.gestionaire.entities.Animal;
import tn.esprit.gestionaire.entities.Zoo;
import tn.esprit.gestionaire.entities.Aquatic;
import tn.esprit.gestionaire.entities.Terrestrial;
import tn.esprit.gestionaire.entities.Dolphin;
import tn.esprit.gestionaire.entities.Penguin;

public class Main {
    public static void main(String[] args){
        //Prosite 1
//        ZooManagement zoo = new ZooManagement();
//        ZooManagement[] t = new ZooManagement[5];
//        //String[] b = new String[7];
//        //int[] b = new int[90];
//
//        //1er methode
//        for(int i = 0; i < 5; i++){
//            t[i] = new ZooManagement();
//            t[i].saisir();
//        }
//
//        /*for(int i = 0; i < 5; i++){
//            t[i].affiche();
//        }*/
//        for(ZooManagement z : t){
//            z.affiche();
//        }
//        zoo.saisir();
//        zoo.affiche();
        //prosite 2 , 3 et 4
        Animal lion = new Animal("zedar", "houssien", 5, true);
        Animal maysson = new Animal("zedar", "maysson", 25, true);

        Animal isra = new Animal("dzedzed", "edzedzedzdezedzdzedzdz", 25, true);
        Animal dog = new Animal();
        Zoo myzoo = new Zoo("ezfzefzef" , "Tunis");
        Zoo myzoo2 = new Zoo("fzefzefz" , "zefzfzefzf");
        myzoo.DisplayZoo();
        System.out.println(lion);
        for(int i = 0; i<24 ; i++){
            myzoo.ajouter_animal(lion);
        }
        myzoo.ajouter_animal(maysson);
        myzoo.Diplay_animals();
        System.out.println(myzoo.searcheanimal(lion));

        myzoo.removeAnimal(lion);
        myzoo.Diplay_animals();
        myzoo.ajouter_animal(maysson);
        System.out.println(myzoo.isZoofull());
        System.out.println(myzoo.comparezoo(myzoo,myzoo2));


        //Prosite 5
        System.out.println("\n=== prosit 5 tests ===");

        Aquatic a1 = new Aquatic("fish","nemo",2,false, "ocean");
        Terrestrial t1 = new Terrestrial("zefaf","cat", 3, true, 4);
        Dolphin d1 = new Dolphin("mammal", "zefaf", 10, true, "sea", 40.5f);
        Penguin p1 = new Penguin("zefzafzef", "pingu", 5, false, "zefzf", 12.3f);

        System.out.println(a1);
        System.out.println(t1);
        System.out.println(d1);
        System.out.println(p1);

        // comportement swim()
        a1.swim();
        d1.swim();
        p1.swim();

    }
}