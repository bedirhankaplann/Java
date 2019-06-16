public class Stack
{
    private Node top;

    public Stack()
    {
        this.top = null;
    }
    public void setTop(Node top)
    {
        this.top = top;
    }
    public Node getTop()
    {
        return top;
    }

    public boolean isEmpty()
    {
        return (top == null);
    }
    public void push(int key)
    {
        top = new Node(key, top);
    }
    public int pop()
    {
        if( isEmpty() )
        {
            return 0;
        }
        else
        {
            int key = top.getKey();
            top = top.getNext();
            return key;
        }
    }
}