/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Manage_Files;

import java.io.File;
import java.io.IOException;

/**
 * @author Ahmed Abuwarda on: Aug 28,2019.
 */
class CreateDeleteFile {

    /**
     * @param file Any string file.
     * @throws IOException Exception.
     */
    static void createFile(String file) throws IOException {

        File file1 = new File(file);

        // If statement.
        if (!file1.exists()) {

            file1.createNewFile();

        } else {

            System.out.println("  >> File Is Already Exists!");

        }

    }

    /**
     * @param file Any string file.
     * @throws IOException Exception.
     */
    static void deleteFile(String file) throws IOException {

        File file1 = new File(file);

        if (file1.exists()) {

            file1.delete();

        } else {

            System.out.println("  >> You can not delete a File which does not Exists!");

        }

    }

}