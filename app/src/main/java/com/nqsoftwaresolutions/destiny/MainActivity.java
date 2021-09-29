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
                mStoryTv.setText(R.string.T3_Story);
                mRedBtn.setText(R.string.T3_Ans1);
                mBlueBtn.setText(R.string.T3_Ans2);
            });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
            mBlueBtn.setOnClickListener(v ->{
                mStoryTv.setText(R.string.T2_Story);
                mRedBtn.setText(R.string.T2_Ans1);
                mBlueBtn.setText(R.string.T2_Ans2);
            });

    }
}
