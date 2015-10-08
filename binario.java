import javax.swing.*;
public class binario{
   public static void main(String[] axx){
   int numero=Integer.parseInt(JOptionPane.showInputDialog("Inserire il numero da convertire"));
   String risultato="";
   if(numero==0){
   	    risultato="0";
   }
   else{
       while((numero)!=0){
       risultato=(numero%2)+risultato;
       numero=numero/2;
          }
         }
 	    JOptionPane.showMessageDialog(null,"Il numero binario è "+risultato);
   
   }
}