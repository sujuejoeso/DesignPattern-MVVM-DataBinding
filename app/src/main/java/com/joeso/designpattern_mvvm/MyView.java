package com.joeso.designpattern_mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.joeso.designpattern_mvvm.databinding.MyViewBinding;

public class MyView extends AppCompatActivity {
    private Button bnChangeSource;
    private Button bnGetData;
    private EditText etSource;
    private TextView tvResult;
    private TextView tvData;

    private MyViewModel mViewModel;
    private MyRepository myRepository;

    MyViewBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding= DataBindingUtil.setContentView(this,R.layout.my_view);
        tvData=findViewById(R.id.data);
        myRepository=MyRepository.getInstance();
        mViewModel = ViewModelProviders.of(this).get(MyViewModel.class);

        mBinding.setMyData("I am binded !");




    }
}
