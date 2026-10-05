import java.util.ArrayList;
import java.util.List;

class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = "";

            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
                s = "FizzBuzz";
            } else if ((i + 1) % 3 == 0) {
                s = "Fizz";
            } else if ((i + 1) % 5 == 0) {
                s = "Buzz";
            } else {
                s = String.valueOf(i + 1);
            }

            result.add(s);
        }

        return result;
    }
}
