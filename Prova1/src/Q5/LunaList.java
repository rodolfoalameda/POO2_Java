package Q5;

import Q4.ListaLotadaException;
import lombok.Data;

@Data
public class LunaList {

	public Aviao cabeca;
	private int inseridos;
	private int tamanhoMaximo = 30;

	public void add(Aviao a) throws ListaLotadaException {
		
		if (inseridos == tamanhoMaximo) {
			throw new ListaLotadaException();
		}
		if (cabeca == null) {
			cabeca = a;
		} else {
			a.proximo = cabeca;
			cabeca = a;
		}

		inseridos++;
	}

	public int size() {
		return inseridos;
	}

	public void noFim(Aviao a) throws ListaLotadaException {
		if (cabeca == null) {
			cabeca = a;
		} else {
			Aviao temp = cabeca;
			while (temp.proximo != null) {
				temp = temp.proximo;
			}
			temp.proximo = a;
		}
		if (inseridos == tamanhoMaximo) {
			throw new ListaLotadaException();
		}
		inseridos++;
	}
}
