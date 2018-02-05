package de.doubleslash.demo.coverage.module.two;

public class Bar {

    private int i = 5;
    private String s = "jacoco";

    public int barMethod() {
        return i;
    }

    public String anotherBarMethod() {
        return s + String.valueOf(i);
    }

    public String conditionedBarMethod(boolean condition) {
        if (!condition) {
            return s;
        }
        else {
            int j = i + 1;
            return String.valueOf(j) + s;
        }
    }

}
