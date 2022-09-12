package puzzle.base;

import java.util.Arrays;
import java.util.ArrayList; 
import java.util.Collections; 

public class BaseNumero {
	private int m = 0;
	private int definir;
	private int pecas[][];
	
	public void setModo(int definir) {
		this.definir = definir;
	}
	
	// definir é o valor que define o  tamanho e quantidade de valores dentro da matriz
	public int[][] Calculo() {
		pecas = new int[definir][definir];
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		for(int n = 0; n < (definir*definir); n++){// Cria o conjunto de números usados na Matriz
			numeros.add(n);
		}
		Collections.shuffle(numeros);//Embaralha os numeros de forma aleátoria
		//System.out.println(numeros);
	       for(int x = 0; x < definir; x++){ // Defini cada espaço do array que forma a matriz
	           for(int y = 0; y < definir; y++){
	               pecas[x][y] = numeros.get(m);
				   m++;
	            }
	        }
	       /*
	        * posX = numeros.indexOf(0);
	        * tempX = 0;
	        * posP;
	        * tempP;
	        * if(movimento.equalsIgnoreCase("W")) {
	        * 	if(posX >= definir) {
	        * 		posP = posX - definir;
	        * 		tempP = numeros.get(posP);
	        * 		numeros.set(posP,temX);
	        * 		numeros.set(posX,temP);
	        * 	}
	        * }
	        */
			System.out.print(Arrays.deepToString(pecas));
		return pecas;
	}
	public int porPeca(int x, int y) {
		return pecas[x][y];
	}
}