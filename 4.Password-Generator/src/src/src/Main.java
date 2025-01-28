public class Main {
    public static void main(String[] args) {
        PasswordGenerator generator = new PasswordGenerator(100,true,true,false);
        System.out.println(generator.generatePassword());
    }
}
