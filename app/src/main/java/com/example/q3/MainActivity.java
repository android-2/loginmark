package com.example.q3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText txtname,txtsurname,txtclass,txtgender,txthobbies,txtmarks;
    Button btnsubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        txtname=(EditText)findViewById(R.id.txtname);
        txtsurname=(EditText)findViewById(R.id.txtsurname);
        txtclass=(EditText)findViewById(R.id.txtclass);
        txtgender=(EditText)findViewById(R.id.txtgender);
        txthobbies=(EditText)findViewById(R.id.txthobbies);
        txtmarks=(EditText)findViewById(R.id.txtmarks);

        btnsubmit=(Button) findViewById(R.id.btnsubmit);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=txtname.getText().toString();
                String surname=txtsurname.getText().toString();
                String classes=txtclass.getText().toString();
                String gender=txtgender.getText().toString();
                String hobbies=txthobbies.getText().toString();
                String marks=txtmarks.getText().toString();
                Bundle bundle=new Bundle();
                bundle.putString("name",name);
                bundle.putString("surname",surname);
                bundle.putString("class",classes);
                bundle.putString("gender",gender);
                bundle.putString("hobbies",hobbies);
                bundle.putString("marks",marks);

                Intent intent=new Intent(MainActivity.this, MainActivity2.class);

                intent.putExtras(bundle);
                startActivity(intent);


            }
        });

    }
}