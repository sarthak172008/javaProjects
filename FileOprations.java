import java.io.*;
import java.util.Scanner;

public class FileOprations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            File obj = new File("myFile.txt");

            if (obj.createNewFile()) {
                System.out.println("File created: " + obj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter Writer = new FileWriter("myFile.txt", true);

            System.out.println("What do you want to write in the file 'myFile.txt'");
            String a = sc.nextLine();
            Writer.write(a);
            Writer.close();

            System.out.println("Successfully written.");
        } catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }

        try {
            File Obj = new File("myFile.txt");
            Scanner Reader = new Scanner(Obj);

            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.print("The File now Contains : ");
                System.out.println(data);
            }

            Reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }

        File Obj = new File("myFile.txt");

        System.out.println("Do you want to delete this file");
        System.out.println("1 For NO || 2 For Yes");
        int a  = sc.nextInt();
        
        switch (a) {
            case 1 : System.out.println("The file is not Deleted");
            break;

            case 2 : if(Obj.delete()) {
                System.out.println("The deleted file is : " + Obj.getName());
            } else {
                System.out.println("Failed in deleting in file.");
            }
         }
    }
}
