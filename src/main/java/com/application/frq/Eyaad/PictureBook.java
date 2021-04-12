package com.application.frq.Eyaad;

public class PictureBook extends Book {
    private String illustrator;
    public PictureBook(String t, String a, String i) {
        super(t, a);
        illustrator = i;
    }
    public String printBookInfo() {
        super.printBookInfo();
        return super.printBookInfo() + " and illustrated by " + illustrator;
    }
}
