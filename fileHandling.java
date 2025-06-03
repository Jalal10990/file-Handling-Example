

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class fileHandling {
public static void main(String[] args) {
    

    //code to create a new file
    File myFile = new File("jalal.txt"); 
     try {
        myFile.createNewFile();
    } catch (IOException e) {
        System.out.println("Enable to create this file.");
        e.printStackTrace();
    }


    //code to write a file

    try (FileWriter fileWrite = new FileWriter("jalal.txt")) {

        fileWrite.write("This is our first file from this course \n fine be happy ");
        fileWrite.close();
    } catch (IOException e) {
        
        e.printStackTrace();
    }

    //code to read the file

     try  {
             Scanner sc = new Scanner(myFile);

             while(sc.hasNextLine()){
             String line = sc.nextLine();
             System.out.println(line);
             }
             sc.close();
    } 
    catch (FileNotFoundException e) {
        
        e.printStackTrace();
    }


    // code ffor delete file 
//     if(myFile.delete()){
//         System.out.println("i have deleted : "+myFile.getName());
//     }else{
//         System.out.println("Some error occoured while deleting the file");
//     }





 }
    



}