import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class Main {

    private static final String URL = "http://pmk.tversu.ru/";

    public static void main(String[] args) throws IOException {
        URL url = new URL(URL);
        InputStream inputStream = url.openStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String response = bufferedReader.lines().collect(Collectors.joining());
        System.out.println(response);
        inputStream.close();
    }
}