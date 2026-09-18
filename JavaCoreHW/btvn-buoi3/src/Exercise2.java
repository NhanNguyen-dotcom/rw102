import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Exercise2 {

    //Q1:
    public static void question1(){
        int i = 5;
        System.out.printf("%d%n", i);
    }

    //Q2:
    public static void question2(){
        System.out.println("========E2-2=========");
        int i = 100000000;
        System.out.printf(Locale.US, "%,d%n", i);
    }

    //Q3:
    public static void question3(){
        System.out.println("========E2-3=========");
        float i = 5.5670998f;
        System.out.printf("%5.4f%n", i);
    }

    //Q4:
    public static void question4(){
        System.out.println("========E2-4=========");
        String ten = "Nguyễn Văn A";
        System.out.printf("Tên tôi là " + ten + " và tôi đang độc thân \n");
    }

    //Q5:
    public static void question5(){
        System.out.println("========E2-5=========");
        String pattern = "dd/MM/yyyy HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.printf("Time:" + date + "\n");
    }

    //Q6:
    public static void question6(Account[] accounts){
        System.out.println("========E2-6=========");
        int i = 0;
        System.out.println("+--------------------+--------------------+--------------------+");
        System.out.printf("|%20s|%20s|%20s|\n", "Email", "FullName", "Department Name");
        System.out.println("+--------------------+--------------------+--------------------+");
        while (i < accounts.length){
            System.out.printf("|%20s|%20s|%20s|\n", accounts[i].email, accounts[i].fullName, accounts[i].department.name);
            i++;
        }
        System.out.println("+--------------------+--------------------+--------------------+");
    }
}
