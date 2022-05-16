package com.jeddi.belajarspring;

import com.jeddi.belajarspring.data.Bar;
import com.jeddi.belajarspring.data.Foo;
import com.jeddi.belajarspring.data.FooBar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencyInjectionConfiguration {

    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    @Bean
    public FooBar FooBar(Foo foo, Bar bar) {
        return new FooBar(foo, bar);
    }
}
