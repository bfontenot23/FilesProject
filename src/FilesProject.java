//Student Name: Beau A Fontenot
//LSU ID: 896506087
//Lab Section: 002 (1:30pm F)

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

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

        File inputFile = new File("./src/calculations.txt");
        int[] nums = new int[1000];
        Scanner input = null;
        try { input = new Scanner(inputFile); }
        catch(FileNotFoundException e) { System.out.println(e); }

        for(int i = 0; i<1000; i++) { nums[i] = input.nextInt(); }

        int sum = 0;
        for (int num : nums) { sum += num; }

        double average = (double) sum /nums.length;

        System.out.printf("\nThe average of all the numbers in calculations.txt is %.2f.", average);

    }
}
