public class StackItem {
        private Object data;
        private StackItem nextpart;

    public StackItem(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public StackItem getNextpart() {
        return nextpart;
    }

    public void setNextpart(StackItem nextpart) {
        this.nextpart = nextpart;
    }
}
