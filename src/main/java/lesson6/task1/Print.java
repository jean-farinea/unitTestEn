package lesson6.task1;

import lesson6.task0.FileUtils;

import java.io.IOException;

public class Print {

    public static String printFileContent(String filePath) throws IOException {
        return FileUtils.readFromFile(filePath);
    }

}
