package com.thoughtworks.galaxy.parser;

import com.thoughtworks.galaxy.EarthUnits;

import java.util.AbstractMap;
import java.util.Map;

public class UnitEquivalenceParser {

    public Map.Entry<String, EarthUnits> parseUnitEquivalence(String relation) {
        String[] parts = relation.split(" ");
        return new AbstractMap.SimpleEntry<>(parts[0], EarthUnits.valueOf(parts[2]));
    }

}
