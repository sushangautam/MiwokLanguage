package com.example.miwoklanguage;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int maudioResId;
    private int mImageResourceId = NO_IMAGE;

    private static final int NO_IMAGE = -1;

    public Word(String defaultTranslation, String miwokTranslation, int audioResId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        maudioResId = audioResId;
    }
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        maudioResId = audioResId;

    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getmImageResourceId() { return mImageResourceId; }

    public int getAudioResId(){ return maudioResId; }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE;
    }
}
