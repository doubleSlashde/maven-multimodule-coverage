package de.doubleslash.demo.coverage.module.one;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class FooTest {

    @Test
    void testFooMethod() {
        Foo testee = new Foo();
        assertThat(testee.fooMethod(), is(7));
    }

}
