package com.example.sarashpaz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter_recycler_myanvade extends RecyclerView.Adapter<ItemAdapter_recycler_myanvade.MyViewHolder> {
    List<Item_recycler_myanvade>itemList;
    Context mContext;
    public ItemAdapter_recycler_myanvade(List<Item_recycler_myanvade>itemList, Context mContext){
        this.itemList = itemList;
        this.mContext = mContext;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View aView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_myanvade,parent,false);
        return new MyViewHolder(aView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Item_recycler_myanvade aItem = itemList.get(position);
        holder.aAvatar.setImageResource(aItem.getuAvatar());
        holder.aName.setText(aItem.getuName());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView aAvatar;
        public TextView aName;



        public MyViewHolder(View itemView) {
            super(itemView);

            aAvatar = itemView.findViewById(R.id.img_recycler_myanvade);
            aName = itemView.findViewById(R.id.txt_name_mianvade);

        }
    }

}