package com.example.joy.recyclerview7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private TextView name,description;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        //---initialize----------
        name=findViewById(R.id.textView_name);
        description=findViewById(R.id.textView_des);
        imageView=findViewById(R.id.imageView);


        name.setText(getIntent().getStringExtra("name"));
        description.setText(getIntent().getStringExtra("des"));
        imageView.setImageResource(getIntent().getIntExtra("logo",R.mipmap.ic_launcher));


    }
}
