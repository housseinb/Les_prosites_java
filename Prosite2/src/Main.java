public class Main {
    public static void main(String[] args) {
        Animal Lion = new Animal("Lion" , "Simbaaaaaa" , 21 , true);
        Animal elephent = new Animal("elephent" , "ele" , 40 , true);
        Animal mouse = new Animal("mouse" , "mouse" , 11 , false);

        Zoo zoo = new Zoo("My zoo" , "Tunis" , 10);

        zoo.displayZoo();

        //pour la partie to string
        System.out.println(zoo);
        System.out.println(zoo.toString());
        System.out.println(Lion);

        //manipulation de tableau
        zoo.addAnimal(Lion);
        zoo.addAnimal(mouse);
        zoo.addAnimal(elephent);
        zoo.displayZootableau();

    }
}