package com.example.lab2_reproductor_de_musica;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    private MediaPlayer mediaPlayer;
    private AudioManager audioManager;
    private Field[] trackList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        trackList = R.raw.class.getFields();
    }

    public void btnListenerPrevious(View view)
    {

    }

    public void btnListenerPlay(View view)
    {

    }

    public void btnListenerNext(View view)
    {

    }
}
