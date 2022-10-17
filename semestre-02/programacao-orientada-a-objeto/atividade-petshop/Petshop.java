package petshop;

public class Petshop {
	private static final int maximoClientes = 5;
	
	private String cnpj;
	private Endereco endereco;
	private Pet[] clientes = new Pet[maximoClientes];
	private int totalClientes;
	
	public String getCnpj() {
		return this.cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Pet[] getClientes() {
		return this.clientes;
	}
	
	public void setClientes(Pet[] clientes) {
		this.totalClientes = ((clientes.length <= maximoClientes)? clientes.length : maximoClientes);
		int i;
		for(i = 0; i < totalClientes; i++) {
			this.clientes[i] = clientes[i];
		}
	}

	public void addCliente(Pet cliente) {
		if(this.totalClientes < maximoClientes) {
			this.clientes[this.totalClientes] = cliente;
		}
		this.totalClientes++;
	}
	
	public Petshop() {
		super();
	}

	public Petshop(String cnpj, Endereco endereco) {
		super();
		this.cnpj = cnpj;
		this.endereco = endereco;
	}

	public Petshop(String cnpj, Endereco endereco, Pet[] clientes) {
		super();
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.clientes = clientes;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("CNPJ: ");
		sb.append(this.cnpj);
		sb.append("\nEndereço: ");
		sb.append(this.endereco);
		sb.append("\nClientes: [");
		for(int i = 0; i < this.totalClientes; i++) {
			sb.append("(");
			sb.append(this.clientes[i]);
			sb.append("), ");
		}
		sb.append("].");

		return sb.toString();
		
	}
}
