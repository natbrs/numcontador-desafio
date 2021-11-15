package desafio4;

import javax.swing.JOptionPane;

public class Desafio4 {
    
    public static void main(String[] args) {
        
         int i = 0, n, c = 0;
        
         do{
             n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor(se "+ "digitar 0 a operação acaba)"));
         switch(n){
             
         case 0: 
            i++;
         break;
         default:
               if(n > 100 && n < 200){
                  c++;
               }
         }
       }while(i == 0);
       System.out.println("Foram digitados " + c +  " entre 100 e 200(inclusive " + "eles)" );
    }
}
