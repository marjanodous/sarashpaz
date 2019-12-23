package com.example.sarashpaz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter_recycler_img extends RecyclerView.Adapter<ItemAdapter_recycler_img.MyViewHolder3> {
    List<Item_recycler_img> item3ListRecyclerimg;
    Context mContext3;
    public ItemAdapter_recycler_img(List<Item_recycler_img> item3ListRecyclerimg, Context mContext3){
        this.item3ListRecyclerimg = item3ListRecyclerimg;
        this.mContext3 = mContext3;
    }
    @NonNull
    @Override
    public MyViewHolder3 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View aView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_img,parent,false);
        return new MyViewHolder3(aView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder3 holder, int position) {
        Item_recycler_img aItemRecyclerimg = item3ListRecyclerimg.get(position);
        holder.aAvatar3.setImageResource(aItemRecyclerimg.getuAvatar3());
    }

    @Override
    public int getItemCount() {
        return item3ListRecyclerimg.size();
    }

    public class MyViewHolder3 extends RecyclerView.ViewHolder {

        public ImageView aAvatar3;



        public MyViewHolder3(View itemView) {
            super(itemView);

            aAvatar3 = itemView.findViewById(R.id.img_recycler_img);

        }
    }

}