package model;

/**
 *
 * @author Juana
 */
public class ArtisticMovement {
    private int id;
    private String name;
    private String epoch;

    public ArtisticMovement() {
        this.id = 0;
        this.name = "";
        this.epoch = "";
    }
    
    public ArtisticMovement(int id, String name, String epoch) {
        this.id = id;
        this.name = name;
        this.epoch = epoch;
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

    public String getEpoch() {
        return epoch;
    }

    public void setEpoch(String epoch) {
        this.epoch = epoch;
    }

    @Override
    public String toString() {
        return "ArtisticMovement{" + "id=" + id + ", name=" + name + ", epoch=" + epoch + '}';
    }
}
