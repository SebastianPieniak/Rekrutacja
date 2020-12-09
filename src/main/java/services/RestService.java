package services;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Logger;

public class RestService {

    Logger logger = Logger.getLogger(RestService.class.getName());

    public RestService() {}

    public int getDataFromRest(){

        try {

            URL url = new URL("http://www.randomnumberapi.com/api/v1.0/random?min=100&max=1000&count=1");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            if (httpURLConnection.getResponseCode() != 200) {
                logger.warning("Problem with connection to service HTTP CODE: "+ httpURLConnection.getResponseCode());
                return 0;
            }
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader br = new BufferedReader(inputStreamReader);
            String output;
            while ((output = br.readLine()) != null) {
                return  Integer.parseInt(output.substring(1,output.length()-1));
            }
            httpURLConnection.disconnect();

        } catch (Exception e) {
           logger.warning("Exception "+ e.getMessage());
        }

        return 0;
    }

}
