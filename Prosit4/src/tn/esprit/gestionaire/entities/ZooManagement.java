package tn.esprit.gestionaire.entities;

import java.util.Scanner;


public class ZooManagement {
    //les attribues
    private int nbrcages;
    private String zooname;

    //constructeur
    public ZooManagement(){}

    public ZooManagement(int nbrcages, String zooname){
        this.nbrcages=nbrcages;
        this.zooname=zooname;
    }


    //les methodes
    public void saisir(){
        Scanner s = new Scanner(System.in);
        System.out.println("donner le nom du zoo");
        zooname = s.nextLine();
        while(zooname.equals("")){
            System.out.println("donner le nom du zoo");
            zooname = s.nextLine();
        }
        System.out.println("donner le nombre de cages");
        nbrcages = s.nextInt();
        while(nbrcages <= 0) {
            System.out.println("donner le nombre de cages");
            nbrcages = s.nextInt();
        }
    }

    public void affiche(){
        System.out.println("nombre de cages :" + nbrcages + " Zoo name :" + zooname);
    }

    //geters seters
    int getNbrcages(){
        return nbrcages;
    }
    void setNbrcages(int x){
        this.nbrcages = x;
    }
    String getZooname(){
        return zooname;
    }
    void setZooname(String x){
        this.zooname = x;
    }

}
