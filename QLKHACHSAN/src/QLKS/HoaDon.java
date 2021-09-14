package QLKS;
import java.util.Date;
public class HoaDon {
    private String MAHD;
    private String MANV;
    private String MAPHONG;
    private Date NGAY;
    private double GIAHD;

    public HoaDon(String MAHD, String MANV, String MAPHONG, Date NGAY, double GIAHD) {
        this.MAHD = MAHD;
        this.MANV = MANV;
        this.MAPHONG = MAPHONG;
        this.NGAY = NGAY;
        this.GIAHD = GIAHD;
    }

    public HoaDon() {
    }

    public void setMAHD(String MAHD) {
        this.MAHD = MAHD;
    }
    public String getMAHD() {
        return MAHD;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }
      public String getMANV() {
        return MANV;
    }

    public void setMAPHONG(String MAPHONG) {
        this.MAPHONG = MAPHONG;
    }
     public String getMAPHONG() {
        return MAPHONG;
    }

    public void setNGAY(Date NGAY) {
        this.NGAY = NGAY;
    }
    public Date getNGAY() {
        return NGAY;
    }

    public void setGIAHD(double GIAHD) {
        this.GIAHD = GIAHD;
    }
      public double getGIAHD() {
        return GIAHD;
    }


    @Override
    public String toString() {
        return "HoaDon{" + "MAHD=" + MAHD + ", MANV=" + MANV + ", MAPHONG=" + MAPHONG + ", NGAY=" + NGAY + ", GIAHD=" + GIAHD + '}';
    }
    
    
    
    
}
