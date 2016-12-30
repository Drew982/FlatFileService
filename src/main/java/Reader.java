import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Andrew on 12/29/2016.
 */
public class Reader //Opens file, reads, closes file, sends to main
{
    private Scanner scanner;
    private File file;

    public Reader(String filename) //Opens file
    {
        file = new File(filename);
        try
        {
            scanner = new Scanner(file);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public String readLine() //Reads a line of a file
    {
        if(scanner.hasNextLine()) //Checks if file has another line
        {
            return scanner.nextLine(); //Reads next line
        }
        else
        {
            scanner.close(); //Closes scanner & returns null
            return null;
        }
    }
}
