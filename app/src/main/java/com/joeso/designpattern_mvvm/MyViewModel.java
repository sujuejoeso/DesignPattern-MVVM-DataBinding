package com.joeso.designpattern_mvvm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private MyRepository mRepository=MyRepository.getInstance();
    public MutableLiveData<String> getData() {
        return mRepository.getData();
    }
}
