package backendschool.week5.day1020.stack2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class stack02Test {
    /**
     * @BeforeEach 는 각 테스트가 실행되기 전에 실행되는 구간
     * 각 테스트틑 독립적으로 실행되어야 하기 때문에
     * db에서 데이터를 지우는 코드
     * db에 데이터를 넣는 코드 등을 넣는다.
     */



    @BeforeEach
    void setUp() {
        // ex) db에서 데이터 지우는 코드
        // ex) db에 데이터를 넣는 코드
        System.out.println("before each");
    }

    @Test
    @DisplayName("push Test")
    void push() {
        //.push()
        //.getArr()

        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);

        Integer[] arr = st.getArr();
        assertEquals(20, arr[1]);
        assertEquals(10, arr[0]);
    }

    @Test
    @DisplayName("pushAndPop")
    void pushAndPop() {

        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);

        assertEquals(20, st.pop());
        assertEquals(10, st.pop());

        assertThrows(RuntimeException.class, () -> {
            st.pop();
        });
    }

    @Test
    @DisplayName("isEmpty Test")
    void isEmpty() {

        Stack02 st = new Stack02();
        assertTrue(st.isEmpty());
        st.push(10);
        assertFalse(st.isEmpty());
        st.pop();
        assertTrue(st.isEmpty());
    }

    @Test
    void peek() {
        Stack02 st = new Stack02();
        // stack이 비었는데 peek 할때
        assertThrows(EmptyStackException.class, () -> {
            st.peek();
        });

        st.push(10);
        int peeked = st.peek();
        assertEquals(10, peeked);
    }

    @Test
    void realStack() {
        Stack<Integer> st = new Stack<>();
        assertThrows(EmptyStackException.class, () -> {
            st.pop();
        });
    }
}