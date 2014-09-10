/**
 * 
 */
package net.bryansaunders.dl2.service.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Information Service for providing information about the currently running application.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>

 */
@Path("/info")
public interface InfoService {

    /**
     * Returns the current application version.
     * 
     * @return JSON String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/version")
    String getVersion();
}
