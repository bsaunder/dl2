/**
 * 
 */
package net.bryansaunders.dl2.service.impl;

import net.bryansaunders.dl2.resource.InfoResource;
import net.bryansaunders.dl2.service.InfoService;

import org.switchyard.component.bean.Service;

/**
 * 
 * @see InfoResource
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@Service(value = InfoService.class, name = "InfoServiceImpl")
public class InfoServiceImpl implements InfoService {

    /* (non-Javadoc)
     * @see InfoService#getVersion()
     */
    @Override
    public String getVersion() {
        // TODO Implement Version Logic
        return "{\"version\":\"0.0.1=SNAPSHOT\"}";
    }

}
