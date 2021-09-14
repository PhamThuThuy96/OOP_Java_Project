package QLKS;
public class KhachHang {
    private String MAKH;
    private String TENKH;
    private String CMND;
    private String QUOCTICH;
    private String GIOITINH;
    private int tuoi;
    private String SDT;
    private String MAPHONG;

    public KhachHang(String MAKH, String TENKH, String CMND, String QUOCTICH, String GIOITINH, int tuoi, String SDT, String MAPHONG) {
        this.MAKH = MAKH;
        this.TENKH = TENKH;
        this.CMND = CMND;
        this.QUOCTICH = QUOCTICH;
        this.GIOITINH = GIOITINH;
        this.tuoi = tuoi;
        this.SDT = SDT;
        this.MAPHONG = MAPHONG;
    }

    public KhachHang() {
    }

    KhachHang(String string, String string0, String string1, String string2, String string3, int aInt, String string4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setMAKH(String MAKH) {
        this.MAKH = MAKH;
    }
    public String getMAKH() {
        return MAKH;
    }

    public void setTENKH(String TENKH) {
        this.TENKH = TENKH;
    }
       public String getTENKH() {
        return TENKH;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }
      public String getCMND() {
        return CMND;
    }

    public void setQUOCTICH(String QUOCTICH) {
        this.QUOCTICH = QUOCTICH;
    }
      public String getQUOCTICH() {
        return QUOCTICH;
    }

    public void setGIOITINH(String GIOITINH) {
        this.GIOITINH = GIOITINH;
    }
     public String getGIOITINH() {
        return GIOITINH;
     }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
     public int getTuoi() {
        return tuoi;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
    public String getSDT() {
        return SDT;
    }

    public void setMAPHONG(String MAPHONG) {
        this.MAPHONG = MAPHONG;
    }
     public String getMAPHONG() {
        return MAPHONG;
    }

    @Override
    public String toString() {
        return "khachHang{" + "MAKH=" + MAKH + ", TENKH=" + TENKH + ", CMND=" + CMND + ", QUOCTICH=" + QUOCTICH + ", GIOITINH=" + GIOITINH + ", tuoi=" + tuoi + ", SDT=" + SDT + ", MAPHONG=" + MAPHONG + '}';
    }
    
    
    
    
}
