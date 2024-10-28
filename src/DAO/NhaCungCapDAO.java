package DAO;

import entity.NhaCungCap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class NhaCungCapDAO {
    public static NhaCungCapDAO getInstance(){
        return new NhaCungCapDAO();
    }
    
    public NhaCungCap selectNCCByMaNCC(int maNCC){
        NhaCungCap ncc = null;
        try {
            Connection con = (Connection) config.JDBCUtil.getConnection();
            String sql = "SELECT * FROM tb_NCC WHERE maNCC = ?";
            PreparedStatement p = (PreparedStatement) con.prepareStatement(sql);
            p.setInt(1, maNCC);
            ResultSet rs = (ResultSet) p.executeQuery();
            while(rs.next()){
                int mncc = rs.getInt("maNCC");
                String tenNCC = rs.getString("tenNCC");
                String diaChi = rs.getString("diaChiNCC");
                String mailNCC = rs.getString("mailNCC");
                int sdt = rs.getInt("sdtNCC");
                NhaCungCap ncc_temp = new NhaCungCap(mncc, tenNCC, diaChi, mailNCC, sdt);
                ncc = ncc_temp;
                
            }
            config.JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
        }
        return ncc;
    }
    
    
    public boolean insertNCC(NhaCungCap ncc){
        int result = 0;
        
        try {
            Connection con = (Connection) config.JDBCUtil.getConnection();
            String sql = "INSERT INTO tb_NCC VALUES(?,?,?,?,?)";
            PreparedStatement p = (PreparedStatement)con.prepareStatement(sql);
            p.setInt(1, ncc.getMaNCC());
            p.setString(2, ncc.getTenNCC());
            p.setString(3, ncc.getDiaChi());
            p.setString(4, ncc.getEmail());
            p.setInt(5, ncc.getSdtNCC());
            result = p.executeUpdate();
            
           config.JDBCUtil.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result > 0;
    }
    
    
    public static ArrayList<NhaCungCap> getAllNhaCungCap(){
        ArrayList<NhaCungCap> dsNCC = new ArrayList<>();
        Connection con = (Connection) config.JDBCUtil.getConnection();
        String sql = "SELECT * FROM tb_NCC";
        
        try {
            PreparedStatement p = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                int mncc = rs.getInt("maNCC");
                String tenNCC = rs.getString("tenNCC");
                String diaChi = rs.getString("diaChiNCC");
                String mailNCC = rs.getString("mailNCC");
                int sdt = rs.getInt("sdtNCC");

                NhaCungCap ncc = new NhaCungCap(mncc, tenNCC, diaChi, mailNCC, sdt);
                dsNCC.add(ncc);
                
                
            }
            config.JDBCUtil.closeConnection(con);
            
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsNCC;
        
    }
    

    
    
}
