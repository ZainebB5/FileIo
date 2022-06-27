package be.intecbrussel.opdracht;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AppCat {
    public static void main(String[] args) {
        Cat cat = new Cat("titi") ;
        Path path = Paths.get("MyFolder/FromPearlToZaineb/");
        try (FileOutputStream fos = new FileOutputStream(".ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(cat);

        }catch (IOException e) {
            e.printStackTrace();
        }

    }

}
