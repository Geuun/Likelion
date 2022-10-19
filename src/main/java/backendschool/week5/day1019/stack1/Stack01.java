package backendschool.week5.day1019.stack1;


/**
 * Java에는 이미 Stack 이 구현되어 있으므로
 * 혹시 모를 에러를 피하기 위해서 Stack01로 생성
 */
public class Stack01 {

    private int[] arr = new int[10000];
    private int pointer = 0;

    public Stack01() {
    }

    public Stack01(int size) {
        this.arr = new int[size];
    }

    public void push(int value) {
        this.arr[this.pointer] = value;
        this.pointer ++;
    }

    public int[] getArr() {
        return arr;
    }

    public int pop() {
        // push 10 push 20 pointer 2
        int value = this.arr[this.pointer-1];
        this.pointer--;
        return value;
    }

    public static void main(String[] args) {

    }
}
