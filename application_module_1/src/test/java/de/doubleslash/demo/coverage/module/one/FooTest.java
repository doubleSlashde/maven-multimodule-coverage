package de.doubleslash.demo.coverage.module.one;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FooTest {

    @Test
    public void testFooMethod() {
        Foo testee = new Foo();
        assertThat(testee.fooMethod(), is(7));
    }

}
