
package projeto201238;

public class Funcionario extends Pessoa implements IPessoa {
    private String nome;
    private int idade;
    private String estiloArte;
    private int codigo;
    private double salario;

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

    public String getEstiloArte() {
        return estiloArte;
    }

    public void setEstiloArte(String estiloArte) {
        this.estiloArte = estiloArte;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void exibir() {
        System.out.println("Nome: " + nome + ".\nIdade: " + idade + ".\nEstilo de desenho: " + estiloArte
                + ".\nCódigo: " + codigo + ".\nSalário: " + salario + ".");
    }

}
