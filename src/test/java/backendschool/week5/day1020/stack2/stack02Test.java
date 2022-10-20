package backendschool.week5.day1020.stack2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class stack02Test {
    /**
     * @BeforeEach 는 각 테스트가 실행되기 전에 실행되는 구간
     * 각 테스트틑 독립적으로 실행되어야 하기 때문에
     * db에서 데이터를 지우는 코드
     * db에 데이터를 넣는 코드 등을 넣는다.
     */

    Stack02 st = new Stack02();

    @BeforeEach
    void setUp() {
        // ex) db에서 데이터 지우는 코드
        // ex) db에 데이터를 넣는 코드
        System.out.println("before each");
        st.push(10);
        st.push(20);
    }

    @Test
    @DisplayName("push Test")
    void push() {
        //.push()
        //.getArr()

        Integer[] arr = st.getArr();
        assertEquals(20, arr[1]);
        assertEquals(10, arr[0]);
    }

    @Test
    @DisplayName("pushAndPop")
    void pushAndPop() {

        Integer[] arr = st.getArr();
        assertEquals(20, st.pop());
        assertEquals(10, st.pop());
    }
}