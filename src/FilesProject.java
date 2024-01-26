import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FilesProject {

    public static void main(String[] args)
    {
        File outputFile = new File("./src/calculations.txt");
        try
        {
            if(outputFile.createNewFile()) { System.out.println("The file calculations.txt did not yet exist, so it was created."); }
        }
        catch(IOException e) { System.out.println(e); }

        PrintWriter output = null;
        try { output = new PrintWriter(outputFile); }
        catch(FileNotFoundException e) { System.out.println(e); }

        Random rand = new Random();

        for(int i = 0; i<1000; i++)
        {
            output.println(rand.nextInt(0, 1001));
        }
        output.close();

    }
}
