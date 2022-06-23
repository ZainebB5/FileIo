package be.intecbrussel;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HowDoFilesWork {
    public static void main(String[] args) {
// Absolute Path
        String pathToSecret = "C:\\Users\\ZainebB\\IdeaProjects\\FileIO";
//Relative Path
        String relativePath = "MyFolder/Secrets";

        File file = new File(pathToSecret);

        Path path = Paths.get(pathToSecret);
        //String pathToSecret = "C:\\Users\\ZainebB\\IdeaProjects\\FileIO\\MyFolder\\Secrets\\Secrets2";

//        try {
//            boolean didItWork = file.createNewFile();
//            System.out.println(didItWork);
//            file.delete();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        System.out.println(path);
        path = path.resolve("MyFolder");
        System.out.println(path);
        path = path.resolve("Secrets/Secrets");
        //path = path.resolve("Secrets\\Secrets");
        System.out.println(path);
        Path pathWithRelative = Paths.get(relativePath);
        pathWithRelative =  pathWithRelative.resolve("Secrets");
        System.out.println(pathWithRelative);

        Path fileToPath = file.toPath();
        File pathToFile = path.toFile();




    }
}
