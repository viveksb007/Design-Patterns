package com.thoughtworks.galaxy.parser;

import com.thoughtworks.galaxy.EarthUnits;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MetalCostParserTest {

    @Test
    public void shouldParseMetaCost() {
        Map<String, EarthUnits> galaxyUnitToEarthUnit = new HashMap<>();
        galaxyUnitToEarthUnit.put("glob", EarthUnits.I);
        MetalCostParser metalCostParser = new MetalCostParser(galaxyUnitToEarthUnit);
        Map<String, Double> metalCostMap = metalCostParser.parseMetalCost("glob glob Silver is 34 Credits");
        assertNotNull(metalCostMap);
        assertEquals(new Double(17), metalCostMap.get("Silver"));

        galaxyUnitToEarthUnit.put("prok", EarthUnits.V);
        metalCostMap = metalCostParser.parseMetalCost("glob prok Gold is 57800 Credits");
        assertNotNull(metalCostMap);
        assertEquals(new Double(57800 / (double) 4), metalCostMap.get("Gold"));
    }

}
