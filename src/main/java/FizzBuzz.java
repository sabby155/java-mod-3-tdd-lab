import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public String fizzBuzzString(String str) {

        if(str == null) {
            System.out.println("Null value not accepted");
            return null;
        }

        if (str.startsWith("f") && str.endsWith("b")) return "FizzBuzz";

        if (str.startsWith("f"))  return "Fizz";
        if (str.endsWith("b")) return "Buzz";


        return str;
    }

    public  List<String> fizzBuzzArray(List<String> arr) {
        List<String> resultsArray = new ArrayList<>();

        if(arr == null) {
            System.out.println("Null value not accepted");
            return null;
        }

        for (String value : arr) {
            String fizBuzzedString = fizzBuzzString(value);
            resultsArray.add(fizBuzzedString);
        }

        return resultsArray;
    }
}

