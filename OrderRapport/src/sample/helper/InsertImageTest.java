package sample.helper;

import java.io.*;
import java.sql.*;

public class InsertImageTest {

    public static void main(String[] args) throws SQLException {
        InsertImageTest imageTest = new InsertImageTest();
        imageTest.insertImage();
    }

    public Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "gibbiX12345");
        } catch (Exception e) {
            System.out.println("Error Occured While Getting the Connection: - " + e);
        }
        return connection;
    }

    public void insertImage() {
        Connection connection = null;
        PreparedStatement statement = null;
        FileInputStream inputStream = null;

        try {
            File image = new File("C:/Users/Kurt/Desktop/571260532p0.jpg");
            inputStream = new FileInputStream(image);

            connection = getConnection();
            statement = connection.prepareStatement("insert into bildtest(Name, Bild) " + "values(?,?)");
            statement.setString(1, "Honda Car");
            statement.setBinaryStream(2, (InputStream) inputStream, (int)(image.length()));

            statement.executeUpdate();

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: - " + e);
        } catch (SQLException e) {
            System.out.println("SQLException: - " + e);
        } finally {

            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                System.out.println("SQLException Finally: - " + e);
            }

        }

    }

    public BufferedInputStream readeImage(String SQLQuery, String Attribut){
        Connection connection = getConnection();
        try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(SQLQuery);
            rs.next();
            java.sql.Blob blob = rs.getBlob(Attribut);
            InputStream in = blob.getBinaryStream();
            BufferedInputStream image = new BufferedInputStream(in);
            rs.close();
            stmt.close();
            return  image;
        }catch (Exception ex){
            System.out.println(ex);
            return null;
        }
    }

}
