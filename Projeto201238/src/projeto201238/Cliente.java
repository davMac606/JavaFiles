
package projeto201238;


public class Cliente extends Pessoa implements IPessoa {
    private String nome;
    private int idade;
    private int codigo;
    private String email;
    private float telefone;
    
    
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getTelefone() {
        return telefone;
    }

    public void setTelefone(float telefone) {
        this.telefone = telefone;
    }
    @Override
    public void exibir() {
        System.out.println(nome + "\n");
        System.out.println(idade + "\n");
        System.out.println(codigo + "\n");
        System.out.println(email + "\n");
        System.out.println(telefone + "\n");
    }
    
    @Override
    public void maior() {
        System.out.println("Aqui será exibido o cliente mais velho");
    }
    @Override
    public void menor() {
        System.out.println("Aqui será exibido o cliente mais novo");
    }
    @Override
    public void media() {
        System.out.println("Aqui será exibida a média de idade dos clientes");
    }
    @Override
    public void quantidade() {
        System.out.println("Aqui será exibida a quantidade de clientes");
    }

}
