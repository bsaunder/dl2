/**
 * 
 */
package net.bryansaunders.dl2.service.impl;

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
