package projeto201238;

import java.util.Scanner;
import java.util.ArrayList;

public class Projeto201238 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
     Cliente cl1 = new Cliente(teclado.nextLine(),teclado.nextInt(),teclado.nextInt(), teclado.nextInt(),teclado.nextInt());

     cl1.exibir();
    }
    
}
