import javax.sound.midi.Soundbank;
import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        //Department
        Department department1 = new Department();
        department1.departmentID = 1;
        department1.departmentName = "Sale";

        Department department2 = new Department();
        department2.departmentID = 2;
        department2.departmentName = "Marketing";

        Department department3 = new Department();
        department3.departmentID = 3;
        department3.departmentName = "Ke Toan";

        //Position
        Position position1 = new Position();
        position1.positionID = 1;
        position1.positionName = Position.PositionName.PM;

        Position position2 = new Position();
        position2.positionID = 2;
        position2.positionName = Position.PositionName.DEV;

        Position position3 = new Position();
        position3.positionID = 3;
        position3.positionName = Position.PositionName.SCRUM_MASTER;

        //Account
        Account account1 = new Account();
        account1.accountID = 1;
        account1.email = "abc123@gmail.com";
        account1.username = "mot";
        account1.fullName = "Nguyễn Văn Một";
        account1.department.departmentID = 1;
        account1.position.positionID = 1;
        account1.createDate = LocalDate.of(2026,8,10);

        Account account2 = new Account();
        account2.accountID = 2;
        account2.email = "abc456@gmail.com";
        account2.username = "hai";
        account2.fullName = "Nguyễn Văn Hai";
        account2.department.departmentID = 2;
        account2.position.positionID = 2;
        account2.createDate = LocalDate.of(2025,8,10);

        Account account3 = new Account();
        account3.accountID = 3;
        account3.email = "abc789@gmail.com";
        account3.username = "ba";
        account3.fullName = "Nguyễn Văn Ba";
        account3.department.departmentID = 3;
        account3.position.positionID = 3;
        account3.createDate = LocalDate.of(2024,8,10);

        //Group
        Group group1 = new Group();
        group1.groupID = 1;
        group1.groupName = "Nhóm Sale";
        group1.creatorID = 1;
        group1.createDate = LocalDate.of(2025,7,10);

        Group group2 = new Group();
        group2.groupID = 2;
        group2.groupName = "Nhóm Marketing";
        group2.creatorID = 2;
        group2.createDate = LocalDate.of(2025,8,10);

        Group group3 = new Group();
        group3.groupID = 3;
        group3.groupName = "Nhóm học";
        group3.creatorID = 3;
        group3.createDate = LocalDate.of(2024,7,10);

        //GroupAccount
        GroupAccount groupAccount1 = new GroupAccount();
        groupAccount1.group.groupID = 1;
        groupAccount1.account.accountID = 1;
        groupAccount1.joinDate = LocalDate.of(2026,9,11);

        GroupAccount groupAccount2 = new GroupAccount();
        groupAccount2.group.groupID = 2;
        groupAccount2.account.accountID = 2;
        groupAccount2.joinDate = LocalDate.of(2023,9,11);

        GroupAccount groupAccount3 = new GroupAccount();
        groupAccount3.group.groupID = 3;
        groupAccount3.account.accountID = 3;
        groupAccount3.joinDate = LocalDate.of(2021,9,11);

        //TypeQuestion
        TypeQuestion typeQuestion1 = new TypeQuestion();
        typeQuestion1.typeID = 1;
        typeQuestion1.typeName = TypeQuestion.TypeName.ESSAY;

        TypeQuestion typeQuestion2 = new TypeQuestion();
        typeQuestion2.typeID = 2;
        typeQuestion2.typeName = TypeQuestion.TypeName.MULTIPLE_CHOICE;

        TypeQuestion typeQuestion3 = new TypeQuestion();
        typeQuestion3.typeID = 3;
        typeQuestion3.typeName = TypeQuestion.TypeName.ESSAY;

        //CategoryQuestion
        CategoryQuestion categoryQuestion1 = new CategoryQuestion();
        categoryQuestion1.categoryID = 1;
        categoryQuestion1.categoryName = CategoryQuestion.CategoryName.JAVA;

        CategoryQuestion categoryQuestion2 = new CategoryQuestion();
        categoryQuestion2.categoryID = 2;
        categoryQuestion2.categoryName = CategoryQuestion.CategoryName.NET;

        CategoryQuestion categoryQuestion3 = new CategoryQuestion();
        categoryQuestion3.categoryID = 3;
        categoryQuestion3.categoryName = CategoryQuestion.CategoryName.SQL;

        //Question
        Question question1 = new Question();
        question1.questionID = 1;
        question1.content = "What?";
        question1.categoryQuestion.categoryID = 1;
        question1.typeQuestion.typeID = 1;
        question1.creatorID = 1;
        question1.createDate = LocalDate.of(2021,5,5);

        Question question2 = new Question();
        question2.questionID = 2;
        question2.content = "How?";
        question2.categoryQuestion.categoryID = 2;
        question2.typeQuestion.typeID = 2;
        question2.creatorID = 2;
        question2.createDate = LocalDate.of(2021,7,7);

        Question question3 = new Question();
        question3.questionID = 3;
        question3.content = "Where?";
        question3.categoryQuestion.categoryID = 3;
        question3.typeQuestion.typeID = 3;
        question3.creatorID = 3;
        question3.createDate = LocalDate.of(2020,5,5);

        //Answer
        Answer answer1 = new Answer();
        answer1.answerID = 1;
        answer1.content = "You and me";
        answer1.question.questionID = 1;
        answer1.isCorrect = false;

        Answer answer2 = new Answer();
        answer2.answerID = 2;
        answer2.content = "Nice";
        answer2.question.questionID = 2;
        answer2.isCorrect = true;

        Answer answer3 = new Answer();
        answer3.answerID = 3;
        answer3.content = "Very good";
        answer3.question.questionID = 3;
        answer3.isCorrect = false;

        //Exam
        Exam exam1 = new Exam();
        exam1.examID = 1;
        exam1.code = 101;
        exam1.title = "Chào các bạn";
        exam1.categoryQuestion.categoryID = 1;
        exam1.duration = LocalDate.of(2020,10,7);
        exam1.creatorID = 1;
        exam1.createDate = LocalDate.of(2025,10,5);

        Exam exam2 = new Exam();
        exam2.examID = 2;
        exam2.code = 102;
        exam2.title = "Chào các bạn yêu nhé";
        exam2.categoryQuestion.categoryID = 2;
        exam2.duration = LocalDate.of(2021,10,7);
        exam2.creatorID = 2;
        exam2.createDate = LocalDate.of(2024,10,5);

        Exam exam3 = new Exam();
        exam3.examID = 3;
        exam3.code = 103;
        exam3.title = "Chào các bạn của tôi";
        exam3.categoryQuestion.categoryID = 3;
        exam3.duration = LocalDate.of(2028,10,7);
        exam3.creatorID = 3;
        exam3.createDate = LocalDate.of(2023,10,5);

        //ExamQuestion
        ExamQuestion examQuestion1 = new ExamQuestion();
        examQuestion1.exam.examID = 1;
        examQuestion1.question.questionID = 1;

        ExamQuestion examQuestion2 = new ExamQuestion();
        examQuestion2.exam.examID = 2;
        examQuestion2.question.questionID = 2;

        ExamQuestion examQuestion3 = new ExamQuestion();
        examQuestion3.exam.examID = 3;
        examQuestion3.question.questionID = 3;

        //========= In ra ==========
        System.out.println("DepamentID: " +department1.departmentID);
        System.out.println("DepamentName: " +department1.departmentName);
        System.out.println();
        System.out.println("=============================");

        System.out.println("PositionID: " + position1.positionID);
        System.out.println("PositionName: " + position1.positionName);
        System.out.println();
        System.out.println("=============================");

        System.out.println("AccountID: " + account1.accountID);
        System.out.println("Username: " + account1.username);
        System.out.println("Email: " + account1.email);
        System.out.println("FullName: " + account1.fullName);
        System.out.println("DepartmentID: " + account1.department.departmentID);
        System.out.println("PositionID: " + account1.position.positionID);
        System.out.println("CreateDate: " + account1.createDate);System.out.println();
        System.out.println("=============================");

        System.out.println("GroupID: " + group1.groupID);
        System.out.println("GroupName: " + group1.groupName);
        System.out.println("CreatorID: " + group1.creatorID);
        System.out.println("CreateDate: " + group1.createDate);
        System.out.println();
        System.out.println("=============================");

        System.out.println("GroupID: " + groupAccount1.group.groupID);
        System.out.println("AccountID: " + groupAccount1.account.accountID);
        System.out.println("JoinDate: " + groupAccount1.joinDate);
        System.out.println();
        System.out.println("=============================");

        System.out.println("TypeID: " + typeQuestion1.typeID);
        System.out.println("TypeName: " + typeQuestion1.typeName);
        System.out.println();
        System.out.println("=============================");

        System.out.println("CategoryID: " + categoryQuestion1.categoryID);
        System.out.println("CategoryName: " + categoryQuestion1.categoryName);
        System.out.println();
        System.out.println("=============================");

        System.out.println("QuestionID: " + question1.questionID);
        System.out.println("Content: " + question1.content);
        System.out.println("CategoryID: " + question1.categoryQuestion.categoryID);
        System.out.println("TypeID: " + question1.typeQuestion.typeID);
        System.out.println("CreatorID: " + question1.creatorID);
        System.out.println("CreateDate: " + question1.createDate);
        System.out.println();
        System.out.println("=============================");

        System.out.println("AnswerID: " + answer1.answerID);
        System.out.println("Content: " + answer1.content);
        System.out.println("QuestionID: " + answer1.question.questionID);
        System.out.println("isCorrect: " + answer1.isCorrect);
        System.out.println();
        System.out.println("=============================");

        System.out.println("ExamID: " + exam1.examID);
        System.out.println("Code: " + exam1.code);
        System.out.println("Title: " + exam1.title);
        System.out.println("CategoryID: " + exam1.categoryQuestion.categoryID);
        System.out.println("Duration: " + exam1.duration);
        System.out.println("CreatorID: " + exam1.creatorID);
        System.out.println("CreateDate: " + exam1.createDate);
        System.out.println();
        System.out.println("=============================");

        System.out.println("ExamID: " + examQuestion1.exam.examID);
        System.out.println("QuestionID: " + examQuestion1.question.questionID);
    }
}
