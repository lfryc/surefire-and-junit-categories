package integration.tests;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import category.Smoke;

@Category(Smoke.class)
@RunWith(Arquillian.class)
public class MySmokeTest {

    @Test
    public void smokeTest() {
        System.out.println("smokeTest");
    }
}
