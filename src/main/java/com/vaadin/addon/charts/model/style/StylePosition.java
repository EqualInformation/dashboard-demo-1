package com.vaadin.addon.charts.model.style;

/**
 * Created by bpupadhyaya on 12/25/15.
 */
import com.vaadin.addon.charts.model.ChartEnum;

public enum StylePosition implements ChartEnum {
    ABSOLUTE("absolute"),
    RELATIVE("relative");

    private String position;

    private StylePosition(String position) {
        this.position = position;
    }

    public String toString() {
        return this.position;
    }
}

