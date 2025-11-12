package tn.esprit.gestionaire.main;
import tn.esprit.gestionaire.entities.Animal;
import tn.esprit.gestionaire.entities.Zoo;

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
        maysson.name = "jndkjfd";
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


    }
}