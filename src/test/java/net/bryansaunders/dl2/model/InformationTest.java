/**
 * 
 */
package net.bryansaunders.dl2.model;/*
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


import junit.framework.Assert;

import org.junit.Test;

/**
 * Unit Tests for Information Model.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
public class InformationTest {

    private static final String NAME = "DL2";
    private static final String DESC = "Description";
    private static final String VER = "Version X";

    /**
     * Tests that the Setters and Getters are working.
     */
    @Test
    public void ifValuesSameThenPass() {
        // given
        Information info = new Information();

        // when
        info.setDescription(InformationTest.DESC);
        info.setName(InformationTest.NAME);
        info.setVersion(InformationTest.VER);

        // then
        Assert.assertEquals(InformationTest.NAME, info.getName());
        Assert.assertEquals(InformationTest.DESC, info.getDescription());
        Assert.assertEquals(InformationTest.VER, info.getVersion());
    }

}
