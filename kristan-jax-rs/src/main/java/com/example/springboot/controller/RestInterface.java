package com.example.springboot.controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.PATCH;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("students")
@Produces(MediaType.APPLICATION_JSON)
public interface RestInterface {

    @GET
    public Response getAllStudents();

    @Path("gettest")
    @GET
    public Response getTest();

    @Path("posttest")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postTest(String jsonInput);

    @Path("puttest")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response putTest(String jsonInput);

    @Path("patchtes")
    @PATCH
    @Consumes(MediaType.APPLICATION_JSON)
    public Response patchTest(String jsonInput);

    @Path("deltest")
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public Response delTest(String jsonInput);
}
