/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraquestao;

import java.util.ArrayList;

/**
 *
 * @author Rennan
 */
public class Repository {
    
    Fare fare = new Fare();
    Operator operator = new Operator();
    
    ArrayList<Fare> Lista = new ArrayList();
        
    public void insert (double valor, String operador){
        if(!operator.getCode().equalsIgnoreCase(operador)) {
            operator.setCode(operador);
            fare.setOperatorId(operador);
            fare.setValue(valor);
            fare.setStatus(1);
            //Lista.add(0,);
            System.out.println("Tarifa cadastrada com sucesso!");
        } else if(operator.getCode().equalsIgnoreCase(operador) && 
                operador.equalsIgnoreCase(fare.getOperatorId())){
            if(fare.getStatus() == 1) {
                System.out.println("Operador já possui tarifa cadastrada!");
            }
        }
    }
    
    public void update (){
        
    }
    
}
