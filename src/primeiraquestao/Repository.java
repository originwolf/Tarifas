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
public class Repository {
    
    int tempoMeses;
    
    Fare fare = new Fare();
    Operator operator = new Operator();
    
    Scanner scanner = new Scanner(System.in);
        
    public void insert (double valor, String operador){
        fare.setOperatorId("op01");
        fare.setValue(valor);
        operator.setCode("op01");
        //valores adicionados manualmente para teste de igualdade e inicialização
        //das variáveis
        if(operator.getCode().equalsIgnoreCase(operador) 
                && fare.getValue() == valor) {
            System.out.println("A quanto tempo (meses) a tarifa foi cadastrada?");
            tempoMeses = scanner.nextInt();
            if(tempoMeses <= 6){
                System.out.println("Operador já possui tarifa cadastrada!");
            } else {
                operator.setCode(operador);
                fare.setOperatorId(operador);
                fare.setValue(valor);
                fare.setStatus(1);
                System.out.println("Tarifa cadastrada com sucesso!");
            }        
        } else {
            operator.setCode(operador);
            fare.setOperatorId(operador);
            fare.setValue(valor);
            fare.setStatus(1);
            System.out.println("Tarifa cadastrada com sucesso!");
       }
    }
}