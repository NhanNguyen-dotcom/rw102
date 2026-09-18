import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Exercise3 {

    //Q1:
    public static void question1(Exam exam){
        System.out.println("=======E3-1=======");
        System.out.println("Thông tin của exam là: ");
        System.out.println("Code: " + exam.code);
        Locale locale = new Locale("vn", "VN");
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date = dateFormat.format(exam.createDate);
        System.out.println("CreateDate: " + date);
    }

    //Q2:
    public static void question2(Exam[] exams){
        System.out.println("=======E3-2=======");
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss");
        for (Exam exam : exams){
            System.out.println(exam.code + ": " + dateFormat.format(exam.createDate));
        }
    }

    //Q3:
    public static void question3(Exam[] exams){
        System.out.println("=======E3-3=======");
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy");
        for (Exam exam : exams){
            System.out.println(exam.code + ": " + dateFormat.format(exam.createDate));
        }
    }

    //Q4:
    public static void question4(Exam[] exams){
        System.out.println("=======E3-4=======");
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM");
        for (Exam exam : exams){
            System.out.println(exam.code + ": " + dateFormat.format(exam.createDate));
        }
    }

    //Q5:
    public static void question5(Exam[] exams){
        System.out.println("=======E3-5=======");
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM-dd");
        for (Exam exam : exams){
            System.out.println(exam.code + ": " + dateFormat.format(exam.createDate));
        }
    }


}
