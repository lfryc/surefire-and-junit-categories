package integration.tests;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import category.Failing;
import category.JavaEEOnly;
import category.NoPhantomJS;
import category.Smoke;

@Category(Smoke.class)
@RunWith(Arquillian.class)
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

    @Category(JavaEEOnly.class)
    @Test
    public void notSupportedOnTomcat() {
        System.out.println("notSupportedOnTomcat");
    }

    @Category(NoPhantomJS.class)
    @Test
    public void notSupportedOnFirefox() {
        System.out.println("notSupportedOnFirefox");
    }
}