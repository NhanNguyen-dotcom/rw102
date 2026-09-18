public class Exercise6 {

    //Q1:
    public static void question1() {
        System.out.println("=======E6-1=======");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    //Q2:
    public static void question2(Account[] accounts) {
        System.out.println("=======E6-2=======");
        for(int i = 0; i < accounts.length; i++){
            System.out.println("Thông tin account thứ " + (i+1) + " là: ");
            System.out.println(
                "ID: " + accounts[i].id +
                        " Email: " + accounts[i].email +
                        " Username: " + accounts[i].username +
                        " FullName: " + accounts[i].fullName +
                        " CreareDate: " + accounts[i].createDate
        );
        }
    }

    //Q3:
    public static void question3() {
        System.out.println("=======E6-3=======");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }
}
