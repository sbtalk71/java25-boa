package http.clients;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import static java.net.http.HttpResponse.BodyHandlers;

public class GetClient {
    static void main() throws Exception {
        HttpClient httpClient=HttpClient.newHttpClient();

        HttpRequest request= HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/20"))
                .GET()
                .build();
        HttpResponse<String> response=httpClient.send(request, BodyHandlers.ofString());

        System.out.println("Status Code : "+response.statusCode());
        System.out.println(response.body());
    }
}
