package Test;

import java.io.File;
import java.io.IOException;

public class CreateDeleteFile {

    public static void createFile(String file) throws IOException {

        File file1 = new File(file);
        if (!file1.exists()) {
            file1.createNewFile();
        } else {
            System.out.println("  >> File Is Already Exists!");
        }
    }

    public static void deleteFile(String file) throws IOException {

        File file1 = new File(file);
        if (file1.exists()) {
            file1.delete();
        } else {
            System.out.println("  >> You can not delete a File which does not Exists!");
        }

    }
}