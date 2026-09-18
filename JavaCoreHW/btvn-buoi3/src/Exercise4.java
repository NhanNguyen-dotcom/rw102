import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class Exercise4 {

    //Q1:
    public static void question1(){
        System.out.println("=======E4-1=======");
        Random random = new Random();
        int n = random.nextInt();
        System.out.println(n);
    }

    //Q2:
    public static void question2(){
        System.out.println("=======E4-2=======");
        Random random = new Random();
        Float n = random.nextFloat();
        System.out.println(n);
    }

    //Q3:
    public static void question3(){
        String[] ten = {"Nhân", "Mai", "Đào", "Dũng"};
        System.out.println("=======E4-3=======");
        Random random = new Random();
        int i = random.nextInt(ten.length);
        System.out.println(i);
    }

    //Q4:
    public static void question4(){
        System.out.println("=======E4-4=======");
        Random random = new Random();
        int minDay = (int) LocalDate.of(1995, 7, 24).toEpochDay();
        int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
        long randomInt = minDay + random.nextInt(maxDay - minDay);
        LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
        System.out.println(randomDay);
    }

    //Q5:
    public static void question5(){
        System.out.println("=======E4-5=======");
        Random random = new Random();
        int now = (int) LocalDate.now().toEpochDay();
        int randomDate = now - random.nextInt(365);
        LocalDate resultDate = LocalDate.ofEpochDay(randomDate);
        System.out.println("Ngày ngẫu nhiên là: " + resultDate);
    }

    //Q6:
    public static void question6(){
        System.out.println("=======E4-6=======");
        Random random = new Random();
        int maxDay = (int) LocalDate.now().toEpochDay();
        long randomDay = random.nextInt(maxDay);
        LocalDate resultDate = LocalDate.ofEpochDay(randomDay);
        System.out.println("Ngày ngẫu nhiên trong quá khứ là: " + resultDate);
    }

    //Q7:
    public static void question7(){
        System.out.println("=======E4-7=======");
        Random random = new Random();
        int n = random.nextInt(999 - 100 + 1) + 100;
        System.out.println(n);
    }
}


