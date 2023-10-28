package com.example.a1.fragment_one.anime_adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.a1.R;
import com.example.a1.fragment_one.anime_adapter.clicitem.OnItemClicListner;

import java.util.ArrayList;

public class AnimeAdaper extends RecyclerView.Adapter<AnimeAdaper.AnimeViewHolder> {
    private ArrayList<Anime> animeList;
    private OnItemClicListner onItemClicListner;

    public AnimeAdaper(ArrayList<Anime> animeList, OnItemClicListner onItemClicListner) {
        this.animeList = animeList;
        this.onItemClicListner = onItemClicListner;
    }

//    public AnimeAdaper(ArrayList<Anime> animeItem)   {
//        this.animeList=animeItem;
//    }

    @NonNull
    @Override
    public AnimeAdaper.AnimeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AnimeViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_anime, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AnimeAdaper.AnimeViewHolder holder, int position) {
        holder.onBind(animeList.get(position));
    }

    @Override
    public int getItemCount() {
        return animeList.size();
    }

    public class AnimeViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgPoster;
        private TextView tvName;

        public AnimeViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPoster = itemView.findViewById(R.id.img_poster);
            tvName = itemView.findViewById(R.id.tv_name);
        }

        public void onBind(@NonNull Anime anime) {
            tvName.setText(anime.getTvName());
            Glide.with(itemView).load(anime.getImgPoster()).into(imgPoster);
            itemView.setOnClickListener(v -> {
                onItemClicListner.onItemClic(getAdapterPosition());

            });
        }
    }
}
