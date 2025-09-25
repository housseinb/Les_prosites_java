public class Zoo {
    private Animal[] animals;
    private String name;
    private String City;
    private int nbrCges;
    private int nbranimal = 0;

    public Zoo(){
        System.out.println("Zoo created");
        this.animals = new Animal[25];
    }

    public Zoo(String name, String city , int age){
        System.out.println("Zoo created");
        this.name = name;
        this.City = city;
        this.nbrCges = age;
        this.animals = new Animal[25];
    }

    public void displayZoo(){
        System.out.println("Zoo name: " + this.name);
        System.out.println("Zoo city: " + this.City);
        System.out.println("Zoo age: " + this.nbrCges);

    }

    @Override
    public String toString(){
        return "Zoo " + "name='" + name + ", city='" + City + ", nbrCages=" + nbrCges ;
    }

    public void addAnimal(Animal animal) {
        if (nbranimal < animals.length) {
            animals[nbranimal] = animal;
            nbranimal++;
        } else {
            System.out.println("Full");
        }
    }

    public void displayZootableau(){
        System.out.println("Zoo listed =================================> ");
        displayZoo();
        for(int i = 0; i < nbranimal; i++){
            System.out.println( i + 1 + ") " +  animals[i]);
        }
    }

}
