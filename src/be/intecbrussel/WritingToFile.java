package be.intecbrussel;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WritingToFile {
    public static void main(String[] args) {

        Path path = Paths.get("MyFolder/Secrets");

        String data = "Ik ben heel moe";

//        Path path2 = Paths.get("");
//        System.out.println(path2.toAbsolutePath());


        try {
            Files.writeString(path,data);
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> people = new ArrayList<>();
        people.add("jean-Bon");
        people.add("jean-Vie");
        people.add("jean-Tille");
        people.add("jean-Nuit");


        try {
            Files.write(path, people);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
