package lk.jiat.web.rest;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Path("/users")
public class UserResource {

    @GET
    @Path("/{id}")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.TEXT_HTML)
    public List<User> getUser(Integer id){

        //find by id
        User user = new User();
        user.setId(id);
        user.setName("Supun");
        user.setEmail("supun@gmail.com");

        return Arrays.asList(user);
    }

}
