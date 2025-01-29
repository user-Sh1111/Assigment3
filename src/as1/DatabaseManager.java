package as1;


import java.sql.*;

public class DatabaseManager {

    private static final String URL = "jdbc:postgresql://localhost:5432/artgallerydb";
    private static final String USER = "postgres";
    private static final String PASSWORD = "1234";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    // Artist insert
    public static void insertArtist(int artist_id, String name, int birthYear, String nationality) {
        String sql = "INSERT INTO Artist (artist_id, name, birthYear, nationality) VALUES (?, ?, ?, ?)";
        try (Connection conn = connect();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, artist_id);
            pst.setString(2, name);
            pst.setInt(3, birthYear);
            pst.setString(4, nationality);
            pst.executeUpdate();
            System.out.println("Artist " + name + " added");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // ArtGallery insert
    public static void insertArtGallery(int artgallery_id, String name, String location){
        String sql = "INSERT INTO ArtGallery (artgallery_id, name, location) VALUES (?,?,?)";
        try(Connection conn1 = connect();
             PreparedStatement pst = conn1.prepareStatement(sql)) {
            pst.setInt(1, artgallery_id);
            pst.setString(2, name);
            pst.setString(3, location);
            pst.executeUpdate();
            System.out.println("ArtGallery " + name + " added");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // Artwork insert
    public static void insertArtwork(int artwork_id, String tittle, int age, double price, int artist_id, int artgallery_id) {
        String sql = "INSERT INTO Artwork (artwork_id, tittle, age, price, artist_id, artgallery_id) VALUES (?,?,?,?,?,?)";
        try(Connection conn = connect();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, artwork_id);
            pst.setString(2, tittle);
            pst.setInt(3, age);
            pst.setDouble(4, price);
            pst.setInt(5, artist_id);
            pst.setInt(6, artgallery_id);
            pst.executeUpdate();
            System.out.println("Artwork " + tittle + " added");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    
    // Artists read
    public static void readArtists () {
        String sql = "SELECT * FROM Artist";
        try (Connection conn = connect();
             Statement stm = conn.createStatement();
             ResultSet rls = stm.executeQuery(sql)) {
            while (rls.next()) {
                System.out.println("ID: " + rls.getInt("artist_id") +
                        ", Name: " + rls.getString("name") +
                        ", Nationality: " + rls.getString("nationality"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // ArtGallery read
    public static void readArtGallery () {
        String sql = "SELECT * FROM ArtGallery";
        try(Connection conn = connect();
             Statement stm = conn.createStatement();
             ResultSet rls = stm.executeQuery(sql)) {
            while (rls.next()) {
                System.out.println("ID: " + rls.getInt("artgallery_id") +
                        ", Name: " + rls.getString("name") +
                        ", location: " + rls.getString("location"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Artwork read
    public static void readArtwork (){
        String sql = "SELECT * FROM Artwork";
        try(Connection conn = connect();
             Statement stm = conn.createStatement();
             ResultSet rls = stm.executeQuery(sql)) {
            while (rls.next()) {
                System.out.println("ID: " + rls.getInt("artwork_id") +
                        ", Tittle: " + rls.getString("tittle") +
                        ", Age: " + rls.getInt("age") +
                        ", Price: " + rls.getDouble("price") +
                        ", ArtistID: " + rls.getInt("artist_id") +
                        ", ArtGalleryID: " + rls.getInt("artgallery_id"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




    // Artist update
    public static void updateArtist (String newName, int artist_id) {
        String sql = "UPDATE Artist SET name = ? WHERE artist_id = ?";
        try (Connection conn = connect();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, newName);
            pst.setInt(2, artist_id);
            pst.executeUpdate();
            System.out.println("Artist " + artist_id + " updated");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // ArtGallery update
    public static void updateArtGallery (String newName, int artgallery_id) {
        String sql = "UPDATE Artist SET name = ? WHERE artist_id = ?";
        try (Connection conn = connect();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, newName);
            pst.setInt(2, artgallery_id);
            pst.executeUpdate();
            System.out.println("ArtGallery " + artgallery_id + " updated");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // ArtWork update
    public static void updateArtwork (String newName, int artwork_id) {
        String sql = "UPDATE Artist SET name = ? WHERE artist_id = ?";
        try (Connection conn = connect();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, newName);
            pst.setInt(2, artwork_id);
            pst.executeUpdate();
            System.out.println("Artwork " + artwork_id + " updated");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    // Artist delete
    public static void deleteArtist(int artist_id) {
        String sql = "DELETE FROM Artist WHERE artist_id = ?";
        try(Connection conn = connect();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, artist_id);
            pst.executeUpdate();
            System.out.println("Artist " + artist_id + " deleted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // ArtGallery delete
    public static void deleteArtGallery(int artgallery_id) {
        String sql = "DELETE FROM Artist WHERE artist_id = ?";
        try(Connection conn = connect();
            PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, artgallery_id);
            pst.executeUpdate();
            System.out.println("ArtGallery " + artgallery_id + " deleted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // Artwork delete
    public static void deleteArtwork(int artwork_id) {
        String sql = "DELETE FROM Artist WHERE artist_id = ?";
        try(Connection conn = connect();
            PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, artwork_id);
            pst.executeUpdate();
            System.out.println("Artwork " + artwork_id + " deleted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
