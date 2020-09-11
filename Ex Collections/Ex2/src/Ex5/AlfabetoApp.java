package Ex5;

import java.util.HashSet;

public class AlfabetoApp {

	public static void main(String[] args) {

		HashSet<AlfabetoEx> conjunto = new HashSet<AlfabetoEx>();

		AlfabetoEx a1 = new AlfabetoEx("a", 1);
		AlfabetoEx a2 = new AlfabetoEx("b", 2);
		AlfabetoEx a3 = new AlfabetoEx("a", 5);

		conjunto.add(a1);
		conjunto.add(a2);
		// a3 não entra porque ja foi gerado um hash para "a";
		conjunto.add(a3);

		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(conjunto.size());

	}

}
