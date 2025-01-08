package as1;

import java.sql.SQLOutput;

public class Artist {
    private String name;
    private int birthYear;
    private String nationality;

    public Artist(String name, int birthYear, String nationality){
        this.name = name;
        this.birthYear = birthYear;
        this.nationality = nationality;
    }

    /// Getter and Setter
    public String getName(){ return name; }
    public void setName() { this.name = name; }
    public int getBirthYear(){ return birthYear; }
    public void setBirthYear() { this.birthYear = birthYear; }
    public String getNationality(){ return nationality; }
    public void setNationality() { this.nationality = nationality; }


    public void infoAboutArtist(){
        System.out.println("Name: " + name);
        System.out.println("Year of birth: " + birthYear);
        System.out.println("Nationality: " + nationality);
    }


    public String toString() {
        return "Artist: " + name + ", Year of Birth: " + birthYear + ", Nationality: " + nationality;
    }

}
