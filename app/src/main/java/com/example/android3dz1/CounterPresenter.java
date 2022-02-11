package com.example.android3dz1;


import android.graphics.Color;

import com.example.android3dz1.databinding.ActivityMainBinding;


public class CounterPresenter implements CounterContracts.Presenter {
    CounterModel counterModel;
    CounterContracts.CounterView counterView;
    ActivityMainBinding binding;



    public CounterPresenter() {
        counterModel = new CounterModel();
    }

    @Override
    public void increment() {
        counterModel.increment();
        counterView.updateCounter(counterModel.getCount());
    }

    @Override
    public void decrement() {
        counterModel.decrement();
        counterView.updateCounter(counterModel.getCount());
    }

    @Override
    public void attachView(CounterContracts.CounterView counterView) {
        this.counterView = counterView;
    }

    @Override
    public void updateCounter(int count) {
        binding.numberTv.setText(String.valueOf(count));
        if (count == 10){
            binding.numberTv.setTextColor(Color.GREEN);
        }else {
            binding.numberTv.setTextColor(Color.WHITE);
        }
    }

}
