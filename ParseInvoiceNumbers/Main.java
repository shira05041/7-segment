import java.util.List;

public class Main {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\smswe\\OneDrive\\Desktop\\My_Repositories\\Taboola\\";

        List<String> segmentData = FileHandler.readSevenSegmentFile(filePath);
    
        List<String> numbers = SevenSegmentParser.convertSegmentToNumber(segmentData);
    
        FileHandler.writeNumbersToFile(filePath, numbers);
    }
}