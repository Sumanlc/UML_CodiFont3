import java.util.ArrayList;
import java.util.List;

public class persona {
    private int id;
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private String addressBook;
    private address lives_at;

    private List<ParkingPass> parkingPasses;

    public persona(int id, String name, String phoneNumber, String emailAddress, String addressBook, List<ParkingPass> parkingPasses) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.addressBook = addressBook;

    }

    public persona(int id, String name, String phoneNumber, String emailAddress, address lives_at) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.lives_at = lives_at;
    }

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAddressBook() {
        return addressBook;
    }

    public void setAddressBook(String addressBook) {
        this.addressBook = addressBook;
    }

    public static class ParkingPass {
    }
}
