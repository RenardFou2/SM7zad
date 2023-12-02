package com.example.sm7;

import android.hardware.Sensor;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.TypeVariable;

public class SensorWrapper {
    private Sensor sensor;
    private int index;
    private boolean selectable;

    public SensorWrapper(Sensor sensor, int index, boolean selectable) {
        this.sensor = sensor;
        this.index = index;
        this.selectable = selectable;
    }

    public void setSelectable(boolean b) {
        selectable = true;
    }

    public boolean isSelectable() {
        return selectable;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public int getIndex() {
        return index;
    }
}