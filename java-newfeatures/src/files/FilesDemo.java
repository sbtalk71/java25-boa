package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FilesDemo {
    static void main()  throws IOException {
    String content= Files.readString(Path.of("employees.txt"));
        System.out.println(content);

        String newContent= """
                100,Ranga,Hyderabad,35000
                101,Shantanu,Bangalore,75000
                103,Ramesh,Chennai,45000
                104,Kiran,Bangalore,75000
                105,Rajesh,Chennai,45000
                """;

        //Files.writeString(Path.of("new-employee.txt"), newContent);

        Files.writeString(Path.of("new-employee.txt"),newContent, StandardOpenOption.WRITE, StandardOpenOption.APPEND);
        Files.lines(Path.of("new-employee.txt")).filter(line->line.contains("Chennai")).forEach(System.out::println);

    }
}
