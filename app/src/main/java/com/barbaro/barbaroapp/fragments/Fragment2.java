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

public class Fragment2  extends Fragment {

    public static Fragment2 newInstance(String name, String description) {

        Bundle args = new Bundle();
        args.putString("name", name);
        args.putString("description", description);
        Fragment2 fragment = new Fragment2();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return LayoutInflater.from(container.getContext()).inflate(R.layout.fragment_two, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        TextView txtName = view.findViewById(R.id.txt_name);
        TextView txtDes = view.findViewById(R.id.txt_description);

        txtName.setText(getArguments().getString("name"));
        txtDes.setText(getArguments().getString("description"));
    }

}
