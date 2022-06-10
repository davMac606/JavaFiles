
package projeto201238;

import java.util.InputMismatchException;

public class Funcionario extends Pessoa implements IPessoa {
    private String nome;
    private int idade;
    private String descFunc;
    private int codigo;
    private double salario;
    
    public Funcionario() {
    	this.idade = -1;
    	this.codigo = -1;
    	this.salario = -1;
    }
    
	@Override
	public void exibir() {
		System.out.println("\nNome do Funcionário: " + this.nome + "\nIdade do funcionário: " + this.idade + "\nCódigo: "
				+ this.codigo + "\nBreve descrição do funcionário: " + this.descFunc + "\nSalario: " + this.salario);
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

	public String getDescFunc() {
		return descFunc;
	}

	public void setDescFunc(String descFunc) {
		if (descFunc instanceof String) {
			this.descFunc = descFunc;
		} else {
			throw new InputMismatchException();
		}
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		if (codigo < 0)
			throw new IllegalArgumentException("Código invalido !!");
		else
			this.codigo = codigo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario < 0)
			throw new IllegalArgumentException("Salário invalido !!");
		else
			this.salario = salario;
	}

}
