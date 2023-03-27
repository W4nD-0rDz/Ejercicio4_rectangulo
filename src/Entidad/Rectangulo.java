
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Wendy
 */
public class Rectangulo {

    //attribute
    
    private int base;
    
    private int altura;
    
    //constructores

    public Rectangulo() {
    }
    
    
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
       

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
//Crear
public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectángulo: ");
        setBase(leer.nextInt());
        System.out.println("Ingrese la altura del rectángulo: ");
        setAltura(leer.nextInt());
    }    


//Superficie
    public int superficie(){
        return base * altura;
    }
    
    public int perimetro(){
        return (base * 2) + (altura * 2);
    }
    
    public void dibujo(){ ///no devuelve ningún número, sólo ejecuta el "dibujo".
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if(i>0 && i<altura-1 && j>0 && j<base-1){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                }
            System.out.println("");            
        }
     }
}

    
      

