public class FizzBuzz {

    public Object[] fizzle(int[] numbers) {

        Object[] result = new Object[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0 && numbers[i] % 15 != 0) {
                result[i] = "fizz";
            } else if (numbers[i] % 15 == 0) {
                result[i] = "fizzbuzz";
            } else if (numbers[i] % 5 == 0) {
                result[i] = "buzz";
            } else {
                result[i] = numbers[i];
            }
        }

        return result;
    }
}
