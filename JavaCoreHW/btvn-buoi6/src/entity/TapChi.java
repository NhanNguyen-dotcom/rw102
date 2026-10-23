package entity;

public class TapChi extends TaiLieu{
    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi(){
    }

    public TapChi(String ma, String tenNhaXB, int soBanPH, Loai loai, int soPhatHanh,  int thangPhatHanh) {
        super(ma, tenNhaXB, soBanPH, loai.TAPCHI);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }
}
