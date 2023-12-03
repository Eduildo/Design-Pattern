package proxy;

public class Contact {
    private String name;
    private String email;
    private String phone;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
    }

    public Contact(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

}
