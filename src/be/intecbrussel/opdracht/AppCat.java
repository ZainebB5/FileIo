package be.intecbrussel.opdracht;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AppCat {
    public static void main(String[] args) {
        Cat cat = new Cat("titi") ;
        try{
            Path relativePath = Paths.get("C:\\Users\\ZainebB\\IdeaProjects\\FileIO\\MyFolder\\FromPearlToZaineb");
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
        Path path = Paths.get("MyFolder/FromPearlToZaineb/animal.txt");
        try (FileOutputStream fos = new FileOutputStream(path.toFile());
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(cat);

        }catch (IOException e) {
            e.printStackTrace();
        }

    }

}
