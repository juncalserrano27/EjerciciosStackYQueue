import java.util.Scanner;

public class EjercicioStack2Palindromo {
	int MAX;
	int top;
	char []stack;
	String myString1;
	Scanner scan= new Scanner (System.in);
	public EjercicioStack2Palindromo() {
		System.out.println("Ingrese la frase la que quiere verificar que sea un palindromo:"); 
		myString1=scan.nextLine();
		MAX=myString1.length();
		stack= myString1.toCharArray();
		top=1;}
	
	public void InvertirCad() {
			char top2;
			String NewString="";
			for(int i=MAX-1; i>=0;i--) {
			top2=stack[i];
			stack[MAX-1]='0';
			NewString=NewString+top2;
			}
			myString1=myString1.replaceAll(" ","");
			stack = myString1.toCharArray();
			NewString=NewString.replaceAll(" ","");
			MAX=stack.length;
			char[] NewNewString=NewString.toCharArray();
			for(int i=MAX-1;i>=0;i--) {
			 if (stack[i]==NewNewString[i]) {
				 continue;
			 }else {
				  System.out.println("No es un palíndromo");
				  System.exit(0);;
			 }
			}System.out.println("Si es un palíndromo");
			
		}
		

}
