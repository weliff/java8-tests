package referenciaAMetodos;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;

public class Teste {
	
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("José", 20);
		Pessoa p2 = new Pessoa("A", 39);
		Pessoa p3 = new Pessoa("Raimundo", 39);
		Pessoa[] arrayP = {p, p2, p3};
	
		Arrays.sort(arrayP, ComparasionProvider::comparaPorIdade);//static metodo
		Arrays.sort(arrayP, new ComparasionProvider()::comparaPorNome);//nao static metodo
		Arrays.sort(arrayP, (a,b) ->{return a.getIdade() - b.getIdade();});//nao static metodo
		
		System.out.println(Arrays.toString(arrayP));
	}

}
