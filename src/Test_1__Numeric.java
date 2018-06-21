public class Test_1__Numeric {

    interface NumericTest {
        boolean computeTest(int n);
    }

    public static void main(String[] args) {

        NumericTest isEven = (n) -> (n % 2) == 0;
        NumericTest isNegative = (n) -> (n < 0);

        // Output: false
        System.out.println(isEven.computeTest(5));

        // Output: true
        System.out.println(isNegative.computeTest(-5));


        NumericTest isGreaterThanHundred = (n) -> (n > 100);

        // Output: false
        System.out.println(isGreaterThanHundred.computeTest(99));

        // Output: false
        System.out.println(isGreaterThanHundred.computeTest(100));

        // Output: true
        System.out.println(isGreaterThanHundred.computeTest(101));


    }
}
