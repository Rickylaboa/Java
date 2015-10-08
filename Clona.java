import javax.swing.*;
public class Clona{
	
	 public static double[] clona(double[] a){
	  	double []a2= new double [a.length];
	   for(int i=0; i<a.length; i++){
	   	a2[i]=a[i];
	   }
	 return a2;
	 }

	
   public static void main(String[] axx){
   	JOptionPane.showMessageDialog(null,"Test Vector {1,2,3}");
   double [] x= new double[] {1,2,3};
   double [] y=clona(x);
   System.out.println("Vettore {1,2,3}:");
   System.out.print(x[0]);
      System.out.print(x[1]);
         System.out.println(x[2]);
        System.out.println("Vettore copia:");
     System.out.print(y[0]);
        System.out.print(y[1]);
           System.out.println(y[2]);
   
   
  }
}