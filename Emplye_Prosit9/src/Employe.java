public class Employe implements Comparable<Employe>{
    private int id;
    private String nom;
    private String prenom;
    private String nom_depart;
    private int grade;

    Employe(){
        this.id = 0;
        this.nom = "";
        this.prenom = "";
        this.nom_depart = "";
        this.grade = 0;
    }

    public Employe(int id, String nom, String prenom, String nom_depart, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nom_depart = nom_depart;
        this.grade = grade;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}
    public String getPrenom() {return prenom;}
    public void setPrenom(String prenom) {this.prenom = prenom;}
    public String getNom_depart() {return nom_depart;}
    public int getGrade() {return grade;}
    public void setGrade(int grade) {this.grade = grade;}

    @Override
    public boolean equals(Object o){
        if(o ==null) return false;
        if(o==this) return true;
        if(o instanceof Employe e){
            return this.id == e.id && this.nom.equals(e.nom);
        }
        return false;
    }

    @Override
    public String toString(){
        return this.nom + " " + this.prenom + " " + this.nom_depart + " " + this.grade;}

    @Override
    public int compareTo(Employe e) {return Integer.compare(this.id, e.id);}
}
