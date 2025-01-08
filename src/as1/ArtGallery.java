package as1;

import java.util.ArrayList;

public class ArtGallery {
    private String name;
    private String location;
    private ArrayList<Artwork> artworks;

    public ArtGallery(String name, String location){
        this.name = name;
        this.location = location;
        this.artworks = new ArrayList<>();
    }

    /// Getter and Setter
    public String getName(){ return name; }
    public void setName() { }
    public String getLocation(){ return location; }
    public void setLocation() { }
    public void addArtwork(Artwork artwork){
        artworks.add(artwork);
    }


    public void infoAboutArtGallery(){
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        Artwork c = new Artwork();
        System.out.println("The number of artworks: " + c.count());
    }
    public void listOfArtworksOfArtGallery(){
        System.out.println("List of its artworks: ");
        for(Artwork artwork : artworks) {
            String a = artwork.getTittle();
            System.out.println("~~ " + a);
        }
    }




}
