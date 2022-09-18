package ru.amalashok;

import org.junit.jupiter.api.*;

public class JUnitDemoTest {

    @BeforeAll
    static void setUp() {
        System.out.println("### BeforeAll!");
    }

    @BeforeEach
    void BeforeEachTest() {
        System.out.println("###   BeforeEach!");
    }

    @AfterEach
    void AfterEachEachTest() {
        System.out.println("###   AfterEach!");
    }

    @Test
    void simpleTest0() {
        Assertions.assertTrue(3 > 2);
        System.out.println("###      FirstTest!");
    }

    @Test
    void simpleTest1() {
        Assertions.assertTrue(3 > 2);
        System.out.println("###      SecondTest!");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("#### AfterAll!");
    }
}
