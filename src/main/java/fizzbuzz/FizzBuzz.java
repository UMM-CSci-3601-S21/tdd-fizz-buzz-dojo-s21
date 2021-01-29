package fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        for (int i=1; i<=100; ++i) {
            System.out.println(fb.fizzbuzz(i));
        }
    }

	public String fizzbuzz(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        }
        if (i % 3 == 0) {
            return "Fizz";
        }
        if (i % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(i);
	}
}