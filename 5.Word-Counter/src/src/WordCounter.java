import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class WordCounter {
    private int wordsCounter;
    private int charactersCounter;
    private int linesCounter;
    private String filePath;

    public WordCounter(String filePath) throws FileNotFoundException {
        this.filePath = filePath;
        this.wordsCounter = 0;
        this.charactersCounter = 0;
        this.linesCounter = 0;
    }

    public int linesCounter() throws FileNotFoundException {
        var scannerLines = new Scanner(new FileInputStream(filePath));

        while(scannerLines.hasNext()){
            linesCounter++;
            scannerLines.nextLine();
        }
        System.out.println("Nr. de linii: " + linesCounter);
        scannerLines.close();
        return linesCounter;
    }

    public int wordsCounter() throws FileNotFoundException {
        var scannerWords = new Scanner(new FileInputStream(filePath));

        while(scannerWords.hasNext()){
            String line = scannerWords.nextLine();
            String[] words = line.split(" ");
            wordsCounter += words.length;
        }
        System.out.println("Nr. de cuvinte: " + wordsCounter);
        scannerWords.close();
        return wordsCounter;
    }

    public int charactersCount() throws FileNotFoundException {
        var scannerCharacters = new Scanner(new FileInputStream(filePath));
        while(scannerCharacters.hasNext()){
            charactersCounter += (int)scannerCharacters.nextLine()
                    .chars()
                    .filter(c -> !Character.isWhitespace(c))
                    .count();
        }
        System.out.println("Nr de carcatere este: " + charactersCounter);
        return charactersCounter;
    }
}