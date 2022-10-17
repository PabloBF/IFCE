package petshop;

public class Gato extends Pet {
	private static int total = 0;

	public Gato compararPeso(Gato gato) {
		return (this.peso > gato.peso)? this : gato;
	}

	public Gato() {
		super();
		total++;
	}

	public Gato(String nome, String raça, int peso) {
		super(nome, raça, peso);
		total++;
	}
}
