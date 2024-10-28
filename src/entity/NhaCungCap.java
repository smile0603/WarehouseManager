package entity;


public class NhaCungCap {
    private int maNCC;
    private String tenNCC;
    private String diaChi;
    private String email;
    private int sdtNCC;

    public int getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(int maNCC) {
        this.maNCC = maNCC;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSdtNCC() {
        return sdtNCC;
    }

    public void setSdtNCC(int sdtNCC) {
        this.sdtNCC = sdtNCC;
    }

    public NhaCungCap() {
    }

    public NhaCungCap(int maNCC, String tenNCC, String diaChi, String email, int sdtNCC) {
        this.maNCC = maNCC;
        this.tenNCC = tenNCC;
        this.diaChi = diaChi;
        this.email = email;
        this.sdtNCC = sdtNCC;
    }
    
    public NhaCungCap(int maNCC) {
        this.maNCC = maNCC;
    }
    public NhaCungCap(int maNCC,String tenNCC){
        this.maNCC = maNCC;
        this.tenNCC = tenNCC;
    }



}
