package com.example.baitap_diemdanh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnNhap;
    EditText edtTenSV, edtMaSV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNhap = (Button) findViewById(R.id.btn_Nhap);
        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                Bundle bundle = new Bundle();
                bundle.putString("TenSV", String.valueOf(edtTenSV));
                bundle.putString("MaSV", String.valueOf(edtMaSV));
                intent.putExtra("dulieu", bundle);

                startActivity(intent);
            }
        });
    }
}