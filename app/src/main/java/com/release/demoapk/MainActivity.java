package com.release.demoapk;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextView text;
    EditText edit;
    ImageView like;
    Button login;
    boolean isLiked=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.textView);
        like = findViewById(R.id.like);
        edit = findViewById(R.id.edit);
        login = findViewById(R.id.login);

        login.setEnabled(false);
        
        edit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (edit.getText().toString().length()>=10){
                    Toast.makeText(MainActivity.this, "Valid!", Toast.LENGTH_SHORT).show();
                    login.setEnabled(true);
                }else{
                    login.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        edit.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(MainActivity.this, "isFocues"+hasFocus, Toast.LENGTH_SHORT).show();
            }
        });


        like.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "LOng Clicked!", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        like.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (isLiked){
                    like.setImageResource(R.drawable.ic_baseline_thumb_down_24);
                    isLiked=false;
                }else{
                    like.setImageResource(R.drawable.ic_baseline_thumb_up_24);
                    isLiked=true;
                }

            }
        });


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                loginUser();


                Student s = new Student("paresh","23","a","89");

                Bundle bundle =  new Bundle();
                bundle.putSerializable("data",s);

                Intent homeIntent = new Intent(MainActivity.this,HomePage.class);
                homeIntent.setFlags( Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
              homeIntent.putExtras(bundle);
//                homeIntent.putExtra("name",edit.getText().toString());
                startActivity(homeIntent);
                finish();

//                startActivity(new Intent(MainActivity.this,HomePage.class));

            }


        });

        Log.v("Paresh","User is online");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("Paresh","User is online");

    }



    private void loginUser() {

        //Step1 VAlidate
        //Step 2 Api call
//        it returns a response
//        if no error
        Intent homeIntent = new Intent(MainActivity.this,HomePage.class);
        homeIntent.setFlags( Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
//              homeIntent.putExtras(bundle);
        startActivity(homeIntent);
        finish();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("Paresh","User is online");


    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.v("Paresh","Activity is Away");

    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.v("Paresh","Activity is Away");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("Paresh","Activity is Away");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("Paresh","Activity is Offline");

    }
}