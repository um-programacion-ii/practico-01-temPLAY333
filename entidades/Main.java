package entidades;

public class Main {
    static Ingrediente ingre1 = new Ingrediente("tomate",5);
    static Ingrediente ingre2 = new Ingrediente("zanahoria",3);

    public static void main(String args[]) {
        System.out.println(ingre1.toString());
        System.out.println(ingre2.toString());
    }
}
