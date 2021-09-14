package model;

/**
 *
 * @author Juana
 */
public class Author {
    private int id; 
    private String name;
    private String nationality; 
    private String artGenre; 

    public Author() {
        this.id = 0;
        this.name = "";
        this.nationality = "";
        this.artGenre = "";
    }
    
    public Author(int id, String name, String nationality, String artGenre) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.artGenre = artGenre;
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

    public String getGender() {
        return artGenre;
    }

    public void setGender(String artGenre) {
        this.artGenre = artGenre;
    }

    @Override
    public String toString() {
        return "Author{" + "id=" + id + ", name=" + name + ", nationality="
                + nationality + ", artGenre=" + artGenre + '}';
    }
}
