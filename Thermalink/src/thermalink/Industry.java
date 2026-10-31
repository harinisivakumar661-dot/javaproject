package thermalink;

public class Industry {

    int id;
    String name;
    String type;
    String location;

    Industry(int id, String name, String type, String location) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.location = location;
    }

    void show() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Location: " + location);
    }
}