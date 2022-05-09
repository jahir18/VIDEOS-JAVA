public class Main {
    public static void main(String[] args) {

        Interes interes = new Interes(2000000, 1.5, 3);

        System.out.println(interes.optenerValorPresente());
        System.out.println(interes.optenerInteresPeriodico());
        System.out.println(interes.optenerTienpoInversion());

        System.out.println("iInteres Compuesto = " + interes.interes());

        Nota nota = new Nota(12, 12, 14, 16, 13, 16);

        System.out.println("Tare1" + nota.optenerTarea1());
        System.out.println("Tarea2" + nota.optenerTarea2());
        System.out.println("Tarea3" + nota.optenerTarea3());
        System.out.println("Tarea4" + nota.optenerTarea4());
        System.out.println("Examen medio curso" + nota.optenerMedioCurso());
        System.out.println("Examen fin de curso" + nota.optenerFinCurso());

        System.out.println("Nota final = " + nota.notaFinal());

    }
}
