package com.vaadin.addon.charts.model.style;

/**
 * Created by bpupadhyaya on 12/25/15.
 */
import com.vaadin.addon.charts.model.ChartEnum;

public enum FontWeight implements ChartEnum {
    NORMAL("normal"),
    BOLD("bold");

    private String type;

    private FontWeight(String type) {
        this.type = type;
    }

    public String toString() {
        return this.type;
    }
}
