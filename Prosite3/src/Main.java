public class Main {
    public static void main(String[] args) {

        Zoo zoo1 = new Zoo("Zoo1", "Tunis", 10);
        Zoo zoo2 = new Zoo("Zoo2", "Sousse", 8);
        Animal Lion = new Animal("assed" , "lion" , 10 , true);
        Animal elephent = new Animal("ele" , "cdcsc" , 40 , true);
        Animal mouse = new Animal("moeczeczduse" , "dcqc" , 11 , false);
        Zoo zoo = new Zoo("My zoo" , "Tunis" , 10);
        zoo.displayZoo();
        //pour la partie to string
        System.out.println(zoo);
        System.out.println(zoo.toString());
        System.out.println(Lion);

        //nouveate Prosite 3

        System.out.println("lion ajoute " + zoo.addAnimal(Lion));
        System.out.println("ele ajoute " + zoo.addAnimal(elephent));
        System.out.println("moeczeczduse ajoute " + zoo.addAnimal(mouse));

        zoo.afficheranimal();

        if(zoo.searchAnimal("lion") != -1){
            System.out.println("lion trouver");
        }else{
            System.out.println("lion introuvable");
        }

        System.out.println("suppression du lion : " + zoo.removeAnimal("lion"));
        zoo.afficheranimal();

        System.out.println("zoo plein " + zoo.isZooFull());

        zoo2.addAnimal(new Animal("zefzefs", "ergzfzdf", 5, true));
        Zoo biggerZoo = Zoo.compareZoo(zoo1, zoo2);
        System.out.println("zoo avec le plus d'animaux: " + biggerZoo);

    }
}