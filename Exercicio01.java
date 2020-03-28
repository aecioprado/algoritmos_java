package exercicios;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		
		double area, raio;
		
		System.out.println("Informe o raio");
		raio = ler.nextDouble();
		
		area = 3.14 * raio * raio;
		
		System.out.println("A area do circulo e: " + area);
		
		
		
		

	}

}
