package com.example.resources;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.example.dao.PersonDAO;
import com.example.dao.PersonDAOMock;

@Path("/persons")
public class PersonResource {
 
    PersonDAO dao = new PersonDAOMock();
 
    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public List<Person> findAll() {
        return dao.findAll();
    }
 
    @GET @Path("{id}")
    @Produces({ MediaType.APPLICATION_JSON })
    public Person findById(@PathParam("id") String id) {
        return dao.findById(Integer.parseInt(id));
    }
 
}
