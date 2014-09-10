/**
 * 
 */
package net.bryansaunders.dl2.service.impl;

/*
 * #%L
 * DL2
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

import static com.jayway.restassured.RestAssured.given;
import junit.framework.Assert;
import net.bryansaunders.dl2.model.Information;
import net.bryansaunders.dl2.test.RestApiTest;

import org.apache.http.HttpStatus;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Integration Test for Information Service.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@RunWith(Arquillian.class)
public class InfoServiceImplIT extends RestApiTest {

    /**
     * Tests that the Correct Information was Returned from the Information Service.
     */
    @Test
    public void ifInformationCorrectThenPass() throws Exception {
        final String json = given().expect().statusCode(HttpStatus.SC_OK).when().get(RestApiTest.URL_ROOT + "/info")
                .asString();

        Assert.assertNotNull(json);

        final ObjectMapper objMapper = new ObjectMapper();
        final Information info = objMapper.readValue(json, new TypeReference<Information>() {
        });
        Assert.assertNotNull(info);

        Assert.assertEquals("DL2", info.getName());
        Assert.assertNotNull(info.getDescription());
        Assert.assertNotNull(info.getVersion());
    }

}
