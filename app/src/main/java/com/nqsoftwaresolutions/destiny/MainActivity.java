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
    private int mRedJourney;
    private int mBlueJourney;
    private int mStory;
    private int mRedInBlue;
    private int mBlueInRed;

    //Todo constants for keys
    private final String RED_KEY = "RedKey";
    private final String BLUE_KEY = "BlueKey";
    private final String STORY_KEY = "StoryKey";
    private final String RED_IN_BLUE_KEY= "RedInBlueKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Todo Check current state of activity
            if (savedInstanceState != null){
                mStory = savedInstanceState.getInt(STORY_KEY);
                mRedJourney = savedInstanceState.getInt(RED_KEY);
                mBlueJourney = savedInstanceState.getInt(BLUE_KEY);
                mRedInBlue = savedInstanceState.getInt(RED_IN_BLUE_KEY);
            }

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
            mStoryTv = findViewById(R.id.storyTextView);
            mRedBtn = findViewById(R.id.buttonTop);
            mBlueBtn = findViewById(R.id.buttonBottom);

        // Todo Set text on views according to variables values.
            if (mStory == 0 && mRedJourney == 0 && mBlueJourney == 0){
                mStoryTv.setText(R.string.T1_Story);
                mBlueBtn.setText(R.string.T1_Ans2);
                mRedBtn.setText(R.string.T1_Ans1);
            }else if (mStory == 1 && mRedJourney == 1 && mBlueJourney == 0){
                mStoryTv.setText(R.string.T3_Story);
                mRedBtn.setText(R.string.T3_Ans1);
                mBlueBtn.setText(R.string.T3_Ans2);
            }else if (mStory == 2 && mRedJourney == 2 && mBlueJourney == 0){
                mStoryTv.setText(R.string.T6_End);
                mBlueBtn.setVisibility(View.INVISIBLE);
                mRedBtn.setVisibility(View.INVISIBLE);
            }else if (mStory == 2 && mRedJourney == 1 && mBlueJourney == 1 && mBlueInRed == 1){
                mStoryTv.setText(R.string.T5_End);
                mBlueBtn.setVisibility(View.INVISIBLE);
                mRedBtn.setVisibility(View.INVISIBLE);
            }else if (mStory == 1 && mRedJourney == 0 && mBlueJourney == 1){
                mStoryTv.setText(R.string.T2_Story);
                mRedBtn.setText(R.string.T2_Ans1);
                mBlueBtn.setText(R.string.T2_Ans2);
            }else if (mStory == 2 && mRedJourney == 0 && mBlueJourney == 2){
                mStoryTv.setText(R.string.T4_End);
                mBlueBtn.setVisibility(View.INVISIBLE);
                mRedBtn.setVisibility(View.INVISIBLE);
            }else if (mStory == 2 && mRedJourney == 1 && mBlueJourney == 1 && mRedInBlue == 1){
                mStoryTv.setText(R.string.T3_Story);
                mRedBtn.setText(R.string.T3_Ans1);
                mBlueBtn.setText(R.string.T3_Ans2);
            }else if (mStory == 3 && mRedJourney == 2 && mBlueJourney == 1){
                mStoryTv.setText(R.string.T6_End);
                mBlueBtn.setVisibility(View.INVISIBLE);
                mRedBtn.setVisibility(View.INVISIBLE);
            }else if (mStory == 3 && mRedJourney == 1 && mBlueJourney == 2){
                mStoryTv.setText(R.string.T5_End);
                mBlueBtn.setVisibility(View.INVISIBLE);
                mRedBtn.setVisibility(View.INVISIBLE);
            }
        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
            mRedBtn.setOnClickListener(v ->{
                if (mRedJourney == 0 && mStory == 0){
                    mStoryTv.setText(R.string.T3_Story);
                    mRedBtn.setText(R.string.T3_Ans1);
                    mBlueBtn.setText(R.string.T3_Ans2);
                    mRedJourney++;
                    mStory++;
                }else if (mRedJourney == 1 && mStory == 1){
                    mStoryTv.setText(R.string.T6_End);
                    mBlueBtn.setVisibility(View.INVISIBLE);
                    mRedBtn.setVisibility(View.INVISIBLE);
                    mRedJourney++;
                    mStory++;
                }else if(mStory == 1 && mBlueJourney == 1 && mRedJourney == 0){
                    mStoryTv.setText(R.string.T3_Story);
                    mRedBtn.setText(R.string.T3_Ans1);
                    mBlueBtn.setText(R.string.T3_Ans2);
                    mRedJourney++;
                    mRedInBlue++;
                    mStory++;
                }else if(mStory == 2 && mBlueJourney == 1 && mRedJourney == 1){
                    mStoryTv.setText(R.string.T6_End);
                    mBlueBtn.setVisibility(View.INVISIBLE);
                    mRedBtn.setVisibility(View.INVISIBLE);
                    mRedJourney++;
                    mRedInBlue++;
                    mStory++;
                }
            });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
            mBlueBtn.setOnClickListener(v ->{
                if (mBlueJourney == 0 && mStory == 0){
                    mStoryTv.setText(R.string.T2_Story);
                    mRedBtn.setText(R.string.T2_Ans1);
                    mBlueBtn.setText(R.string.T2_Ans2);
                    mBlueJourney++;
                    mStory++;
                }else if (mBlueJourney == 1 && mStory == 1) {
                    mStoryTv.setText(R.string.T4_End);
                    mBlueBtn.setVisibility(View.INVISIBLE);
                    mRedBtn.setVisibility(View.INVISIBLE);
                    mBlueJourney++;
                    mStory++;
                }else if (mRedJourney == 1 && mStory  == 2 && mBlueJourney == 1) {
                    mStoryTv.setText(R.string.T5_End);
                    mBlueBtn.setVisibility(View.INVISIBLE);
                    mRedBtn.setVisibility(View.INVISIBLE);
                    mBlueJourney++;
                    mBlueInRed++;
                    mStory++;
                }else if (mStory == 1 && mRedJourney == 1 && mBlueJourney == 0){
                    mStoryTv.setText(R.string.T5_End);
                    mBlueBtn.setVisibility(View.INVISIBLE);
                    mRedBtn.setVisibility(View.INVISIBLE);
                    mBlueJourney++;
                    mStory++;
                }
            });

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(RED_KEY, mRedJourney);
        outState.putInt(BLUE_KEY, mBlueJourney);
        outState.putInt(STORY_KEY, mStory);
        outState.putInt(RED_IN_BLUE_KEY, mRedInBlue);
    }
}
