import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UnitConverter u1 = new UnitConverter();
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Meniu");
            System.out.println("1: km -> mile");
            System.out.println("2: mile -> km");
            System.out.println("3: C -> F");
            System.out.println("4: F -> C");
            System.out.println("5: Exit...");

            Scanner scanner = new Scanner(System.in);
            int optiune = scanner.nextInt();
            switch (optiune){
                case 1 -> {
                    System.out.println("Valoare?");
                    double valoare = scanner.nextDouble();
                    u1.kmToMiles(valoare);
                }
                case 2 -> {
                    System.out.println("Valoare?");
                    double valoare = scanner.nextDouble();
                    u1.milesToKm(valoare);
                }
                case 3 -> {
                    System.out.println("Valoare?");
                    double valoare = scanner.nextDouble();
                    u1.CToF(valoare);
                }
                case 4 -> {
                    System.out.println("Valoare?");
                    double valoare = scanner.nextDouble();
                    u1.FToC(valoare);
                }

                case 5 -> {
                    System.out.println("Exit...");
                    isRunning = false;
                }
                default -> System.out.println("Optiunea nu este valida!");
            }
        }
    }
}
