package com.barbaro.barbaroapp.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.barbaro.barbaroapp.R;
import com.barbaro.barbaroapp.adapter.ItemAdapter;
import com.barbaro.barbaroapp.models.ItemProduct;

import java.util.ArrayList;
import java.util.List;

public class Fragment1 extends Fragment implements ItemAdapter.OnPhoneClickListener {

    private RecyclerView listProducts;

    public static Fragment1 newInstance() {

        Bundle args = new Bundle();
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
        listProducts = view.findViewById(R.id.listProducts);
        listProducts.setLayoutManager(new LinearLayoutManager(getActivity()));
        fillProducts();
    }

    private void fillProducts() {
        List<ItemProduct> itemProducts = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            itemProducts.add(new ItemProduct("Producto " + (i +1), "BestBuy", "3141212323"));
        }
        listProducts.setAdapter(new ItemAdapter(itemProducts, this));
    }

    @Override
    public void onPhoneClick(String phone) {
        // LLAMAR
    }
}
