package metnum.utilidades.algebraicas;

import java.util.LinkedList;

/**
 * Un objeto de esta clase contiene datos tales como num. de iteracion, aproximacion y error relativo de iteracion
 * acorde a una iteracion n de una solucion de metodos numericos
 */
public class Iteracion {

    /**
     * Crea una iteracion vacia
     */
    public Iteracion() {
        numIteracion = 0;
        aproximacion = 0;
        errorRelativo = 0;
    }

    /**
     * Crea una iteracion con los valores dados
     * @param numIteracion numero de iteracion
     * @param aproximacion aproximacion o valor de la iteracion
     * @param errorRelativo error relativo de la iteracion
     */
    public Iteracion(int numIteracion, double aproximacion, double errorRelativo) {
        this.numIteracion = numIteracion;
        this.aproximacion = aproximacion;
        this.errorRelativo = errorRelativo;
    }

    public int getNumIteracion() {
        return numIteracion;
    }

    public void setNumIteracion(int numIteracion) {
        this.numIteracion = numIteracion;
    }

    public double getAproximacion() {
        return aproximacion;
    }

    public void setAproximacion(double aproximacion) {
        this.aproximacion = aproximacion;
    }

    public double getErrorRelativo() {
        return errorRelativo;
    }

    public void setErrorRelativo(double errorRelativo) {
        this.errorRelativo = errorRelativo;
    }

    public static void limpiarIteraciones() { iteraciones = new LinkedList<Iteracion>(); }

    /**
     * Convierte cada valor de la iteracion a String y los retorna en forma de array.
     * @return un String array de los valores de iteracion del objeto
     */
    public String[] toStringArray() {
        return new String[]{String.valueOf(numIteracion), String.valueOf(aproximacion), String.valueOf(errorRelativo)};
    }

    private int numIteracion;
    private double aproximacion;
    private double errorRelativo;

    public static final int MAX_ITERACIONES = 1000;

    public static LinkedList<Iteracion> iteraciones;
}

