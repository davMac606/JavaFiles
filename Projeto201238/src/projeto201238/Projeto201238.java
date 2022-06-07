package projeto201238;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Projeto201238 {
  
   public static void main(String[] args) {
   ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
   ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
   ArrayList<Produto> listaProduto = new ArrayList<Produto>();

   Scanner tec = new Scanner(System.in); 


   System.out.println("Bem-vindo ao COTIL-art! O que deseja fazer?\n(0):Encerrar funcionamento do programa.\n(1):Efetuar cadastro de um cliente\n(2):Excluir cadastro de um cliente\n(3):Exibir cadastro de clientes\n(4):Efetuar cadastro de um funcionário\n(5):Excluir cadastro de funcionários\n(6):Exibir cadastro de funcionários\n(7):Efetuar cadastro de um produto\n(8):Excluir cadastro de um produto\n(9):Exibir cadastro de produtos\n(10):Buscar um cliente através do nome\n(11):Buscar um funcionário através do nome\n(12):Buscar um produto através da descrição\n(13):Buscar um produto através do tipo\n(14):Exibir o cliente de maior idade\n(15):Exibir o cliente mais jovem\n(16):Exibir o cliente mais jovem\n(17):Exibir a quantidade de clientes acima de 60 anos\n(18):Exibir a quantidade de clientes abaixo de 18 anos\n(19):Exibir a média de idade dos clientes\n(20):Exibir o produto mais caro\n(21):Exibir o produto mais barato\n(22):Exibir a média de preços\n(23):Exibir a quantidade de produtos acima da média de preço.");
   
    int escolhaUser = (tec.nextInt());

       
   Cliente cl1 = new Cliente();
   System.out.println("Digite o nome do cliente.\n");
   cl1.setNome(tec.next());
   tec.nextLine();
   System.out.println("Digite a idade do cliente.\n");
   try {
      cl1.setIdade(tec.nextInt());
      if (cl1.getIdade() <= 0) {
         throw new InputMismatchException();
      }
   } catch (InputMismatchException e) {
      System.out.println("Erro: Valor inválido para idade.");
   }
   System.out.println("Digite o código do cliente.\n");
   try {
      cl1.setCodigo(tec.nextInt());
      if (cl1.getCodigo() <= 0) {
         throw new InputMismatchException();
      }
   } catch (InputMismatchException e1) {
      System.out.println("Erro: Valor inválido para código.");
   }
   System.out.println("Digite o número de pedidos do cliente.\n");
   cl1.setPedidos(tec.nextInt());
   System.out.println("Digite o número de telefone do cliente.\n");
   try {
      cl1.setTelefone(tec.nextInt());
      if (cl1.getTelefone() <= 0) {
         throw new InputMismatchException();
      }
   } catch (InputMismatchException e2) {
      System.out.println("Erro: Valor inválido para telefone.");
   }

       

   Funcionario func1 = new Funcionario();
   System.out.println("Digite o nome do funcionário.\n");
   func1.setNome(tec.next());
   tec.nextLine();

   System.out.println("Digite a idade do funcionário.\n");
   try {
      func1.setIdade(tec.nextInt());
      if (func1.getIdade() <= 0) {
         throw new InputMismatchException();
      }
   } catch (InputMismatchException e3) {
      System.out.println("Erro: Valor inválido para idade.");
   }

   System.out.println("Digite o estilo favorito de arte do funcionário.\n");
   try {
      func1.setEstiloArte(tec.next());
      tec.nextLine();
   } catch (InputMismatchException e4) {
      System.out.println("Erro: Estilo favorito de arte inválido.");
   }

   System.out.println("Digite o código do funcionário.\n");
   func1.setCodigo(tec.nextInt());
   tec.nextLine();

   System.out.println("Digite o salário do funcionário.\n");
   try {
      func1.setSalario(tec.nextDouble());
      if (func1.getSalario() < 0) {
         throw new InputMismatchException();
      }
   } catch (InputMismatchException e5) {
      System.out.println("Erro: O salário não pode ser negativo.");
   }
   func1.exibir();

   Produto prod1 = new Produto();

   System.out.println("Digite o nome do produto.\n");
   try {
      prod1.setNome(tec.next());
      tec.nextLine();
   } catch (InputMismatchException e6) {
      System.out.println("Erro: Nome inválido para o produto.");
   }

   System.out.println("Digite a descrição do produto.\n");
   prod1.setDescricao(tec.next());
   tec.nextLine();

   System.out.println("Digite o código do produto.\n");
   try {
      prod1.setCodigo(tec.nextInt());
      if (prod1.getCodigo() <= 0) {
         throw new InputMismatchException();
      }
   } catch (InputMismatchException e7) {
      System.out.println("Erro: Valor inválido para o código do produto.");
   }

   System.out.println("Digite o preço do produto.\n");
   try {
      prod1.setPreco(tec.nextDouble());
      if (prod1.getPreco() < 0) {
         throw new InputMismatchException();
      }
   } catch (InputMismatchException e8) {
      System.out.println("Erro: O preço não pode ser negativo.");
   }
   System.out.println("Digite o estilo do produto(Desenho, colar, pulseira, etc).\n");
   try {
      prod1.setTipo(tec.next());
      tec.nextLine();
   } catch (InputMismatchException e9) {
      System.out.println("Erro: Valor inválido para o estilo da obra.");
   }
   prod1.exibir();
   tec.close();
   }
}
