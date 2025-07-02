package lk.jiat.web.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Path("/users")
public class UserResource {

    @GET
    public List<String> getUsers(){

        return Arrays.asList(new String[]{"Chanu","Chani","Chuti"});
    }

    @GET
    @Path("/{id}")
    public String getUser(@PathParam("id") String id){
        return "User "+id;
    }

}
