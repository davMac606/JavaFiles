package projeto201238;

import java.util.Scanner;
public class Projeto201238 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
     Cliente cl1 = new Cliente();
     cl1.setNome(teclado.nextLine());
     cl1.setIdade(teclado.nextInt());  
     cl1.setCodigo(teclado.nextInt());
     cl1.setEmail(teclado.nextLine());
     cl1.setTelefone(teclado.nextInt());
    }
    
}