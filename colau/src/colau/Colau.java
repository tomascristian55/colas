
package colau;

import java.util.Scanner;


public class Colau {

   Scanner Leer = new Scanner(System.in);
   int tam=0;
   char vi[] = new char[tam = Leer.nextInt()];
   int tope = tam;
   
   public void llenarcola(){
        for (int i = 0; i<tope; i++){
            vi[i]=Leer.next().charAt(0);
            
        }     
        System.out.println("agregados "+tope+" elementos a la cola");
   }
   
   public void mostrarcola(){
       for (int i = 0; i<tope; i++){
           System.out.println("el valor de la posicion ["+i+"]; es:"+vi[i]);    
       }
   }
   
   public void eliminarcola(){
       //eliminar el primer elemento
       tope--;
       for (int i = 0; i<tope; i++){
           vi[i]=vi[i+1];
       }
       System.out.println("elemento eliminado");
   }
   
   public void agregarcola(){
       vi[tope]=Leer.next().charAt(0);
       tope++;
       System.out.println("dato agregado");
   }
   
    
    public static void main(String[] args) {
        System.out.println("ingresa el tamaño de la cola \n");
        
        Colau c = new Colau();
        Scanner sc = new Scanner(System.in);
        int opt=0;
        do{
         System.out.println("1. llenar \n");
         System.out.println("2. mostrar \n");
         System.out.println("3. eliminar \n");
         System.out.println("4. agregar \n");
         System.out.println("5. salir \n");
         switch(opt= sc.nextInt()){
             case 1:
                 c.llenarcola();
                 break;
             case 2:
                 c.mostrarcola();
                 break;
             case 3:
                 c.eliminarcola();
                 break;
             case 4:
                 c.agregarcola();
                 break;
         }
        }while(opt != 5);
    }
    
}
