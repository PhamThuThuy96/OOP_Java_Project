package QLKS;
public class Phong {
    private String MAPHONG;
    private String TENPHONG;
    private String LOAIPHONG;
    private double GIAPHONG;
    private String CHUTHICH;
    private String TINHTRANG;
    private String MANV;
    private String MADV;

    public Phong(String MAPHONG, String TENPHONG, String LOAIPHONG, double GIAPHONG, String CHUTHICH, String TINHTRANG, String MANV, String MADV) {
        this.MAPHONG = MAPHONG;
        this.TENPHONG = TENPHONG;
        this.LOAIPHONG = LOAIPHONG;
        this.GIAPHONG = GIAPHONG;
        this.CHUTHICH = CHUTHICH;
        this.TINHTRANG = TINHTRANG;
        this.MANV = MANV;
        this.MADV = MADV;
    }

    public Phong() {
    }

    Phong(String string, String string0, String string1, double aDouble, String string2, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setMAPHONG(String MAPHONG) {
        this.MAPHONG = MAPHONG;
    }
      public String getMAPHONG() {
        return MAPHONG;
    }

    public void setTENPHONG(String TENPHONG) {
        this.TENPHONG = TENPHONG;
    }
    public String getTENPHONG() {
        return TENPHONG;
    }

    public void setLOAIPHONG(String LOAIPHONG) {
        this.LOAIPHONG = LOAIPHONG;
    }
    public String getLOAIPHONG() {
        return LOAIPHONG;
    }

    public void setGIAPHONG(double GIAPHONG) {
        this.GIAPHONG = GIAPHONG;
    }
     public double getGIAPHONG() {
        return GIAPHONG;
    }
     
    public void setCHUTHICH(String CHUTHICH) {
        this.CHUTHICH = CHUTHICH;
    }
      public String getCHUTHICH() {
        return CHUTHICH;
    }
      
    public void setTINHTRANG(String TINHTRANG) {
        this.TINHTRANG = TINHTRANG;
    }
    
    public String getTINHTRANG() {
        return TINHTRANG;
    }
    
    public void setMANV(String MANV) {
        this.MANV = MANV;
    }
     public String getMANV() {
        return MANV;
    }

    public void setMADV(String MADV) {
        this.MADV = MADV;
    }
     public String getMADV() {
        return MADV;
    }


    @Override
    public String toString() {
        return "Phong{" + "MAPHONG=" + MAPHONG + ", TENPHONG=" + TENPHONG + ", LOAIPHONG=" + LOAIPHONG + ", GIAPHONG=" + GIAPHONG + ", CHUTHICH=" + CHUTHICH + ", TINHTRANG=" + TINHTRANG + ", MANV=" + MANV + ", MADV=" + MADV + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
