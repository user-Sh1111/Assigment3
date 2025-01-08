package as1;

public class Artwork {
    private String tittle;
    private int age;
    private double price;
    private Artist artist;
    private static int count = 0;

    public Artwork(String tittle, int age, double price, Artist artist) {
        this.tittle = tittle;
        this.age = age;
        this.price = price;
        this.artist = artist;
        count++;
    }

    public Artwork(){}

    /// Getter and Setter
    public String getTittle(){ return tittle; }
    public void setTittle() { this.tittle = tittle; }
    public int getAge(){ return age; }
    public void setAge() { age = age; }
    public double getPrice(){ return price; }
    public void setPrice() { price = price; }
    public Artist getArtist(){ return artist; }
    public void setArtist() { artist = artist; }



    public void infoAboutArtwork(){
        System.out.println("Tittle: " + tittle);
        System.out.println("Age of artwork: " + age);
        System.out.println("Price: $" + price);
        System.out.println("Artist of the artwork: " + artist.getName());
    }

    public int count() {
        return count;
    }




}
