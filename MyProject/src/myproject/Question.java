package myproject;
public class Question {
    private int questionId;
    private int questionNumber;
    private String questionHeader;
    private String  questionAnswer;
    private int correctAnswer ;
    private int questionmark;
    public Question(int questionId, int questionNumber, String questionHeader, String questionAnswers, int questionmark) {
       this.questionId = questionId;
        this.questionNumber = questionNumber;
        this.questionHeader = questionHeader;
        this.questionAnswer = questionAnswers;
        this.questionmark = questionmark; 
    }
    public Question(int questionId, int questionNumber, String questionHeader, String questionAnswers, int correctAnswers, int questionmark) {
        this.questionId = questionId;
        this.questionNumber = questionNumber;
        this.questionHeader = questionHeader;
        this.questionAnswer = questionAnswers;
        this.correctAnswer = correctAnswers;
        this.questionmark = questionmark;
    }
    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getQuestionHeader() {
        return questionHeader;
    }

    public void setQuestionHeader(String questionHeader) {
        this.questionHeader = questionHeader;
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getQuestionmark() {
        return questionmark;
    }

    public void setQuestionmark(int questionmark) {
        this.questionmark = questionmark;
    }
    
  
    @Override
    public String toString() {
        return "Question{" + "questionId=" + questionId + ", questionNumber=" + questionNumber + ", questionHeader=" + questionHeader + ", questionAnswers=" + questionAnswer + ", correctAnswers=" + correctAnswer + ", questionmark=" + questionmark + '}';
    }
}
