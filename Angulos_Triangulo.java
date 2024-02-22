package angulos_triangulo;

import java.util.Scanner;

public class Angulos_Triangulo {

    public static void main(String[] args) {
          double anguloA=0;
          double anguloB=0;
          double anguloC=0;
          double suma=0;
          
      Scanner entrada= new Scanner(System.in);
      System.out.println("Realize la suma de los angulos de un triangulo");
      System.out.println("Introduzca el angulo A");
      anguloA=entrada.nextDouble();
      System.out.println("Introduzca el angulo B");
      anguloB=entrada.nextDouble();
      System.out.println("Introduzca el angulo C");
      anguloC=entrada.nextDouble();
      suma=anguloA+anguloB+anguloC;
      if(suma==180){
      System.out.println("La suma de los angulos es: "+ suma);
      if(anguloA==anguloB && anguloB==anguloC){
          System.out.println("Es un triangulo equilatero");
      }
      else{
          if(anguloA==anguloB && anguloB>anguloC){
              System.out.println("Es un triangulo isoceles");
          }
      }
          if(anguloA>anguloB && anguloB>anguloC){
              System.out.println("Es un triangulo escaleno");
          }
      }
      else{
          System.out.println("No es un triangulo");
      }
      
      }    
    
}
