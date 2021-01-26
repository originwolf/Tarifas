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
public class Fare {
    
    private int Id, Status;
    private double Value;
    private String OperatorId;
    
    Fare() {
        
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getOperatorId() {
        return OperatorId;
    }

    public void setOperatorId(String OperatorId) {
        this.OperatorId = OperatorId;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

    public double getValue() {
        return Value;
    }

    public void setValue(double Value) {
        this.Value = Value;
    }
    
}
