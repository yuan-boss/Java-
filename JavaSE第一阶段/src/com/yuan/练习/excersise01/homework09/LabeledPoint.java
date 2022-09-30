package com.yuan.练习.excersise01.homework09;

/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-09-30 16:04
 **/
public class LabeledPoint extends Point{

    private String label;

    public LabeledPoint(String label,double x, double y) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setName(String label) {
        this.label = label;
    }
}
