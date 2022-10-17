package petshop;

public class Cao extends Pet {
	private static int total = 0;
	
	Cao() {
		super();
		total++;
	}

	Cao(String nome, String raça, int peso) {
		super(nome, raça, peso);
		total++;
	}
}
