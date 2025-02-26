package com.ohgiraffers.basic.mission01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    @Test
    public void testEvenNumber() {
        // 실제 메서드 호출
        boolean result = Application.checkEven(4);
        assertTrue(result); // 4가 짝수인지 확인
    }

    @Test
    public void testOddNumber() {
        // 실제 메서드 호출
        boolean result = Application.checkEven(7);
        assertTrue(!result); // 7이 홀수인지 확인 (false 예상)
    }

    @Test
    public void testZeroNumber() {
        // 실제 메서드 호출
        boolean result = Application.checkEven(0);
        assertTrue(result); // 0이 짝수인지 확인
    }

}