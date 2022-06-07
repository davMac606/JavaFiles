
package projeto201238;
public class Funcionario extends Pessoa implements IPessoa {
    private String nome;
    private int idade;
    private String estiloDesenho;
    private String codigo;
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
    public String getEstiloDesenho() {
        return estiloDesenho;
    }
    public void setEstiloDesenho(String estiloDesenho) {
        this.estiloDesenho = estiloDesenho;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
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
        System.out.println("Nome: " + nome + ". Idade: " + idade + ". Estilo de desenho: " + estiloDesenho + ". Código: " + codigo + ". Salário: " + salario + ".");
    }

}
