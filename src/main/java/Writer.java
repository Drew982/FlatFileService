import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Andrew on 12/29/2016.
 */
public class Writer //Takes strings and writes them to a file
{
    public void write(ArrayList<Country> data) //Creates a new data file
    {
        try
        {
            File file = new File("CountryRateOfChange.txt");
            FileWriter writer = new FileWriter(file);
            for(Country country:data) //loops over each country in data list
            {
                if(country != null)
                {
                    System.out.println(country.countryName);
                    writer.write(country.countryName + "," + country.formattedRate + "\n");
                }
            }
            writer.flush(); //Writes data to file (clears buffer)
            writer.close(); //Closes file writer
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
