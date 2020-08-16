package com.thoughtworks.galaxy.parser;

import com.thoughtworks.galaxy.EarthUnits;
import com.thoughtworks.galaxy.converters.RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class MetalCostParser {

    private final Map<String, EarthUnits> galaxyUnitToEarthUnit;
    private Map<String, Double> metalCostMap;

    public MetalCostParser(Map<String, EarthUnits> galaxyUnitToEarthUnit) {
        this.galaxyUnitToEarthUnit = galaxyUnitToEarthUnit;
        this.metalCostMap = new HashMap<>();
    }

    public Map<String, Double> parseMetalCost(String relation) {
        String[] parts = relation.split(" is ");
        int cost = Integer.parseInt(parts[1].split(" ")[0]);
        parts = parts[0].split(" ");
        String metal = parts[parts.length - 1];
        StringBuilder romanNumber = new StringBuilder();
        for (int i = 0; i < parts.length - 1; i++) {
            romanNumber.append(galaxyUnitToEarthUnit.get(parts[i]).name());
        }
        int factor = new RomanToInteger().convertRomanToInteger(romanNumber.toString());
        metalCostMap.put(metal, cost / (double) factor);
        return metalCostMap;
    }

}
