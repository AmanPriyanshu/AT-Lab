package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    private Button bt_black;
    private Button bt_white;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_black = (Button) findViewById(R.id.black);
        bt_white = (Button) findViewById(R.id.white);
        final LinearLayout linearLayout;
        linearLayout = findViewById(R.id.main_var);
        bt_black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayout.setBackgroundResource(R.color.black);
            }
        });
        bt_white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayout.setBackgroundResource(R.color.white);
            }
        });
    }
}