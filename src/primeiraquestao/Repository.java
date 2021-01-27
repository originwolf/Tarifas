/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraquestao;

/**
 *
 * @author Rennan
 */
public class Repository {
    
    Fare fare = new Fare();
    Operator operator = new Operator();
        
    public void insert (double valor, String operador){
       if(operator.getCode().equalsIgnoreCase(operador) 
                && fare.getValue() == valor) {
                System.out.println("Operador já possui tarifa cadastrada!");
        } else {
            operator.setCode(operador);
            fare.setOperatorId(operador);
            fare.setValue(valor);
            fare.setStatus(1);
            System.out.println("Tarifa cadastrada com sucesso!");
       }
    }
}