package projeto201238;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Projeto201238 {

    public static void main(String[] args) {
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        Scanner tec = new Scanner(System.in);
     Cliente cl1 = new Cliente();
        System.out.println("Digite o nome do cliente.\n");
     cl1.setNome(tec.next());
     tec.nextLine();
        System.out.println("Digite a idade do cliente.\n");
        try {
     cl1.setIdade(tec.nextInt());
     if (cl1.getIdade() <= 0 ) {
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
   }catch (InputMismatchException e) {
        System.out.println("Erro: Valor inválido para telefone.");
     }
        
     listaCliente.add(cl1);
     cl1.exibir();
     tec.close();
    }
    
}

    
