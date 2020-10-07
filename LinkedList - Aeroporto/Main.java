package LinkedList;

public class Main {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		Aviao a1 = new Aviao("prt - 2078");
		Aviao a2 = new Aviao("acs - 7578");
		Aviao a3 = new Aviao("rgo - 9962");
		
		ll.add(a1);
		ll.add(a2);
		ll.noFim(a3);
		ll.removerPrimeiro();
		System.out.println(ll.size());
		System.out.println(ll);
	}
}
