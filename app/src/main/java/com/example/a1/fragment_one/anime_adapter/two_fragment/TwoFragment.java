package com.example.a1.fragment_one.anime_adapter.two_fragment;

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

import java.util.ArrayList;

public class TwoFragment extends Fragment {
    private ArrayList<Anime>animeArrayListOf=new ArrayList<>();
    private TwoAdapter twoFragment;
    private FragmentOneBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding=FragmentOneBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        Anime anime=(Anime) getArguments().getSerializable("anime");
        int post=getArguments().getInt("key");

        cheekPosition(post);
        twoFragment = new TwoAdapter(animeArrayListOf);
    }

    private void cheekPosition(int post) {
        if (post==0){
            loadAzia();
        }
        if (post==1){
            loadAfrica();
        }
        if (post==2){
            loadEvropa();
        }
        if (post==3){
            loadSewerAmerika();
        }
        if (post==4){
            loadAfstralia();
        }
        if (post==5){
            loadIyujnayaAmerika();
        }
    }

    private void loadIyujnayaAmerika() {
        animeArrayListOf.add(new Anime("",""));
        animeArrayListOf.add(new Anime("",""));
        animeArrayListOf.add(new Anime("",""));
        animeArrayListOf.add(new Anime("",""));
        animeArrayListOf.add(new Anime("",""));

    }

    private void loadAfstralia() {
        animeArrayListOf.add(new Anime("",""));
        animeArrayListOf.add(new Anime("",""));
        animeArrayListOf.add(new Anime("",""));
        animeArrayListOf.add(new Anime("",""));
        animeArrayListOf.add(new Anime("",""));

    }

    private void loadSewerAmerika() {
        animeArrayListOf.add(new Anime("",""));
        animeArrayListOf.add(new Anime("",""));
        animeArrayListOf.add(new Anime("",""));
        animeArrayListOf.add(new Anime("",""));
        animeArrayListOf.add(new Anime("",""));

    }

    private void loadEvropa() {
        animeArrayListOf.add(new Anime("",""));
        animeArrayListOf.add(new Anime("",""));
        animeArrayListOf.add(new Anime("",""));
        animeArrayListOf.add(new Anime("",""));
        animeArrayListOf.add(new Anime("",""));

    }

    private void loadAfrica() {
        animeArrayListOf.add(new Anime("",""));
        animeArrayListOf.add(new Anime("",""));
        animeArrayListOf.add(new Anime("",""));
        animeArrayListOf.add(new Anime("",""));
        animeArrayListOf.add(new Anime("",""));
    }

    private void loadAzia() {
        animeArrayListOf.add(new Anime("Соединенные Штаты Америким","data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAHkAAABACAMAAAAJUSgeAAAAnFBMVEX///+yIjQ8O26xHTGtABmxGS7AXmetABywECjOiY+4PUrpzc/26uvcrrKuACI6OW20s8I1NGosKmU0PHAxMGiMLU5RUHtjYodMS3ifn7O+vcpFRHNBQHEjImHd3eRYV4D29vipqbuJiaOUlKvm5uuCgZ0cG150dJPPz9lubY8VE1uQPFnFxdCIHEOVT2gSD1uum6uebIGmhpjNsLj2n0eBAAAEAklEQVRYhe2Z25LbNgxAWSZp0lsg0FxRd1KWZEmutunl//+tAOi0eeh0xh7M7MMuxjPH3IeFSeqAMG0sBVj7Df598x88Pb37TicM/T+oUP5v12Z+HfsyE/PY8lgzM8R6DDQbiFORuTTCcjky141pq30LypmTyRmS2WlyUM1mZXaDWWSygzkzYTM1np4+vNMJyoxFwUtqcRxLILoi04/1DpbGRORxXS94+vVHpTC8f976uDqLnvKcM9tMuNa9RWfBTT2gB+saoxXy7OA6J15R3Oc0eWIYaGVpJYij550YTCFPuHJmsNchXZn9NncAxCMh8LhJkemKFJCtUs0MlmyJbYUdvZhQIgaM4CMCEfkVXKCxV80MYSzoCQIMdbPTfMmujciWbSuzXIadJIdqGVbri5+VgjJXyUS2qr2xm0242bQKN7EL8DATnp7fKwXvc113lidXT5Hn7MaJ9xawPu+8x75eVloTIJJVmtWTrcKwkFoesJ2cjCsmPWSXsWdSWrILdatntiplq9bZsFUQ5mxV/NYq1ur09OmDTvxj1XzhFe+3oRWbjtly/eqP4WbVTJWVPsvpt++VgjKTSp6OqQrbGyF4KPuIbve2cqwYjS8ReOwOPatwbQ56gqh+NdsiHAdhGIczM9bzWewi6lYSTKnjLcTZ8EqDG0wpK7wZqVs0zV3YkF2qmdvzueV+AKaFrOosTmuUT3LeuaJYPwUhTmHVzUy2WBcWscdX9YWJTLIIr8UXGiO68QsQrf/9J6W4WbUYqk98ViVTi1XpdlYlU4hVs2myVc/vP+qEkcbLXrehz1Zt1c2mzIY6IekWtjVbpVlJsA2+8z35RETXIeweoK/Qc7dAf8fV0WdqoaexZmZcti3Xr2PI3UEzy8oHJj3koUi1dIbFXMPp+fMnnaA5X1Jy0g3MxvOmXwYjW9pvbBexMZHPLFfQ2YV//KAUbNW6tjwnu4RIRwYg01JrssSQx+WOmWSVYg1jq+jUr0tg7kUlDGNlWa7qyIxNy1TvANke6bGp95YugCw6S+89iGW2yx2hdgcIbNEBTN80pdhUNDHbVOzCschWqWb25U5dgOsyqSsAtonscov02uiJQD335dyD//MXpWCrhjlbNWSb9m3OdWxLo+wAk8+qIxXUh338rBM05+s897yF/ZCcWLUlsas/TAXZJrHLjXRmqdawKoRWvj/sUc4oWMuYx5V8h8S1+8odFDM75/reSdzwP6R3eqtd3Bl/qT1hb/E6QuvQu/+UVDrnH+gMlOrCA5Xk5TIr9bAPdL1ajfv9nf5bvI7Quny4/7ZC6b7lgRual6skL5dZ6zLx/ttHrQvU+29c3+J1hNaPQPf/aqT0u9cDv5S9XCV5hZn/BuDQw3yWb4KpAAAAAElFTkSuQmCC"));
        animeArrayListOf.add(new Anime("Канада","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQr-73BlEB_zNYogVDjzBDXWISoSYjlw635IJRTIBw&s"));
        animeArrayListOf.add(new Anime("Мексика","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRjGBdy4P3zCOH6RGwDPL6GxUs7fMn9uOi1udP2mwk&s"));
        animeArrayListOf.add(new Anime("Гренландия","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSwFy5-s7H_R4WvpqSG_H-khqXb9xM7DesM8_KMaG_V&s"));
        animeArrayListOf.add(new Anime("Коста-Рика","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRouDG0-iacDE4SnCccfqqEI5BcQ9pevabvS-eQE8k&s"));
        animeArrayListOf.add(new Anime("Куба","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ2PwzweEjrLn3PwwMo3dYylQWvn692sumu4Z2ukiY&s"));
    }
}