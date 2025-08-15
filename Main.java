package Task8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
       //creating a quiz object
        Quiz quiz = new Quiz();

        //adding questions to the quiz
        quiz.addQuestion(new Question(
                "Which of the following is used to determine the length of an array in Java?",
                Arrays.asList("arr.length();", "arr.size;", "arr.length;", "arr.count();"),
                3
        ));
        quiz.addQuestion(new Question(
                "Which company developed Java?",
                Arrays.asList("Microsoft", "Sun Microsystems", "Google", "Oracle"),
                2
        ));
        quiz.addQuestion(new Question(
                "Which keyword is used to inherit a class in Java?",
                Arrays.asList("this", "super", "extends", "implements"),
                3
        ));
        quiz.addQuestion(new Question(
                "What happens if you do not define a constructor in a Java class?",
                Arrays.asList("The program will not compile.", "The class cannot be instantiated.", "The constructor from another class will be used.", "The compiler provides a default constructor."),
                4
        ));

        // to start the quiz
        quiz.start();
    }
}
