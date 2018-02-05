package de.doubleslash.demo.coverage.module.one;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FooIT {

    @Test
    public void testConditionedFooMethod() {
        Foo testee = new Foo();
        assertThat(testee.conditionedFooMethod(true), is("jacoco"));
    }

}
