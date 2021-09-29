package com.nqsoftwaresolutions.destiny;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTv;
    private Button mRedBtn;
    private Button mBlueBtn;
    private Stories[] mStoriesBank;
    private int mRedStory = 1;
    private int mBlueStory = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Todo Retrieve the state of application is if is not null
            if (savedInstanceState != null){

            }
        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
            mStoryTv = findViewById(R.id.storyTextView);
            mRedBtn = findViewById(R.id.buttonTop);
            mBlueBtn = findViewById(R.id.buttonBottom);
        // Todo Init array of stories
        mStoriesBank = new Stories[]{
                new Stories(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2),
                new Stories(R.string.T2_Story,R.string.T2_Ans1,R.string.T2_Ans2),
                new Stories(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2),
                new Stories(R.string.T4_End),
                new Stories(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2),
                new Stories(R.string.T5_End),
                new Stories(R.string.T6_End),
                new Stories(R.string.T5_End),
                new Stories(R.string.T6_End)
        };
        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
            mRedBtn.setOnClickListener(v ->{
                if (mRedStory == 1){
                    mStoryTv.setText(mStoriesBank[2].getStory());
                    mRedBtn.setText(mStoriesBank[2].getAnswer1());
                    mBlueBtn.setText(mStoriesBank[2].getAnswer2());
                    mRedStory++;
                }else if (mBlueStory == 2){
                    mStoryTv.setText(mStoriesBank[4].getStory());
                    mRedBtn.setText(mStoriesBank[4].getAnswer1());
                    mBlueBtn.setText(mStoriesBank[4].getAnswer2());
                    mRedStory++;
                }else if(mRedStory == 3){
                    mStoryTv.setText(R.string.T3_Story);
                    mRedBtn.setText(R.string.T3_Ans1);
                    mBlueBtn.setText(R.string.T3_Ans2);
                    mRedStory++;
                }else if(mRedStory == 4){
                    mStoryTv.setText(R.string.T6_End);
                    mBlueBtn.setVisibility(View.INVISIBLE);
                    mRedBtn.setVisibility(View.INVISIBLE);
                    mRedStory++;
                }
            });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
            mBlueBtn.setOnClickListener(v ->{
                if (mBlueStory == 1){
                    mStoryTv.setText(mStoriesBank[1].getStory());
                    mRedBtn.setText(mStoriesBank[1].getAnswer1());
                    mBlueBtn.setText(mStoriesBank[1].getAnswer2());
                    mBlueStory++;
                }else if (mBlueStory == 2) {
                    mStoryTv.setText(mStoriesBank[3].getStoryEnd());
                    mBlueBtn.setVisibility(View.INVISIBLE);
                    mRedBtn.setVisibility(View.INVISIBLE);
                    mBlueStory++;
                }else if (mRedStory == 2) {
                    mStoryTv.setText(mStoriesBank[5].getStoryEnd());
                    mBlueBtn.setVisibility(View.INVISIBLE);
                    mRedBtn.setVisibility(View.INVISIBLE);
                    mBlueStory++;
                }else if (mBlueStory == 4){
                    mStoryTv.setText(R.string.T5_End);
                    mBlueBtn.setVisibility(View.INVISIBLE);
                    mRedBtn.setVisibility(View.INVISIBLE);
                    mBlueStory++;
                }
            });

    }

    /**Todo Saving the state of application
     * @param outState state of application
     */
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}
