package com.thoughtworks.galaxy.parser;

import com.thoughtworks.galaxy.EarthUnits;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class UnitEquivalenceParserTest {

    @Test
    public void shouldReturnValidRelation() {
        UnitEquivalenceParser unitEquivalenceParser = new UnitEquivalenceParser();
        Map.Entry<String, EarthUnits> relation = unitEquivalenceParser.parseUnitEquivalence("glob is I");
        assertEquals("glob", relation.getKey());
        assertEquals(EarthUnits.I, relation.getValue());

        relation = unitEquivalenceParser.parseUnitEquivalence("pish is X");
        assertEquals("pish", relation.getKey());
        assertEquals(EarthUnits.X, relation.getValue());
    }

}
