package com.example.btfirebasetonghop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Home extends AppCompatActivity {
    ArrayList<Item> arrayList;
    ItemAdapter adapter;
    ListView listview;
    ImageView imageViewback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        arrayList= new ArrayList<>();
        listview = findViewById(R.id.listview);
        getData();
        adapter =new ItemAdapter(this,R.layout.item,arrayList);
        listview.setAdapter(adapter);
        imageViewback= findViewById(R.id.imageViewback);
        imageViewback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Home.this,ChiTietThuoc.class);
                Bundle bundle  = new Bundle();
                bundle.putSerializable("thuoc",arrayList.get(i));
                intent.putExtra("bundle",bundle);
                startActivity(intent);
            }
        });
    }

    private void getData(){
        arrayList.add(new Item("Bạc Hà", "Mentha arvensis L","Xanh" ,"Sơ phong, thanh nhiệt, thấu chẩn, sơ can, giải uất, giải độc. Chữa cảm mạo phong nhiệt,"));
        arrayList.add(new Item("Bách Bộ", "Stemona tuberosa Lour","Xanh" , "Nhuận phế, chỉ ho, sát trùng. Chữa các chứng ho mới hoặc ho lâu ngày"));
        arrayList.add(new Item("Bạch Đồng Nữ", "Clerodendrum chinense","Xanh" , "Thanh nhiệt, giải độc, khu phong trừ thấp, tiêu viêm. Rễ cây chữa gân xương đau nhức"));
        arrayList.add(new Item("Bạch Hoa Xà Thiệt Thảo", "Hedyotis diffusa Willd", "Xanh" ,"Thanh nhiệt giải độc, lợi niệu thông lâm, tiêu ung tán kết."));
        arrayList.add(new Item("Hạ Khô Thảo", "Prunella vulgaris L", "Xanh" ,"Thanh nhiệt giải độc, lợi niệu thông lâm, tiêu ung tán kết."));
    }
}