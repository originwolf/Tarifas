/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraquestao;

import java.util.Scanner;

/**
 *
 * @author Rennan
 */
public class PrimeiraQuestao {
    public static void main(String[] args) {
        
        double valor;
        String operador;

        Repository repo = new Repository();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o valor da tarifa a ser cadastrada: ");
        valor = scanner.nextDouble();
        
        System.out.println("Informe o código da operadora para a tarifa: ");
        System.out.println("Exemplos: OP01, OP02, OP03... ");
        operador = scanner.next();
        
        repo.insert(valor, operador);
    }
}
