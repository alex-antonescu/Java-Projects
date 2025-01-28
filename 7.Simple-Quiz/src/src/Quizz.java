import java.util.Random;
import java.util.Scanner;

public class Quizz {
    private QuestionsBank questions;
    private int intrebariCorecte;
    private int intrebariTotale;

    public Quizz(QuestionsBank questions) {
        this.questions = questions;
    }

    public void pick(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        var generated = random.nextInt(0,questions.lista.size());
        var question = questions.lista.get(generated);
        System.out.println(question);
        System.out.println("Care este raspunsul corect? -- introdu litera");
        char raspuns = scanner.next().charAt(0);
        if(question.getVcorecta().equals(raspuns)){
            intrebariCorecte++;
        }
        intrebariTotale++;
    }

    public void endQuizz(){
        System.out.println("Quizz incheiat!");
        System.out.println("Statistici: " + intrebariCorecte + "/" + intrebariTotale);
    }
}
