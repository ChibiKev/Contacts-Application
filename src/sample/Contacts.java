// Made by: Kevin Chen, 23365285

package sample;

public class Contacts {
    private String FirstName;
    private String LastName;
    private String Email;
    private String Phone;

    public Contacts(){
        this.FirstName = "";
        this.LastName = "";
        this.Email = "";
        this.Phone = "";
    }

    public Contacts(String FirstName, String LastName, String Email, String Phone){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.Phone = Phone;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName){
        this.LastName = LastName;
    }

    public void setEmail(String Email){
        this.Email = Email;
    }

    public void setPhone(String Phone){
        this.Phone = Phone;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhone() {
        return Phone;
    }

}
