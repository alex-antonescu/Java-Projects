public class Calculator {

    public double Addition(double a,double b){
        double rez = a + b;
        System.out.println("Suma: " + a + ", " + b + "este: " + rez);
        return a + b;
    }



    public double Substraction(double a, double b){
        double rez = a - b;
        System.out.println("Diferenta: " + a + ", " + b + " este: " + rez);
        return a - b;
    }

    public double Multiplication(double a, double b){
        double rez = a * b;
        System.out.println("Inmultirea: " + a + ", " + b + " este: " + rez);
        return a * b;
    }

    public double Division(double a, double b){
        double rez = 0;
        try {
            rez = a/b;
            System.out.println("Impartirea: " + a + ", " + b +" este: "+ rez);

        }catch (IllegalArgumentException e){
            System.out.println("Nu poti efectua impartirea cu zero!");
        }
        return rez;
    }
}
