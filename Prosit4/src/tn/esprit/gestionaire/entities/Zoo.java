package tn.esprit.gestionaire.entities;

public class Zoo {
    private Animal[] animals = new Animal[25];
    String name;
    String city;
    final int nbrcages = 25;
    int currentanimal = 0;

    public Zoo(){}
    public Zoo(String n, String c){
        if(n.equals("")){
            System.out.println("Nom d'utilisateur n'est pas valid");
        }else{
            this.name = n;
            this.city = c;
        }
    }

    public void DisplayZoo(){
        System.out.println("Zoo Name: " + name);
        System.out.println("Zoo City: " + city);
        System.out.println("Zoo NB RCAGES: " + nbrcages);
    }

    public boolean ajouter_animal(Animal animal){
        if(isZoofull()){
            System.out.println("Zoo is already full");
            return false;
        }
        if(searcheanimal(animal) != -1){
            System.out.println("animal deja trouvee");
            return false;
        }
        animals[currentanimal] = animal;
        currentanimal++;
        return true;

    }

    public void Diplay_animals(){
        for(Animal a : animals){
            System.out.println(a);
        }
    }

    /*int searchanimal(Animal animal){
        for(int i = 0 ; i < animals.length && animals[i].name != animal.name ; i++){}
        if(i == animals.length && animals[i].name != animal.name) {
            return -1;
        }else{
            return i;
        }
    }*/

    public int searcheanimal(Animal animal){
        if(animal == null){
            return -1;
        }
        for(int i =0; i < animals.length ; i++){
            if(animals[i] != null && animals[i].name.equals(animal.name) ){
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal){
        int n = searcheanimal(animal);
        if(n == -1){
            return false;
        }else{
            for (int i = n; i < animals.length - 1; i++ ){
                animals[i] = animals[i+1];
            }
            animals[animals.length - 1 ] = null;
            currentanimal--;
            return true;
        }
    }

    public boolean isZoofull(){
        for(int i = 0; i < animals.length; i++){
            if(animals[i] == null){
                return false;
            }
        }
        return true;
    }

    public Zoo comparezoo(Zoo o1 , Zoo o2){
        if(o1.currentanimal > o2.currentanimal){
            return o1;
        }else{
            return o2;
        }
    }



    //redefinis la fonction toString
    @Override
    public String toString(){
        return "Zoo Name: " + name + " Zoo City: " + city + " Zoo NB RCAGES: " + nbrcages;
    }

}
