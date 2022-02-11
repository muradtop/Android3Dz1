package com.example.android3dz1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android3dz1.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity implements CounterContracts.CounterView{
    ActivityMainBinding binding;
    CounterPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        presenter = Injector.attachPresenter();
        presenter.attachView(this);
        initListeners();
    }

    private void initListeners() {
        binding.incrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.increment();
            }
        });
        binding.decrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.decrement();
            }
        });

    }

    @Override
    public void UpdateCounter( int count) {
        binding.numberTv.setText(String.valueOf(count));
        if (count >= 10 ){
            binding.numberTv.setBackgroundColor(Color.GREEN);
        }else if(count <=10){
            binding.numberTv.setBackgroundColor(Color.TRANSPARENT);
        }


    }

}