package model;

/**
 *
 * @author Juana 
 */
public class Style {
    private Piece piece;
    private ArtisticMovement artisticMovement;

    public Style() {
        this.piece = new Piece();
        this.artisticMovement = new ArtisticMovement();
    }
    
    public Style(Piece piece, ArtisticMovement artisticMovement) {
        this.piece = piece;
        this.artisticMovement = artisticMovement;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public ArtisticMovement getArtisticMovement() {
        return artisticMovement;
    }

    public void setArtisticMovement(ArtisticMovement artisticMovement) {
        this.artisticMovement = artisticMovement;
    }

    @Override
    public String toString() {
        return "Style{" + "piece=" + piece + ", artisticMovement=" + artisticMovement + '}';
    }
}
