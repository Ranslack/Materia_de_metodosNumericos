package MetodosNumericos;
import java.util.Scanner;

public class  RaizBabilonica1 
{
/*
TIENE QUE REALIZAR UN ALGORITMO PARA ENCONTRAR EL RESULTADO; 
Y ESTO SERÁ BAJO LOS SIGUIENTES PARÁMETROS:
DATOS DE ENTRADA QUE PROPORCIONA EL USUARIO: 
NUMERO AL QUE SE DEBE OBTENER LA RAÍZ, 
NUMERO DE DECIMALES A MANEJAR EN EL SISTEMA (POR REDONDEO),
PORCENTAJE DE ERROR RELATIVO QUE DESEA EL USUARIO PARA SU CALCULO.
DATOS DE SALIDA: 
RAÍZ CUADRADA CALCULADA A CADA ITERACIÓN CON EL ERROR RELATIVO PARA CADA UNA DE ELLAS.
*/
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int op=0, decimales;
	double raiz = 0, base = 0, aproximado=0, error, altura=0;
	//"e" es error relativo, se usa para demostrar si se aproxima a lo ingresado por el usuario
	System.out.println("digite la Raiz cuadrada que desea resolver ");
        raiz = sc.nextDouble();
	//validamos que la raiz no sea negativa
            if(raiz<0)
            {
            System.out.println("Raiz no valida ");
		return ; 
            }else{
		if(raiz>=0.1){
			double x = 0.01;
			for(x = 0.01; x<raiz ; x++)
                        {
			double valor = x*x;
				if(valor<raiz)
                                {
					altura = x;
				}
			}	
		}else{
			if(raiz>=0.01)
                        {
			double x = 0.001;
			for(x=0.001;x<raiz;x++)
                            {
			double valor=x*x;
				if(valor<raiz)
                                {
					altura=x;
				}
                            }
			}else
			{
				if(raiz>=0.001)
                                {
				double x = 0.0001;
					for(x=0.0001;x<raiz;x++)
                                        {
					double valor = x*x;
						if(valor<raiz)
                                                {
							altura = x;
						}	
					}
				}
			}
                    }
	}
	
	       System.out.println("ahora digite el error relativo que desea ");
               error=sc.nextDouble();
	
        System.out.println("digite la cantidad de decimales que quiere que tenga ");
	decimales=sc.nextInt();
	//hacemos el bucle para hacer la veces necesarias hasta que consigamos el valor necesario del error ingresado con el aproximado
	for(int x = 0; x < raiz; x++)
        {
		int valor = x*x;
		if(valor<raiz)
                {
		
		altura = x;
		
		}
	}
	base = raiz/altura;
	
	do{
        System.out.println("______________");
        String Fbase = String.format("%."+decimales+"f", base);
        System.out.println("La base es igual a: " + Fbase);
        //aqui calculamos la raiz en base a la multiplicacion de la altura por la base
	raiz=altura*base;
        String Fraiz = String.format("%."+decimales+"f", raiz);
        System.out.println("______________");
        System.out.println("La raiz, resultado de multiplicar base * altura es: " + Fraiz);
                //aqui hacemos el proceso para sacar el error aproximado 
	aproximado = (base-altura);
	aproximado = aproximado/altura;
	aproximado = aproximado*100;
        System.out.println("______________");
        String Faproximado = String.format("%."+decimales+"f", aproximado);
        System.out.println("Sacamos el aproximado: " + Faproximado);
        System.out.println("por medio de base - altura, el resultado lo dividimos sobre altura y lo multiplicamos por 100");
	//aqui hacemos la comprobacion de que todo este correcto y no sea negativo
	if(aproximado>=0){
		
		if(aproximado<=error){
			op++;	
		}else{
			base=(base+altura);
			base=base/2;
			altura=0;
			aproximado=0;
			altura=raiz/base;
			
		}
	}
	else
	{
		//en caso de que la raiz salga negativa ponemos un error y salimos del bucle
        System.out.println("error");	
        //cout<<"error";
		op++;
	}
	
	}while(op==0);
	
	//imprimimos, tanto la base, la altura y la raiz que ingresamos para corroborar dator
        String Faproximado = String.format("%."+decimales+"f", aproximado);
        System.out.println("______________");
        System.out.println("el error aproximado es de: "+Faproximado);
	//cout<<"el error aproximado es de: "<<fixed<<setprecision(decimales)<<aproximado<<endl;
        String Ferror = String.format("%."+decimales+"f", error);
        System.out.println("______________");
	System.out.println("el error ingresado es de: "+Ferror);
        //cout<<"el error ingresado es de: "<<fixed<<setprecision(decimales)<<Error<<endl;
        System.out.println("______________");
        String Fraiz = String.format("%."+decimales+"f", raiz);
        System.out.println(Fraiz);
	//cout<< raiz<<endl;
        System.out.println("______________");
	//cout<<"___"<<endl;
        String Faltura = String.format("%."+decimales+"f", altura);
        System.out.println("______________");
        System.out.println("Altura: " + Faltura);
        //cout<< altura<<endl;
        String Fbase = String.format("%."+decimales+"f", base);
        System.out.println(Fbase);
        //cout<< base<<endl;
	
	return ;
}
    
}