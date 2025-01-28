import java.util.Random;

public class PasswordGenerator {
    private StringBuilder string;
    private int length;
    private boolean hasSpecialCharacters;
    private boolean hasUpperCase;
    private boolean hasNumbers;
    private char[] lowercase = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private char[] uppercase = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private char[] punctuationAndSymbols = {
            '!', '"', '#', '$', '%', '&', '(', ')', '*', '+', ',', '-', '.', '/',
            ':', ';', '<', '=', '>', '?', '@', '[', ']', '^', '_', '`', '{', '|', '}', '~',
            '"', '‘', '’', '“', '”', '¿', '¡', '°', '©', '®', '™', '¶', '•', '×', '÷', '→', '←',
            '↑', '↓', '±', '∞', '§', '♠', '♥', '♦', '♣', '♪', '♫', '✓', '✔', '✖', '✿', '★', '☆', '♪',
            '¤', '₹', '€', '£', '¥', '₣', '₤', '₱', '₴', '₳', '₽', '₣', '₯', '₪', '₭', '₮', '₱', '€'
    };

    public PasswordGenerator(int length, boolean hasUpperCase, boolean hasNumbers, boolean hasSpecialCharacters) {
        this.string = new StringBuilder();
        this.length = length;
        this.hasSpecialCharacters = hasSpecialCharacters;
        this.hasUpperCase = hasUpperCase;
        this.hasNumbers = hasNumbers;
    }

    public String generatePassword() {
        while (string.length() < length) {
            string.append(randomPicker());
        }
        return string.toString();
    }

    public char randomPicker() {
        char generated = 0;

        Random random = new Random();
        int level1Size = lowercase.length - 1;
        int level2Size = level1Size + uppercase.length - 1;
        int level3Size = level2Size + numbers.length - 1;
        int level4Size = level3Size + punctuationAndSymbols.length - 1;

        if (!hasUpperCase && !hasNumbers && !hasSpecialCharacters) {
            int value = random.nextInt(0, level1Size);
            generated = lowercase[value];
        } else if (hasUpperCase && !hasNumbers && !hasSpecialCharacters) {
            int value = random.nextInt(0, level2Size);
            if (value <= level1Size)
                generated = lowercase[value];
            else {
                generated = uppercase[value - level1Size];
            }
        } else if (hasUpperCase && hasNumbers && !hasSpecialCharacters) {
            int value = random.nextInt(0, level3Size);
            if (value <= level1Size)
                generated = lowercase[value];
            else if (value <= level2Size) {
                generated = uppercase[value - level1Size];
            } else generated = numbers[value - level2Size];
        } else {
            int value = random.nextInt(0, level4Size);
            if (value <= level1Size)
                generated = lowercase[value];
            else if (value <= level2Size) {
                generated = uppercase[value - level1Size];
            } else if(value <=level3Size)
                generated = numbers[value - level2Size];
            else {
                generated = punctuationAndSymbols[value-level3Size];
            }
        }
        return generated;
    }
}
