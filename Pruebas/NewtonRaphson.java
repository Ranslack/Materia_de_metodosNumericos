package metnum.procesos;

import metnum.utilidades.FuncionesNumericas;
import metnum.utilidades.GUI;
import metnum.utilidades.algebraicas.Iteracion;

public class NewtonRaphson {
    
    public static boolean resolver(double x0, int grado, double[] coef, double errorPer, int decim) {

        //limpiamos las iteraciones
        Iteracion.limpiarIteraciones();

        //---- Validacion: Si el valor dado es solucion ----
        {
            //obtener valores de funcion para ambos intervalos
            double t0 = FuncionAlgebraicaGrado6.resolver(x0, grado, coef);

            //si f(x0) = 0 entonces es solucion
            if (t0 == 0) {
                Iteracion it = new Iteracion(1, x0, 0);
                Iteracion.iteraciones.add(it);
                return true;
            }
        }

        //prepare variables
        double Xi, Xj, errorR;
        Xj = x0;
        int i = 1;

        do {

            if (i >= Iteracion.MAX_ITERACIONES) {
                GUI.PopUps.showSinSolucionWarning(null);
                break;
            }

            //actualizar variable
            Xi = Xj;

            //calcular funcion y derivada
            double y = FuncionAlgebraicaGrado6.resolver(Xi, grado, coef);
            double[] derivada = FuncionAlgebraicaGrado6.derivar(coef);
            double dy = FuncionAlgebraicaGrado6.resolver(Xi, grado, derivada);
            y = FuncionesNumericas.redondearDouble(y, decim);
            dy = FuncionesNumericas.redondearDouble(dy, decim);

            //ejecutar formula iterativa
            Xj = Xi - (y / dy);
            Xj = FuncionesNumericas.redondearDouble(Xj, decim);
            errorR = FuncionesNumericas.errorRelativo(Xj, Xi);

            //agregar iteraciones
            Iteracion it = new Iteracion(i, Xj, errorR);
            Iteracion.iteraciones.add(it);
            i++;

        } while (errorR > errorPer);

        return true;
    }
}
