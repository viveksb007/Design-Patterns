package com.thoughtworks.galaxy.converters;

import com.thoughtworks.galaxy.EarthUnits;

import java.util.List;
import java.util.stream.Collectors;

public class RomanToInteger {

    public int convertRomanToInteger(String romanNumber) {
        List<EarthUnits> romanUnits = romanNumber
                .chars()
                .mapToObj(c -> (char) c)
                .map(c -> EarthUnits.valueOf(String.valueOf(c)))
                .collect(Collectors.toList());
        int sum = 0;
        for (int i = 0; i < romanUnits.size(); i++) {
            EarthUnits first = romanUnits.get(i);
            EarthUnits second = (i == romanUnits.size() - 1) ? EarthUnits.I : romanUnits.get(i + 1);
            if (first.getValue() < second.getValue()) {
                sum += (second.getValue() - first.getValue());
                i++;
            } else {
                sum += first.getValue();
            }
        }
        return sum;
    }

}
