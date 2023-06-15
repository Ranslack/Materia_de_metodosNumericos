package metnum.utilidades;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class FuncionesNumericas {

    /**
     * Calcula el valor absoluto de la diferencia de 2 numeros
     * @param valor1 valor 1
     * @param valor2 valor 2
     * @return el valor absouluto de la deferencia entre ambos numeros
     */
    public static double absoluto(double valor1, double valor2) { return (valor1 > valor2) ? valor1 - valor2 : valor2 - valor1; }

    public static double potencia(double base, int exp) {

        if (exp == 0)
            return 1;

        double result = base;

        for (int i = 1; i < exp; i++)
            result *= base;

        return  result;
    }

    //Recibe numero decimal y devuelve otro solo con la cantidad de decimales indicada
    public static double limitarDecimales(double num, int decim) {

        //transformar a string
        String numStr = String.valueOf(num);

        //contar numeros antes del punto decimal
        int i = 0;
        while (numStr.charAt(i) != '.')
            i++;

        //recortar desde los enteros hasta los decimales indicados
        numStr = numStr.substring(0, decim+i);

        //redondear

        return Double.parseDouble(numStr);
    }

    /**
     * Redondea los decimales indicados de un numero double
     * @param num numero double a redondear
     * @param decim cantidad de decimales
     * @return numero double redondeado a los decimales indicados
     */
    public static double redondearDouble(double num, int decim) {

        //contruir formato a partir de la cantidad de decimales recibida en el parametro
        String format = "#." + "0".repeat(Math.max(0, decim));

        //obtener formato final
        DecimalFormat df = new DecimalFormat(format);
        df.setRoundingMode(RoundingMode.UP);

        //retornar formato como double
        return Double.parseDouble(df.format(num));
    }

    /**
     * Calcula el error relativo entre los valores dados
     * @param valorActual el valor actual
     * @param valorAnterior el valor anterior
     * @return el error relativo entre los valores
     */
    public static double errorRelativo(double valorActual, double valorAnterior) {
        double valAct = Math.abs(valorActual);
        double valAnt = Math.abs(valorAnterior);
        double dividendo = Math.abs(valAct - valAnt);
        return (dividendo / valAct) * 100;
    }
}
