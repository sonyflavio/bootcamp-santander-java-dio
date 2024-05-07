import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		int contagem = parametroDois - parametroUm;
		for(int resultado = 1;  resultado <= contagem; resultado++ ) {
			System.out.println(" Imprimindo numero: " + resultado);

		}

	}

}

	