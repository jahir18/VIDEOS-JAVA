public class Interes {
    int valorPresente;// valor presente
    double interesPeriodico;// interes periodico
    int tiempoInversion;// tiempo de inversion

    public Interes(int vp, double ip, int n) {

        establecerValorPresente(vp);
        establecerInteresPeriodico(ip);
        establecerTiempoInversion(n);
    }

    public int optenerValorPresente() {

        return valorPresente;
    }

    public void establecerValorPresente(int vp) {

        valorPresente = vp;
    }

    public double optenerInteresPeriodico() {

        return interesPeriodico;
    }

    public void establecerInteresPeriodico(double ip) {

        interesPeriodico = ip;
    }

    public int optenerTienpoInversion() {

        return tiempoInversion;
    }

    public void establecerTiempoInversion(int n) {

        tiempoInversion = n;
    }

    double interes() {
        double interes;
        int N = optenerTienpoInversion() * 12;

        interes = optenerValorPresente() * ((Math.pow((optenerInteresPeriodico() * 0.01) + 1, N)) - 1);

        return interes;
    }

}
