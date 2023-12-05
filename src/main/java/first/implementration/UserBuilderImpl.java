package first.implementration;

public class UserBuilderImpl implements UserBuilder{

    private String name;
    private String lastName;
    private Integer age;
    private Address address;
    private String phoneNumber;
    private String identification;
    private String mail;
    private String sourceBranch;
    private User user;

    @Override
    public UserBuilder name(String name) {
        this.name=name;
        return this;
    }

    @Override
    public UserBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserBuilder age(Integer age) {
        this.age = age;
        return this;
    }

    @Override
    public UserBuilder address(Address address) {
        this.address = address;
        return this;
    }

    @Override
    public UserBuilder identification(String identification) {
        this.identification = identification;
        return this;
    }

    @Override
    public UserBuilder mail(String mail) {
        this.mail = mail;
        return this;
    }

    @Override
    public UserBuilder sourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
        return this;
    }

    @Override
    public User build() {
        user = new User(name, lastName, address, age, phoneNumber, identification, mail, sourceBranch);
        return  this.user;
    }

    @Override
    public User getUser() {
        return this.user;
    }
}
