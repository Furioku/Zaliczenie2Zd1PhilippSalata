package com.philippsalata.map;

public class District extends Map {
    protected String districtName;
    protected String districtSize;

    protected District(String name, int size, float coordinates){
        super (name, size, coordinates);
        this.districtName = districtName;
        this.districtSize = districtSize;
        }

    public String getDistrictName() {
        return districtName;
    }

    public String getDistrictSize() {
        return districtSize;
    }

}
