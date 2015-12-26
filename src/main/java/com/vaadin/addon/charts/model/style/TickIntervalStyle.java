package com.vaadin.addon.charts.model.style;

/**
 * Created by bpupadhyaya on 12/25/15.
 */
import com.vaadin.addon.charts.model.ChartEnum;

public enum TickIntervalStyle implements ChartEnum {
    AUTO("auto"),
    NONE("");

    private String type;

    private TickIntervalStyle(String type) {
        this.type = type;
    }

    public String toString() {
        return this.type;
    }
}

