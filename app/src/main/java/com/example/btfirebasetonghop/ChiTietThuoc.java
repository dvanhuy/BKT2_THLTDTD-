package com.example.btfirebasetonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ChiTietThuoc extends AppCompatActivity {

    ImageView back;
    TextView tenkhoahoc,tenthuong,maula,congdung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_thuoc);
        back=findViewById(R.id.buttonback);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Intent intent = getIntent();
        Bundle bundle= intent.getBundleExtra("bundle");
        Item item  = (Item) bundle.getSerializable("thuoc");
        tenkhoahoc= findViewById(R.id.chitiettenkhoahoc);
        tenthuong= findViewById(R.id.chitiettenthuong);
        maula= findViewById(R.id.chitietmaula);
        congdung= findViewById(R.id.chitietcongdung);

        tenkhoahoc.setText(item.getTenkhoahoc());
        tenthuong.setText("Tên thường : " + item.getTenthuong());
        maula.setText("Màu lá : " +item.getMaula());
        congdung.setText("Công dụng : " +item.getCongdung());

    }
}