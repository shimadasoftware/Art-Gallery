package model;

import java.util.Date;

/**
 *
 * @author Juana
 */
public class Piece {
    private int id;
    private String name;
    private Date date;
    private String technique;
    private int price;
    private Owner owner;
    private Author author;
    private Type type;
    
    public Piece() {
        this.id = 0;
        this.name = "";
        this.date = new Date();
        this.technique = "";
        this.price = 0;
        this.owner = new Owner();
        this.author = new Author();
        this.type = Type.picture;
    }

    public Piece(int id, String name, Date date, String technique, int price, Owner owner, Author author, Type type) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.technique = technique;
        this.price = price;
        this.owner = owner;
        this.author = author;
        this.type = type;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTechnique() {
        return technique;
    }

    public void setTechnique(String technique) {
        this.technique = technique;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Piece{" + "id=" + id + ", name=" + name + ", date=" + date +
                ", technique=" + technique + ", price=" + price + ", owner=" 
                + owner + ", author=" + author + ", type=" + type + '}';
    }
}
