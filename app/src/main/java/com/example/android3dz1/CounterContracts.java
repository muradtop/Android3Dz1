package com.example.android3dz1;

public class CounterContracts {



    interface CounterView{
        void updateCounter(int count);
        void greenView();
    }

    interface Presenter{
        void increment();
        void attachView(CounterView counterView);
        void change();

    }
}
