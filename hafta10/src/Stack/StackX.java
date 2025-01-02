package Stack;

public class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackX(int s) {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }
    //top degerini once arttirip sora kullandik
    //LIFO-> artirilmis deger yiginin ustuu isaret eder
    //ekleme
    public void push(char j) {
        stackArray[++top] = j;
    }
    //cikarilan eleamnin yerini belirlemek icin
    //silme
    public char pop() {
        return stackArray[top--];
    }
    public char peek() {
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top==-1);
    }
    public boolean isFull(){
        return (top==maxSize-1);
    }

}
