package first.implementration;

public class Address {

    private String st;
    private String number;
    private String country;
    private String state;

    public Address(String st, String number, String country, String state) {
        this.st = st;
        this.number = number;
        this.country = country;
        this.state = state;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
