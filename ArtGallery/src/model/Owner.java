package model;

/**
 *
 * @author Juana
 */
public class Owner {
    private int id; 
    private String name;
    private String nationality; 
    private String cellPhone;
    private String address;
    private String email;

    public Owner() {
        this.id = 0;
        this.name = "";
        this.nationality = "";
        this.cellPhone = "";
        this.address = "";
        this.email = "";
    }

    public Owner(int id, String name, String nationality, String cellPhone, String address, String email) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.cellPhone = cellPhone;
        this.address = address;
        this.email = email;
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Owner{" + "id=" + id + ", name=" + name + ", nationality=" +
                nationality + ", cellPhone=" + cellPhone + ", address=" + 
                address + ", email=" + email + '}';
    }
}
