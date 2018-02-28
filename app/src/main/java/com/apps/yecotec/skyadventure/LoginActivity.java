package com.apps.yecotec.skyadventure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.login_button)
    public void navigateToContainer() {
        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.sign_up_button)
    public void navigateToLogin() {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }
}
