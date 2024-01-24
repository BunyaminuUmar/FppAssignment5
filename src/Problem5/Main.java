package Problem5;

public class Main {
    public static void main(String[] args) {
        Computer comp1 = new Computer("Dell","Core 2", 8, 2.50);
        Computer comp2 = new Computer("Dell","Core 2", 8, 2.50);
        Computer comp3 = new Computer("Lenovo", "Core 5", 16, 5.70);

        System.out.println(comp1);
        System.out.println(comp1.equals(comp2));
        System.out.println(comp1.equals(comp3));
        System.out.println(comp1.hashCode());
        System.out.println(comp3.hashCode());
        System.out.println(comp1.hashCode() == comp2.hashCode());
        System.out.println(comp1.hashCode() == comp3.hashCode());

    }
}
