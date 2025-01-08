package as1;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {


        /// Constructors
        Artist artist1 = new Artist("Leonardo Da Vinci", 1452, "Italian");

        Artwork artwork1 = new Artwork("Mona Lisa", 500, 870000000.0, artist1);
        Artwork artwork2 = new Artwork("The Last Supper", 530, 1000000000.0, artist1);
        Artwork artwork3 = new Artwork("Leda and the Swan", 522, 52887500.0, artist1);

        ArtGallery artGallery1 = new ArtGallery("Louvre", "Paris, France");
        ArtGallery works = new ArtGallery(artwork2.getTittle(), artwork1.getTittle());
        works.addArtwork(artwork3);
        works.addArtwork(artwork2);
        works.addArtwork(artwork1);


        /// Output
        artGallery1.infoAboutArtGallery();
        works.listOfArtworksOfArtGallery();
        System.out.println();
        artist1.infoAboutArtist();
        System.out.println();
        artwork1.infoAboutArtwork();
        System.out.println();
        artwork2.infoAboutArtwork();
        System.out.println();
        artwork3.infoAboutArtwork();
        System.out.println();





        ArrayList<Artwork> works1 = new ArrayList<>();
        works1.add(artwork1);
        works1.add(artwork2);
        works1.add(artwork3);
        double[] arrPrices = new double[works1.size()];

        for(int i = 0; i < works1.size(); i++){
            arrPrices[i] = works1.get(i).getPrice();
        }
        sort(arrPrices);
        System.out.println("Compare prices of artworks: ");;
        for(int i = 0; i < works1.size(); i++){
            System.out.print("$" + arrPrices[i]);
            if(i == works1.size() - 1){
                break;
            }
            else{
                System.out.print(" < ");
            }
        }

        works.sortArtworksByPrice();
        System.out.println("Artworks sorted by price:");
        works.listOfArtworksOfArtGallery();


    }
}
