package sample.helper;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DBManager {

    public DBConnectionSingleton connection = DBConnectionSingleton.getInstance();

    public DBManager() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
    }


    public List<Integer> Select01(String SQLQuery, String Attribut){
        try{
            Statement stmt = connection.conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQLQuery);

            List<Integer> Liste01 = new ArrayList<Integer>();
            Integer name = 0;
            while (rs.next()) {
                name = rs.getInt(Attribut);
                Liste01.add(name);
                System.out.println("Select: " + name);
            }
            rs.close();
            stmt.close();
            return Liste01;
        }catch (Exception ex){
            System.out.println(ex);
            return null;
        }
    }


    public List<String> Select02(String SQLQuery, String Attribut){
        try{
            Statement stmt = connection.conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQLQuery);

            List<String> Liste01 = new ArrayList<String>();
            String name = "";
            while (rs.next()) {
                name = rs.getString(Attribut);
                Liste01.add(name);
                System.out.println("Select: " + name);
            }
            rs.close();
            stmt.close();
            return Liste01;
        }catch (Exception ex){
            System.out.println(ex);
            return null;
        }
    }


    public void Insert1(String SQLQuery,String Value){
        try{
            PreparedStatement stmt = connection.conn.prepareStatement(SQLQuery);
            stmt.setString(1, Value);
            stmt.execute();
            stmt.close();
        }catch (Exception ex){
            System.out.println(ex);

        }
    }


    public void Insert2(String SQLQuery, String Value1, String Value2, Integer Value3) {
        try{
            PreparedStatement stmt = connection.conn.prepareStatement(SQLQuery);
            stmt.setString(1, Value1);
            stmt.setString(2, Value2);
            stmt.setInt(3, Value3);
            stmt.execute();
            stmt.close();
        }catch (Exception ex){
            System.out.println(ex);

        }
    }



    public void Delete(String SQLQuery) {
        try {
            PreparedStatement stmt = connection.conn.prepareStatement(SQLQuery);
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


    public void databaseupdaterichtigfalsch(String update, Boolean value1) {
        try {
            PreparedStatement stmt = connection.conn
                    .prepareStatement(update);
            try {
                stmt.setBoolean(1, value1);
                stmt.execute();
                System.out.println("Data is inserted 1");
                stmt.close();
            } catch (SQLException e1) {
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }

}
