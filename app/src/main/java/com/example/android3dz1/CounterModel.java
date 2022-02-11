package com.example.android3dz1;

public class CounterModel {

    int count = 0;


    void decrement() {
        --count;
    }

    void increment() {
        ++count;
    }

    public int getCount() {
        return count;
    }
}
