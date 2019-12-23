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

public class ItemAdapter_recycler_behtarin_dastoor_pokht_ha extends RecyclerView.Adapter<ItemAdapter_recycler_behtarin_dastoor_pokht_ha.MyViewHolder> {
    List<Item_recycler_behtarin_dastoor_pokht_ha>itemList2;
    Context mContext2;
    public ItemAdapter_recycler_behtarin_dastoor_pokht_ha(List<Item_recycler_behtarin_dastoor_pokht_ha>itemList2, Context mContext2){
        this.itemList2 = itemList2;
        this.mContext2 = mContext2;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View aView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_bartarindastoorpokht,parent,false);
        return new MyViewHolder(aView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Item_recycler_behtarin_dastoor_pokht_ha aItemRecyclerbehtarindastoorpokhtha = itemList2.get(position);
        holder.aAvatar2.setImageResource(aItemRecyclerbehtarindastoorpokhtha.getuAvatar2());
        holder.aName2.setText(aItemRecyclerbehtarindastoorpokhtha.getuName2());
    }

    @Override
    public int getItemCount() {
        return itemList2.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView aAvatar2;
        public TextView aName2;




        public MyViewHolder(View itemView) {
            super(itemView);

            aAvatar2 = itemView.findViewById(R.id.img_recycler_bartarinDastoorPokht);
            aName2 = itemView.findViewById(R.id.txt_name_bartarinDastoorPokht);


        }
    }

}