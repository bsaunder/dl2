/**
 * 
 */
package net.bryansaunders.dl2.service.impl;/*
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


import net.bryansaunders.dl2.service.rest.InfoService;

/**
 * @see InfoService
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 */
public class InfoServiceImpl implements InfoService {

    /*
     * (non-Javadoc)
     * @see net.bryansaunders.dl2.service.InfoService#getVersion()
     */
    @Override
    public String getVersion() {
        // TODO Implement Version Logic
        
        return "{\"version\":\"0.0.1=SNAPSHOT\"}";
    }

}
