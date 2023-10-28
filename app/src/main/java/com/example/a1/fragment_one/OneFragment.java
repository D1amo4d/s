package com.example.a1.fragment_one;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a1.R;
import com.example.a1.databinding.FragmentOneBinding;
import com.example.a1.fragment_one.anime_adapter.Anime;
import com.example.a1.fragment_one.anime_adapter.AnimeAdaper;
import com.example.a1.fragment_one.anime_adapter.clicitem.OnItemClicListner;
import com.example.a1.fragment_one.anime_adapter.two_fragment.TwoFragment;

import java.util.ArrayList;

public class OneFragment extends Fragment implements OnItemClicListner {
    private ArrayList<Anime> animeItem = new ArrayList<>();
    private FragmentOneBinding binding;
    private AnimeAdaper AniAdaper;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentOneBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        AniAdaper = new AnimeAdaper(animeItem, this);
        binding.rvAnime.setAdapter(AniAdaper);

        adater();
    }

    private void adater() {
        animeItem.add(new Anime("https://w7.pngwing.com/pngs/896/770/png-transparent-asia-hd-logo.png", "Азия"));
        animeItem.add(new Anime("https://thumbs.dreamstime.com/b/%D0%BD%D0%B0%D0%B4%D0%BF%D0%B8%D1%81%D1%8C-%D0%BD%D0%B0-%D0%B0%D1%84%D1%80%D0%B8%D0%BA%D1%83-%D0%B8-%D1%81%D0%B8%D0%BB%D1%83%D1%8D%D1%82-%D0%B6%D0%B8%D1%80%D0%B0%D1%84-%D1%84%D0%BE%D0%BD%D0%B5-%D0%BA%D1%80%D0%B0%D1%81%D0%BD%D0%BE%D0%B3%D0%BE-%D0%BF%D1%8F%D1%82%D0%BD%D0%B0-%D0%B6%D0%B8%D1%80%D0%B0%D1%84%D1%8B-177474468.jpg", "Aфрика"));
        animeItem.add(new Anime("https://png.pngtree.com/png-vector/20190322/ourmid/pngtree-button-europe-flag-vector-template-design-png-image_859958.jpg", "Европа"));
        animeItem.add(new Anime("https://png.pngtree.com/png-clipart/20220719/ourmid/pngtree-flag-of-north-macedonia-png-image_6006716.png", "Северная Америка"));
        animeItem.add(new Anime("https://e7.pngegg.com/pngimages/247/39/png-clipart-australia-koala-australia-text-logo.png", "Австралия"));
        animeItem.add(new Anime("https://png.pngtree.com/png-vector/20200531/ourmid/pngtree-usa-map-illustration-in-icon-drawn-style-png-image_2216330.jpg", "Южная Америка"));
    }

    @Override
    public void onItemClic(int position) {
        Anime anime = animeItem.get(position);
        Bundle bundle = new Bundle();

        bundle.putInt("key",position);

        TwoFragment twoFragment = new TwoFragment();
        twoFragment.setArguments(bundle);

        requireActivity()
                .getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fr_one_fragment, twoFragment)
                .addToBackStack(null)
                .commit();
    }
}
