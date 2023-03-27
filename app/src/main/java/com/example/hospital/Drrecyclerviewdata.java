package com.example.hospital;

public class Drrecyclerviewdata {
    private int imageView1;
    private String textView25;
    private String textView27;
    private String divider;

    Drrecyclerviewdata(int imageView1, String textView25,String textView27,String divider) {
        this.imageView1 = imageView1;
        this.textView25 = textView25;
        this.textView27 = textView27;
        this.divider=divider;
    }

    public int getImageView1() {
        return imageView1;
    }

    public String getTextView25() {
        return textView25;
    }

    public String getDivider() {
        return divider;
    }

    public String getTextView27() {
        return textView27;
    }
}
