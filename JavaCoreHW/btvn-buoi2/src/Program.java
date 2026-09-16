import java.time.LocalDate;

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


// Add Group - Account
        group1.accounts = new Account[] { acc1 };

        group2.accounts = new Account[] { acc1, acc2 };

        group3.accounts = new Account[] { acc2 };

        //Q1:
        System.out.println("---------Question 1---------");

        if (acc2.department == null) {
            System.out.println("Nhân viên này chưa có phòng ban.");
        } else {
            System.out.println("Phòng ban của nv này là: " + acc2.department.name);
        }

        //Q2:
        System.out.println("---------Question 2---------");

        if (acc2.groups == null) {
            System.out.println("Nhân viên này chưa có group");
        } else {
            int countGroup = acc2.groups.length;

            if (countGroup == 1 || countGroup == 2) {
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
            }

            if (countGroup == 3) {
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
            }

            if (countGroup >= 4) {
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
            }
        }

        //Q3:
        System.out.println("---------Question 3---------");

        System.out.println(
                acc2.department == null
                        ? "Nhân viên này chưa có phòng ban."
                        : "Phòng của nhân viên này là: " + acc2.department.name
        );

        //Q4:
        System.out.println("---------Question 4--------");

        System.out.println(
                acc1.position.name.toString().equals("Dev")
                        ? "Đây là Developer"
                        : "Người này không phải là Developer"
        );

        //Q5:
        System.out.println("---------Question 5---------");

        if (group1.accounts == null) {
            System.out.println("Group chưa có thành viên nào tham gia");
        } else {
            int countAccInGroup = group1.accounts.length;

            switch (countAccInGroup) {
                case 1:
                    System.out.println("Nhóm có một thành viên");
                    break;

                case 2:
                    System.out.println("Nhóm có hai thành viên");
                    break;

                case 3:
                    System.out.println("Nhóm có ba thành viên");
                    break;

                default:
                    System.out.println("Nhóm có nhiều thành viên");
                    break;
            }
        }

        //Q6:
        System.out.println(
                "---------Question 6---------"
        );

        if (acc2.groups == null) {
            System.out.println("Nhân viên này chưa có group");
        } else {
            switch (acc2.groups.length) {

                case 1:
                    System.out.println(
                            "Group của nhân viên này là Java Fresher, C# Fresher"
                    );
                    break;

                case 2:
                    System.out.println(
                            "Group của nhân viên này là Java Fresher, C# Fresher"
                    );
                    break;

                case 3:
                    System.out.println(
                            "Nhân viên này là người quan trọng, tham gia nhiều group"
                    );
                    break;

                default:
                    System.out.println(
                            "Nhân viên này là người hóng chuyện, tham gia tất cả các group"
                    );
                    break;
            }
        }

        //Q7:
        System.out.println(
                "---------Question 7---------"
        );

        String positionName = acc1.position.name.toString();

        switch (positionName) {
            case "Dev":
                System.out.println("Đây là Developer");
                break;

            default:
                System.out.println("Người này không phải là Developer");
                break;
        }

        //Q8:
        System.out.println("---------Question 8:---------");

        Account[] accArray = { acc1, acc2, acc3 };

        for (Account account : accArray) {
            System.out.println(
                    "AccountID: " + account.id
                            + " Email: " + account.email
                            + " Name: " + account.fullName
            );
        }

        //Q9:
        System.out.println("---------Question 9--------");

        Department[] depArray = { dep1, dep2, dep3 };

        for (Department department : depArray) {
            System.out.println(
                    "DepID: " + department.id
                            + " Name: " + department.name
            );
        }

        //Q10:
        System.out.println(
                "---------Question 10--------"
        );

        Account[] accArray1 = { acc1, acc2 };

        for (int i = 0; i < accArray1.length; i++) {

            System.out.println(
                    "Thông tin account thứ " + (i + 1) + " là:"
            );

            System.out.println(
                    "Email: " + accArray1[i].email
            );

            System.out.println(
                    "Full name: " + accArray1[i].fullName
            );

            System.out.println(
                    "Phòng ban: " + accArray1[i].department.name
            );
        }

        //Q11:
        System.out.println(
                "---------Question 11---------"
        );

        Department[] depArray1 = { dep1, dep2, dep3 };

        for (int i = 0; i < depArray1.length; i++) {

            System.out.println(
                    "Thông tin department thứ " + (i + 1) + " là:"
            );

            System.out.println(
                    "Id: " + depArray1[i].id
            );

            System.out.println(
                    "Name: " + depArray1[i].name
            );
        }

        //Q12:
        System.out.println(
                "---------Question 12---------"
        );

        Department[] depArray2 = { dep1, dep2, dep3 };

        for (int i = 0; i < 2; i++) {

            System.out.println(
                    "Thông tin department thứ " + (i + 1) + " là:"
            );

            System.out.println(
                    "Id: " + depArray2[i].id
            );

            System.out.println(
                    "Name: " + depArray2[i].name
            );
        }

        //Q13:
        System.out.println(
                "----------Question 13------------"
        );

        Account[] accArray2 = { acc1, acc2, acc3 };

        for (int i = 0; i < accArray2.length; i++) {

            if (i != 1) {

                System.out.println(
                        "Thông tin account thứ " + (i + 1) + " là:"
                );

                System.out.println(
                        "Email: " + accArray2[i].email
                );

                System.out.println(
                        "Full name: " + accArray2[i].fullName
                );

                System.out.println(
                        "Phòng ban: " + accArray2[i].department.name
                );
            }
        }

        //Q14:
        System.out.println(
                "----------Question 14-----------"
        );

        Account[] accArray3 = { acc1, acc2, acc3 };

        for (int j = 0; j < accArray3.length; j++) {

            if (accArray3[j].id < 4) {

                System.out.println(
                        "Thông tin account thứ " + (j + 1) + " là:"
                );

                System.out.println(
                        "Email: " + accArray3[j].email
                );

                System.out.println(
                        "Full name: " + accArray3[j].fullName
                );

                System.out.println(
                        "Phòng ban: " + accArray3[j].department.name
                );
            }
        }

        //Q15:
        System.out.println(
                "---------Question 15-----------"
        );

        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}