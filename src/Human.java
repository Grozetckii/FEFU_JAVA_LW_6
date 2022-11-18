import java.io.Serial;
import java.io.Serializable;

public class Human implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private String surname;
    private int yearOfBirth;
    private String mail;
    private String city;

    public Human(String name, String surname, int yearOfBirth, String mail, String city){
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.mail = mail;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString(){
        return "Human{" +
                "name=" + name + "," +
                "surname=" + surname + "," +
                "yearOfBirth=" + yearOfBirth + "," +
                "mail=" + mail + "," +
                "city=" + city + "," + "}";
    }
}
