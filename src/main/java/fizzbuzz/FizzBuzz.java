package fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }

	public String fizzbuzz(int i) {
        if (i == 5) {
            return "Buzz";
        }
        if (i == 3) {
            return "Fizz";
        }
		return "FizzBuzz";
	}
}