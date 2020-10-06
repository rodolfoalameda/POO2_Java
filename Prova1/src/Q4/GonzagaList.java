package Q4;

import lombok.Data;

@Data
public class GonzagaList {

	public class SequencialList {

		private static final int INITIAL_VALLUE = 10;
		private static final int FINAL_VALLUE = 100;
		private int inseridos;
		private int isPar = 0;
		private int isOdd = 1;

		public Object[] nomes = new Object[INITIAL_VALLUE];

		public void add(Object o) throws ListaLotadaException {

			if (inseridos == FINAL_VALLUE) {
				throw new ListaLotadaException();
			}
			
			if (inseridos == nomes.length && inseridos <= FINAL_VALLUE) {
				aumentaArray();
			}

			else if (isOdd < FINAL_VALLUE) {
				nomes[isOdd] = o;
				isOdd += 2;
				inseridos++;
			}

			else if (isPar < FINAL_VALLUE) {
				nomes[isPar] = o;
				isPar += 2;
				inseridos++;
			}
		}

		public void aumentaArray() {
			if (inseridos == nomes.length) {
				Object[] novoArray = new Integer[nomes.length + 10];
				for (int i = 0; i < nomes.length; i++) {
					novoArray[i] = nomes[i];
				}
				nomes = novoArray;
			}
		}
	}
}
