public class StackedLinkedList implements Stack{

    StackItem top;


    @Override
    public void push(Object item) {
        StackItem newBox = new StackItem(item);
        StackItem previousTop = this.top;
        this.top = newBox;
        top.setNextpart(previousTop);

        // Create a box
        // empty the top
        // put the top


    }

    @Override
    public Object pop() throws MyEmptyStackException{
        if(this.top == null) {
            throw new MyEmptyStackException("Stack is empty");
        }
        Object tempData = top.getData();
        top = top.getNextpart();
        return tempData;
    }

    @Override
    public void peek() {
        System.out.println("The top is " + this.top.getData());
    }

    @Override
    public boolean isEmpty() {
        return this.top == null;
    }
}
