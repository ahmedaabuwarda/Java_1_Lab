/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Manage_Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Ahmed Abuwarda on: Aug 28,2019.
 */
public class EditFile {

    /**
     * @param file Any String file.
     * @param array An array.
     * @return Text
     */
    public static String Edit(String file, String[] array) {

        String text = "";

        // Try catch block.
        try {

            // If statement.
            if (file.isEmpty()) {

                System.out.println("  >> Oops!, This file is Empty!!");

            } else {

                System.out.println("  >> Is this file Empty ? " + file.isEmpty());
                Scanner readFile = new Scanner(new File(file));

                while (readFile.hasNextLine()) {

                    text = text + "\n" + readFile.nextLine();
                    array[0] = text;

                }

            }

        } catch (FileNotFoundException ex) {
            System.out.println("  >> You can not read from this file, because file does not exist!");
        }

        return text;

    }

}