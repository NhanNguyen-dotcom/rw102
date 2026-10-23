package backend;

import entity.*;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class QLTV implements IQLTV{

    private List<TaiLieu> taiLieuList;
    Scanner sc = new Scanner(System.in);

    public QLTV(){
        taiLieuList = new ArrayList<>();
        taiLieuList.add(new TaiLieu("001", "Xuân Hoài", 2000, Loai.BAO));
        taiLieuList.add(new TaiLieu("002", "Tô Hoài", 3000, Loai.TAPCHI));
        taiLieuList.add(new TaiLieu("003", "Nguyễn Trãi", 2500, Loai.SACH));
        taiLieuList.add(new TaiLieu("004", "Lý Quốc Sư", 4000, Loai.BAO));
    }

    @Override
    public void themMoiTaiLieu() {
        System.out.println("===== THÊM MỚI TÀI LIỆU =====");
        System.out.print("Nhập mã tài liệu: ");
        String ma = sc.nextLine();
        System.out.print("Nhập tên nhà xuất bản: ");
        String tenNhaXB = sc.nextLine();
        System.out.print("Nhập số bản phát hành: ");
        int soBanPH = sc.nextInt();
        sc.nextLine();

        System.out.print("Chọn loại tài liệu(1.Sách  2.Tạp chí  khác.Báo): ");
        String choice = sc.nextLine();
        switch (choice){
            case "1" :
                System.out.print("Nhập tên tác giá: ");
                String tacGia = sc.nextLine();
                System.out.println("Nhập số trang: ");
                int soTrang = sc.nextInt();
                TaiLieu sach = new Sach(ma, tenNhaXB, soBanPH, Loai.SACH, tacGia, soTrang);
                taiLieuList.add(sach);
                System.out.println("Thêm sách thành công!");
                break;
            case "2" :
                System.out.print("Nhập số phát hành: ");
                int soPhatHanh = sc.nextInt();
                sc.nextLine();
                System.out.print("Nhập tháng phát hành: ");
                int thangPhatHanh = sc.nextInt();
                sc.nextLine();
                TaiLieu tapChi = new TapChi(ma, tenNhaXB, soBanPH, Loai.TAPCHI, soPhatHanh, thangPhatHanh);
                taiLieuList.add(tapChi);
                System.out.println("Thêm tạp chí thành công!");
                break;
            default:
                System.out.print("Nhập ngày phát hành: ");
                int ngayPH = sc.nextInt();
                System.out.print("Nhập tháng phát hành: ");
                int thangPH = sc.nextInt();
                System.out.print("Nhập năm phát hành: ");
                int namPH = sc.nextInt();
                LocalDate ngayPhatHanh = LocalDate.of(namPH, thangPH, ngayPH);
                TaiLieu bao = new Bao(ma, tenNhaXB, soBanPH, Loai.BAO , ngayPhatHanh);
                taiLieuList.add(bao);
                System.out.println("Thêm báo thành công!");
        }

    }

    @Override
    public void xoaTaiLieuTheoMa() {
        System.out.println("====== XOÁ TÀI LIỆU THEO MÃ ======");
        System.out.print("Nhập mã tài liệu cần xoá: ");
        String ma = sc.nextLine();
        boolean rs = taiLieuList.removeIf(tl -> tl.getMa().equals(ma));
        if(rs)
            System.out.println("Xoá thành công!");
        else
            System.out.println("Không có dữ liệu tương ứng để xoá!");
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("===== HIỂN THỊ THÔNG TIN TÀI LIỆU =====");
        System.out.println("+--------------------+--------------------+--------------------+----------+");
        System.out.printf("|%20s|%20s|%20s|%10s|\n", "Mã tài liệu", "Tên nhà xuất bản", "Số trang phát hành", "Loại");
        System.out.println("+--------------------+--------------------+--------------------+----------+");
        if(taiLieuList.size() > 0){
            for (TaiLieu tl : taiLieuList){
                System.out.printf("|%20s|%20s|%20s|%10s|\n", tl.getMa(), tl.getTenNhaXB(), tl.getSoBanPH(), tl.getLoai());
        }}
        else
            System.out.printf("|%73s|\n", "Không có thông tin");
        System.out.println("+--------------------+--------------------+--------------------+----------+");
    }

    @Override
    public void timKiemTaiLieu() {
        System.out.println("===== TÌM KIẾM TÀI LIỆU THEO LOẠI =====");
        System.out.println("Nhập loại tài liệu bạn cần tìm kiếm (BAO, TAPCHI, SACH): ");

        String loaiTK = sc.nextLine().trim().toUpperCase();

        System.out.println("+--------------------+--------------------+--------------------+----------+");
        System.out.printf("|%20s|%20s|%20s|%10s|\n",
                "Mã tài liệu", "Tên nhà xuất bản", "Số trang phát hành", "Loại");
        System.out.println("+--------------------+--------------------+--------------------+----------+");

        boolean timThay = false;

        for (TaiLieu tl : taiLieuList) {
            if (tl.getLoai().toString().equals(loaiTK)) {
                System.out.printf("|%20s|%20s|%20s|%10s|\n",
                        tl.getMa(), tl.getTenNhaXB(), tl.getSoBanPH(), tl.getLoai());
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("Không tìm thấy tài liệu thuộc loại: " + loaiTK);
        }

        System.out.println("+--------------------+--------------------+--------------------+----------+");
    }
}
