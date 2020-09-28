package ImplementandoListas;

import java.util.ArrayList;
import java.util.List;

public class ListaSequencial {

	private static final int INITIAL_ALLOCATION = 3;
	Conta[] arrayInterno = new Conta[INITIAL_ALLOCATION];
	private int inseridos;

	public List<Conta> buscar(String titular) {
		List<Conta> respostaBusca = new ArrayList<Conta>();
		for (int i = 0; i < arrayInterno.length; i++) {
			if (arrayInterno[i].getTitular().equals(titular)) {
				respostaBusca.add(arrayInterno[i]);
			}
		}
		return respostaBusca;
	}

	public int size() {
		return inseridos;
	}

	public Conta buscarConta(Conta c) {
		Conta respostaBusca = null;
		for (int i = 0; i < arrayInterno.length; i++) {
			if (arrayInterno[i].equals(c)) {
				respostaBusca = arrayInterno[i];
				break;
			}
		}
		return respostaBusca;
	}
}
