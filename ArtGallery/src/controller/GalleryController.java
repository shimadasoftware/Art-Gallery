package controller;

import model.ArtisticMovement;
import model.Author;
import model.Exhibition;
import model.Location;
import model.Owner;

/**
 * 
 * @author Juana
 */
public class GalleryController {
    private ArtisticMovement[] movements;
    private Author[] authors;
    private Owner[] owners;
    private Location[] locations;
    private Exhibition[] exhibitions;

    public GalleryController() {
        this.movements = new ArtisticMovement[]{};
        this.authors = new Author[]{};
        this.owners = new Owner[]{};
        this.locations = new Location[]{};
        this.exhibitions = new Exhibition[]{};
    }
    
    public GalleryController(ArtisticMovement[] movements, Author[] authors, 
            Owner[] owners, Location[] locations, Exhibition[] exhibitions) {
        this.movements = movements;
        this.authors = authors;
        this.owners = owners;
        this.locations = locations;
        this.exhibitions = exhibitions;
    }

    public ArtisticMovement[] getMovements() {
        return movements;
    }

    public void setMovements(ArtisticMovement[] movements) {
        this.movements = movements;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public Owner[] getOwners() {
        return owners;
    }

    public void setOwners(Owner[] owners) {
        this.owners = owners;
    }

    public Location[] getLocation() {
        return locations;
    }

    public void setLocalizations(Location[] locations) {
        this.locations = locations;
    }

    public Exhibition[] getExhibitions() {
        return exhibitions;
    }

    public void setExhibitions(Exhibition[] exhibitions) {
        this.exhibitions = exhibitions;
    }
    
    
}
