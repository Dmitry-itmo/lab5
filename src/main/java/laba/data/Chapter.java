package data;

public class Chapter {
    private String name = "Name Chapter"; //Поле не может быть null, Строка не может быть пустой
    private String world = "Earth"; //Поле не может быть null

    public String getName() {
        return name;
    }

    public String getWorld() {
        return world;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    @Override
    public String toString() {
        return "Name: " + name + " World: " + world;
    }
}
