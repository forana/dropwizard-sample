package com.example.dropwizard.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.example.dropwizard.models.Hello;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloResource {
    private final String greeting;
    
    public HelloResource(String greeting) {
        this.greeting = greeting;
    }
    
    @GET
    public Hello helloWorld() {
        return new Hello(greeting);
    }
    
    @GET
    @Path("/{who}")
    public Hello helloWho(@PathParam("who") String who) {
        Hello hello = new Hello(greeting);
        hello.setWho(who);
        return hello;
    }
}
