package com.example.musicos;

public class Singer {
    private String singerName;
    private int singerAge;
    private String country;
    private String famousSong;

    public Singer(String singerName, int singerAge, String country, String famousSong) {
        this.singerName = singerName;
        this.singerAge = singerAge;
        this.country = country;
        this.famousSong = famousSong;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public int getSingerAge() {
        return singerAge;
    }

    public void setSingerAge(int singerAge) {
        this.singerAge = singerAge;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFamousSong() {
        return famousSong;
    }

    public void setFamousSong(String famousSong) {
        this.famousSong = famousSong;
    }
}
