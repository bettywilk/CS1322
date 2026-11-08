import java.util.ArrayDeque;

class BuildQueue
{
    public static void main(String [] args)
    {
        //Build queue program
        ArrayDeque<String> myQueue = new ArrayDeque<String>();
        myQueue.add("Item 1:");
        myQueue.add("Item 2:");
        myQueue.add("Item 3:");
        System.out.println(myQueue.peek());

        String nextItem = myQueue.remove();
        System.out.println("Next Item to do is: " +nextItem);
        System.out.println(myQueue.peek());
    }
}	