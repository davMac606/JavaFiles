
package projeto201238;


public class Cliente extends Pessoa implements IPessoa {
	private String nome;
	private int idade;
	private int codigo;
	private int pedidos;
	private int dividas;

	public Cliente() {
		this.idade = -1;
		this.codigo = -1;
		this.pedidos = -1;
		this.dividas = -1;
	}
	
	@Override
	public void exibir() {
		System.out.println("\nNome do Cliente: " + this.nome + "\nIdade do cliente: " + this.idade + "\nCódigo: "
				+ this.codigo + "\nNúmero de pedidos do Cliente: " + this.pedidos + "\nNúmero de dívidas do cliente: " + this.dividas);
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
			throw new IllegalArgumentException("Idade inválida !!");
		else 
			this.idade = idade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		if (codigo < 0)
			throw new IllegalArgumentException("Código inválido !!");
		else
			this.codigo = codigo;
	}

	public int getPedidos() {
		return pedidos;
	}

	public void setPedidos(int pedidos) {
		if (pedidos < 0)
			throw new IllegalArgumentException("Valor inválido para pedidos!!");
		else
			this.pedidos = pedidos;
	}

	public int getDividas() {
		return dividas;
	}

	public void setDividas(int dividas) {
		if (dividas < 0)
			throw new IllegalArgumentException("Valor inválido para dívidas!!");
		else
			this.dividas = dividas;
	}

	
}

