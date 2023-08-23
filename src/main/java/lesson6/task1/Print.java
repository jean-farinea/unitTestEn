package lesson6.task1;

import lesson6.task0.FileUtils;
import java.io.IOException;

public class Print {

    public static String printFileContent() throws IOException{
        String content = FileUtils.readFromFile("src/main/resources/data.txt");
        return content;
    }

}
