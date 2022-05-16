package com.jeddi.belajarspring;

import com.jeddi.belajarspring.data.Bar;
import com.jeddi.belajarspring.data.Foo;
import com.jeddi.belajarspring.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DependencyInjectionTest {

    @Test
    void testNoDI() {
        var foo = new Foo();
        var bar = new Bar();

        var fooBar = new FooBar(foo, bar);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());
    }
}
