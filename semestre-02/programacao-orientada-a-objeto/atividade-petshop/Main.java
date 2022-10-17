package petshop;

public class Main {
  public static void main(String[] args) {
		Endereco meuEndereco = new Endereco("Av. Treze de Maio", 2081, "60040-531");
		Petshop quatroPatas = new Petshop("01.234.567/0001-89", meuEndereco);
		
		Cao toto = new Cao("Totó", "vira-lara", 7000);
		Gato yogi = new Gato("Yogi", "persa", 3000);
		Gato farelo = new Gato("Farelo", "angorá", 4000);
		
		
		quatroPatas.addCliente(toto);
		quatroPatas.addCliente(yogi);
		quatroPatas.addCliente(farelo);
		

		System.out.println(toto);
		System.out.println(yogi);
		System.out.println(farelo);
		
		toto.alimentar(200);
		
		System.out.println(toto);
		
		System.out.println(quatroPatas);
  }
}
