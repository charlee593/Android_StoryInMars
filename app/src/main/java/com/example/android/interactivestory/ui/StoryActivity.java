package com.example.android.interactivestory.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.interactivestory.R;
import com.example.android.interactivestory.model.Page;
import com.example.android.interactivestory.model.Story;


public class StoryActivity extends ActionBarActivity {
    public static final String TAG = StoryActivity.class.getSimpleName();

    private Story mStory = new Story();
    private ImageView mImageView;
    private TextView mTextView;
    private Button mChoice1;
    private Button mChoice2;
    private String mName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        Intent intent = getIntent();
        String mName = intent.getStringExtra(getString(R.string.key_name));
        if (mName == null){
            mName = "Andy";
        }
        Log.d(TAG, mName);
        mImageView = (ImageView) findViewById(R.id.storyImageView);
        mTextView = (TextView) findViewById(R.id.storyTextView);
        mChoice1 = (Button) findViewById(R.id.choiceButton);
        mChoice2 = (Button) findViewById(R.id.choiceButton2);
        loadPage();
    }

    private void loadPage(){
        Page page = mStory.getPage(0);
        Drawable drawable = getResources().getDrawable(page.getImageId());
        mImageView.setImageDrawable(drawable);

        String pageText = page.getText();
        //Add the name if placeholder included
        pageText = String.format(pageText, mName);
        mTextView.setText(pageText);

        mChoice2.setText(page.getChoice2().getText());
        mChoice1.setText(page.getChoice1().getText());

    }
}
