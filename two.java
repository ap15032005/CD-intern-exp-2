//word counter

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
class two
{
  public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);

    System.out.println("Welcome to the word counter game");
    System.out.println("Enter the text or provide atext file path");

    String data= scan.nextLine();

    String fd;

    if(data.endsWith("txt")){
      fd=two.ReadFile(data);
    }
    else{
      fd=data;
    }

    String[] words = fd.split("[\\s\\p{Punct}]+");
    //System.out.println(words);
    int count= words.length;
    System.out.println("total number of words are = "+count);


  }

   public static String  ReadFile(String filepath)
   {
    StringBuilder content = new StringBuilder();

        try
         {
            File file = new File(filepath);
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return content.toString();

  }
}
