package herencia;

import java.util.ArrayList;
import java.util.List;

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
/*
    public boolean prestamoLibro(int item_id, int user_id) {

        Usuario userList = new Usuario();
        LibraryItem itemsList = new LibraryItem();

        boolean isUserPresent = false;
        boolean isItemsIsPresent = false;
        // buscar usuario
        for (Usuario user : users) {
            if (user.getId() == user_id) {
                isUserPresent = true;
                userList = user;
                break;
            }
        }
        if (isUserPresent == false) {
            System.out.println("El usuario no existe");
            return false;
        }

        for (LibraryItem libraryItem : libraryItems) {
            if (libraryItem.getId() == item_id){
                System.out.println("El libro existe");
                itemsList= libraryItem;
                isItemsIsPresent = true;
                break;
            }
            if (isItemsIsPresent == false) {
                System.out.println("El usuario no existe");
                return false;
            }

        }

    }
 */




}
