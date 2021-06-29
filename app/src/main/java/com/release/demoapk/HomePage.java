package com.release.demoapk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        String name = getIntent().getStringExtra("name");
      Student s = (Student) getIntent().getSerializableExtra("data");


      txt = findViewById( R.id.text);

      txt.setText("name: "+s.name+"\nroll: "+s.roll+"\n class"+s.clas+"\n mark : "+s.mark);

//      Toast.makeText(this,"Hy",Toast.LENGTH_SHORT).show();






    }
}