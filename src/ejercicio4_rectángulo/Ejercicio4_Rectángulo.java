
package ejercicio4_rectángulo;

import Entidad.Rectangulo;

/**
 *
 * @author Wendy
 */
public class Ejercicio4_Rectángulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        
        r1.crearRectangulo();
        System.out.println("La superficie del rectángulo es " + r1.superficie()+ ".");
        System.out.println("El perímetro del rectángulo es " + r1.perimetro() +".");
        r1.dibujo();
        
         
        
        
    }
    
}
