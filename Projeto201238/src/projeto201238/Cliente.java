
package projeto201238;

public class Cliente extends Pessoa implements IPessoa {
    private String nome;
    private int idade;
    private int codigo;
    private int pedidos;
    private int telefone;

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
        this.idade = idade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPedidos() {
        return pedidos;
    }

    public void setPedidos(int pedidos) {
        this.pedidos = pedidos;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Cliente() {
        this.idade = 0;
        this.telefone = -1;
    }
    @Override
    public void exibir() {
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nCódigo: " + codigo + "\nPedidos: " + pedidos
                + "\n" + "\nTelefone: " + telefone);

    }

    public void maior() {
        System.out.println("Aqui será exibido o cliente mais velho");
    }

    public void menor() {
        System.out.println("Aqui será exibido o cliente mais novo");
    }

    public void media() {
        System.out.println("Aqui será exibida a média de idade dos clientes");
    }

    public void quantidade() {
        System.out.println("Aqui será exibida a quantidade de clientes");
    }

}
