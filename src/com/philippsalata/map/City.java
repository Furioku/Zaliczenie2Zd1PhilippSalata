package com.philippsalata.map;

public class City extends Map{
    protected String cityName;
    protected int citySize;
    public int cityPopulation;

    protected City(String name, int size, float coordinates){
        super (name, size, coordinates);
        this.cityName = cityName;
        this.citySize = citySize;
    }

    public City(String name , int size , float coordinates , int cityPopulation) {
        super ( name , size , coordinates );
        this.cityPopulation = cityPopulation;
    }

    public String getCityName() {
        return cityName;
    }

    public int getCitySize() {
        return citySize;
    }

    public int getCityPopulation() {
        return cityPopulation;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCitySize(int citySize) {
        this.citySize = citySize;
    }

    public void setCityPopulation(int cityPopulation) {
        this.cityPopulation = cityPopulation;
    }
}
