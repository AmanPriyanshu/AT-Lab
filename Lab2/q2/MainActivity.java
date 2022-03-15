package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private EditText et_plaintext;
    private EditText et_shift_key;
    private Button btn_encrypt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_plaintext = (EditText) findViewById(R.id.plain);
        et_shift_key = (EditText) findViewById(R.id.key);
        btn_encrypt = (Button) findViewById(R.id.btn_encrypt);
        btn_encrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String plain_text = String.valueOf(et_plaintext.getText());
                String shift_key_txt = String.valueOf(et_shift_key.getText());
                int shift_key = Integer.parseInt(shift_key_txt);
                String cipher_text = "";
                for (int i = 0; i < plain_text.length(); i++) {
                    if(('Z' >= plain_text.charAt(i) && plain_text.charAt(i)>='A') || ('z' >= plain_text.charAt(i) && plain_text.charAt(i)>='a')){
                        char t = (char)((int)plain_text.charAt(i)+shift_key);
                        cipher_text += t;
                    }
                    else{
                        cipher_text += plain_text.charAt(i);
                    }
                }
                Toast.makeText(getApplicationContext(), cipher_text, Toast.LENGTH_LONG).show();
            }
        });
    }
}