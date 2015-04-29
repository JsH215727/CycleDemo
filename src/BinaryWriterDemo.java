
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Space
 */
public class BinaryWriterDemo {
    public static void main(String[]args) {
        try{
            FileOutputStream output = new FileOutputStream("output.txt");
            ObjectOutputStream objOutput = new ObjectOutputStream(output);
            Cycle aCycle = new Cycle(5.0,9.0);
            objOutput.writeObject(aCycle);
            output.close();
        }catch(FileNotFoundException e){
            System.out.println("Cannot Read File");
            
        }catch (IOException w){
            System.out.println("File cannot be read");
        }catch (InvalidValueException e){
            System.out.println("Please enter a numberical value");
        }
    }
}
