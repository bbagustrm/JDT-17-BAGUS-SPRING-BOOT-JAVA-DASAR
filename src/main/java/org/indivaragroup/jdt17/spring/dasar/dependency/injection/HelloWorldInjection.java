package org.indivaragroup.jdt17.spring.dasar.dependency.injection;

import org.indivaragroup.jdt17.spring.dasar.dependency.injection.dto.HelloInjection;
import org.indivaragroup.jdt17.spring.dasar.dependency.injection.dto.WorldInjection;

public class HelloWorldInjection {

    private HelloInjection helloInjection;
    private WorldInjection worldInjection;

    public HelloWorldInjection(
            HelloInjection helloInjection,
            WorldInjection worldInjection
    ){
        this.helloInjection = helloInjection;
        this.worldInjection = worldInjection;
    }


}
