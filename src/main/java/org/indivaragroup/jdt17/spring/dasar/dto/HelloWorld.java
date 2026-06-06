package org.indivaragroup.jdt17.spring.dasar.dto;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    @Autowired(required = false)
    @Qualifier("helloSecond")
    private HelloDTO hello;

    // atau
//    @Autowired
//    private Optional<HelloDTO> helloSecond;

    @Autowired
    private WorldDTO world;

    public HelloWorld(HelloDTO hello) {
        this.hello = hello;
        this.world = null;
    }

    // Constructor Based DI
    @Autowired
    public HelloWorld(HelloDTO hello, WorldDTO world) {
        this.hello = hello;
        this.world = world;
    }

    public HelloDTO getHello() {
        return hello;
    }

    public WorldDTO getWorld() {
        return world;
    }


    // Setter-Based DI
    @Autowired
    public void setHello(HelloDTO hello) {
        this.hello = hello;
    }

    @Autowired
    public void setWorld(WorldDTO world) {
        this.world = world;
    }


    @Autowired
    private ObjectProvider<HelloDTO> helloProvider;

    public void doSomething() {
        HelloDTO hello = helloProvider.getIfAvailable();
        if (hello != null) {
            System.out.println(hello);
        }
    }

}
