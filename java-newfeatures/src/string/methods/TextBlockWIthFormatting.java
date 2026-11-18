package string.methods;

public class TextBlockWIthFormatting {
    static void main() {
        String data= """
                {
                  "userId": %d,
                  "id": %d,
                  "title": "doloribus ad provident suscipit at",
                  "body": "qui consequuntur ducimus possimus quisquam amet similique\\nsuscipit porro ipsam amet\\neos veritatis officiis exercitationem vel fugit aut necessitatibus totam\\nomnis rerum consequatur expedita quidem cumque explicabo"
                }
                """;
        String formatted= String.format(data,2,20);
        System.out.println(formatted);
    }
}
