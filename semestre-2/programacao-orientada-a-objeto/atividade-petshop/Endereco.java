package petshop;

public class Endereco {
	private String logradouro;
	private int numero;
	private String cep;
	
	public String getLogradouro() {
		return this.logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCep() {
		return this.cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public Endereco() {
		super();
	}

	public Endereco(String logradouro, int numero, String cep) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
	}

	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Logradouro: ");
		stringBuffer.append(this.logradouro);
		stringBuffer.append(", ");
		stringBuffer.append(this.numero);
		stringBuffer.append(" - ");
		stringBuffer.append(this.cep);
		stringBuffer.append(".");

		return stringBuffer.toString();
	}
}
