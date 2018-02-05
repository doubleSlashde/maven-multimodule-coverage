package de.doubleslash.demo.coverage.module.one;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class FooIT {

    @Test
    void testConditionedFooMethod() {
        Foo testee = new Foo();
        assertThat(testee.conditionedFooMethod(true), is("jacoco"));
    }

}
