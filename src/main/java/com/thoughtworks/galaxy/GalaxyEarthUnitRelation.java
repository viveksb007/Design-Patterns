package com.thoughtworks.galaxy;

public class GalaxyEarthUnitRelation {

    private final String galaxyUnit;
    private final EarthUnits earthUnit;

    public GalaxyEarthUnitRelation(String galaxyUnit, EarthUnits earthUnit) {
        this.galaxyUnit = galaxyUnit;
        this.earthUnit = earthUnit;
    }

    public String getGalaxyUnit() {
        return galaxyUnit;
    }

    public EarthUnits getEarthUnit() {
        return earthUnit;
    }
}
