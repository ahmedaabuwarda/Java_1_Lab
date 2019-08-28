/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Manage_Files;

import java.io.*;
import java.util.Scanner;

/**
 * @author Ahmed Abuwarda on: Aug 28,2019.
 */
class ReadWriteFiles {

    /**
     * @param file Any string file.
     * @return Text.
     */
    static String ReadFile(String file) {

        String text = "";

        try {

            // If statement.
            if (file.isEmpty()) {

                System.out.println("  >> Oops!, This file is empty!!");

            } else {

                System.out.println("  >> Is this file empty ? " + file.isEmpty());
                Scanner readFile = new Scanner(new File(file));

                // While loop.
                while (readFile.hasNextLine()) {

                    text = text + "\n" + readFile.nextLine();

                }

            }

        } catch (FileNotFoundException ex) {
            System.out.println("  >> You can not read from this file, because file does not exist!");
        }
        return text;

    }

    /**
     * @param file Any string file.
     */
    static void WriteFile(String file) {

        // Try catch.
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