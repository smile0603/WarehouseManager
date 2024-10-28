package DAO;

import entity.NhanVien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    public static LoginDAO getInstance(){
        return new LoginDAO();
    }
    
    
    public NhanVien getUserNamePassWord(){
        NhanVien u = null;
        try {
            Connection con = (Connection) config.JDBCUtil.getConnection();
            String sql = "SELECT maNV, matKhau FROM tb_NhanVien";
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = (ResultSet) pst.executeQuery();
            while(rs.next()){
                String taiKhoan = rs.getString("maNV");
                String matKhau = rs.getString("matKhau");
                u = new NhanVien(taiKhoan, matKhau);
                
            }
            
            config.JDBCUtil.closeConnection(con);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return u;
    }
    public NhanVien selectByMaNV(String maNV){
        NhanVien nv = null;
        try {
            Connection con = (Connection) config.JDBCUtil.getConnection();
            String sql = "SELECT * FROM tb_NhanVien WHERE maNV = ?";
            PreparedStatement p = (PreparedStatement) con.prepareStatement(sql);
            p.setString(1, maNV);
            ResultSet rs = (ResultSet) p.executeQuery();
            while(rs.next()){
                String taiKhoan = rs.getString("maNV");
                String matKhau = rs.getString("matKhau");
                NhanVien nv_temp = new NhanVien(taiKhoan, matKhau);
                nv = nv_temp;
            }
            config.JDBCUtil.closeConnection(con);
            
        } catch (SQLException e) {
        
        }
        return nv;
        
    }

}
