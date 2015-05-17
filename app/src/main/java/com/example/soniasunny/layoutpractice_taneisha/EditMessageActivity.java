package com.example.soniasunny.layoutpractice_taneisha;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class EditMessageActivity extends Activity {
    private Button increase,decrease,back;
    private String text;
    private  TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_message);

        back =(Button)findViewById(R.id.back);
        increase = (Button)findViewById(R.id.increase);
        decrease = (Button)findViewById(R.id.decrease);
        text = MainActivity.message.getText().toString();
        display = (TextView)findViewById(R.id.blank_Text);
        display.setText(text);
        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setTextSize(TypedValue.COMPLEX_UNIT_DIP,display.getTextSize()+0.1f);
            }
        });

        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setTextSize(TypedValue.COMPLEX_UNIT_DIP,display.getTextSize()-0.1f);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditMessageActivity.this.finish();
            }
        });
    }


}
