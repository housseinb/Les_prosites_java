package tn.esprit.gestionaire.entities;

public class Animal{
    String familly;
    public String name;
    int age;
    boolean isMammal;

    public Animal(){
        System.out.println("Animal constructor");
    }
    public Animal(String f, String n , int a , boolean m){
        if(a > 0) {
            this.familly = f;
            this.name = n;
            this.age = a;
            this.isMammal = m;
        }else{
            System.out.println("age ne doit pas etre negative");
        }
    }
    @Override
    public String toString(){
        return familly + " " + name + " " + age + " " + isMammal;
    }


}
