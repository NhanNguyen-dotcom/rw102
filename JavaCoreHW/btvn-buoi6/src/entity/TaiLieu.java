package entity;

public class TaiLieu {
    private String ma;
    private String tenNhaXB;
    private int soBanPH;
    private Loai loai;

    public TaiLieu() {
    }

    public TaiLieu(String ma, String tenNhaXB, int soBanPH, Loai loai) {
        this.ma = ma;
        this.tenNhaXB = tenNhaXB;
        this.soBanPH = soBanPH;
        this.loai = loai;
    }

    public TaiLieu(String ma, String tenNhaXB, int soBanPH) {
        this.ma = ma;
        this.tenNhaXB = tenNhaXB;
        this.soBanPH = soBanPH;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenNhaXB() {
        return tenNhaXB;
    }

    public void setTenNhaXB(String tenNhaXB) {
        this.tenNhaXB = tenNhaXB;
    }

    public int getSoBanPH() {
        return soBanPH;
    }

    public void setSoBanPH(int soBanPH) {
        this.soBanPH = soBanPH;
    }

    public Loai getLoai() {
        return loai;
    }

    public void setLoai(Loai loai) {
        this.loai = loai;
    }
}
