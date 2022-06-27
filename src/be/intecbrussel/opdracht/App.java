package be.intecbrussel.opdracht;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        try{
            Path relativePath = Paths.get("C:\\Users\\ZainebB\\IdeaProjects\\FileIO\\MyFolder\\FromZainebToPearl\\message");
            Files.createDirectories(relativePath.getParent());
            if(Files.notExists(relativePath)){
                Files.createFile(relativePath);
                System.out.println("file created");
            }else{
                System.out.println("file already exist");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        try{
            Path relativePath = Paths.get("C:\\Users\\ZainebB\\IdeaProjects\\FileIO\\MyFolder\\FromPearlToZaineb\\animal");
            Files.createDirectories(relativePath.getParent());
            if(Files.notExists(relativePath)){
                Files.createFile(relativePath);
                System.out.println("file created");
            }else{
                System.out.println("file already exist");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        writeToFile();

//        Path path = Paths.get("MyFolder/FromZainebToPearl/message");
//        String data = "ik heb geen inspiratie";
//
//
//        try {
//            Files.writeString(path,data);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }





    }
    //hulp methodes
    private static void writeToFile(){
        Path path = Paths.get("MyFolder/FromZainebToPearl/message");

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path)){
            bufferedWriter.write("ik heb geen inspiratie");

        } catch (IOException e) {
            e.printStackTrace();
        }

    };
    private static void readToFile(){};


}

