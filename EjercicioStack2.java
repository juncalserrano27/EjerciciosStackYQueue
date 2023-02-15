import java.util.Scanner;
public class EjercicioStack2 {
	int MAX;
	int top;
	char []stack;
	Scanner scan= new Scanner (System.in);
	public EjercicioStack2() {
		System.out.println("Ingrese la frase la que quiere invertir:"); 
		String myString1=scan.nextLine();
		MAX=myString1.length();
		stack= myString1.toCharArray();
		top=1;}
	
	public String InvertirCad() {
			char top2;
			String NewString="";
			for(int i=MAX-1; i>=0;i--) {
			top2=stack[i];
			stack[MAX-1]='0';
			NewString=NewString+top2;
		}return(NewString);
	}
	

}
