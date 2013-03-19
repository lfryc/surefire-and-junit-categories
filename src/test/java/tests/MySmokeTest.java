package tests;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import category.Failing;
import category.Smoke;

@Category(Smoke.class)
public class MySmokeTest {

    @Test
    public void smokeTest() {
        System.out.println("smokeTest");
    }

    @Category(Failing.class)
    @Test
    public void failingTest() {
        System.out.println("failingTest");
    }
}
