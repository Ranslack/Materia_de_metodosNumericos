package MetodosNumericos;
import java.util.Scanner;
public class RaizIterativo 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
	int op=0, decimales;
	//error relativo, se usa para demostrar si se aproxima a lo ingresado por el usuario
	double equis=0, raiz=0, num=0, aproximado=0, error;
        
	System.out.println("digite la Raiz cuadrada que desea resolver: ");
        raiz = sc.nextDouble();
        //cin>>raiz; 
	
	
	//validamos que la raiz no sea negativa
	if(raiz < 0)
        {
        System.out.println("raiz no valida");
	//cout<<"";
	return ; 
	}else{
		if(raiz>=0.1){
			double x=0.01;
			for(x=0.01;x<raiz;x++){
			double valor=x*x;
				if(valor<raiz){
		
					num=x;
		
				}
			}	
		}else{
			if(raiz>=0.01){
			double x=0.001;
			for(x=0.001;x<raiz;x++){
			double valor=x*x;
				if(valor<raiz){
		
					num=x;
				
				}
			}
			}else
			{
				if(raiz>=0.001){
				double x =0.0001;
					for(x=0.0001;x<raiz;x++){
					double valor=x*x;
						if(valor<raiz){
		
							num	=x;
						
						}	
					}
				}
			}
		}
	}
	System.out.println("ahora digite el error relativo que desea ");
	//cout<<"ahora digite el error relativo que desea ";
      	error=sc.nextDouble();
        //cin>>Error;
        System.out.println("digite la cantidad de decimales que quiere que tenga" );
	//cout<<"digite la cantidad de decimales que quiere que tenga ";
        decimales=sc.nextInt();
	//cin>>decimales;
	
	//hacemos el bucle para hacer la veces necesarias hasta que consigamos el valor necesario del error ingresado con el aproximado
	int n=1;
	for(int x = 1; x < raiz; x++)
        {
		int valor = x*x;
		if(valor < raiz)
                {
		num=x;
		}
	}
	equis = .5*(num+raiz/num);
	
	do
        {
	
	//imprimimos el numero que elevado al cuadrado es menor que la raiz
        String Fnum = String.format("%."+decimales+"f", num);
        System.out.println("-------------------------");
        System.out.println("num");
        System.out.println(Fnum);
	//cout<<fixed<<setprecision(decimales)<<num<<endl;
	//imprimimos el dato que vendria siendo de la operacion realizada del 1/2*(x+raiz/x)
        String Fequis = String.format("%."+decimales+"f", equis);
        System.out.println("-------------------------");
        System.out.println("Equis");
        System.out.println(Fequis);
        
	aproximado = (equis-num);
	aproximado = aproximado/equis;
	aproximado = aproximado*100;
	
	//aqui hacemos la comprobacion de que todo este correcto y no sea negativo
	if(aproximado < 0){
		aproximado = aproximado* -1;
	}
            String Faproximado = String.format("%."+decimales+"f", aproximado);
            System.out.println("-------------------------");
            System.out.println("Aproximado");
            System.out.println(Faproximado);
	//cout<<fixed<<setprecision(decimales)<<aproximado<<endl;
	if(aproximado>=0){
		
		if(aproximado<=error){
			op++;	
		}else{
			num=0;
			num=equis;
			equis=0;
			equis=0.5*(num+raiz/num);
                        Fnum = String.format("%."+decimales+"f", num);
                        System.out.println("-------------------------");
                        System.out.println("num");
                        System.out.println(Fnum);
			//cout<<num<<endl;
                        Fequis = String.format("%."+decimales+"f", equis);
                        System.out.println("-------------------------");
                        System.out.println("equis");
                        System.out.println(Fequis);
			
		}
	}
	else
	{
                        Fnum = String.format("%."+decimales+"f", num);
                        System.out.println("-------------------------");
                        System.out.println("num");
			System.out.println(Fnum);
                        Fequis = String.format("%."+decimales+"f", equis);
                        System.out.println("-------------------------");
                        System.out.println("Equis");
                        System.out.println(Fequis);
		//en caso de que la raiz salga negativa ponemos un error y salimos del bucle
                System.out.println("-------------------------");
                System.out.println("error");
		System.out.println("-------------------------");
                Faproximado = String.format("%."+decimales+"f", aproximado);
                System.out.println("-------------------------");
                        System.out.println("aproximado");
                System.out.println(Faproximado);
		//cout<<aproximado<<endl;
		op++;
	}
	
	}while(op==0);


return ;
}
}