package at.restapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author panagiotis
 */
@Path("/at")
public class Resource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/test")
    public Response getTest() {
        return Response.status(200).entity("Test AT ....").build();
    }
}
