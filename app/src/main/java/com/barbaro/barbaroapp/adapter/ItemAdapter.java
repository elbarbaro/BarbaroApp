package com.barbaro.barbaroapp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.barbaro.barbaroapp.R;
import com.barbaro.barbaroapp.models.ItemProduct;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private List<ItemProduct> itemProducts;
    private OnPhoneClickListener listener;

    public ItemAdapter(List<ItemProduct> itemProducts) {
        this.itemProducts = itemProducts;
    }

    public ItemAdapter(List<ItemProduct> itemProducts, OnPhoneClickListener listener) {
        this.itemProducts = itemProducts;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_product, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        final ItemProduct itemProduct = itemProducts.get(position);

        viewHolder.txtTitle.setText(itemProduct.getName());
        viewHolder.txtStore.setText(itemProduct.getStore());
        viewHolder.txtPhone.setText(itemProduct.getPhone());

        viewHolder.txtPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onPhoneClick(itemProduct.getPhone());
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemProducts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtTitle;
        TextView txtStore;
        TextView txtPhone;
        Button btnShare;
        Button btnSeeMore;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.item_product_title);
            txtStore = itemView.findViewById(R.id.item_product_store);
            txtPhone = itemView.findViewById(R.id.item_product_phone);
            btnShare = itemView.findViewById(R.id.item_product_share);
            btnSeeMore = itemView.findViewById(R.id.item_product_detail);
        }
    }

    public void addItems(List<ItemProduct> list){
        itemProducts.addAll(list);
    }

    public interface OnPhoneClickListener {
        void onPhoneClick(String phone);
    }
}
