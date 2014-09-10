/**
 * 
 */
package net.bryansaunders.dl2.service.rest;/*
 * #%L
 * net.bryansaunders:dl2
 * %%
 * Copyright (C) 2014 Bryan Saunders
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */


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
