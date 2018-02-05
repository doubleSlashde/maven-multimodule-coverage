package de.doubleslash.demo.coverage.module.one;

public class Foo {

    private int i = 7;
    private String s = "jacoco";

    public int fooMethod() {
        return i;
    }

    public String conditionedFooMethod(boolean condition) {
        if (condition) {
            return s;
        }
        else {
            int j = i + 1;
            return s + String.valueOf(j);
        }
    }

}
