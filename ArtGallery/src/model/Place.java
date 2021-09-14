package model;

/**
 *
 * @author Juana
 */
public class Place {
    private Piece piece;
    private Location location;

     public Place() {
        this.piece = new Piece();
        this.location = new Location();
    }
    
    public Place(Piece piece, Location location) {
        this.piece = piece;
        this.location = location;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Location getLocalization() {
        return location;
    }

    public void setLocalization(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Place{" + "piece=" + piece + ", Location=" + location + '}';
    }
}
