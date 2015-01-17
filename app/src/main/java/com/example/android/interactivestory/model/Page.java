package com.example.android.interactivestory.model;

/**
 * Created by Carlos on 2015-01-17.
 */
public class Page {
    private int mImageId;
    private String mText;
    private Choice mChoice1;
    private Choice mChoice2;

    public boolean isFinal() {
        return isFinal;
    }

    public void setFinal(boolean isFinal) {
        this.isFinal = isFinal;
    }

    private boolean isFinal = false;

    public Page(int imageId, String mText, Choice mChoice1, Choice mChoice2){
        mImageId = imageId;
        this.mText = mText;
        this.mChoice1 = mChoice1;
        this.mChoice2 = mChoice2;
    }

    public Page(int imageId, String mText){
        mImageId = imageId;
        this.mText = mText;
        isFinal = true;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int mImageId) {
        this.mImageId = mImageId;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice mChoice1) {
        this.mChoice1 = mChoice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice mChoice2) {
        this.mChoice2 = mChoice2;
    }

    public String getText() {
        return mText;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

}
