package Exercise_01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProgram {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("data/source.txt");
            FileWriter fw = new FileWriter("data/target.txt", true);

            CopyDataThread t = new CopyDataThread(fr, fw);

            t.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
