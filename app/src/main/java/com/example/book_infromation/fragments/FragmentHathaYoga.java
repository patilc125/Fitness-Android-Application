package com.example.book_infromation.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.book_infromation.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class FragmentHathaYoga extends Fragment {
    public static FragmentHathaYoga newInstance(){
        return new FragmentHathaYoga();
    }
    private ImageView imageViewhathayoga;
    private ProgressBar progressBarHathaYoga;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_hatha_yoga,container,false);

        imageViewhathayoga=view.findViewById(R.id.imageViewhathayoga);
        progressBarHathaYoga=view.findViewById(R.id.progressBarhathayoga);


        return view;
    }
}
