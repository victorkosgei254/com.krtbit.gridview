package com.kritbit.gridview;

public class CourseModel {
    private int image;
    private String text;

    public CourseModel(int image, String text) {
        this.image = image;
        this.text = text;
    }

    public int getImage() {
        return image;
    }

    public String getText() {
        return text;
    }
}
