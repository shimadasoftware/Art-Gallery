package model;

/**
 *
 * @author Juana
 */
public class Location {
    private int id;
    private int floor; // 1 or 2
    private char section; // a, b or c

    public Location() {
        this.id = 0;
        this.floor = 1;
        this.section = 'a';
    }

    public Location(int id, int floor, char section) {
        this.id = id;
        this.floor = floor;
        this.section = section;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Localization{" + "id=" + id + ", floor=" + floor + ", section=" + section + '}';
    }
}
