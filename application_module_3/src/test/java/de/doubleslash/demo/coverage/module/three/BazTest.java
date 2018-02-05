package de.doubleslash.demo.coverage.module.three;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BazTest {

    @Test
    public void testBazMethod() {
        Baz testee = new Baz();
        assertThat(testee.bazMethod(), is(6));
    }

}
