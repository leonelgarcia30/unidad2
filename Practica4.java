/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg4;
import java.util.Scanner();
/**
 *
 * @author Usuario
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner money = new Scanner(System.in);
        
        System.out.println("Ingresar cantidad en pesos: ");
        final double pesos = money.nextInt();
        
        final double dolar = 17.5;
        final double euro = 18.29;
        
        double d = pesos / dolar;
        double e = pesos / euro;

        System.out.println("La cantidad en dolares es: " + d);
        System.out.println("La cantidad en euros es: " + e);     
        
        money.close();
    }
    
}
