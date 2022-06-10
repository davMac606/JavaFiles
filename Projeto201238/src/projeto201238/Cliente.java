
package projeto201238;


public class Cliente extends Pessoa implements IPessoa {
	private String nome;
	private int idade;
	private int codigo;
	private int pedidos;
	private int telefone;

	public Cliente() {
		this.idade = -1;
		this.codigo = -1;
		this.pedidos = -1;
		this.telefone = -1;
	}
	
	@Override
	public void exibir() {
		System.out.println("\nNome do Cliente: " + this.nome + "\nIdade do cliente: " + this.idade + "\nCodigo: "
				+ this.codigo + "\nPedidos do Cliente: " + this.pedidos + "\nTelefone: " + this.telefone);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade < 0)
			throw new IllegalArgumentException("Idade invalida !!");
		else 
			this.idade = idade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		if (codigo < 0)
			throw new IllegalArgumentException("Codigo invalido !!");
		else
			this.codigo = codigo;
	}

	public int getPedidos() {
		return pedidos;
	}

	public void setPedidos(int pedidos) {
		if (pedidos < 0)
			throw new IllegalArgumentException("Codigo invalido !!");
		else
			this.pedidos = pedidos;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		if (telefone < 0)
			throw new IllegalArgumentException("Telefone invalido !!");
		else
			this.telefone = telefone;
	}

	
}

