package herencia;

import java.util.ArrayList;

public class Usuario {
    String username;
    int id;
    ArrayList<LibraryItem> items;

    public Usuario(String username, int id){
        this.username = username;
        this.id = id;
        items = new ArrayList<>();
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

    public ArrayList<LibraryItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<LibraryItem> items) {
        this.items = items;
    }
}
