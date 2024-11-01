
package entity;


public class SanPham {
    private String maSP;
    private String tenSP;
    private String ghiChu;
    
    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public SanPham(String maSP, String tenSP, String ghiChu) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.ghiChu = ghiChu;
    }
    public SanPham(String maSP, String tenSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
    }
    public SanPham() {
    }
    

    @Override
    public String toString() {
        return tenSP;
    }
    
    
    
}
