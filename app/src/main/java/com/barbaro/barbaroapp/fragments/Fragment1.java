package com.barbaro.barbaroapp.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.barbaro.barbaroapp.R;

public class Fragment1 extends Fragment {

    public static Fragment1 newInstance(String text) {

        Bundle args = new Bundle();
        args.putString("text", text);
        Fragment1 fragment = new Fragment1();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return LayoutInflater.from(container.getContext()).inflate(R.layout.fragment_one, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        TextView txtOne = view.findViewById(R.id.txt_text1);
        txtOne.setText(getArguments().getString("text"));
    }
}
