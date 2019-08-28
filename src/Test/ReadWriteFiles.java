package Test;

import java.io.*;
import java.util.Scanner;

public class ReadWriteFiles {

    public static String ReadFile(String file) {
        String text = "";
        try {
            if (file.isEmpty()) {
                System.out.println("  >> Oops!, This file is empty!!");
            }else {
                System.out.println("  >> Is this file empty ? " + file.isEmpty());
                Scanner readFile = new Scanner(new File(file));
                while (readFile.hasNextLine()) {
                    text = text + "\n" + readFile.nextLine();
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("  >> You can not read from this file, because file does not exist!");
        }
        return text;
    }

    public static void WriteFile(String file) {
        try {
            Scanner write = new Scanner(System.in);
            System.out.print("\n  >> Enter Your Data: ");
            FileWriter fw = new FileWriter(new File(file), true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(write.nextLine());
            pw.close();
            fw.close();
        } catch (IOException ie) {
            System.out.println("  >> You can not write to this file, because file does not exist!");
        }
    }
}