/**
 * Created by Andrew on 12/29/2016.
 */
public class Country
{
    String countryName;
    int pop1960;
    int pop2015;
    String formattedRate;

    public Country(String countryName, int pop1960, int pop2015, String formattedRate)
    {
        this.countryName = countryName;
        this.pop1960 = pop1960;
        this.pop2015 = pop2015;
        this.formattedRate = formattedRate;
    }
}
