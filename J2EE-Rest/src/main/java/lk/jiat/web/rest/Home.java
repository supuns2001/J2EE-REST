package lk.jiat.web.rest;

import jakarta.ws.rs.*;

@Path("/")
public class Home {

    //JAX-RS
    //Jersey,RESTEasy

    @GET
    public String home(){
        System.out.println("home method");
        return "Hello world";
    }

    @POST
    public String home02(){
        System.out.println("home POST method");
        return "Post";
    }
//    @PUT
//    @HEAD
//    @OPTIONS
//    @DELETE
}
