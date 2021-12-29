// 각 MaxSum 결과 Test
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSumTest {

    static int result1, result2, result3, result4;

    @BeforeAll
    static void init() {
        int[] arr = {10, -2, 8, 1, 5, -5, 4, 9, -12};
        result1 = MaxSum.inefficientMaxSum(arr);
        result2 = MaxSum.betterMaxSum(arr);
        result3 = MaxSum.fastMaxSum(arr, 0, arr.length-1);
        result4 = MaxSum.fastestMaxSum(arr);
        System.out.println("테스트 시작");
    }

    @Test
    @DisplayName("결과값 비교")
    void test() {
        System.out.println("알고리즘 결과값: " + result1);
        assertEquals(result1, result2);
        assertEquals(result1, result3);
        assertEquals(result1, result4);
    }

    @AfterAll
    static void tearDown() {
        System.out.println("테스트 종료");
    }
}