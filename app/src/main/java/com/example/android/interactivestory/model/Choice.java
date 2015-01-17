package com.example.android.interactivestory.model;

/**
 * Created by Carlos on 2015-01-17.
 */
public class Choice {
    private String mText;
    private int mNextPage;

    public Choice(String mText, int mNextPage){
        this.mText = mText;
        this.mNextPage = mNextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
