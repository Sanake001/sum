package first.implementration;

public interface UserBuilder {
    UserBuilder name(String name);
    UserBuilder lastName(String lastName);
    UserBuilder age(Integer age);
    UserBuilder address(Address address);
    UserBuilder identification(String identification);
    UserBuilder mail(String mail);
    UserBuilder sourceBranch(String sourceBranch);
    User build();
    User getUser();
}
