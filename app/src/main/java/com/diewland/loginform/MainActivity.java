package com.diewland.loginform;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et_username;
    private EditText et_password;
    private Button bt_login;
    private TextView tv_output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_username = (EditText)findViewById(R.id.username);
        et_password = (EditText)findViewById(R.id.password);
        bt_login    = (Button)findViewById(R.id.login);
        tv_output   = (TextView)findViewById(R.id.output);

        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usr = et_username.getText().toString();
                String pwd = et_password.getText().toString();
                if((usr.equals("admin")) &&
                   (pwd.equals("password"))){
                    tv_output.setText("Login success");
                    tv_output.setTextColor(Color.GREEN);
                }
                else {
                    tv_output.setText("Login fail");
                    tv_output.setTextColor(Color.RED);
                }
            }
        });
    }
}
