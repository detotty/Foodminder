package com.hpp.foodminder;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AddItem extends SlidingDrawerActivity {

    EditText Notes, name;
    TextView restName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);
    }


    @Override
    protected void onResume() {
        super.onResume();
        name = (EditText) findViewById(R.id.et_name);
        restName = (TextView) findViewById(R.id.tv_name);
        ImageView mHome = (ImageView) toolbar.findViewById(R.id.home);
        mHome.setImageDrawable(getResources().getDrawable(R.drawable.check_mark));
        TextView mText = (TextView) toolbar.findViewById(R.id.toolbar_title);
        Typeface tf = Typeface.createFromAsset(getAssets(), "Pacifico.ttf");
        mText.setTypeface(tf);
        restName.setTypeface(tf);
        mHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!name.getText().toString().isEmpty()) {

                } else {
                    Toast.makeText(AddItem.this, "Please enter item name", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}