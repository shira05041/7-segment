import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

    private static final String INPUT_FILE_NAME = "input_Q1a.txt";
    private static final String OUTPUT_FILE_NAME = "my_output_Q1a.txt";

    public static List<String> readSevenSegmentFile(String filePath) {

        List<String> lines = new ArrayList<>();
        Path path = Path.of(filePath + INPUT_FILE_NAME);
        if (Files.exists(path)) {

            try {
                lines = Files.readAllLines(path);     
            } catch (IOException e) {
                e.printStackTrace();
                } 

        } else {
                System.out.println("file does not exist at specified path: " + filePath);
            }
            return lines; 
    }

    public static void writeNumbersToFile(String filePath, List<String> numbers) {
        Path path = Path.of(filePath + OUTPUT_FILE_NAME);

        try {
            Files.write(path, numbers);
            System.out.println("numbers have successfuly written to " + OUTPUT_FILE_NAME + " file");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

}
