/**
 * Created by Andrew on 12/29/2016.
 */
public class Main
{
    public static void main(String[] args) //Traffic Controller - passes data from from class to another
    {
        Reader reader = new Reader("Raw_Country_Data.csv");
        Transformer transformer = new Transformer();
        Writer writer = new Writer();

        String line;
        do
        {
            line = reader.readLine();
            System.out.println(line);
        }
        while (line != null);


    }
}
