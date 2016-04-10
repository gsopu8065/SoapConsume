import net.webservicex.GeoIPService;

/**
 * Created by srujangopu on 4/10/16.
 */
public class SoapConsume {

    public static void main(String arg[]){

        GeoIPService geoIPService = new GeoIPService();

        String countryName = geoIPService.getGeoIPServiceSoap().getGeoIP("216.58.194.131").getCountryName();

        System.out.println(countryName);


    }
}
