import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {
    public static void main(String[] args) {
        // Tạo Department
        Department dep1 = new Department();
        dep1.id = 1;
        dep1.name = "Marketing";

        Department dep2 = new Department();
        dep2.id = 2;
        dep2.name = "Sale";

        Department dep3 = new Department();
        dep3.id = 3;
        dep3.name = "BOD";


// Tạo Position
        Position pos1 = new Position();
        pos1.id = 1;
        pos1.name = Position.PositionName.DEV;

        Position pos2 = new Position();
        pos2.id = 2;
        pos2.name = Position.PositionName.PM;

        Position pos3 = new Position();
        pos3.id = 3;
        pos3.name = Position.PositionName.SCRUM_MASTER;


// Tạo Group
        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Testing System";
        group1.createDate = LocalDate.of(2021, 1, 1);

        Group group2 = new Group();
        group2.id = 2;
        group2.name = "Development";
        group2.createDate = LocalDate.of(2020, 2, 1);

        Group group3 = new Group();
        group3.id = 3;
        group3.name = "Sale";
        group3.createDate = LocalDate.of(2019, 9, 23);


// Tạo Account
        Account acc1 = new Account();
        acc1.id = 1;
        acc1.email = "daonq1";
        acc1.username = "daonq1";
        acc1.fullName = "Dao Nguyen 1";
        acc1.department = dep1;
        acc1.position = pos1;
        acc1.createDate = LocalDate.now();

        Group[] groupAcc1 = { group1, group2 };
        acc1.groups = groupAcc1;


        Account acc2 = new Account();
        acc2.id = 2;
        acc2.email = "daonq2";
        acc2.username = "daonq2";
        acc2.fullName = "Dao Nguyen 2";
        acc2.department = dep2;
        acc2.position = pos2;
        acc2.createDate = LocalDate.of(2021, 03, 17);

        acc2.groups = new Group[] { group3, group2 };


        Account acc3 = new Account();
        acc3.id = 3;
        acc3.email = "daonq3";
        acc3.username = "daonq3";
        acc3.fullName = "Dao Nguyen 3";
        acc3.department = dep3;
        acc3.position = pos3;
        acc3.createDate = LocalDate.now();

        Account acc4 = new Account();
        acc4.id = 4;
        acc4.email = "daonq3";
        acc4.username = "daonq3";
        acc4.fullName = "Dao Nguyen 3";
        acc4.department = dep3;
        acc4.position = pos3;
        acc4.createDate = LocalDate.now();



// Add Group - Account
        group1.accounts = new Account[] { acc1 };

        group2.accounts = new Account[] { acc1, acc2 };

        group3.accounts = new Account[] { acc2 };

//Add Exam:
        Exam exam1 = new Exam();
        exam1.code = "De thi 1";
        exam1.createDate = LocalDateTime.now();

        Exam exam2 = new Exam();
        exam2.code = "De thi 2";
        exam2.createDate = LocalDateTime.now();

        Exam exam3 = new Exam();
        exam3.code = "De thi 3";
        exam3.createDate = LocalDateTime.now();

// Phần làm bài tập về nhà:
        Account[] accounts = {acc1, acc2, acc3, acc4};
        Department[] departments = {dep1, dep2, dep3};
        Exam[] exams = {exam1, exam2, exam3};

        //Q16-10:
        System.out.println("========Q16-10=========");
        Exercise1.question10(accounts);

        //Q16-11:
        System.out.println("========Q16-11=========");
        Exercise1.question11(departments);

        //Q16-12:
        System.out.println("========Q16-12=========");
        Exercise1.question12(departments);

        //Q16-13:
        System.out.println("========Q16-13=========");
        Exercise1.question13(accounts);

        //Q16-14:
        System.out.println("========Q16-14=========");
        Exercise1.question14(accounts);

        //Q16-15:
        System.out.println("========Q16-15=========");
        Exercise1.question15();

        //Q17-10:
        System.out.println("========Q17-10=========");
        Exercise1.question17_10(accounts);

        //Q17-11:
        System.out.println("========Q17-11=========");
        Exercise1.question17_11(departments);

        //Q17-12:
        System.out.println("========Q17-12=========");
        Exercise1.question17_12(departments);

        //Q17-13:
        System.out.println("========Q17-13=========");
        Exercise1.question17_13(accounts);

        //Q17-14:
        System.out.println("========Q17-14=========");
        Exercise1.question17_14(accounts);

        //Q17-15:
        System.out.println("========Q17-15=========");
        Exercise1.question17_15();

        //E2-1:
        System.out.println("========E2-1=========");
        Exercise2.question1();

        //E2-2:
        Exercise2.question2();
        Exercise2.question3();
        Exercise2.question4();
        Exercise2.question5();
        Exercise2.question6(accounts);

        //E3:
        Exercise3.question1(exam3);
        Exercise3.question2(exams);
        Exercise3.question3(exams);
        Exercise3.question4(exams);
        Exercise3.question5(exams);

        //E4:
        Exercise4.question1();
        Exercise4.question2();
        Exercise4.question3();
        Exercise4.question4();
        Exercise4.question5();
        Exercise4.question6();
        Exercise4.question7();

        //E5:
        Exercise5.question1();
        Exercise5.question2();
        Exercise5.question3();
        Exercise5.question4();
        Exercise5.question5();
        Exercise5.question6();
        Exercise5.question7();
        Exercise5.question8();
        Exercise5.question9();
        Exercise5.question10();
        Exercise5.question11();

        //E6:
        Exercise6.question1();
        Exercise6.question2(accounts);
        Exercise6.question3();
    }


}