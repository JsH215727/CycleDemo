/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Space
 */
import javax.swing.*;
public class TestEx {
    public static void main(String[]args) {
        try {
        Cycle c = new Cycle(-5,-6);
        } catch (InvalidValueException e) {
            JOptionPane.showMessageDialog(null, "You must enter a positive value");
        }
    }
    
}
