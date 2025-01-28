import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {
    List<Question> lista;

    public QuestionsBank() {
        this.lista = new ArrayList<>();
    }

    public void addQuestion(Question question){
        lista.add(question);
        System.out.println("Question added!");
    }

    public void updateQuestion(Question question){
        boolean isFound = false;
        for(var q : lista){
            if(q.equals(question)){
                isFound = true;
                lista.remove(q);
                lista.add(question);
                System.out.println("Updated!");
                break;
            }
        }
        if(!isFound){
            System.out.println("Nu s-a putut face update pentru ca intrebarea nu a fost gasita!");
        }
    }

    public void deleteQuestion(Question question){
        boolean isFound = false;
        for(var q : lista){
            if(q.equals(question)) {
                isFound = true;
                lista.remove(q);
            }
        }
        if(!isFound){
            System.out.println("Intrebarea nu a fost gasita");
        }
    }

}
