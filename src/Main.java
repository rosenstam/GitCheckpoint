public class Main {

    public static void main(String[] args) {
        System.out.println("This is some text.");
        SuperflousPrinter superflousPrinter = new SuperflousPrinter();
        superflousPrinter.print();
        Dice dice = new Dice();
        System.out.println("Rolling a six-sided die, result is: " + dice.rollD6());
    }
}
