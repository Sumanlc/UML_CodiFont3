public class state {
    private int id;
    private String name;
    private country country;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public country getCountry() {
        return country;
    }

    public void setCountry(country country) {
        this.country = country;
    }

    public state(int id, String name, country country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }
}
