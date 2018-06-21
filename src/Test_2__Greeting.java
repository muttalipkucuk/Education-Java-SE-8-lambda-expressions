public class Test_2__Greeting {

    interface MyGreeting {
        String processName(String str);
    }

    public static void main(String args[]) {
        MyGreeting morningGreeting = (str) -> "Good Morning " + str + "!";
        MyGreeting eveningGreeting = (str) -> "Good Evening " + str + "!";

        // Output: Good Morning Luis!
        System.out.println(morningGreeting.processName("Luis"));

        // Output: Good Evening Jessica!
        System.out.println(eveningGreeting.processName("Jessica"));




        MyGreeting sayHelloWithName = (s) -> ("Hello my friend " + s + ". \nHow are you? \n\nGreetings, bot.");

        System.out.println(sayHelloWithName.processName("John"));
    }
}
