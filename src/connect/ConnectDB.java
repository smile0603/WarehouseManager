package connect;


import java.sql.*;

public class ConnectDB {
    public static Connection con = null;
    private static ConnectDB instance =new ConnectDB();
    static final String url = "jdbc:sqlserver://localhost:1433;databasename = CSDL_QLK;encrypt=true;trustServerCertificate=true";
    static final String user  = "sa";
    static final  String password = "123456";
    
    public static ConnectDB getInstance() {
	return instance;
    }
    
    public void connect() throws Exception {
        con = DriverManager.getConnection(url,user,password);
    }
    
    public void disconnect() {
        if(con != null) {
            try {
                con.close();
            }
            catch(SQLException e) {
		e.printStackTrace();
            }
	}
    }
    public static Connection getConnection() {
	return con;
    }
}
//    
//    public static void kiemTraDangNhap(){
//        try {
//            con = DriverManager.getConnection(url,user,password);
//            Statement stmt = null;
//            stmt = con.createStatement();
//            String sql = "SELECT taiKhoan, matKhau FROM tb_dangNhap";
//            ResultSet rs = stmt.executeQuery(sql);
//            while(rs.next()){
//                String tk = rs.getString("taiKhoan");
//                String pw = rs.getString("matKhau");
//                System.out.println("Tai khoan: "+ tk);
//                System.out.println("Mat Khau: " + pw);
//            }
//            rs.close();
//            stmt.close();
//            con.close();
//        } catch (SQLException e) {
//            System.out.println("FAIL");
//            e.printStackTrace();
//        }
//    }



