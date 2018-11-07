package com.ofal.ihsan.petemuanpertama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView hasil;
    Button btn_tast, btn_count;
    int jumlah=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hasil= findViewById(R.id.txt_hasil);
        btn_tast= findViewById(R.id.btn_toast);
        btn_count=findViewById(R.id.btn_count);

        btn_tast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hallo Selamat Datang", Toast.LENGTH_SHORT).show();
            }
        });
        btn_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumlah=jumlah+1;
                hasil.setText(String.valueOf(jumlah));
            }
        });

    }
}
