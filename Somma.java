public class Somma{
	
	 public static int Sum(int a, int b){
	 	return a+b;
	 }
	 
	 public static int Sum(int a, int b, int c){
	 	return a+b+c;
	 }
	 
	 	public static int Sum(int a, int b, int c, int d){
	 	return a+b+c+d;
	 }
	 
	 
	
   public static void main(String[] axx){
    int a=0;
    int b=1;
    int c=2;
    int d=3;
    System.out.println(Sum(a,b));
    System.out.println(Sum(a,b,c));
    System.out.println(Sum(a,b,c,d));
   }
}