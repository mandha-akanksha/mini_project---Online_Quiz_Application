package Task8;

import java.util.List;

public class Question {
    private String questionText; // for storing the question
    private List<String> options; // for storing the multiple choice options
    private int correctOption; //for storing correct answer index

    public Question(String questionText,List<String> options,int correctOption ){
        this.questionText = questionText;
        this.options = options;
        this.correctOption=correctOption;
    }

    public String getQuestionText(){
        return questionText;
    }

    public List<String> getOptions() {
        return options;
    }

     public int getCorrectOption() {
        return correctOption;
    }
}
