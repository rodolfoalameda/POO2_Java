package ImplementandoListas;

import java.util.ArrayList;
import java.util.List;




public class ListaEncadeada {

	private Conta cabeca;
	private int inseridos;

	public void add(Conta c) {
		if (cabeca == null) {
			cabeca = c;
		} else {
			c.proximo = cabeca;
			cabeca = c;
		}
		inseridos++;
	}

	public List<Conta> buscar(String titular) {
		Conta temp = cabeca;
		List<Conta>respostaBusca = new ArrayList<Conta>();
		
		while(temp.proximo != null) {
			
			if(temp.getTitular().equals(titular)) {
				respostaBusca.add(temp);
			}
			
			temp = temp.proximo;
		}
		return respostaBusca;
	}

	public int size() {
		return inseridos;
	}

	public Conta buscarConta(Conta c) {
		Conta temp = cabeca;
		Conta respostaBusca = null;
		
		while(temp.proximo != null) {
			
			if(c.equals(temp)) {
				respostaBusca = c;
				break;
			}
			
			temp = temp.proximo;
		}
		return respostaBusca;
	}

	public ListaEncadeada merge(Conta cabecaNovaConta) {
		Conta temp = cabeca;
		
		while(temp.proximo != null) {
			temp = temp.proximo;
		}
		temp.proximo = cabecaNovaConta; 
		return this;
	}

}
