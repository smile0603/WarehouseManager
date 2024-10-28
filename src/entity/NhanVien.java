package entity;

public class NhanVien {
    private String maNV;
    private String tenNV;
    private String matKhau;
    private String mail;
    private int sdt;

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public NhanVien() {
    }

    public NhanVien(String maNV, String tenNV, String matKhau, String mail, int sdt) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.matKhau = matKhau;
        this.mail = mail;
        this.sdt = sdt;
    }
    

    public NhanVien(String maNV, String matKhau) {
        this.maNV = maNV;
        this.matKhau = matKhau;

    }

    @Override
    public String toString() {
        return super.toString(); 
    }
    
}