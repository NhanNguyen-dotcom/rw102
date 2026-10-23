package backend;

import entity.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB implements IQLCB{

//    private CanBo[] canBos;// lưu trữ dữ liệu(bị fix cứng)
    private List<CanBo> canBoList;
    private Scanner sc = new Scanner(System.in);

    public QLCB(){
        canBoList = new ArrayList<>();
//        canBoList.add(new CanBo("Nguyễn Đặng Nhân", 22, GioiTinh.NAM, "HN", Loai.NV));
//        canBoList.add(new CanBo("Nguyễn Thị Hà", 23, GioiTinh.NU, "HCM", Loai.CN));
//        canBoList.add(new CanBo("Bùi Văn Tuấn", 24, GioiTinh.NAM, "HT", Loai.KS));
//        canBoList.add(new CanBo("Vũ Thị Hai", 25, GioiTinh.KHAC, "HG", Loai.CN));
    }

    @Override
    public void themMoi() {
        System.out.println("===== THÊM MỚI CÁN BỘ =====");
        System.out.print("Nhập họ tên: ");
        String hoten = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        int tuoi = 0;
        while (true){
            if(!sc.hasNextInt()){
                System.err.println("Vui lòng nhập số nguyên dương!");
                sc.nextLine();
            } else {
                tuoi = sc.nextInt();
                if(tuoi < 0 || tuoi > 150){
                    System.err.println("Vui lòng nhập số nguyên dương!");
                    sc.nextLine();}
                else
                    break;
            }
        }
        System.out.print("Chọn giới tính (1.NAM  2.NỮ  KHÁC): ");
        String gt = sc.nextLine();
        GioiTinh gioiTinh;
        switch (gt) {
            case "1" :
                gioiTinh = GioiTinh.NAM;
                break;
            case "2" :
                gioiTinh = GioiTinh.NU;
                break;
            default:
                gioiTinh = GioiTinh.KHAC;

        }
        System.out.print("Nhập địa chỉ: ");
        String diaChi = sc.nextLine();

        // Chọn loại cán bộ:
        System.out.print("Chọn loại cán bộ (1.Công nhân  2.Kỹ sư  khác(Nhân viên)): ");
        String choice = sc.nextLine();
        switch (choice) {
            case "1" :
                System.out.print("Nhập bậc: ");
                int bac = sc.nextInt();
                sc.nextLine();
                CanBo congNhan = new CongNhan(hoten, tuoi, gioiTinh, diaChi, Loai.CN, bac);
                canBoList.add(congNhan);
                System.out.println("Thêm công nhân thành công!");
                break;
            case "2" :
                System.out.print("Nhập ngành đào tạo: ");
                String nganhDaoTao = sc.nextLine();
                CanBo kySu = new KySu(hoten, tuoi, gioiTinh, diaChi, Loai.KS, nganhDaoTao);
                canBoList.add(kySu);
                System.out.println("Thêm kỹ sư thành công!");
                break;
            default:
                System.out.print("Nhập công việc: ");
                String congViec = sc.nextLine();
                CanBo nhanVien = new NhanVien(hoten, tuoi, gioiTinh, diaChi, Loai.NV, congViec);
                canBoList.add(nhanVien);
                System.out.println("Thêm nhân viên thành công!");
        }
    }

    @Override
    public void timKiemTheoTen() {
        System.out.println("===== TÌM KIẾM THEO HỌ TÊN =====");
        System.out.println("Nhập họ tên cần tìm: ");
        String ten = sc.nextLine();
        List<CanBo> canBos = new ArrayList<>();

        try {
            //Bước 1: lấy dữ liệu từ DB
            String url = "jdbc:mysql://localhost:3306/qlcb";
            String username = "root";
            String password = "root";
            //tạo kết nối đến database
            Connection connection = DriverManager.getConnection(url, username, password);
            String sql = "select * from can_bo where ho_ten like ?"; // ? là tham số
            PreparedStatement statement = connection.prepareStatement(sql);// hỗ trợ câu sql có tham số
            statement.setString(1, "%" + ten + "%");

            ResultSet resultSet = statement.executeQuery();//thực thi câu query sau
            while (resultSet.next()){ //chuyển từ resultset sang list cán bộ
                String hoTen = resultSet.getString("ho_ten"); //lấy dữ liệu theo tên cột hoặc vị trí
                int tuoi = resultSet.getInt("tuoi");
                String gt = resultSet.getString("gioi_tinh");
                GioiTinh gioiTinh = GioiTinh.valueOf(gt);
                String diaChi = resultSet.getString("dia_chi");
                String loaiString = resultSet.getString("loai");
                Loai loai = Loai.valueOf(loaiString);
                if(loai == Loai.CN){
                    int bac = resultSet.getInt("bac");
                    CanBo cn = new CongNhan(hoTen, tuoi, gioiTinh, diaChi, Loai.CN, bac);
                    canBos.add(cn);
                } else if (loai == Loai.KS) {
                    String nganhDaoTao = resultSet.getString("nganh");
                    CanBo ks = new KySu(hoTen, tuoi, gioiTinh, diaChi, Loai.KS, nganhDaoTao);
                    canBos.add(ks);
                } else if (loai == Loai.NV) {
                    String congViec = resultSet.getString("cong_viec");
                    CanBo nv = new NhanVien(hoTen, tuoi, gioiTinh, diaChi, Loai.NV, congViec);
                    canBos.add(nv);}
            }



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



        //hiển thị thông tin
        System.out.println("+-------------------------+-----+----------+--------------------+");
        System.out.printf("|%25s|%5s|%10s|%20s|\n", "Họ tên", "Tuổi", "Giới Tính", "Địa chỉ");
        System.out.println("+-------------------------+-----+----------+--------------------+");
        for (CanBo cb : canBos){
            System.out.printf("|%25s|%5s|%10s|%20s|\n", cb.getHoTen(), cb.getTuoi(), cb.getGioiTinh(), cb.getDiaChi());
        }
        System.out.println("+-------------------------+-----+----------+--------------------+");

    }

    @Override
    public void hienThiToanBo() {
        List<CanBo> canBos = new ArrayList<>();



        try {
            //Bước 1: lấy dữ liệu từ DB
            String url = "jdbc:mysql://localhost:3306/qlcb";
            String username = "root";
            String password = "root";
            //tạo kết nối đến database
            Connection connection = DriverManager.getConnection(url, username, password);
            String sql = "select * from can_bo";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);//thực thi câu query
            while (resultSet.next()){ //chuyển từ resultset sang list cán bộ
                String hoTen = resultSet.getString("ho_ten"); //lấy dữ liệu theo tên cột hoặc vị trí
                int tuoi = resultSet.getInt("tuoi");
                String gt = resultSet.getString("gioi_tinh");
                GioiTinh gioiTinh = GioiTinh.valueOf(gt);
                String diaChi = resultSet.getString("dia_chi");
                String loaiString = resultSet.getString("loai");
                Loai loai = Loai.valueOf(loaiString);
                if(loai == Loai.CN){
                    int bac = resultSet.getInt("bac");
                    CanBo cn = new CongNhan(hoTen, tuoi, gioiTinh, diaChi, Loai.CN, bac);
                    canBos.add(cn);
                } else if (loai == Loai.KS) {
                    String nganhDaoTao = resultSet.getString("nganh");
                    CanBo ks = new KySu(hoTen, tuoi, gioiTinh, diaChi, Loai.KS, nganhDaoTao);
                    canBos.add(ks);
                } else if (loai == Loai.NV) {
                    String congViec = resultSet.getString("cong_viec");
                    CanBo nv = new NhanVien(hoTen, tuoi, gioiTinh, diaChi, Loai.NV, congViec);
                    canBos.add(nv);}
            }



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        //bước 2: hiển thị dữ liệu
        System.out.println("===== HIỂN THỊ TOÀN BỘ CÁN BỘ =====");
        System.out.println("+-------------------------+-----+----------+--------------------+");
        System.out.printf("|%25s|%5s|%10s|%20s|\n", "Họ tên", "Tuổi", "Giới Tính", "Địa chỉ");
        System.out.println("+-------------------------+-----+----------+--------------------+");
        for (CanBo cb : canBos){
            System.out.printf("|%25s|%5s|%10s|%20s|\n", cb.getHoTen(), cb.getTuoi(), cb.getGioiTinh(), cb.getDiaChi());
        }
        System.out.println("+-------------------------+-----+----------+--------------------+");
    }

    @Override
    public void xoaTheoTen() {
        System.out.println("===== XOÁ CÁN BỘ THEO TÊN =====");

        //Nhập tên cần xoá
        System.out.print("Nhập tên cần xoá(nhập chính xác): ");
        String ten = sc.nextLine();

        //Tạo list chứa tên cần xoá:
        List<CanBo> removes = new ArrayList<>();
        for(CanBo cb : canBoList){
            if(cb.getHoTen().equals(ten)){
                removes.add(cb);
            }
        }

        if(removes.isEmpty()){ // list trống
            System.out.println("Không có cán bộ nào trùng tên!");
        }
        else{
            canBoList.removeAll(removes);
            System.out.println("Xoá thành công!");
        }
    }
}
