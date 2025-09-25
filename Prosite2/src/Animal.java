public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal() {
        System.out.println("Animal created");
    }

    public Animal(String family, String name, int age , boolean isMammal) {
        System.out.println("Animal created");
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal" + " name='" + name + ", age=" + age + ", isMammal=" + isMammal;
    }

}
