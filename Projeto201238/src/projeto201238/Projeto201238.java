package projeto201238;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Projeto201238 {

   public static void main(String[] args) {
      Scanner tec = new Scanner(System.in);
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
      } catch (InputMismatchException e) {
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
      } catch (InputMismatchException e) {
         System.out.println("Erro: Valor inválido para telefone.");
      }
      cl1.exibir();

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
      } catch (InputMismatchException e) {
         System.out.println("Erro: Valor inválido para idade.");
      }

      System.out.println("Digite o estilo favorito de arte do funcionário.\n");
      try {
         func1.setEstiloArte(tec.next());
         tec.nextLine();
      } catch (InputMismatchException e1) {
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
      } catch (InputMismatchException e) {
         System.out.println("Erro: O salário não pode ser negativo.");
      }
      func1.exibir();

      Produto prod1 = new Produto();

      System.out.println("Digite o nome do produto.\n");
      try {
         prod1.setNome(tec.next());
         tec.nextLine();
      } catch (InputMismatchException e) {
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
      } catch (InputMismatchException e) {
         System.out.println("Erro: Valor inválido para o código do produto.");
      }

      System.out.println("Digite o preço do produto.\n");
      try {
         prod1.setPreco(tec.nextDouble());
         if (prod1.getPreco() < 0) {
            throw new InputMismatchException();
         }
      } catch (InputMismatchException e) {
         System.out.println("Erro: O preço não pode ser negativo.");
      }
      System.out.println("Digite o estilo do produto(Desenho, colar, pulseira, etc).\n");
      try {
         prod1.setEstilo(tec.next());
         tec.nextLine();
      } catch (InputMismatchException e) {
         System.out.println("Erro: Valor inválido para o estilo da obra.");
      }
      prod1.exibir();
      tec.close();
   }
}
