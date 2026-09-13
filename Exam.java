import java.time.LocalDate;

public class Exam {
    int examID;
    double code;
    String title;
    CategoryQuestion categoryQuestion;
    LocalDate duration;
    int creatorID;
    LocalDate createDate;

    public Exam() {
        categoryQuestion = new CategoryQuestion();
    }
}
