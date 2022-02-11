package com.example.android3dz1;

public class CounterContracts {

    public interface  CounterView{
        void updateCounter(int count);
    }
    interface Presenter{
        void increment();
        void decrement();
        void attachView(CounterView counterView);

        void updateCounter(int count);
    }


}
