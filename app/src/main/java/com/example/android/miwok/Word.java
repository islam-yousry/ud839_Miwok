package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int imageResourseId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int audioResourceId;

    public Word(String mDefaultTranslation, String mMiwokTranslation, int imageResourseId, int audioResourceId){
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.imageResourseId = imageResourseId;
        this.audioResourceId = audioResourceId;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int audioResourceId){
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.audioResourceId = audioResourceId;
    }

    /**
     * @return the default word in english.
     */
    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     * @return the miowk translation for this word.
     */
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * @return audio resource id of the word.
     */

    public int getAudioResourceId(){
        return audioResourceId;
    }
    /**
     * @return image resource id of the word.
     */
    public int getImageResourseId(){
        return imageResourseId;
    }

    /**
     * @return whether or not there is an image for this word.
     */
    public boolean hasImage(){
        return imageResourseId != NO_IMAGE_PROVIDED;
    }


}
