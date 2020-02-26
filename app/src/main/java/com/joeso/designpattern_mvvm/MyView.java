package com.joeso.designpattern_mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MyView extends AppCompatActivity {
    private Button bnChangeSource;
    private Button bnGetData;
    private EditText etSource;
    private TextView tvResult;
    private MyViewModel mViewModel;
    private MyRepository myRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bnChangeSource = findViewById(R.id.button);
        bnGetData=findViewById(R.id.button2);
        etSource = findViewById(R.id.source);
        tvResult = findViewById(R.id.result);
        myRepository=MyRepository.getInstance();
        mViewModel = ViewModelProviders.of(this).get(MyViewModel.class);

        bnChangeSource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etSource.getText()!=null)
                    myRepository.setData(etSource.getText().toString());
            }
        });

        bnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText();
            }
        });
    }

    private void setText() {
        mViewModel.getData().observe(this,new Observer<String>() {
            @Override
            public void onChanged (String data){
                tvResult.setText(data);
            }
        });
    }
}
