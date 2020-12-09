package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utilities {

    Logger logger = Logger.getLogger(Utilities.class.getName());

    public Utilities() {
    }

    public String readFromInputStream(InputStream inputStream)
            throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line);
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
            logger.warning("Problem with file: " + e.getMessage());
            return "0";
        }
        return resultStringBuilder.toString();
    }
}
