/**
 * Created by Andrew on 12/29/2016.
 */
public class Transformer //Takes data line by line and manipulates it
{
    public Country transform(String data)
    {
        if(data != null)
        {
            String[] population = data.split(","); //Splits string into columns
            String countryName = population[0];
            String pop1960 = population[5];
            String pop2015 = population[population.length - 3];

            pop1960 = pop1960.replace("\"", ""); //Replace quotes with empty string
            pop2015 = pop2015.replace("\"", ""); //Replace quotes with empty string
            int intPop1960 = Integer.parseInt(pop1960);
            int intPop2015 = Integer.parseInt(pop2015);

            double rateOfChange = intPop2015 - intPop1960;
            rateOfChange /= 55;
            String formattedRate = String.format("%1$, .2f", rateOfChange);

            return new Country(countryName, intPop1960, intPop2015, formattedRate);
        }
        else
            return null;
    }
}
