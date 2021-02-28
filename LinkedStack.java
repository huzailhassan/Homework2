public class LinkedStack<T> implements StackInterface<T>
{
    private Node topNode;

    public LinkedStack()
    {
        topNode = null;
    }

    public void push(T newEntry)
    {
        Node newNode = new Node(newEntry, topNode);
        topNode = newNode;
        //topNode = new Node(newEntry, topNode); // Alternate code
    } // end push

    public T pop()
    {
       T top = peek();  // Might throw EmptyStackException
       // Assertion: topNode != null
       topNode = topNode.getNextNode();
    
       return top;
    } // end pop

    public T peek()
    {
       if (isEmpty())
          throw new EmptyStackException();
       else
          return topNode.getData();
    } // end peek
    
    public boolean isEmpty()
    {
        return topNode == null;
    } // end isEmpty

    public void clear()
    {
        topNode = null;
    }

    private class Node
    {
        private T data; // entry in stack
        private Node next; //link to next node

        private T getData()
    {
    return data;
    } // end getData

    private void setData(T newData)
    {
        data = newData;
    } // end setData

    private Node getNextNode()
    {
        return next;
    } // end getNextNode

    private void setNextNode(Node nextNode){
        next = nextNode;
    } // end setNextNode
        
    }
}

