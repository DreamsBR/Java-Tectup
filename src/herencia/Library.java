package herencia;

import java.awt.font.LineBreakMeasurer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Library {
    String name;
    ArrayList<LibraryItem> libraryItems;
    ArrayList<Usuario> users;

    // metodos
    // prestar
    // devolver
    // registrar usuario
    // eliminar usuario
    // buscar item

    public Library(String name, ArrayList<LibraryItem> libraryItems, ArrayList<Usuario> users) {
        this.name = name;
        this.libraryItems = libraryItems;
        this.users = users;
    }

    public boolean prestamo(int item_id, int user_id) {
        // buscar usuario
        Usuario userFound = new Usuario();
        boolean isUserPresent = false;
        for (Usuario user : users) {
            if (user.getId() == user_id) {
                isUserPresent = true;
                userFound = user;
                break;
            }
        }
        /*if(isUserPresent==false)
        {
            System.out.println("El usuario no existe");
            return false;
        }*/

        // buscar item
        LibraryItem libraryItem = new LibraryItem();
        boolean itemFound = false;

        for (LibraryItem item : libraryItems) {
            if (item.getId() == item_id) {
                itemFound = true;
                libraryItem = item;
                break;
            }
        }

        /*if(itemFound == false)
        {
            System.out.println("El item no existe");
            return false;
        }*/

        if (!(itemFound && isUserPresent)) {
            System.out.println("Usuario o item no presente");
            return false;
        }

        if (libraryItem.isDisponible()) {
            userFound.addItem(libraryItem);
            libraryItem.setDisponible(false);
            System.out.println(libraryItem.toString());
            System.out.println("Prestamo Realizado con exito.");

            return true;
        } else {
            System.out.println("Item no disponible");
            return false;
        }

    }

    public boolean enterToLibrary(int user_id){
        Usuario userFound = new Usuario();
        boolean isUserPresent = false;
        for (Usuario user : users) {
            if (user.getId() == user_id) {
                isUserPresent = true;
                userFound = user;
                System.out.println(userFound.toString());
                break;
            }
        }
        return false;

    }

    public void usaurioAndItems (int id_usuario){

        Usuario userFound = new Usuario();

        for (Usuario usuario : users){
            if(usuario.getId() == id_usuario && usuario.getItems().size()== 0){
                System.out.println("No tienes items!!");
                return;
            }
            if(usuario.getId()==id_usuario){
                System.out.println("Mostrando los Libros PRESTADOS :");
                System.out.println(usuario.toString());
            }
        }
    }
    public void deleteBook(int id_book,int id_usuario) {
        LibraryItem libraryItem = new LibraryItem();
        boolean itemFound = false;
        Usuario userFound = new Usuario();

        boolean isUserPresent = false;
        for (Usuario user : users) {
            if (user.getId() == id_usuario) {
                userFound = user;
                break;
            }
        }

        for (LibraryItem item : libraryItems) {
            if (item.getId() == id_book) {
                libraryItem = item;
                break;
            }

        }
        userFound.deleteItem(libraryItem);
        libraryItem.setDisponible(true);
        System.out.println(libraryItem.toString());
        System.out.println("Devuelto con exito");
    }

}
