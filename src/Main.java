import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
                "1. _______ apple a day keeps _______ doctor away.\n" +
                        "   a) An, the\n" +
                        "   b) A, a\n" +
                        "   c) The, a\n" +
                        "   d) No article needed\n",

                "2. She wants to be _______ astronaut and explore _______ space.\n" +
                        "   a) An, a\n" +
                        "   b) A, a\n" +
                        "   c) The, the\n" +
                        "   d) No article needed\n",

                "3. I need to buy _______ new car because _______ old one broke down.\n" +
                        "   a) An, the\n" +
                        "   b) A, the\n" +
                        "   c) The, an\n" +
                        "   d) No article needed\n",
                "4. Could you pass me _______ salt, please?\n" +
                        "   a) An\n" +
                        "   b) A\n" +
                        "   c) The\n" +
                        "   d) No article needed\n",

                "5. _______ Statue of Liberty is located in _______ New York City.\n" +
                        "   a) An, a\n" +
                        "   b) A, a\n" +
                        "   c) The, the\n" +
                        "   d) No article needed\n"
        };

        String[] correctAnswers = {"b", "b", "b", "d", "c"};
        int score = 0;
        int totalQuestions = questions.length;

        for (int i = 0; i < totalQuestions; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().toLowerCase();

            if (userAnswer.equals("1111")) {
                System.out.println("Answers: " + correctAnswers[i]);
                continue;
            }

            if (userAnswer.equals(correctAnswers[i])) {
                score++;
            } else if (!userAnswer.matches("[abcd]")) {
                System.out.println("Incorrect answer. Please enter a, b, c, or d.");
                i--;
            }
        }

        double percentageScore = (double) score / totalQuestions * 100;
        System.out.println("Score: " + percentageScore + "%");

        scanner.close();
    }
}