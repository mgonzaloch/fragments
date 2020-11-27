package com.example.fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SonidoFragment extends Fragment {

    public SonidoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sonido, container, false);

        final ImageView playbtn = view.findViewById(R.id.iv_play);
        final ImageView pausebtn = view.findViewById(R.id.iv_pause);
        final ImageView replaybtn = view.findViewById(R.id.iv_replay);
        final MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.track01);
        final EditText lyrics = view.findViewById(R.id.et_lyrics);
        lyrics.setEnabled(false);

        lyrics.setText("[Verse 1: Laura Brehm]\nStill and silent\nCalm before the storm\n Gold and diamond\nJewels behind the throne\n\n[Pre-Chorus 1: Laura Brehm]\nInto the night, out of the dark, take to the sky, chasing the stars\nAll that we said, all that we are, waiting to fly, this is the start\n\n[Chorus: Laura Brehm]\nHide and seek, reason and rhyme, grand and glorious\nLiving the dream, yours and mine, euphoria\nHide and seek, reason and rhyme, grand and glorious\nLiving the dream, yours and mine, euphoria\n\n[Drop]\n\n[Verse 2: Laura Brehm]\nStone and feather\nMove outside your head\nNow or never\nStrong in every step\n\n[Pre-Chorus 2: Laura Brehm]\nGive me a sign, hitting the mark, take to the sky, chasing the stars\nOpen your eyes, watching afar, waiting to fly, this is the start\n\n[Chorus: Laura Brehm]\nHide and seek, reason and rhyme, grand and glorious\nLiving the dream, yours and mine, euphoria\n\n[Drop]\n\n[Outro: Laura Brehm]\nHide and seek, reason and rhyme, grand and glorious\nLiving the dream, yours and mine, euphoria");

        playbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                playbtn.setVisibility(View.GONE);
                pausebtn.setVisibility(View.VISIBLE);
            }});
        pausebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
                playbtn.setVisibility(View.VISIBLE);
                pausebtn.setVisibility(View.GONE);
            }});
        replaybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.seekTo(0);
                playbtn.setVisibility(View.GONE);
                pausebtn.setVisibility(View.VISIBLE);
            }});

        return view;
    }
}
