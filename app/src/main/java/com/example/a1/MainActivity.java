package com.example.a1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.a1.databinding.ActivityMainBinding;
import com.example.a1.fragment_one.OneFragment;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fr_one_fragment, new OneFragment())
                .addToBackStack(null)
                .commit();
    }
}