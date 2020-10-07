package LinkedList;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class LinkedList {

	public Aviao cabeca;
	private int inseridos;

	// inserir avião na cabeça da fila
	public void add(Aviao a) {
		if (cabeca == null) {
			cabeca = a;
		} else {
			a.proximo = cabeca;
			cabeca = a;
		}
		inseridos++;
	}

	// quantos aviões tem na pista
	public int size() {
		return inseridos;
	}

	// autoriza a decolagem da cabeça
	public void removerPrimeiro() {
		if (cabeca == null) {
			System.out.println("Não tem avião para decolar");
		} else if (cabeca.proximo == null) {
			cabeca = null;
		} else if (cabeca.proximo != null) {
			cabeca = cabeca.proximo;
		}
		inseridos--;
	}

	// adiciona no fim da fila
	public void noFim(Aviao a) {
		if (cabeca == null) {
			cabeca = a;
		} else {
			Aviao temp = cabeca;
			while (temp.proximo != null) {
				temp = temp.proximo;
			}
			temp.proximo = a;
		}
		inseridos++;
	}

	public String exibePrimeiro() {
		return cabeca.getMatricula();
	}

	public List<String> buscarPorMat(String mat) {
		if (cabeca == null) {
			return null;
		} else {
			Aviao temp = cabeca;
			List<String> resposta = new ArrayList<String>();

			while (temp.proximo != null) {
				if (temp.getMatricula().equals(mat)) {
					resposta.add(temp.getMatricula());
					break;
				}
				temp = temp.proximo;
			}
			return resposta;
		}
	}

	public ArrayList<Aviao> lista() {
		ArrayList<Aviao> aux = new ArrayList<Aviao>();
		Aviao aviao = cabeca;
		while (aviao != null) {
			aux.add(aviao);
			aviao = aviao.proximo;
		}
		return aux;
	}

}
