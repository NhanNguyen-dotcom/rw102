import java.time.LocalDate;

public class Question {
    int questionID;
    String content;
    CategoryQuestion categoryQuestion;
    TypeQuestion typeQuestion;
    int creatorID;
    LocalDate createDate;

    public Question() {
        categoryQuestion = new CategoryQuestion();
        typeQuestion = new TypeQuestion();
    }
}
