import java.io.File;
import java.util.Scanner;

/**
 * Created by home-folder on 6/12/17.
 */
public class Printer {

    private File fileName;
    private Scanner reader;

    public Printer(String fileName) throws  Exception{
        this.fileName = new File(fileName);
    }

    public void printLinesWhichContain(String word) throws Exception{

        this.reader = new Scanner(this.fileName);

        while(reader.hasNextLine()){

            String line = reader.nextLine();
            if(line.contains(word)){
                System.out.println(line);
            }
        }
        reader.close();
    }
}
