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
    public void setName() { name = name; }
    public int getBirthYear(){ return birthYear; }
    public void setBirthYear() { birthYear = birthYear; }
    public String getNationality(){ return nationality; }
    public void setNationality() { nationality = nationality; }


    public void infoAboutArtist(){
        System.out.println("Name: " + name);
        System.out.println("Year of birth: " + birthYear);
        System.out.println("Nationality: " + nationality);
    }


}
