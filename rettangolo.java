import javax.swing.*;
public class rettangolo{
   public static void main(String[] axx){
 	   String a=JOptionPane.showInputDialog("Inserire il primo lato");
 	   String b=JOptionPane.showInputDialog("Inserire il secondo lato");
 	        double base=Double.parseDouble(a);
 	        double altezza=Double.parseDouble(b);
 	        double area=(base*altezza);
 	    System.out.println("L'area del rettangolo è "+area);
 	    JOptionPane.showMessageDialog(null,"Area: "+area);
     String s="xxxxx";
 	   }
}