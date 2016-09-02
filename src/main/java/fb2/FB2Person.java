package fb2;

import javax.xml.bind.annotation.*;

/**
 * Created by hav on 22.08.16.
 */
@XmlType(propOrder = {"firstName", "middleName", "lastName", "nickName", "email"})
@XmlAccessorType(XmlAccessType.FIELD)
public class FB2Person extends FB2Element {

    @XmlTransient
    private String role;
    @XmlElement(name = "first-name")
    private String firstName;
    @XmlElement(name = "middle-name")
    private String middleName;
    @XmlElement(name = "last-name")
    private String lastName;
    @XmlElement(name = "nickname")
    private String nickName;
    private String email;

    public FB2Person(String role) {
        this.role = role;
    }

    public FB2Person() {
        this("author");
    }

    @Override
    public String getName() {
        return role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return (firstName != null && !firstName.isEmpty() ? firstName + " " : "") +
                (middleName != null && !middleName.isEmpty() ? middleName + " " : "") +
                (lastName != null && !lastName.isEmpty() ? lastName : "") +
                "FB2Person{" +
                "email='" + email + '\'' +
                ", nickName='" + nickName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
