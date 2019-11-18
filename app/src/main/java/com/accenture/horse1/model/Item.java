package com.accenture.horse1.model;

public class Item
{

    private String name;
    private String breedName;

    private int image_name;
//    private double rating;

    public  Item(String name, int image_name, String breedName) {
        this.name = name;
        this.image_name = image_name;
        this.breedName = breedName;
//        this.rating =rating;
    }

    public String getName() {
        return name;
    }

    public int getImageName() {
        return image_name;
    }

    public String getBreedName() {
        return breedName;

    }

//    public double rating()
//    {
//        return rating;
//    }


}

