package entity;

public class Sach extends TaiLieu {
    private String tenTacGia;
    private int soTrang;

    public Sach(){
    }

    public Sach(String ma, String tenNhaXB, int soBanPH, Loai loai, String tenTacGia, int soTrang) {
        super(ma, tenNhaXB, soBanPH, loai.SACH);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
}
