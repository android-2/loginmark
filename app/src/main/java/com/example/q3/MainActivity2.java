package com.example.q3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    TextView txtname,txtsurname,txtclass,txtgender,txthobbies,txtmarks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
        Bundle bundle=getIntent().getExtras();


        txtname=(TextView) findViewById(R.id.txtname);
        txtsurname=(TextView) findViewById(R.id.txtsurname);
        txtclass=(TextView) findViewById(R.id.txtclass);
        txtgender=(TextView) findViewById(R.id.txtgender);
        txthobbies=(TextView) findViewById(R.id.txthobbies);
        txtmarks=(TextView) findViewById(R.id.txtmarks);



        if(bundle!=null)
        {
            String name= bundle.getString("name");
            String surname= bundle.getString("surname");
            String classes= bundle.getString("class");
            String gender= bundle.getString("gender");

            String hobbies=bundle.getString("hobbies");
            String marks=bundle.getString("marks");

            txtname.setText("Name:-"+name);
            txtsurname.setText("surname:-"+surname);
            txtclass.setText("class:-"+classes);
            txtgender.setText("Gender:-"+gender);
            txthobbies.setText("Hobbies:-"+hobbies);
            txtmarks.setText("marks:-"+marks);


        }

    }
}