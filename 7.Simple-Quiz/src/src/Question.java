import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class Question {
    private String question;
    private Map<Character,String> optiuni;
    private Character vcorecta;

    public Question(String question,String v1,String v2, String v3, Character vcorecta) {
        this.question = question;
        this.optiuni = new HashMap<>();
        this.optiuni.put('a', v1);
        this.optiuni.put('b', v2);
        this.optiuni.put('c', v3);
        this.vcorecta = vcorecta;
    }

    public Character getVcorecta() {
        return vcorecta;
    }

    @Override
    public String toString() {
        return "Question: " + question + "\n" +
                "a: " + optiuni.get('a') + "\n" +
                "b: " + optiuni.get('b') + "\n" +
                "c: " + optiuni.get('c');
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question question1)) return false;

        return question.equalsIgnoreCase(question1.question);
    }

    @Override
    public int hashCode() {
        return question.hashCode();
    }
}
