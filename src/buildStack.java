import java.util.Stack;

class BuildStack
{
    public static void main(String[] args)
    {
        // Build stack program
        Stack<String> myStack = new Stack<String>();
        myStack.push("Item 1");
        myStack.push("Item 2");
        myStack.push("Item 3");
        System.out.println(myStack.peek());

        String nextItem = myStack.pop();
        System.out.println("Next Item to do is: "+nextItem);
        System.out.println(myStack.peek());
    }
}
