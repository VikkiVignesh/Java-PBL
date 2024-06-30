import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Count {
    public static void main(String[] args) {
        File test=new File("Example.txt");
        FileReader file=null;
        

        try {
            file = new FileReader(test);
            int c, cnt = 0;
            while ((c = file.read()) != -1) {
                if ('a' == (char) c) {
                    cnt++;
                }
            }
            System.out.println("Number of times 'a' appears in the file: " + cnt);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (file != null) {
                    file.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
