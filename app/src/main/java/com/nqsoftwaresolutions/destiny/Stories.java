package com.nqsoftwaresolutions.destiny;

public class Stories {
    private int mStory;
    private int mAnswer1;
    private int mAnswer2;
    private int mStoryEnd;

    public Stories(int story, int answer1, int answer2, int storyEnd) {
        mStory = story;
        mAnswer1 = answer1;
        mAnswer2 = answer2;
        mStoryEnd = storyEnd;
    }

    public Stories(int story, int answer1, int answer2) {
        mStory = story;
        mAnswer1 = answer1;
        mAnswer2 = answer2;
    }
    public Stories(int storyEnd) {
       mStoryEnd = storyEnd;
    }

    public int getStory() {
        return mStory;
    }

    public void setStory(int story) {
        mStory = story;
    }

    public int getAnswer1() {
        return mAnswer1;
    }

    public void setAnswer1(int answer1) {
        mAnswer1 = answer1;
    }

    public int getAnswer2() {
        return mAnswer2;
    }

    public void setAnswer2(int answer2) {
        mAnswer2 = answer2;
    }

    public int getStoryEnd() {
        return mStoryEnd;
    }

    public void setStoryEnd(int storyEnd) {
        mStoryEnd = storyEnd;
    }
}
