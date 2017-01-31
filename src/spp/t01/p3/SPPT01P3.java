/*//Problema 3 de IMT Fabricio Arturo Balboa Cavazos A01411541
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.t01.p3;
import java.util.Scanner;
/**
 *
 * @author FabricioArturo
 */
public class SPPT01P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { Scanner Kb = new Scanner (System.in);
       Double X1;
       Double X2;
       Double Y1;
       Double Y2;
       Double Dis;
    
    System.out.println("Bienvenido al determinador de distancias "); 
        System.out.println("Introduce tus distancias en metros ");
        System.out.println("Dime la coordenada actual en X : ");
        X1 = Kb.nextDouble();
        System.out.println("Ahora la coordenada actual en Y : ");
        Y1 = Kb.nextDouble();
        System.out.println("Ahora dime la coordenada de el punto de  destino en X : ");
        X2 = Kb.nextDouble();
        System.out.println("Y ahora la coordenada en Y del punto de destino : ");
        Y2 = Kb.nextDouble();
        Dis = Math.sqrt(Math.pow(X1-X2, 2)+ Math.pow(Y1-Y2, 2));
        System.out.println("La distancia a tu destino es de "+ (Dis) + " metros");
        System.out.println("Gracias por usar");
               
        // TODO code application logic here
    }
    
}
