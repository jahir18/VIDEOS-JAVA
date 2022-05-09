public class Main {
    public static void main(String[] args) {

        Interes interes = new Interes(2000000, 1.5, 3);

        System.out.println(interes.optenerValorPresente());
        System.out.println(interes.optenerInteresPeriodico());
        System.out.println(interes.optenerTienpoInversion());

        System.out.println("iInteres Compuesto = " + interes.interes());

    }

}
