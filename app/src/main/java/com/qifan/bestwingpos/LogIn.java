package com.qifan.bestwingpos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LogIn extends AppCompatActivity {


    @BindView(R.id.password)
    EditText password;

    @BindView(R.id.user_name)
    EditText userName;

    @BindView(R.id.LogInButton)
    Button LogInButton;

    //Just a Temporary Hold before i Create a Database;
    private final String mUsername="Qifanguo";
    private final String mPassword="qifanerB123.";

    @OnClick(R.id.LogInButton)
    public void OnLogIn(){
        String tUserName=userName.getText().toString();
        String tPassword=password.getText().toString();

        if(!mUsername.equals(tUserName)){
            Log.d("LogIn",userName.getText().toString());
            Toast.makeText(this,"User Name does not Exist",Toast.LENGTH_SHORT).show();
        }else
            if(!mPassword.equals(tPassword)){
            Toast.makeText(this,"Wrong Password",Toast.LENGTH_SHORT).show();
        }else{
                Intent intent= new Intent(this,MainActivity.class);
                intent.putExtra("UserName",mUsername);
                this.startActivity(intent);

            }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        ButterKnife.bind(this);
    }
}
