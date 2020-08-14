package com.thoughtworks.galaxy.parser;

import com.thoughtworks.galaxy.EarthUnits;
import com.thoughtworks.galaxy.GalaxyEarthUnitRelation;

public class UnitEquivalenceParser {

    public GalaxyEarthUnitRelation parseUnitEquivalence(String relation) {
        String[] parts = relation.split(" ");
        return new GalaxyEarthUnitRelation(parts[0], EarthUnits.valueOf(parts[2]));
    }

}
