package com.example.android3dz1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.android3dz1.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity implements CounterContracts.CounterView{

    ActivityMainBinding binding;
    CounterPresenter counterPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        counterPresenter = Injector.attachPresenter();
        counterPresenter.attachView(this);
        initListener();
    }
    private void initListener() {
        binding.incrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterPresenter.increment();
                counterPresenter.change();

            }
        });

        binding.decrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterPresenter.decrement();
                counterPresenter.change();
            }
        });
    }

    @Override
    public void updateCounter(int count) {
        binding.numberTv.setText(String.valueOf(count));
    }

    public void greenView() {
        binding.numberTv.setTextColor(Color.parseColor("#4D9E50"));
    }
}
