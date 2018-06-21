public class Test_3__Block_lambda {

    interface MyString {
        String myStringFunction(String str);
    }

    public static void main (String args[]) {
        // Block lambda to reverse string
        MyString reverseStr = (str) -> {
            String result = "";

            for(int i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);

            return result;
        };

        // Output: omeD adbmaL
        System.out.println(reverseStr.myStringFunction("Lambda Demo"));


        MyString getCharsWithDots = (input) -> {
            String output = "";

            for (int i = 0; i<input.length(); i++) {

                output += input.charAt(i) + ".";
            }

            return output;
        };


        // Output: a.b.c.d.e.f.g.h.
        System.out.println(getCharsWithDots.myStringFunction("abcdefgh"));
    }

}
