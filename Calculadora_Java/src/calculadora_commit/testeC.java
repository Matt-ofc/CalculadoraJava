package calculadora_commit;
import java.util.Scanner;

public class testeC {

	public class Calculadora {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int opcao;
	        double num1, num2, resultado;

	        do {
	            System.out.println("=== Calculadora ===");
	            System.out.println("1 - Soma");
	            System.out.println("2 - Subtração");
	            System.out.println("3 - Multiplicação");
	            System.out.println("4 - Divisão");
	            System.out.println("0 - Sair");
	            System.out.print("Escolha uma opção: ");
	            opcao = scanner.nextInt();

	            if (opcao == 0) {
	                System.out.println("Encerrando...");
	                break;
	            }

	            System.out.print("Digite o primeiro número: ");
	            num1 = scanner.nextDouble();
	            System.out.print("Digite o segundo número: ");
	            num2 = scanner.nextDouble();

	            switch (opcao) {
	                case 1:
	                    resultado = num1 + num2;
	                    System.out.println("Resultado: " + resultado);
	                    break;
	                case 2:
	                    resultado = num1 - num2;
	                    System.out.println("Resultado: " + resultado);
	                    break;
	                case 3:
	                    resultado = num1 * num2;
	                    System.out.println("Resultado: " + resultado);
	                    break;
	                case 4:
	                    if (num2 != 0) {
	                        resultado = num1 / num2;
	                        System.out.println("Resultado: " + resultado);
	                    } else {
	                        System.out.println("Erro: divisão por zero!");
	                    }
	                    break;
	                default:
	                    System.out.println("Opção inválida!");
	            }
	            System.out.println(); // linha em branco para separar
	        } while (opcao != 0);

	        scanner.close();
	    }
	}}