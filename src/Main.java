import ClasesAbstractas.Circulo;
import ClasesAbstractas.Cuadrado;
import herencia.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            // instanciamos library
            ArrayList<Usuario> usuarios = new ArrayList<>();
            usuarios.add(new Usuario("Jorge", 1));
            usuarios.add(new Usuario("Juan", 2));
            usuarios.add(new Usuario("Pedro", 3));
            usuarios.add(new Usuario("Maria", 4));

            ArrayList<LibraryItem> libraryItems = new ArrayList<>();
            libraryItems.add(new Book(1, "El mundo que vimso arder", true, "Renato Cisneros"));
            libraryItems.add(new Book(2, "La fiesta del chivo", true, "Mario Vargas Llosa"));
            libraryItems.add(new DVD(3, "Spiderman", true, "Sam Raymi", (short) 120));
            libraryItems.add(new DVD(4, "Avengers", true, "James Gosling", (short) 120));

            Library library = new Library("Mario Vargas Llosa", libraryItems, usuarios);
            Scanner sc = new Scanner(System.in);

            while (true){
                System.out.println("Ingrese su codigo de Usuario");
                int id_user = sc.nextInt();
                library.enterToLibrary(id_user);
                System.out.println(" ");
                System.out.println("Opciones : \n1) Prestar \n2) Devolver \n3) Consultar");
                int option = sc.nextInt();
                if(option==1){
                    System.out.println("Ingrese el codigo del Item :  ");
                    int item_id = sc.nextInt();
                    library.prestamo(item_id, id_user);
                }if(option==2){
                    System.out.println("Ingrese el codigo del Item :  ");
                    int item_id = sc.nextInt();
                    library.deleteBook(item_id, id_user);
                }if(option==3){
                    library.usaurioAndItems(id_user);
                }
            }

        }
    }
   /*while(true)
            {
                System.out.println("1. Prestamo");
                int option = sc.nextInt();
                if(option==1)
                {
                    System.out.println("Ingrese el id del usuario");
                    int id_user = sc.nextInt();
                    //libraryItems.forEach(item -> System.out.println(item.toString()));
                    System.out.println("Ingrese el id del item");
                    int id_item = sc.nextInt();

                    library.prestamo(id_item, id_user);
                }
            }
            */