public class Nota {
    int tarea1;
    int tarea2;
    int tarea3;
    int tarea4;
    int medioCurso;
    int finCurso;

    public Nota(int t1, int t2, int t3, int t4, int mc, int fc) {
        establecerTarea1(t1);
        establecerTarea2(t2);
        establecerTarea3(t3);
        establecerTarea4(t4);
        establecerMedioCurso(mc);
        establecerFinCurso(fc);

    }

    public int optenerTarea1() {

        return tarea1;
    }

    public void establecerTarea1(int t1) {

        tarea1 = t1;

    }

    public int optenerTarea2() {

        return tarea2;
    }

    public void establecerTarea2(int t2) {

        tarea2 = t2;

    }

    public int optenerTarea3() {

        return tarea3;
    }

    public void establecerTarea3(int t3) {

        tarea3 = t3;

    }

    public int optenerTarea4() {

        return tarea4;
    }

    public void establecerTarea4(int t4) {

        tarea4 = t4;

    }

    public int optenerMedioCurso() {

        return medioCurso;
    }

    public void establecerMedioCurso(int mc) {

        medioCurso = mc;
    }

    public int optenerFinCurso() {

        return finCurso;
    }

    public void establecerFinCurso(int fc) {

        finCurso = fc;
    }

    double promedioTareas() {

        double promedioTareas;
        promedioTareas = (optenerTarea1() + optenerTarea2() + optenerTarea3() + optenerTarea4()) / 4;

        return promedioTareas;

    }

    double notaFinal() {
        double notaFinal;

        notaFinal = (promedioTareas() + optenerMedioCurso() + optenerFinCurso()) / 3;

        return notaFinal;
    }

}
