public class addressBook {
    private int id;
    private String person;
    private String addresses;

    public addressBook(int id, String person, String addresses) {
        this.id = id;
        this.person = person;
        this.addresses = addresses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getAddresses() {
        return addresses;
    }

    public void setAddresses(String addresses) {
        this.addresses = addresses;
    }

    public class Address{

    }


}
