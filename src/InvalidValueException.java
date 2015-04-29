/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Space
 */
import java.util.*;
public class InvalidValueException extends Exception {
    private double value=0;
   
     public InvalidValueException(){
        System.out.println("Invalid value must be greater than zero "+ value);
        
    }
    public InvalidValueException(double value){
        super("Invalid value must be greater than zero "+ value);
        this.value=value;
    }
    public double getValue(){
        return value;
    }
    
}
