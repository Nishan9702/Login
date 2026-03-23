package dao;

import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {


    public boolean validateUser(String userName, String email) {

        String sql = "SELECT * FROM users WHERE userName= ? AND email =?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, userName);
            ps.setString(2, email);

            ResultSet rs = ps.executeQuery();

            return rs.next();
        }
        catch(Exception e){

        e.printStackTrace();
        }
        return false;
    }
}
