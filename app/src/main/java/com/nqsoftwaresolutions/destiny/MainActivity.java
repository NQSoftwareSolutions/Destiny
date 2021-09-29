package com.nqsoftwaresolutions.destiny;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTv;
    private Button mRedBtn;
    private Button mBlueBtn;
    private int mRedJourney;
    private int mBlueJourney;
    private int mStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
            mStoryTv = findViewById(R.id.storyTextView);
            mRedBtn = findViewById(R.id.buttonTop);
            mBlueBtn = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
            mRedBtn.setOnClickListener(v ->{
                if (mRedJourney == 0){
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
                }else if(mStory == 1){
                    mStoryTv.setText(R.string.T3_Story);
                    mRedBtn.setText(R.string.T3_Ans1);
                    mBlueBtn.setText(R.string.T3_Ans2);
                    mRedJourney++;
                    mStory++;
                }else if(mStory == 2){
                    mStoryTv.setText(R.string.T6_End);
                    mBlueBtn.setVisibility(View.INVISIBLE);
                    mRedBtn.setVisibility(View.INVISIBLE);
                    mRedJourney++;
                    mStory++;
                }
            });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
            mBlueBtn.setOnClickListener(v ->{
                if (mBlueJourney == 0){
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
                }else if (mStory == 2) {
                    mStoryTv.setText(R.string.T5_End);
                    mBlueBtn.setVisibility(View.INVISIBLE);
                    mRedBtn.setVisibility(View.INVISIBLE);
                    mBlueJourney++;
                    mStory++;
                }else if (mStory == 1){
                    mStoryTv.setText(R.string.T5_End);
                    mBlueBtn.setVisibility(View.INVISIBLE);
                    mRedBtn.setVisibility(View.INVISIBLE);
                    mBlueJourney++;
                    mStory++;
                }
            });

    }
}
