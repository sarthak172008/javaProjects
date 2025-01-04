import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class CurrencyConverter2INR {
    private static final String API_KEY = "53d6c8e8e01a0f3fb6cddc95";
    private static final String BASE_URL = "http://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public static double getExchangeRate(String fromCurrency, String toCurrency) throws Exception {
        URL url = new URL(BASE_URL + fromCurrency);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        if(conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

        StringBuilder responseStrBuilder = new StringBuilder();
        String output;

        while((output = br.readLine()) != null) {
            responceStrBuilder.append(output);
        }

        JSONObject jsonResponce = new JSONObject(responseSteBuilder.toString());

        conn.disconnect();

        return conversionRate;
    }

    public static void main(String[] args) {
        try{
            double rate = getExchangeRate("USD", "INR");
            System.out.println("Exchange Rate From USD to INR: " + rate);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}