package DAO;

import entity.NhanVien;
import entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    public static LoginDAO getInstance(){
        return new LoginDAO();
    }
    
    
    public User getUserNamePassWord(){
        User user = null;
        try {
            Connection con = (Connection) config.JDBCUtil.getConnection();
            String sql = "SELECT userName,passWord FROM tb_User";
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = (ResultSet) pst.executeQuery();
            while(rs.next()){
                String userName = rs.getString("userName");
                String passWord = rs.getString("passWord");
                user = new User(userName, passWord);
                
            }
            
            config.JDBCUtil.closeConnection(con);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
    public User selectByUserName(String userName){
        User user = null;
        try {
            Connection con = (Connection) config.JDBCUtil.getConnection();
            String sql = "SELECT * FROM tb_User WHERE userName = ?";
            PreparedStatement p = (PreparedStatement) con.prepareStatement(sql);
            p.setString(1, userName);
            ResultSet rs = (ResultSet) p.executeQuery();
            while(rs.next()){
                String taiKhoan = rs.getString("userName");
                String matKhau = rs.getString("passWord");
                user = new User(taiKhoan, matKhau);
                
            }
            config.JDBCUtil.closeConnection(con);
            
        } catch (SQLException e) {
        
        }
        return user;
        
    }

}
