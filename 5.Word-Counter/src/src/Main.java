import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        WordCounter counter = new WordCounter("input.txt");
        counter.linesCounter();
        counter.wordsCounter();
        counter.charactersCount();
    }
}
