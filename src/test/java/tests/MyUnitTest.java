package tests;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import category.Failing;

public class MyUnitTest {

    @Test
    public void test() {
        System.out.println("test");
    }

    @Test
    @Category(Failing.class)
    public void failingTest() {
        System.out.println("failingTest");

    }
}
