public class Exercise1 {

    //Q16-10:
    public static void question10(Account[] accounts){

        int i = 0;
        while (i < accounts.length) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("FullName : " + accounts[i].fullName);
            System.out.println("Phòng ban: " + accounts[i].department.name);
            i++;
        }
    }

    //Q16-11:
    public static void question11(Department[] departments){
        int i = 0;
        while (i < departments.length) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + departments[i].id);
            System.out.println("Name: " + departments[i].name);
            i++;
        }
    }

    //Q16-12:
    public static void question12(Department[] departments) {
        int i = 0;
        while (i < 2) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + departments[i].id);
            System.out.println("Name: " + departments[i].name);
            i++;
        }
    }

    //Q16-13:
    public static void question13(Account[] accounts) {
        int i = 0;
        while (i < accounts.length) {
            if (i == 1) {
                i++;
                continue;
            }
            System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("FullName : " + accounts[i].fullName);
            System.out.println("Phòng ban: " + accounts[i].department.name);
            i++;
        }
    }

    //Q16-14:
    public static void question14(Account[] accounts) {
        int i = 0;
        while (i < accounts.length) {
            if(accounts[i].id >= 4){
                break;
            }
            System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("FullName : " + accounts[i].fullName);
            System.out.println("Phòng ban: " + accounts[i].department.name);
            i++;
        }
    }

    //Q16-15:
    public static void question15(){
        int sochan = 1;
        while (sochan <= 20){
            if(sochan % 2 == 0){
                System.out.println(sochan);
            }
            sochan++;
        }
    }

    //Q17-10
    public static void question17_10(Account[] accounts){
        int i = 0;
        do {
            System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("FullName : " + accounts[i].fullName);
            System.out.println("Phòng ban: " + accounts[i].department.name);
            i++;
        }
        while (i < accounts.length);
    }

    //Q17-11:
    public static void question17_11(Department[] departments){
        int i = 0;
        do {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + departments[i].id);
            System.out.println("Name: " + departments[i].name);
            i++;
        }
        while (i < departments.length);
    }

    //Q17-12:
    public static void question17_12(Department[] departments) {
        int i = 0;
        do {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + departments[i].id);
            System.out.println("Name: " + departments[i].name);
            i++;
        }
        while (i < 2);
    }

    //Q17-13:
    public static void question17_13(Account[] accounts) {
        int i = 0;
        do {
            if (i == 1) {
                i++;
                continue;
            }
            System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("FullName : " + accounts[i].fullName);
            System.out.println("Phòng ban: " + accounts[i].department.name);
            i++;
        }
        while (i < accounts.length);
    }

    //Q17-14:
    public static void question17_14(Account[] accounts) {
        int i = 0;
        do {
            if(accounts[i].id >= 4){
                break;
            }
            System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("FullName : " + accounts[i].fullName);
            System.out.println("Phòng ban: " + accounts[i].department.name);
            i++;
        }
        while (i < accounts.length);
    }

    //Q17-15:
    public static void question17_15(){
        int sochan = 1;
        do {
            if(sochan % 2 == 0){
                System.out.println(sochan);
            }
            sochan++;
        }
        while (sochan <= 20);
    }
}
