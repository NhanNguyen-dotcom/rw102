package frontend;

import backend.IQLTV;
import backend.QLTV;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        IQLTV iqltv = new QLTV();
        while (true){
            System.out.println("===== MỜI BẠN NHẬP CÁC CHỨC NĂNG =====");
            System.out.println("1. Thêm mới tài liệu.");
            System.out.println("2. Xoá tài liệu theo mã tài liệu.");
            System.out.println("3. Hiển thị thông tin về tài liệu.");
            System.out.println("4. Tìm kiếm tài liệu theo loại.");
            System.out.println("5. Thoát khỏi chương trình.");
            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();
            switch (choice){
                case "1":
                    iqltv.themMoiTaiLieu();
                    break;
                case "2":
                    iqltv.xoaTaiLieuTheoMa();
                    break;
                case "3":
                    iqltv.hienThiThongTin();
                    break;
                case "4":
                    iqltv.timKiemTaiLieu();
                    break;
                case "5":
                    System.out.println("Thoát.");
                    System.exit(0);
                default:
            }
        }
    }
}
