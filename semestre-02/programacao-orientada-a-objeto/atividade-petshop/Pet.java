package petshop;

public abstract class Pet {
	protected String nome;
	protected String raça;
	protected int peso;
	
	public void alimentar(int qtd) {
		this.peso += qtd;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaça() {
		return this.raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	public int getPeso() {
		return this.peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public Pet() {
		super();
	}
	
	public Pet(String nome, String raça, int peso) {
		super();
		this.nome = nome;
		this.raça = raça;
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Nome: ");
		stringBuffer.append(this.nome);
		stringBuffer.append(", Raça: ");
		stringBuffer.append(this.raça);
		stringBuffer.append(", Peso: ");
		stringBuffer.append(this.peso/1000.0);
		stringBuffer.append(" kg.");

		return stringBuffer.toString();
	}
}
