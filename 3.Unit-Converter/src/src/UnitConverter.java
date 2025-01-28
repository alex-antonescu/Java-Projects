public class UnitConverter {

    public double kmToMiles(double value) {
        double rezultat = value * 0.621371;
        System.out.println("Conversie km-mile:" + value + "-" + rezultat);
        return rezultat;
    }

    public double milesToKm(double value) {
        double rezultat = value * 1.60934;
        System.out.println("Conversie mile-km:" + value + "-" + rezultat);
        return rezultat;
    }

    public double CToF(double value) {
        double rezultat = (value * 9 / 5) + 32;
        System.out.println("Conversie C-F:" + value + "-" + rezultat);
        return rezultat;
    }

    public double FToC(double value) {
        double rezultat = (value - 32) * 5 / 9;
        System.out.println("Conversie F-C:" + value + "-" + rezultat);
        return rezultat;
    }

}
