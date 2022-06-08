
package projeto201238;

import java.util.InputMismatchException;

public class Funcionario extends Pessoa implements IPessoa {
    private String nome;
    private int idade;
    private String estiloArte;
    private int codigo;
    private double salario;
    
    public Funcionario() {
    	this.idade = -1;
    	this.codigo = -1;
    	this.salario = -1;
    }
    
	@Override
	public void exibir() {
		System.out.println("\nNome do Funcionario: " + this.nome + "\nIdade do Funcionario: " + this.idade + "\nCodigo: "
				+ this.codigo + "\nEstilo de Arte: " + this.estiloArte + "\nSalario: " + this.salario);
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

	public String getEstiloArte() {
		return estiloArte;
	}

	public void setEstiloArte(String estiloArte) {
		if (estiloArte instanceof String) {
			this.estiloArte = estiloArte;
		} else {
			throw new InputMismatchException();
		}
		
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario < 0)
			throw new IllegalArgumentException("Salario invalido !!");
		else
			this.salario = salario;
	}

}
