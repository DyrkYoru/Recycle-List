package com.example.myapplication;

public class Model {
        String brandName;
        String desc;
        int imageIcon;

    public Model(String brandName, String desc, int imageIcon) {
        this.brandName = brandName;
        this.desc = desc;
        this.imageIcon = imageIcon;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(int imageIcon) {
        this.imageIcon = imageIcon;
    }
}
