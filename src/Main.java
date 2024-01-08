import ClasesAbstractas.Circulo;
import ClasesAbstractas.Cuadrado;
import herencia.Book;
import herencia.DVD;
import herencia.LibraryItem;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /*
    public static void main(String[] args) {
        Book book1 = new Book(
                1,
                "El mundo que vimso arder",
                true,
                "Renato Cisneros");

        DVD dvd1 = new DVD(
                2,
                "DVD1",
                true,
                "James Gosling",
                (short) 120);

        Integer[] array = {1,3,44,23,23};
        for(Integer num: array)
        {
            System.out.println(num);
        }
    }
    */

    public static void main(String[] args) {

        Cuadrado cuadradoNew = new Cuadrado("Azul", 12);

        double areaCuadrado = cuadradoNew.area();
        double pedimetroCuadrado = cuadradoNew.perimetro();
        System.out.println("Cuadrado :");
        System.out.println("El area del cuadrado : " + areaCuadrado + "\nPerimetro del cuadrado es : " + pedimetroCuadrado );
        cuadradoNew.printColor();

        System.out.println("");
        Circulo circuloNew = new Circulo("Rojo", 20);
        double areaCicuclo = circuloNew.area();
        double areaCirculo = circuloNew.perimetro();
        System.out.println("Circulo :");
        System.out.println("El area del Circulo : " + areaCicuclo + "\nPerimetro del Circulo es : " + areaCirculo );
        circuloNew.printColor();






    }

}