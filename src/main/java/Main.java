import java.util.ArrayList;

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
        ArrayList<Country> countries = new ArrayList<Country>(); //Creates an empty arrayList of type Country
        String line;

        do
        {
            line = reader.readLine();
            Country country = transformer.transform(line); //Returns country into country class
            countries.add(country); //Adds to arrayList
//            System.out.println(country.countryName);

        }
        while (line != null);

        writer.write(countries);
    }
}
