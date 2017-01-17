package com.hackference.team20.tutoriah.others;

/**
 * Created by Tianyi Zhang on 11/26/2016.
 */
public class Tutor {
    protected int idImage;
    protected String name, subjects;
    protected float rating;

    public Tutor(int idImage, String name, String subjects, float rating) {
        this.idImage = idImage;
        this.name = name;
        this.subjects = subjects;
        this.rating = rating;
    }

    public Tutor() {
        this.idImage = 0;
        this.name = "Trooper";
        this.subjects = "Star Wars";
        this.rating = 5;
    }

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }
}
