package com.philippsalata.map;

public class Map {
    protected String name;
    protected int size;
    protected float coordinates;

    protected Map(String name , int size , float coordinates) {
        this.name = name;
        this.size = size;
        this.coordinates = coordinates;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public float getCoordinates() {
        return coordinates;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setCoordinates(float coordinates) {
        this.coordinates = coordinates;
    }
}
