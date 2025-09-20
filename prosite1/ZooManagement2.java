import java.util.Scanner;

public class ZooManagement2 {
    public static void main(String args[]){
        int nbrCages;
        String zooName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer le nom de zoo : ");
        zooName = scanner .nextLine();
        System.out.println("donner le nombre de cages");
        nbrCages = scanner.nextInt();
        System.out.println("le nom du zoo " + zooName + " comporte " + nbrCages + " Cages");
    }
}
