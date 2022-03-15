package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity {
    private EditText et_Username;
    private EditText et_Password;
    private EditText et_Email;
    private EditText et_Phone;
    private Button btn_SignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_Username = (EditText) findViewById(R.id.username);
        et_Password = (EditText) findViewById(R.id.password);
        et_Email = (EditText) findViewById(R.id.email);
        et_Phone = (EditText) findViewById(R.id.phone);
        btn_SignIn = (Button) findViewById(R.id.btn_SignIn);
        btn_SignIn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = String.valueOf(et_Username.getText());
                String password = String.valueOf(et_Password.getText());
                String email = String.valueOf(et_Email.getText());
                if (email.indexOf('@')!=-1 && email.lastIndexOf('@')<email.lastIndexOf('.') && email.indexOf('@')==email.lastIndexOf('@')){
                    Toast.makeText(getApplicationContext(), "EMAIL VERIFIED!",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Please ensure the email provided is correct!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}