package programacion.SystemProperties.FileManager;

import java.io.*;
import java.util.Scanner;

public class FileManager {
    //global file to work
    private static File file = new File("C:\\Users\\Alfredo Acosta\\Documents\\Programs\\Java\\FileManagerPractice\\test.txt");

    public static void main(String[] args) {

        if(file.exists()){
            System.out.println("El archivo ya existe!");
        }else {
            createFile();

            addInfoTotheFile();

            readFile();
        }

    }

    private static void addInfoTotheFile(){
        try{
            PrintWriter output = new PrintWriter(new FileWriter(file, true));
            String content = "Added info to the file";
            output.println(content);
            output.println();
            output.println("End of the file");
            output.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
        System.out.println("Info added successfully!");
    }

    private static void readFile(){

        try{
            //File reader.. lee caracteres, buffer reader lineas completas...
            //BufferedReader input = new BufferedReader(new FileReader(file));
            //String read = input.readLine();

            Scanner input = new Scanner(file);

            while (input.hasNextLine()){

                String read = input.nextLine();
                System.out.println("Contenido  : " + read);

            }input.close();

        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    private static void createFile(){

        try{
            PrintWriter output = new PrintWriter(new FileWriter(file));
            output.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
        System.out.println("Archivo creado");
    }
}
