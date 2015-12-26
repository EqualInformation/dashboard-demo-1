package com.vaadin.addon.charts.model.style;

/**
 * Created by bpupadhyaya on 12/25/15.
 */
import com.vaadin.addon.charts.model.AbstractConfigurationObject;

public class Style extends AbstractConfigurationObject {
    private Color color;
    private FontWeight fontWeight;
    private String fontFamily;
    private String fontSize;
    private String left;
    private String top;
    private StylePosition position;
    private String lineHeight;

    public Style() {
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public FontWeight getFontWeight() {
        return this.fontWeight;
    }

    public void setFontWeight(FontWeight fontWeight) {
        this.fontWeight = fontWeight;
    }

    public String getFontFamily() {
        return this.fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public String getFontSize() {
        return this.fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    public String getLeft() {
        return this.left;
    }

    public void setLeft(String left) {
        this.left = left;
    }

    public String getTop() {
        return this.top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public void setPosition(StylePosition position) {
        this.position = position;
    }

    public StylePosition getPosition() {
        return this.position;
    }

    public void setLineHeight(String lineHeight) {
        this.lineHeight = lineHeight;
    }

    public String getLineHeight() {
        return this.lineHeight;
    }
}
