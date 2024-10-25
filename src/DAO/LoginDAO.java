package DAO;

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
        User u = null;
        try {
            Connection con = (Connection) config.JDBCUtil.getConnection();
            String sql = "SELECT taiKhoan, matKhau FROM tb_dangNhap";
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = (ResultSet) pst.executeQuery();
            while(rs.next()){
                String userName = rs.getString("taiKhoan");
                String passWord = rs.getString("matKhau");
                u = new User(userName, passWord);
                
            }
            
            config.JDBCUtil.closeConnection(con);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return u;
    }
    public User selectByUserName(String userName){
        User u = null;
        try {
            Connection con = (Connection) config.JDBCUtil.getConnection();
            String sql = "SELECT * FROM tb_dangNhap WHERE taiKhoan = ?";
            PreparedStatement p = (PreparedStatement) con.prepareStatement(sql);
            p.setString(1, userName);
            ResultSet rs = (ResultSet) p.executeQuery();
            while(rs.next()){
                String taiKhoan = rs.getString("taiKhoan");
                String matKhau = rs.getString("matKhau");
                User u1 = new User(taiKhoan, matKhau);
                u = u1;
            }
            config.JDBCUtil.closeConnection(con);
            
        } catch (SQLException e) {
        
        }
        return u;
        
    }

}
