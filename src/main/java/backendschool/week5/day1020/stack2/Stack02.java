package backendschool.week5.day1020.stack2;

public class Stack02 {
    private Integer[] arr;
    private int top;

    public Stack02() {
        this.arr = new Integer[10000];
    }

    public Stack02(int size) {
        this.arr = new Integer[size];
    }

    public Integer[] getArr() {
        return arr;
    }

    public void push(int value) {
        // 10을 넣으면 arr[0] = 10
        this.arr[top] = value;
        this.top++;
    }

    public int pop() {
//        // this.top = 2
//        int value = this.arr[this.top-1];
//        this.top--;
//        return value;
        return this.arr[--this.top]; // 전위연산자 사용
    }
}
