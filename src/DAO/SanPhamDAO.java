
package DAO;

import entity.SanPham;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SanPhamDAO {
    public ArrayList<SanPham> getAllSanPham(){
        ArrayList<SanPham> dsSP = new ArrayList<>();
        Connection con = (Connection) config.JDBCUtil.getConnection();
        String sql = "SELECT * FROM tb_SanPham";
        
        try {
            PreparedStatement p = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                String maSP = rs.getString("maSP");
                String tenSP = rs.getString("tenSP");
                String ghiChu = rs.getString("ghiChu");
                SanPham sp = new SanPham(maSP, tenSP, ghiChu);
                dsSP.add(sp);
            }
            config.JDBCUtil.closeConnection(con);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return dsSP;
        
    }
    
}
