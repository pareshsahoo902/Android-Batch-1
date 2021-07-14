package com.release.demoapk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SharedPrefActivity extends AppCompatActivity {

    EditText name , age;
    Button add,remove;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_pref);


        name = findViewById(R.id.name);
        age = findViewById(R.id.age);

        add = findViewById(R.id.add);
        remove = findViewById(R.id.remove);
        preferences = getSharedPreferences("MyPref",MODE_PRIVATE);

        String n = preferences.getString("NAME","");
        int a = preferences.getInt("AGE",0);

        //fetch from shred pref

        if (!n.equals("") || n!=null){
            name.setText(n);
        }

        if (a>0){
            age.setText(String.valueOf(a));
        }

        SharedPreferences.Editor myEdit = preferences.edit();

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myEdit.putString("NAME",name.getText().toString().trim());
                myEdit.putInt("AGE",Integer.parseInt(age.getText().toString()));

                myEdit.commit();
                Toast.makeText(SharedPrefActivity.this, "Added!", Toast.LENGTH_SHORT).show();

            }
        });

        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEdit.clear().commit();
                Toast.makeText(SharedPrefActivity.this, "Cleared!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}