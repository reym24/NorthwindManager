package models;

public class Employee {

    private int id;
    private String firstname;
    private String lastname;

    public Employee(String lastname, int id, String firstname) {
        this.lastname = lastname;
        this.id = id;
        this.firstname = firstname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
