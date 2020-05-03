package com.example.android.miwok;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<Word> {

    private int colorResourseId;

    public WordAdapter(Context context, ArrayList<Word> words, int colorResourseId) {
        super(context,0, words);
        this.colorResourseId = colorResourseId;
    }

     @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
     @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Word currentWord = getItem(position);

        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        TextView miowkTextView = listItemView.findViewById(R.id.miowk_text_view);
        miowkTextView.setText(currentWord.getmMiwokTranslation());

        ImageView imageView = listItemView.findViewById(R.id.image_view);

        if(currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourseId());
            imageView.setVisibility(View.VISIBLE);
        }
        else
            imageView.setVisibility(View.GONE);

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),colorResourseId);
        textContainer.setBackgroundColor(color);


        return listItemView;
    }
}
