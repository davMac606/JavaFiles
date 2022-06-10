package projeto201238;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Projeto201238 {
	static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	static ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	static ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();

	static final Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		menuCadastro();

	}
	private static void menuCadastro() {
		int opUsuario = 1;

		while (opUsuario != 0) {
			System.out.println("Bem-vindo ao COTIL-Art! O que deseja fazer?\n\n"
					+ "-> 0 - Sair\n"
					+ "-> 1 - Cadastrar Cliente\n"
					+ "-> 2 - Excluir cliente\n"
					+ "-> 3 - Exibir clientes\n"
					+ "-> 4 - Cadastrar funcionarios\n"
					+ "-> 5 - Excluir funcionario\n"
					+ "-> 6 - Exibir funcionarios\n"
					+ "-> 7 - Cadastrar produto\n"
					+ "-> 8 - Excluir produto\n"
					+ "-> 9 - Exibir produtos\n"
					+ "-> 10 - Procurar cliente\n"
					+ "-> 11 - Procurar produtos por descricao\n"
					+ "-> 12 - Procurar produtos por preco\n"
					+ "-> 13 - Procurar produtos por tipo\n"
					+ "-> 14 - Exibir cliente mais velho\n"
					+ "-> 15 - Exibir cliente mais jovem\n"
					+ "-> 16 - Exibir a quantidade de clientes com mais de 60 anos\n"
					+ "-> 17 - Exibir a quantidade de clientes abaixo dos 18 anos\n"
					+ "-> 18 - Exibir a media da idade dos clientes\n"
					+ "-> 19 - Exibir o produto mais caro\n"
					+ "-> 20 - Exibir o produto mais barato\n"
					+ "-> 21 - Exibir media de precos\n"
					+ "-> 22 - Exibir quantidade de produtos acima da media de preco\n"
					+ "-> 23 - Sobre o projeto\n");

			opUsuario = tec.nextInt();

			switch (opUsuario) {
				case 0:
					System.out.println("Até logo!");
					System.exit(opUsuario);
					break;
				case 1:
					cadastrarCliente();
					break;
				case 2:
					excluirCliente();
					break;
				case 3:
					for (Cliente c : listaClientes) {
						c.exibir();
						System.out.println("Indice do cliente: " + listaClientes.indexOf(c) + "\n");
					}
					break;
				case 4:
					cadastrarFuncionario();
					break;
				case 5:
					excluirFuncionario();
					break;
				case 6:
					for (Funcionario f : listaFuncionarios) {
						f.exibir();
						System.out.println("Indice do funcionario: " + listaFuncionarios.indexOf(f) + "\n");
					}
					break;
				case 7:
					cadastrarProduto();
					break;
				case 8:
					excluirProduto();
					break;
				case 9:
					for (Produto p : listaProdutos) {
						p.exibir();
						System.out.println("Indice do produto: " + listaProdutos.indexOf(p) + "\n");
					}
					break;
				case 10:
					procurarCliente();
					break;
				case 11:
					procurarProdutoDescricao();
					break;
				case 12:
					procurarProdutoPreco();
					break;
				case 13:
					procurarProdutoTipo();
					break;
				case 14:
					exibeClienteMaisVelho();
					break;
				case 15:
					exibeClienteMaisJovem();
					break;
				case 16:
					exibeClienteMaisSessenta();
					break;
				case 17:
					exibeClienteAbaixoDezoito();
					break;
				case 18:
					exibeMediaIdadeClientes();
					break;
				case 19:
					exibeProdutoMaisCaro();
					break;
				case 20:
					exibeProdutoMaisBarato();
					break;
				case 21:
					exibirMediaPrecos();
					break;
				case 22:
					exibirQtdProdutosAcimaMedia();
					break;
				case 23:
					System.out.println("Projeto desenvolvido por Davi Andrade Macedo. RA - 201238");
					break;
				default:
					System.out.println("Opcao invalida !!");
					break;
			}
		}
	}

	private static void exibirQtdProdutosAcimaMedia() {
		double mediaPrecos = 0;
		int qtdProdutosAcimaMedia = 0;
		for (Produto p : listaProdutos) {
			mediaPrecos += p.getPreco();
		}

		mediaPrecos = mediaPrecos / listaProdutos.size();

		for (Produto p : listaProdutos) {
			if (p.getPreco() > mediaPrecos) {
				qtdProdutosAcimaMedia++;
			}
		}

		System.out.println("A Quantidade de produtos acima da media e: " + qtdProdutosAcimaMedia);
	}

	private static void exibirMediaPrecos() {
		double mediaPrecos = 0;

		for (Produto p : listaProdutos) {
			mediaPrecos += p.getPreco();
		}

		mediaPrecos = mediaPrecos / listaProdutos.size();
		System.out.println("A media de precos dos produtos e: " + mediaPrecos);
	}

	private static void exibeProdutoMaisBarato() {
		Produto prodMaisBarato = listaProdutos.get(0);
		for (Produto p : listaProdutos) {
			if (prodMaisBarato.getPreco() > p.getPreco()) {
				prodMaisBarato = p;
			}
		}
		prodMaisBarato.exibir();
	}

	private static void exibeMediaIdadeClientes() {
		int mediaIdade = 0;

		for (Cliente c : listaClientes) {
			mediaIdade += c.getIdade();
		}
		mediaIdade = mediaIdade / listaClientes.size();
		System.out.println("A média de idade dos clientes e: " + mediaIdade);

	}

	private static void exibeClienteAbaixoDezoito() {
		int qtdClientesAbaixoDezoito = 0;

		for (Cliente c : listaClientes) {
			if (c.getIdade() < 18) {
				qtdClientesAbaixoDezoito++;
			}
		}

		System.out.println("Existem " + qtdClientesAbaixoDezoito + " Clientes abaixo de 18 anos.");

	}

	private static void exibeClienteMaisSessenta() {
		int qtdClientesMaisSessenta = 0;

		for (Cliente c : listaClientes) {
			if (c.getIdade() > 60) {
				qtdClientesMaisSessenta++;
			}
		}
		System.out.println("Existem " + qtdClientesMaisSessenta + " Clientes acima dos 60 anos.");
	}

	private static void exibeClienteMaisVelho() {
		Cliente clienteMaisVelho = listaClientes.get(0);
		for (Cliente c : listaClientes) {
			if (clienteMaisVelho.getIdade() < c.getIdade()) {
				clienteMaisVelho = c;
			}
		}
		clienteMaisVelho.exibir();
	}

	private static void exibeClienteMaisJovem() {
		Cliente clienteMaisJovem = listaClientes.get(0);
		for (Cliente c : listaClientes) {
			if (clienteMaisJovem.getIdade() > c.getIdade()) {
				clienteMaisJovem = c;
			}
		}
		clienteMaisJovem.exibir();

	}

	private static void exibeProdutoMaisCaro() {
		Produto produtoMaisCaro = listaProdutos.get(0);

		for (Produto p : listaProdutos) {
			if (produtoMaisCaro.getPreco() < p.getPreco()) {
				produtoMaisCaro = p;
			}
		}
		System.out.println("O produto mais caro e:  ");
		produtoMaisCaro.exibir();

	}

	private static void procurarProdutoTipo() {
		System.out.println("Para realizar a busca, insira parte do tipo da arte ");
		String arteIniciais = tec.next();

		for (Produto p : listaProdutos) {
			if (p.getTipo().startsWith(arteIniciais)) {
				p.exibir();
			}
		}

	}

	private static void procurarProdutoPreco() {
		System.out.println("Para realizar a busca digite o preço da arte: ");
		double desenhoPreco = tec.nextDouble();

		for (Produto p : listaProdutos) {
			if (p.getPreco() == desenhoPreco) {
				p.exibir();
			}
		}

	}

	private static void procurarProdutoDescricao() {
		System.out.println("Para realizar a busca, digite, no minimo, parte da descrição da arte: ");
		String desenhoIniciais = tec.next();
		tec.nextLine();

		for (Produto p : listaProdutos) {
			if (p.getDescricao().startsWith(desenhoIniciais)) {
				p.exibir();
			}
		}

	}

	private static void procurarCliente() {
		System.out.println("Para realizar a busca, insira parte do nome do cliente: ");
		String clienteIniciais = tec.next();

		for (Cliente c : listaClientes) {
			if (c.getNome().startsWith(clienteIniciais)) {
				c.exibir();
			}
		}
	}

	private static void excluirProduto() {
		System.out.println("\nDigite o indice do produto que deseja excluir: ");
		int indexProduto = tec.nextInt();

		while (indexProduto > listaProdutos.size() || indexProduto < 0) {
			System.out.println("Indice invalido !!");
			System.out.println("Digite outro indice: ");

			indexProduto = tec.nextInt();
		}

		listaProdutos.remove(indexProduto);

	}

	private static void cadastrarProduto() {
		Produto produto = new Produto();

		System.out.println("Digite o nome do produto.\n");
		produto.setNome(tec.nextLine());
		produto.setNome(tec.nextLine());

		System.out.println("Digite a descrição do produto.\n");
		produto.setDescricao(tec.nextLine());

		System.out.println("Digite o código do produto.\n");
			try {
				produto.setCodigo(tec.nextInt());
				if (produto.getCodigo() < 0) {
					throw new IllegalArgumentException();
				}
				tec.nextLine();
			}catch (IllegalArgumentException e) {
				System.out.println("Erro: Valor inválido para o código do produto.");
			}finally {
				tec.nextLine();
			}
		

		System.out.println("Digite o nome do autor do produto: ");
		produto.setAutor(tec.next());
		tec.nextLine();


	System.out.println("Digite o preço do produto.\n");
			try {
			produto.setPreco(tec.nextDouble());
			while (produto.getPreco() < 0) {
				
				System.out.println("Digite o preço do produto.\n");
				throw new IllegalArgumentException();
						}

		} catch (IllegalArgumentException e) {
			System.out.println("Erro: O preço não pode ser negativo.");
		} finally {
			tec.nextLine();
		
		}
	
			try {

			produto.setPreco(tec.nextDouble());

		} catch (IllegalArgumentException e) {
			System.out.println("Erro: O preço não pode ser negativo.");
		} finally {
			tec.nextLine();
		
		}

		do {
			try {
				System.out.println("Digite o estilo do produto(Desenho, colar, pulseira, etc).\n");
				produto.setTipo(tec.next());
			} catch (InputMismatchException e) {
				System.out.println("Erro: Valor inválido para o estilo da obra.");
			}finally {
				tec.nextLine();
			}
		} while (!(produto.getTipo() instanceof String));

		listaProdutos.add(produto);
	}

	private static void excluirFuncionario() {
		System.out.println("\nDigite o indice do funcionario que deseja excluir: ");
		int indexFunc = tec.nextInt();

		while (indexFunc > listaFuncionarios.size() || indexFunc < 0) {
			System.out.println("Indice invalido !!");
			System.out.println("Digite outro indice: ");

			indexFunc = tec.nextInt();
		}

		listaFuncionarios.remove(indexFunc);

	}

	private static void cadastrarFuncionario() {
		Funcionario funcionario = new Funcionario();

		System.out.println("Digite o nome do funcionário.\n");
		funcionario.setNome(tec.next());
		tec.nextLine();

		while (funcionario.getIdade() < 0) {
			try {
				System.out.println("Digite a idade do funcionário.\n");
				funcionario.setIdade(tec.nextInt());

			} catch (IllegalArgumentException e) {
				System.out.println("Erro: Valor inválido para idade.");
			}
		}

		do {
			try {
				System.out.println("Dê uma breve descrição sobre o funcionário.\n");
				funcionario.setDescFunc(tec.nextLine());
				tec.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Erro: Descrição inválida.");
			}finally {
				tec.nextLine();
			}
		} while (!(funcionario.getDescFunc() instanceof String));

		while (funcionario.getCodigo() < 0) {
			try {
				System.out.println("Digite o código do funcionário.\n");
				funcionario.setCodigo(tec.nextInt());
			} catch (IllegalArgumentException e) {
				System.out.println("Codigo invalido !!");
			}finally {
				tec.nextLine();
			}
		}

		while (funcionario.getSalario() < 0) {
			try {
				System.out.println("Digite o salário do funcionário.\n");
				funcionario.setSalario(tec.nextDouble());
			} catch (InputMismatchException e) {
				System.out.println("Erro: O salário não pode ser negativo.");
			}finally {
				tec.nextLine();
			}
		}

		listaFuncionarios.add(funcionario);
	}

	private static void excluirCliente() {
		System.out.println("\nDigite o indice do cliente que deseja excluir: ");
		int indexCliente = tec.nextInt();

		while (indexCliente > listaClientes.size() || indexCliente < 0) {
			System.out.println("Indice invalido !!");
			System.out.println("Digite outro indice: ");

			indexCliente = tec.nextInt();
		}

		listaClientes.remove(indexCliente);
	}

	private static void cadastrarCliente() {
		Cliente cliente = new Cliente();

		System.out.println("Digite o nome do cliente.\n");
		cliente.setNome(tec.next());
		tec.nextLine();

		while (cliente.getIdade() < 0) {
			try {
				System.out.println("Digite a idade do cliente.");
				cliente.setIdade(tec.nextInt());
			} catch (IllegalArgumentException e) {
				System.out.println("Erro: Valor inválido para idade.");
			}finally {
				tec.nextLine();
			}
		}

		while (cliente.getCodigo() < 0) {
			try {
				System.out.println("Digite o código do cliente.");
				cliente.setCodigo(tec.nextInt());
			} catch (IllegalArgumentException e) {
				System.out.println("Erro: Valor inválido para código.");
			}finally {
				tec.nextLine();
			}
		}

		while (cliente.getPedidos() < 0) {
			try {
				System.out.println("Digite o número de pedidos do cliente.");
				cliente.setPedidos(tec.nextInt());
			} catch (IllegalArgumentException e) {
				System.out.println("ERRO: valor invalido para numero de pedidos.");
			}finally {
				tec.nextLine();
			}
		}

		while (cliente.getTelefone() < 0) {
			try {
				System.out.println("Digite o número de telefone do cliente.");
				cliente.setTelefone(tec.nextInt());
			} catch (IllegalArgumentException e) {
				System.out.println("Erro: Valor inválido para telefone.");
			}finally {
				tec.nextLine();
			}
		}

		listaClientes.add(cliente);
	}

}
