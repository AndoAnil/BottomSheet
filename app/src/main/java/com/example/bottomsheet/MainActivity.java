package com.example.bottomsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View view;
        Button button=(Button)findViewById(R.id.bottomSheet);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheet bottomSheet=new BottomSheet();
                bottomSheet.show(getSupportFragmentManager(),"Model Bottom sheet");
            }
        });
    }
}