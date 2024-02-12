import clases.Futbolista;

public class Main {
    public static void main(String[] args) {
        Futbolista fut1 = new Futbolista("Pepe", "Cuenca", "2323123", 34, 12, "Portero", 12, 0);


        System.out.println(fut1.rolEnEquipo());
        System.out.println(fut1);
    }
}