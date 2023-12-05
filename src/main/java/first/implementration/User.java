package first.implementration;

public class User {

    private String name;
    private String lastName;
    private Address address;
    private Integer age;
    private String phoneNumber;
    private String identification;
    private String mail;
    private String sourceBranch;


    public User(String name, String lastName, Address address, Integer age, String phoneNumber, String identification, String mail, String sourceBranch) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.identification = identification;
        this.mail = mail;
        this.sourceBranch = sourceBranch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSourceBranch() {
        return sourceBranch;
    }

    public void setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
    }

    @Override
    public String toString() {
        return "first.implementration.User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", identification='" + identification + '\'' +
                ", mail='" + mail + '\'' +
                ", sourceBranch='" + sourceBranch + '\'' +
                '}';
    }
}
