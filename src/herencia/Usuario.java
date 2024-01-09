package herencia;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    String username;
    int id;
    List<LibraryItem> items;

    public Usuario(String username, int id){
        this.username = username;
        this.id = id;
        this.items = new ArrayList<>();
    }

    public Usuario(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<LibraryItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<LibraryItem> items) {
        this.items = items;
    }


    public void addItem(LibraryItem item) {
        this.items.add(item);
    }

    public void deleteItem(LibraryItem item) {
        this.items.remove(item);
    }

    @Override
    public String toString() {
        return "Bienvenido :  " +
                "\n Username = " + username +
                "\n Id = " + id +
                "\n Items = " + items;
    }
}
