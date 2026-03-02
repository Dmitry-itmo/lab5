package data;

import java.time.LocalDate;
import java.util.ArrayList;

import Exceptions.IncorrectCommandException;
import Exceptions.IncorrectIDException;

public class SpaceMarine {
    private Integer id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates = new Coordinates(0, 0); //Поле не может быть null
    private java.time.LocalDate creationDate = LocalDate.now(); //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private long health; //Значение поля должно быть больше 0
    private AstartesCategory category = AstartesCategory.APOTHECARY; //Поле не может быть null
    private Weapon weaponType = Weapon.COMBI_PLASMA_GUN; //Поле может быть null
    private MeleeWeapon meleeWeapon = MeleeWeapon.CHAIN_AXE; //Поле может быть null
    private Chapter chapter = new Chapter(); //Поле не может быть null

    private static ArrayList<Integer> listID = new ArrayList<>();
    private static Integer count = 0;

    static {
        listID.add(count+1);
    }

    {
        count++;
        id = count;
    }

    public SpaceMarine() {
    }
    

    public static Integer getCount() {
        return count;
    }

    public static ArrayList<Integer> getListID() {
        return listID;
    }

    public static void removeID(Integer ID) {
        listID.remove(ID);
    }


    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void setId(Integer id) throws IncorrectIDException{
        for (Integer i : listID) {
            if (i == id) {
                throw new IncorrectIDException();
            }
        }
        this.id = id;
    }

    public void setHealth(long health) throws IncorrectCommandException{
        if (health < 0) throw new IncorrectCommandException();
        this.health = health;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }

     public void setCategory(String line) throws IncorrectCommandException{
        switch (line) {
            case "Inceptor": 
                category = AstartesCategory.INCEPTOR;
                break;
            case "Supressor": 
                category = AstartesCategory.SUPPRESSOR; 
                break;
            case "Terminator": 
                category = AstartesCategory.TERMINATOR;
                break;
            case "Chaplain": 
                category = AstartesCategory.CHAPLAIN;
                break;
            case "Apothecary": 
                category = AstartesCategory.APOTHECARY;
                break;
            default: throw new IncorrectCommandException(); 
        }
    }

    public void setMeleeWeapon(String line) throws IncorrectCommandException{
        
        switch (line) {
            case "Chain sword": 
                meleeWeapon = MeleeWeapon.CHAIN_SWORD;
                break;
            case "Chain axe": 
                meleeWeapon = MeleeWeapon.CHAIN_AXE;
                break;
            case "Manreaper": 
                meleeWeapon = MeleeWeapon.MANREAPER;
            case "Power Fist": 
                meleeWeapon = MeleeWeapon.POWER_FIST;
                break;
            default: throw new IncorrectCommandException();
        }
    
    }

    public void setWeaponType(String line) throws IncorrectCommandException{
        switch (line) {
            case "Combi flamer":
                weaponType = Weapon.COMBI_FLAMER; 
                break;
            case "Combi plasma gun":
                weaponType = Weapon.COMBI_PLASMA_GUN;
                break;
            case "Flamer": 
                weaponType = Weapon.FLAMER;
                break;
            default:
                throw new IncorrectCommandException();
        }
    }

    public Integer getId() {
        return id;
    }

    public java.time.LocalDate getCreationDate() {
        return creationDate;
    }

    public String getName() {
        return name;
    }

    public long getHealth() {
        return health;
    }

    public AstartesCategory getCategory() {
        return category;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public MeleeWeapon getMeleeWeapon() {
        return meleeWeapon;
    }

    public Weapon getWeaponType() {
        return weaponType;
    }

   

    @Override
    public String toString() {
        return "ID: " + id +
        "\nИмя: " + name + 
        "\nКоординаты: " + coordinates.toString() + 
        "\nChapter: \n" + chapter.toString() + 
        "\nДата создания элемента: " + creationDate +
        "\nТип AstartesCategory: " + category + 
        "\nТип Weapon: " + weaponType + 
        "\nТип MeleeWeapon: " + meleeWeapon;
    }

}
