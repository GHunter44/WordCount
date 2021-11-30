package comp.comp152;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        var fileLoc = Paths.get("2600-0.txt");
        List<String> allLines = null;
        try{
            allLines = Files.readAllLines(fileLoc);
        }catch(IOException e){
            System.out.println("Error reading file");
        }
        if(allLines == null)
            System.exit(-1);
        System.out.println(allLines);
    }

    }
