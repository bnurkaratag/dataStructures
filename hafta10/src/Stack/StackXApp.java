package Stack;

public class StackXApp {
    public static void main(String[] args) {
        StackX theStack = new StackX(10);
        //ekleme
        theStack.push('b');
        theStack.push('n');
        theStack.push('u');
        theStack.push('r');

        while (!theStack.isEmpty()) {
            //karakter basmak icin
            char peekvalue = theStack.peek();
            char value = theStack.pop();

            System.out.print(value + " ");
        }
        System.out.println(" ");
    }
}
