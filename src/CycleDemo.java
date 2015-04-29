import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CycleDemo {
int numberOfWheels, weight, count;

public static void main (String[]args) {
    java.io.File file = new java.io.File("Cycle.txt");
    Scanner input = new Scanner(System.in);
         double weight, wheel;
           try{
               System.out.println("Please enter the weight");
             weight= input.nextDouble();
                 System.out.println("Please enter the number of wheels");  
                wheel = input.nextDouble();
            try{ 
                    
             
               Cycle test = new Cycle();
               test.setNumberOfWheels(wheel);
               test.setWeight(weight);
               
               System.out.print(test.toString());
               
               java.io.PrintWriter output; 
        try {
            output = new java.io.PrintWriter(file);
             output.println(test.toString());
               output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CycleDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
              
               }
          catch (InvalidValueException ex){
              System.out.println(ex);
              
          }
         try{
            Scanner fileReader = new Scanner(new File("/Users/Space/Documents/Csc201Projects/Unit3/Cycle/Cycle/Cycle.txt"));
                    
            System.out.println("\n"+fileReader.nextLine());
            System.out.println("File Exists path is true");
            fileReader.close();
        } catch(FileNotFoundException e){
            System.out.printf("File not found");
        }
            
            
            System.out.println("");
             
               System.out.println("Does it exist? "+ file.exists());
               System.out.println("The file has "+ file.length()+"bytes");
               System.out.println("Can it be read? "+ file.canRead());
               System.out.println("Can it be written? "+file.canWrite());
               System.out.println("Is it a directory? "+ file.isDirectory());
               System.out.println("Is it a file? "+ file.isFile());
               System.out.println("Is it absolute? "+ file.isAbsolute());
               System.out.println("Is it hidden? "+ file.isHidden());
               System.out.println("Absolute path is "+ file.getAbsolutePath());
               System.out.println("Last Modified on "+ new java.util.Date(file.lastModified()));
                
           } catch(InputMismatchException e){
               JOptionPane.showMessageDialog(null,"Please enter a numerical value");
               System.exit(0);
           }	
}  
}
