package be.intecbrussel;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOStreams {
    public static void main(String[] args) {
        //pg376
        writeToFile();
        //readToFile();




    }
    //hulp methodes
    private static void writeToFile(){
    Path path = Paths.get("MyFolder/Secrets/secrets");
//        //automatish afgeclosed als de lijncode tussen  haakjes na try
//
//        try (Writer writer = new FileWriter(path.toFile());
//             BufferedWriter bufferedWriter = new BufferedWriter(writer);){
//
//            bufferedWriter.write("hello World 2");
//            //bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path)){
            bufferedWriter.write("hello World 3");

        } catch (IOException e) {
         e.printStackTrace();
      }

    };
    private static void readToFile(){};

}
