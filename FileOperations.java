import java.io.*;
import java.util.Scanner;

public class  FileOperations {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            File obj = new File("myFile.txt");

            if (obj.createNewFile()) {
                System.out.println("File created: " + obj.getName());
            } else {
                System.err.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error has occoured.");
            e.printStackTrace();
        }

        try {
            FileWriter Writer = new FileWriter("myFile.txt", true);

            System.out.println("What do you want to write in the file 'myFile.txt'");
            String  a = sc.nextLine();
            Writer.write(a);
            Writer.close();

            System.out.println("Successfully writen.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            File obj = new File("myFile.txt");
            Scanner Reader = new Scanner(obj);

            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println("The file now contains: ");
                System.out.println(data);                
            }

            Reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }

        File obj = new File("myFile.txt");

        System.out.println("Do you want to delete this file");
        System.out.println("1 for No || 2 for Yes");
        int a = sc.nextInt();

        switch(a) {
            case 1: System.out.println("This file is not deleted");
            break;

            case 2: if(obj.delete()) {
                System.out.println("The deleted file is " + obj.getName());
            } else {
                System.out.println("Failed to delete the file");
            }
            break;

            default: System.out.println("Failed to take an input");
        }
    }
}
