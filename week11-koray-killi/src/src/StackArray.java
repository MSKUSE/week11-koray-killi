import java.util.ArrayList;

public class StackArray implements Stack{

    private ArrayList<Object> stack = new ArrayList<>();

    public ArrayList<Object> getStack() {
        return stack;
    }

    public void setStack(ArrayList<Object> stack) {
        this.stack = stack;
    }

    @Override
    public void push(Object item) {
        stack.add(0,item);
    }

    @Override
    public Object pop() throws MyEmptyStackException {

        if (this.isEmpty()) {
            throw new MyEmptyStackException("You can't pop empty stack");
        }
        return stack.remove(0);
    }

    @Override
    public void peek() {
        System.out.println("The top is " + stack.get(0));
    }

    @Override
    public boolean isEmpty() {
        return stack.size() == 0;
    }
}
