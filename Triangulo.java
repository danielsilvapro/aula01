import javax.swing.JOptionPane;
import java.util.Scanner;
	
class Triangulo {

	public static void main(String args[]) {
	
        float base = 0;
        float altura = 0;


        Scanner entrada = new Scanner(System.in);
		System.out.println ("Digite o valor base");
		base = entrada.nextFloat();
		System.out.println ("Digite altura");
		altura = entrada.nextFloat();

		System.out.println (base * altura/2.0);
		System.out.println ("Este é o valor base");

	}
}
