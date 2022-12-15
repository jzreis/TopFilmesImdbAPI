import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class ImdbApiClient {
    private String apikey;

    public ImdbApiClient(String apiKey) {
        this.apikey = apiKey;
    }

    public String getBody() throws IOException, InterruptedException {
        URI address = URI.create(apikey);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(address).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();
        return body;
    }
}
