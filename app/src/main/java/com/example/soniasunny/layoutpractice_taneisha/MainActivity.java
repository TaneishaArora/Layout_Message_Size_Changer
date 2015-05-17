package com.example.soniasunny.layoutpractice_taneisha;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    private TextView text;
   private Button submit,edit;
    public static EditText message;
    private String line,no_message="No message";


    @Override
    protected void onCreate(Bundle bundle){
       final Context state = getApplicationContext();
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        text =(TextView)findViewById(R.id.blank_Text);
        message = (EditText)findViewById(R.id.user_text);
        submit = (Button)findViewById(R.id.button_submit);
        edit = (Button)findViewById(R.id.button_edit);

       final Toast notify = Toast.makeText(state,no_message,Toast.LENGTH_SHORT);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(message.getText().toString().equals("")){
                notify.show();
                    text.setText(no_message);
                }else{
                    text.setText(message.getText().toString());

                }
            }
        });

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notice = Toast.makeText(state,"You may now edit your text!",Toast.LENGTH_SHORT);
                Intent openEditPage = new Intent(MainActivity.this,EditMessageActivity.class);
                startActivity(openEditPage);
            }
        });

    }
    @Override
    protected void onStart(){
        super.onStart();
    }
    @Override
    protected void onResume(){
        super.onResume();
    }
    @Override
    protected void onPause(){
        super.onPause();
    }
    @Override
    protected void onStop(){
        super.onStop();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
    }

}
