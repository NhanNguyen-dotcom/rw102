public class Answer {
    int answerID;
    String content;
    Question question;
    boolean isCorrect;

    public Answer() {
        question = new Question();
    }
}
