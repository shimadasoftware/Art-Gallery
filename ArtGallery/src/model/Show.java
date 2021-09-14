package model;

/**
 *
 * @author Juana 
 */
public class Show {
    private Piece piece;
    private Exhibition exhibition;

    public Show() {
        this.piece = new Piece();
        this.exhibition = new Exhibition();
    }
    
    public Show(Piece piece, Exhibition exhibition) {
        this.piece = piece;
        this.exhibition = exhibition;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Exhibition getExhibition() {
        return exhibition;
    }

    public void setExhibition(Exhibition exhibition) {
        this.exhibition = exhibition;
    }

    @Override
    public String toString() {
        return "Show{" + "piece=" + piece + ", exhibition=" + exhibition + '}';
    }
}
