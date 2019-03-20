package com.example.androide.cmrcet;


public class Workshop {
    private int id;
    private String title;
    private String audience;
    private int image;

    public Workshop(int id, String title, int image,String audience) {
        this.id = id;
        this.title = title;
        this.audience=audience;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAudience() {
        return audience;
    }

    public int getImage() {
        return image;
    }
}
