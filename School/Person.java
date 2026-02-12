package School;
abstract class Person{
    private int id;
    private String name;
    private String gmail;

    Person(int id, String name, String gmail) {
        this.id = id;
        this.name = name;
        this.gmail = gmail;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGmail() {
        return gmail;
    }

    abstract String getRole();
}

