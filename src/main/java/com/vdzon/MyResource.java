package com.vdzon;

import javax.ws.rs.Path;
import javax.ws.rs.GET;

@Path("/")
public class MyResource {

    @GET
    public String ping(){
        return "pong";
    }
}
