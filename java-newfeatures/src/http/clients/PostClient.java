package http.clients;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static java.net.http.HttpResponse.BodyHandlers;

public class PostClient {
    static void main() throws Exception {
        HttpClient httpClient=HttpClient.newHttpClient();

        String postData= """
                {
                  "userId": 2,
                  "id": 100,
                  "title": "doloribus ad provident suscipit at",
                  "body": "qui consequuntur ducimus possimus quisquam amet similique\\nsuscipit porro ipsam amet\\neos veritatis officiis exercitationem vel fugit aut necessitatibus totam\\nomnis rerum consequatur expedita quidem cumque explicabo"
                }
                """;
        HttpRequest request= HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/"))
                .POST(HttpRequest.BodyPublishers.ofString(postData))
                .build();
        HttpResponse<String> response=httpClient.send(request, BodyHandlers.ofString());

        System.out.println("Status Code : "+response.statusCode());
        System.out.println(response.body());
    }
}
