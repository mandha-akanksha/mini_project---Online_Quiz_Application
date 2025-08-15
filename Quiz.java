package Task8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;// list to store all quiz questions
    private int score;   // stores users score
    
    public Quiz(){
        questions = new ArrayList<>();
        score = 0;
    }
    // method to add questions into the quiz
    public void addQuestion(Question question) {
        questions.add(question);
    }

    // method to start the quiz
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------Quiz-------\n");

        // Loop for each question
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);

            //for printing question
            System.out.println("Q" + (i + 1) + ": " + q.getQuestionText());

            // for printing options
            for (int j = 0; j < q.getOptions().size(); j++) {
                System.out.println((j + 1) + ". " + q.getOptions().get(j));
            }
            // for accept answer
            System.out.print("Choose your answer from above options : ");
            int answer = scanner.nextInt();

            // Checking is it correct answer or not
            if (answer == q.getCorrectOption()) {
                System.out.println("Correct\n");
                score++;
            } else {
                System.out.println("Wrong! Correct answer is: " + q.getOptions().get(q.getCorrectOption() - 1) + "\n");
            }
        }

        //for showing result
        System.out.println("-----Quiz Completed------");
        System.out.println("Your Score: " + score + " out of " + questions.size());
    }

    
}
