package MetodosNumericos;

import java.util.Scanner;

/*
 * @author yetzr
 */
public class NewClass {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    String a = "12.232";
    //a = "wert";
    a = leer.nextLine();
    int n;
    for(n = 0 ; n < a.length() ; n++)
    {
        if(Character.isDigit(a.charAt(n)) || a.charAt(n) == '.')
        {
            System.out.println("valido");
            //System.exit(0);//Salida
        }   
        else
        {
            System.out.println("invalido");
            System.exit(0);//Salida
        }
        
    }
    double e = Double.parseDouble(a);
    //double e = Integer.parseInt(a);
    System.out.print(e);
    
    }
}
