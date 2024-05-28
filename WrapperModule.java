import java.util.Scanner;

public class WrapperModule {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um valor numerico: ");
		int valorPrimitivo = scan.nextInt();
		
		Integer valorWrapper = Integer.valueOf(valorPrimitivo);
		
		System.out.println("Valor lido como primitivo: " + valorPrimitivo);
		System.out.println("Valor convertivo como primitivo: " + valorWrapper);
		
		scan.close();
		
	}

}