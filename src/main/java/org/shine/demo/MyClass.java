package org.shine.demo;

import java.util.Objects;

/**
 * <b>Description</b> :
 *
 * @author Vinod Akkepalli
 */
public class MyClass {
    private final String str;

    public MyClass(String input) {
        this.str = input;
    }

    public String getStr() {
        return str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return Objects.equals(str, myClass.str);
    }

    @Override
    public int hashCode() {
        return Objects.hash(str);
    }
}
