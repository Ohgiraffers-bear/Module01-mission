package com.ohgiraffers.basic.mission02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    @Test
    public void testSumToFive() {
        // 실제 메서드 호출
        int result = Application.calculateSum(5);
        assertEquals(15, result); // 1+2+3+4+5 = 15 확인
        assertTrue(result > 0);   // 합계가 양수인지 확인
    }

    @Test
    public void testSumToThree() {
        // 실제 메서드 호출
        int result = Application.calculateSum(3);
        assertEquals(6, result);  // 1+2+3 = 6 확인
        assertTrue(result > 0);   // 합계가 양수인지 확인
    }

    @Test
    public void testSumToOne() {
        // 실제 메서드 호출
        int result = Application.calculateSum(1);
        assertEquals(1, result);  // 1 = 1 확인
        assertTrue(result > 0);   // 합계가 양수인지 확인
    }
}