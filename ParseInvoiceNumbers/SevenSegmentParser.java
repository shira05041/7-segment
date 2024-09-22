import java.util.*;

public class SevenSegmentParser {

    private static final Integer LINE_LENGTH = 27;
   

    public static List<String> convertSegmentToNumber(List<String> segmentData) {

        Map<String, Character> segmentToNumber = Map.of(
            " _ | ||_|",  '0',
            "     |  |",   '1',
            " _  _||_ ",  '2',
            " _  _| _|",  '3',
            "   |_|  |",  '4',
            " _ |_  _|",  '5',
            " _ |_ |_|",  '6',
            " _   |  |",  '7',
            " _ |_||_|",  '8',
            " _ |_| _|",'9'
        );

        List<String> numbers = new ArrayList<>();

        String numberStr = "" ;
        String number = "";
        int start = 0;
        for (int i = 0; i < segmentData.size() ; i += 4) { //loop all the list jump 4 row
            start = 0;
            number = "";
           
            while (start < LINE_LENGTH-2) {
                numberStr = "";
                for (int j = i; j < i+3 ; j++) { //3 lines 
                    String line = segmentData.get(j);
                    numberStr += line.substring(start, start + 3); //take 3 chars   
                }
                Character n = segmentToNumber.get(numberStr);
                number += n;
                start += 3;
            }
            numbers.add(number);  
        }   
        return numbers;   
    }      
}
 