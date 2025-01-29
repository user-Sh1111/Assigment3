package as1;

public class main {
    public static void main(String[] args) {
        DatabaseManager.insertArtist(1, "Eugène Henri Paul Gauguin", 1848, "French");
        DatabaseManager.insertArtist(2, "Leonardo Da Vinci", 1452, "Italian");
        DatabaseManager.insertArtist(3, "Vincent Van Gogh", 1853, "Dutch");

        DatabaseManager.insertArtGallery(1, "Louvre", "Paris, France");
        DatabaseManager.insertArtwork(1, "Mona Lisa", 500, 87000000, 2, 1);
        DatabaseManager.insertArtwork(2, "The Last Supper", 530, 1000000.00, 2, 1);
        DatabaseManager.insertArtwork(3, "Leda and the Swan", 552, 52887.00, 2, 1);
        DatabaseManager.insertArtwork(4, "Tahitian Women on the Beach", 134, 300000.0, 1, 1);

        DatabaseManager.readArtists();
        DatabaseManager.readArtGallery();
        DatabaseManager.readArtwork();

        DatabaseManager.updateArtist("Henri Paul Gauguin", 1);
        DatabaseManager.updateArtGallery("Louvre1", 1);
        DatabaseManager.updateArtwork("The Last Supper1", 2);

        DatabaseManager.deleteArtist(3);



    }
}
