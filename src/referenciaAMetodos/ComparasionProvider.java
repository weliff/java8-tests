package referenciaAMetodos;

public class ComparasionProvider {
	
	public static int comparaPorIdade(Pessoa p, Pessoa p2){
		return p.getIdade() - p2.getIdade() ;
	}
	
	public int comparaPorNome(Pessoa p, Pessoa p2){
		return p.getNome().compareTo(p2.getNome());
	}
}
