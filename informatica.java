import javax.swing.*;
public class informatica{
   public static void main(String[] axx){
   	   String s=JOptionPane.showInputDialog("Inserisca la sua stringa!");
   	   String s1="";
  
   	int counter=0;
   	int n=0;
	char c=0;
	int i=s.length();
      

   	while((counter<2)&&(n<i+1)){
	    c=s.charAt(n);
	    if((c)=='i'){
   			counter+=1;
			s1=s.substring(0,n);
			s1=s1.replace("i","x");


   		}
   		n++;
   	  }
	if(n<s.length()){
        s1=s1+s.substring(n+1,i+1);
   	  }
   	  System.out.println(s1);
   }
}
