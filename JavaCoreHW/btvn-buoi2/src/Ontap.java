import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ontap {
    public static void main(String[] args) {

        //Q1:
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập 3 số nguyên vào chương trình: ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        System.out.println("Những số vừa nhập là: " + a + " " + b  + " " + c);

        // Q2:
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào chương trình 2 số thực: ");
//        float a = sc.nextFloat();
//        float b = sc.nextFloat();
//        System.out.println("Những số thực vừa nhập là: " + a + " " + b);

        //Q3:
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập họ và tên bạn vào: ");
//        String a = sc.nextLine();
//        System.out.println("Họ và tên của bạn là: " + a);

        //Q4:
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập ngày sinh nhật của bạn vào: ");
//        String a = sc.nextLine();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate birthday = LocalDate.parse(a, formatter);
//
//        System.out.println("Ngày sinh nhật của bạn là: " + a);

        //Q5:

    }
//    public static void question5(){
//        Account account = new Account();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập các thông tin của account: ");
//        System.out.println("Nhập id: ");
//        System.out.println("Nhập tên: ");
//        System.out.println("Nhập ngày sinh: ");
//        int id = sc.nextInt();
//        String ten = sc.nextLine();
//        String ngaySinh = sc.nextLine();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate date = LocalDate.parse(ngaySinh, formatter);
//        int choice = sc.nextInt();
//        switch (choice){
//            case 1:
//                Position position = new Position();
//                position.name = Position.PositionName.DEV;
//                account.position  = position;
//                break;
//
//        }


    }
public static void questionDemo() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập tuổi: ");
    int tuoi = scanner.nextInt();
    System.out.println("Nhập tên: ");
    String ten = scanner.nextLine();
    System.out.println("Nhập điểm: ");
    int diem  = scanner.nextInt();

    System.out.println("Tuổi: " + tuoi);
    System.out.println("Tên: " + ten);
    System.out.println("Điểm: " + diem);
}

