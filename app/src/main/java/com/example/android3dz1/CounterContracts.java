package com.example.android3dz1;

public class CounterContracts {
     public interface CounterView{
         void UpdateCounter(int count);
     }
     interface Presenter{
         void   increment();
         void attachView(CounterView counterView);
         void   decrement();

     }
}
