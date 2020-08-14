package com.thoughtworks.galaxy.parser;

import com.thoughtworks.galaxy.EarthUnits;
import com.thoughtworks.galaxy.GalaxyEarthUnitRelation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitEquivalenceParserTest {

    @Test
    public void shouldReturnValidRelation() {
        UnitEquivalenceParser unitEquivalenceParser = new UnitEquivalenceParser();
        GalaxyEarthUnitRelation relation = unitEquivalenceParser.parseUnitEquivalence("glob is I");
        assertEquals("glob", relation.getGalaxyUnit());
        assertEquals(EarthUnits.I, relation.getEarthUnit());

        relation = unitEquivalenceParser.parseUnitEquivalence("pish is X");
        assertEquals("pish", relation.getGalaxyUnit());
        assertEquals(EarthUnits.X, relation.getEarthUnit());
    }

}
