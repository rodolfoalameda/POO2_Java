package Ex3;

import java.util.Collections;
import java.util.Scanner;

public class ComparatorApp {

	public static void main(String[] args) {

		Comparator comparator = new Comparator();

		Scanner input = new Scanner(System.in);

		int entrada = 0;

		while (entrada != 1) {
			System.out.println("Numero: ");
			int num = input.nextInt();
			comparator.lista.add(num);
			System.out.println("Parar: s/n");
			input.nextLine();
			String parada = input.nextLine();
			if (parada.equals("s")) {
				entrada = 1;
			}
		}
		Collections.sort(comparator.lista, Collections.reverseOrder());
		System.out.println(comparator.lista);

	}

}
