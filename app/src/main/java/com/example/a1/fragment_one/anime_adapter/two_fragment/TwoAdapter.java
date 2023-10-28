package com.example.a1.fragment_one.anime_adapter.two_fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.a1.R;
import com.example.a1.fragment_one.anime_adapter.Anime;

import java.util.ArrayList;

public class TwoAdapter extends RecyclerView.Adapter<TwoAdapter.TwoViewHolder> {
    private ArrayList<Anime>animeArrayList;

    public TwoAdapter(ArrayList<Anime> animeArrayListOf) {
        this.animeArrayList=animeArrayListOf;
    }

    @NonNull
    @Override
    public TwoAdapter.TwoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TwoViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_two,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull TwoAdapter.TwoViewHolder holder, int position) {
    holder.bind(animeArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return animeArrayList.size();
    }

    public class TwoViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgStrana;
        private TextView tvNameStrana;
        public TwoViewHolder(@NonNull View itemView) {
            super(itemView);
            imgStrana=itemView.findViewById(R.id.img_vlege);
            tvNameStrana=itemView.findViewById(R.id.tv_name_strana);
        }
        public void bind(Anime animemodel){
            tvNameStrana.setText(animemodel.getTvName());
            Glide.with(itemView).load(animemodel.getImgPoster()).into(imgStrana);
        }
    }
}
