package tests;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import category.Failing;
import category.NotFirefox;
import category.NotTomcat;
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

    @Category(NotTomcat.class)
    @Test
    public void notSupportedOnTomcat() {
        System.out.println("notSupportedOnTomcat");
    }

    @Category(NotFirefox.class)
    @Test
    public void notSupportedOnFirefox() {
        System.out.println("notSupportedOnFirefox");
    }
}
