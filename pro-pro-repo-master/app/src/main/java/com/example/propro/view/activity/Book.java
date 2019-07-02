package com.example.propro.view.activity;

public class Book {

    private String Catergory;
    private String Title;
    private String Description;
    private int Thumbnail;


    public Book(String catergory, String title, String description, int thumbnail) {
        Catergory = catergory;
        Title = title;
        Description = description;
        Thumbnail = thumbnail;
    }

    public String getCatergory() {
        return Catergory;
    }

    public void setCatergory(String catergory) {
        Catergory = catergory;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
