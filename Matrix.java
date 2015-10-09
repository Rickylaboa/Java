import javax.swing.*;
public class Matrix{
   public static int[][] createMat(){
   	   String mat="";
 	   int rows=Integer.parseInt(JOptionPane.showInputDialog("Insert the number of Rows"));
 	   int cols=Integer.parseInt(JOptionPane.showInputDialog("Insert the number of Cols"));
      int [][] matrix = new int [rows][cols];
      for(int i=0; i<rows;i++){
      	for(int j=0; j<cols; j++){
      matrix[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Insert the number of value in position"+i+j));
      mat=mat+Integer.toString(matrix[i][j]);
      	}
      	mat=mat+"\n";
      }
       JOptionPane.showMessageDialog(null,"Your Matrix is: \n"+mat);
       return matrix;
 	   }
 	   
 	   
 	   public static void main(String [] sdd){
 	   
 	   Matrix.createMat();
 	   
 	   }
 	   

}