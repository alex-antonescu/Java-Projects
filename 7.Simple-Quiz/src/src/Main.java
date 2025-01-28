import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Generarea intrebarilor
        Question q1 = new Question("Capitala RO?", "Bucuresti", "Timisoara", "Iasi", 'a');
        Question q2 = new Question("Capitala HR?", "Zagreb", "Yakutsk", "Porto", 'a');
        Question q3 = new Question("Capitala P?", "Guimaraes", "Porto", "Lisbon", 'c');
        QuestionsBank bank = new QuestionsBank();
        bank.addQuestion(q1);
        bank.addQuestion(q2);
        bank.addQuestion(q3);

        Quizz quizz = new Quizz(bank);

        boolean isRunning = true;
        System.out.println("Let the game begin!");
        Scanner scanner = new Scanner(System.in);
        while (isRunning) {
            System.out.println("1.Show question");
            System.out.println("2.End game");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> quizz.pick();
                case 2 -> {
                    quizz.endQuizz();
                    isRunning = false;
                }
                default -> System.out.println("Not a valid option!");
            }
        }
    }


}
