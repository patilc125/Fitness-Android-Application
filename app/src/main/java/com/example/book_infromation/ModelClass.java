package com.example.book_infromation;

public class ModelClass {
    private String imageName;
    private String categoryName;

   public ModelClass(String name,String cN){
        this.imageName=name;
        this.categoryName=cN;
    }

    public String getImageName() {
        return imageName;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
