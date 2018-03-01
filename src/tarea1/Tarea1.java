/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

/**
 *
 * @author Felipe
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String mi_nombre = "Luis Felipe Bocanegra Morales" ;
       System.out.println(mi_nombre);
       
      int num1, num2, num3, num4, num5, num6 ;
      num1=5 ;
      num2=7 ;
      num3=6 ;
      num4=8 ;
      
     num5=num1+num2+num3+num4; 
     num1=num1+num4 ;
     num2=num2+num3 ;
     num6=num1+num2 ;
        System.out.println(num5);
        System.out.println(num6);
        
        
      num1=5;
      num2=7;
      num3=6;
      num4=8;
      num5=0;
      num6=0;
      
     num5=(num3-num1)-(num4-num2);
     num3=num3-num1;
     num4=num4-num2;
     num6=num3-num4;
     System.out.println(num5);
     System.out.println(num6);
     
     
     num1=5;
     num2=7;
     num3=8;
     num4=8;
     num5=0;
     num6=0;
     
     num5= (num1*num2)+(num3/num4);
     num1=num1*num2;
     num3=num3/num4;
     num6=num1+num3;
     System.out.println(num5);
     System.out.println(num6);
     
     int cont=7;
      System.out.println(cont);
      cont--;
      cont--;
      cont--;
      cont--;
      cont--;
      cont--;
      cont--;
      System.out.println(cont);
      cont++;
      System.out.println(cont);
      
      
      suma(3,5);
     
      divicion(5,5);
      
      Tarea("Profesor Aqui Esta Mi Tarea");
      System.out.println(Tarea1());
      
      
    }
    public static void suma (int num1 ,int num2)
    {
        num1+=num2;
        System.out.println(num1);
}
    public static void divicion (int num1, int num2)
    {
        num1/=num2;
        System.out.println(num1);
    }
    public static void Tarea (String Profesor_Aqui_Esta_Mi_Tarea)
    {
        System.out.println("Profesor Aqui Esta Mi Tarea");
    }
    
    public static String Tarea1() 
    {
        return "Profesor Aqui Esta Mi Tarea" ;
    }
    }
    

