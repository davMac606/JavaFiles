package projeto201238;

import java.util.Scanner;
import java.util.ArrayList;

public class Projeto201238 {

    public static void main(String[] args) {
        ArrayList<Cliente> listaCliente = new ArrayList();
        Scanner teclado = new Scanner(System.in);
     Cliente cl1 = new Cliente();
        System.out.println("Digite o nome do cliente.\n");
     cl1.setNome(teclado.nextLine());
        System.out.println("Digite a idade do cliente.\n");
     cl1.setIdade(teclado.nextInt());
        System.out.println("Digite o código do cliente.\n");
     cl1.setCodigo(teclado.nextInt());
        System.out.println("Digite o número de pedidos do cliente.\n");
     cl1.setPedidos(teclado.nextInt());
        System.out.println("Digite o número de telefone do cliente.\n");
     cl1.setTelefone(teclado.nextInt());

     listaCliente.add(cl1);
     cl1.exibir();
     
    }
    
}

    
