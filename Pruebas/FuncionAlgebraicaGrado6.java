package metnum.procesos;

import static metnum.utilidades.FuncionesNumericas.potencia;

//TODO: documentar
public class FuncionAlgebraicaGrado6 {

    //TODO: completar clase funcion algebraica
    public boolean resolver() {

        return true;
    }

    /**
     * Resuelve la funcion f(x) dada en los parametros
     * @param xValor valor de x para la funcion
     * @param grado grado maximo de la funcion f(x)
     * @param coeficientes los coeficientes para cada x de la funcion
     *                     ejem: [0]x^2, [1]x^1, [2]x^0
     *                     donde: [0]=1, [1]=2 y [2]=1
     *                     resulta: x^2, 2x, 1
     * @return valor de la funcion f(x)
     */
    public static double resolver(double xValor, int grado, double[] coeficientes) {

        double total = 0;
        for (int i = 0; i <= grado; i++) {
            total += coeficientes[i] * potencia(xValor, i);
        }

        return total;
    }

    public static double resolverTrigonometrica(double xValor, int grado, double[] coef, String fun) {
        switch (fun) {
            case "SIN" -> {
                return Math.sin(resolver(xValor, grado, coef));
            }
            case "COS" -> {
                return Math.cos(resolver(xValor, grado, coef));
            }
            case "TAN" -> {
                return Math.tan(resolver(xValor, grado, coef));
            }
            case "CSC" -> {
                return 1 / Math.sin(resolver(xValor, grado, coef));
            }
            case "SEC" -> {
                return 1 / Math.cos(resolver(xValor, grado, coef));
            }
            case "COT" -> {
                return 1 / Math.tan(resolver(xValor, grado, coef));
            }
            default -> {
                return 0;
            }
        }
    }

    public static double[] derivar(double[] coefiecientes) {
        double[] derivada = new double[]{0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < 6; i++) {
            derivada[i] = coefiecientes[i + 1] * (i + 1);
        }
        return derivada;
    }
}
