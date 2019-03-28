package com.example.w2019firstday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


   private EditText  edtemail1;
   private EditText edtpass1;
   private Button btnlogin1;
   private Button btnclr1;
   private TextView textView1;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtemail1 = findViewById(R.id.edtemail);
        edtpass1 = findViewById(R.id.edtpass);
        textView1 = findViewById(R.id.textView);
        btnclr1 = findViewById(R.id.btnclr);
        btnlogin1 = findViewById(R.id.btnlogin);

        btnlogin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = edtemail1.getText().toString();
                Toast.makeText(MainActivity.this,email,Toast.LENGTH_SHORT).show();

            }
        });



    }
}
