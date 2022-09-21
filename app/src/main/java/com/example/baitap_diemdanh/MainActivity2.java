package com.example.baitap_diemdanh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private Button btn_Back;
    TextView text_thongtin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn_Back = (Button) findViewById(R.id.btn_Back);
        text_thongtin = (TextView) findViewById(R.id.text_thongtin);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("dulieu");
        String tensv = bundle.getString("TenSV");
        String masv = bundle.getString("MaSV");
        text_thongtin.setText(tensv);
        btn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent1);
            }
        });
    }
}