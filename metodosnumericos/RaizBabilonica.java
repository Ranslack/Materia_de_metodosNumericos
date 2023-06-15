package MetodosNumericos;
import static java.lang.Math.abs;
import java.util.*;
public class RaizBabilonica 
{ 
    //Variables globales
    static int valor, raiz = 0, errp = 0, count = 0;
    static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        //menu(args);
        raizprox(args);
    }//fin de main
    
    static void raizprox(String[] args){
            double i = 1, resbase = 0, valorfin = 0, h = 0, base = 0, area = 0, err = 0, resbase2 = 0, ban; //Inicializadores.
            //Aqui se hara el calculo de la aproximacion de la raiz
            System.out.println("Numeros Babilonicos");
            System.out.println();
            System.out.println("Numero a sacar raiz"); 
            Double raiz = leer.nextDouble();
            System.out.println("Porcentaje de error deseado");
            Double errp=leer.nextDouble();
            System.out.println("Cantidad de decimales a usar");
            int deci=leer.nextInt();
            
            while(resbase<=raiz){//Mientras el esultado de la base sea menor o igual a la raiz sigue iterando
                resbase=i*i; //resultado de la base
                //System.out.println(i+" x "+i+"="+resbase);
                    if(resbase<=raiz){
                        valorfin=resbase;//pasamos el valor de la base a valor final aproximado.
                        System.out.println("Valor aproximado a la raiz "+valorfin);
                        base=i;//Pasamos del iterador i a la base.
                        System.out.println("base : "+i);
                    }
                    
                   else if(resbase2<=raiz){
                        resbase2=i*i;
                        System.out.println("resbase2: "+resbase2);
                        valorfin=resbase2;
                        System.out.println("Valor fin "+valorfin);
                        base=i;
                        System.out.println("i: "+i);
                        break;
                    }//fin else if
               i++;         
            }
            while(true){  
                    count++;//contador de iteraciones
                    System.out.println("Iterador: "+count);
                    h=raiz/base; //Sacamos la altura. 
                    System.out.println("RAIZ:\t"+String.format("%."+deci+"f",h));
                    err=((abs(h)-base)/h)*100;
                    System.out.println("Error Relativo:\t"+String.format("%."+deci+"f",abs(err)));//+String.format("%.6f",abs((Double)err))
                    if(abs(err)<=errp){
                       System.out.println("Error Relativo:\t"+String.format("%."+deci+"f",abs(err)));
                      break;
                }else{
                        base=(base+h)/2;
                        //System.out.println("Base:\t"+String.format("%."+deci+"f",abs(base)));    
                }//fin else
            }//fin while
            System.out.println("La Raiz de  " +raiz+ " Es: \t"+String.format("%."+deci+"f", (Double)h));
    }//fin raiz
    
    static void menu(String[] args){
        //Todo el Menu del Programa
       String opc1;
         int exit;
            while(true){
                System.out.println("---------------------------------------------------------");
                System.out.println("Desea Continuar Con el programa. Presione un numero:");
                System.out.println("1.- Metodos Babilonicos");
                System.out.println("2.- Salir");
                System.out.println("---------------------------------------------------------");
                System.out.print("Numero del Menu: ");
                opc1=leer.next();
                switch (opc1) {
                    case "1": 
                        //Llamamos a nuestra funcion sin argumentos
                        raizprox(args);
                    break;
                    case "2" : 
                        //Salida
                        salida(args);
                         break;
                    default:
                        error(args);
                        break;
                }//fin de switch
            }//fin while(true)
   }//fin menu
    
    static void error(String[] args){
           System.out.println("|---------ERROR---------ERROR-------------|");
           System.out.println("|  !!DIGITA NUMEROS DENTRO DEL MENU!!!    |");
           System.out.println("|---ERROR-----------ERROR-----------------|");
    }
    
    static void salida(String[] args){
        System.out.println("|---------------------------------------|");
        System.out.println("|  |---    |     |       |      ------  |");
        System.out.println("|  |        |   |        |         |    |");
        System.out.println("|  |--       |-|         |         |    |");
        System.out.println("|  |        |   |        |         |    |");
        System.out.println("|  |___    |     |       |         |    |");
        System.out.println("|---------------------------------------|");
        System.exit(0);//Salida
    }
    
    
    
}//fin clase 
