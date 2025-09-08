/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progassignment;

/**
 *
 * @author RC_Student_lab
 */
public class seriesModel {
 private String seriesId;
    private String seriesName;
    private int seriesAgeRestriction;
    private int seriesNumberOfEpisodes;

    public seriesModel(String seriesId, String seriesName, int seriesAgeRestriction, int seriesNumberOfEpisodes) {
        this.seriesId = seriesId;
        this.seriesName = seriesName;
        this.seriesAgeRestriction = seriesAgeRestriction;
        this.seriesNumberOfEpisodes = seriesNumberOfEpisodes;
    }

    // Getters and Setters
    public String getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public int getSeriesAgeRestriction() {
        return seriesAgeRestriction;
    }

    public void setSeriesAgeRestriction(int seriesAgeRestriction) {
        this.seriesAgeRestriction = seriesAgeRestriction;
    }

    public int getSeriesNumberOfEpisodes() {
        return seriesNumberOfEpisodes;
    }

    public void setSeriesNumberOfEpisodes(int seriesNumberOfEpisodes) {
        this.seriesNumberOfEpisodes = seriesNumberOfEpisodes;
    }

    @Override
    public String toString() {
        return "SERIES ID: " + seriesId +
                "\nSERIES NAME: " + seriesName +
                "\nSERIES AGE RESTRICTION: " + seriesAgeRestriction +
                "\nSERIES NUMBER OF EPISODES: " + seriesNumberOfEpisodes;
    }   
}
