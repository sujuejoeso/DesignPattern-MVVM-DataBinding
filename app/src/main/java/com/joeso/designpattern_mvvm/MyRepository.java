package com.joeso.designpattern_mvvm;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

class MyRepository {
    private static final MyRepository ourInstance = new MyRepository();
    static MyRepository getInstance() {
        return ourInstance;
    }
    private MyRepository() { }
    private String data;

    public void setData(String data) {
        this.data=data;
    }

    public MutableLiveData<String> getData(){
        MutableLiveData<String> liveData=new MutableLiveData<>();
        liveData.setValue(this.data);
        return liveData;
    }
}
