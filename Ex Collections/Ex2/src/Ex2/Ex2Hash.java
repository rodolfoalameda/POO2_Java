package Ex2;

import java.util.HashSet;


public class Ex2Hash {

	public static void main(String[] args) {

		// insercao

		long start = System.currentTimeMillis();

		HashSet<Integer> example = new HashSet<Integer>();
		int total = 300000;

		for (int i = 0; i <= total; i++) {
			example.add(i);
		}

		long elapsedTime = System.currentTimeMillis() - start;
		System.out.println("Tempo gasto Hs: " + elapsedTime);

///////////////////////////////////////////////////////////////////////////////

		// navegacao

		long start2 = System.currentTimeMillis();

		for (int i = 0; i < example.size(); i++) {
			example.contains(i);
		}

		long elapsedTime2 = System.currentTimeMillis() - start2;
		System.out.println("Tempo gasto Hs: " + elapsedTime2);

///////////////////////////////////////////////////////////////////////////////

//		// obtencao
//
//		long start3 = System.currentTimeMillis();
//
//		for (int i = 0; i < example.size(); i++) {
//			example.
//		}
//
//		long elapsedTime3 = System.currentTimeMillis() - start3;
//		System.out.println("Tempo gasto Hs: " + elapsedTime3);

////////////////////////////////////////////////////////////////////////////////		

		// remocao

		long start4 = System.currentTimeMillis();

		for (int i = 0; i < example.size(); i++) {
			example.remove(i);
		}

		long elapsedTime4 = System.currentTimeMillis() - start4;

		System.out.println("Tempo gasto Hs: " + elapsedTime4);
	}
///////////////////////////////////////////////////////////////////////////////
	
}
