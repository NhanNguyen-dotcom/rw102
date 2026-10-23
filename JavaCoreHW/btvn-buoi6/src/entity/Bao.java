package entity;

import java.time.LocalDate;

public class Bao extends TaiLieu{
    private LocalDate ngayPhatHanh;

    public Bao() {
    }

    public Bao(String ma, String tenNhaXB, int soBanPH, Loai loai, LocalDate ngayPhatHanh) {
        super(ma, tenNhaXB, soBanPH, loai.BAO);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public LocalDate getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(LocalDate ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
}
