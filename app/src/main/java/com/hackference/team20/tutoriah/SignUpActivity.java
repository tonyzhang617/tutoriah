package com.hackference.team20.tutoriah;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener, Runnable {

    private Button btnSendCode, btnVerify;
    private TextView textConfirmationCode;
    private EditText editConfirmationCode;

    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btnSendCode = (Button) findViewById(R.id.btn_send_code);
        btnVerify = (Button) findViewById(R.id.btn_verify);

        textConfirmationCode = (TextView) findViewById(R.id.text_confirmation_code);

        editConfirmationCode = (EditText) findViewById(R.id.edit_confirmation_code);

        btnSendCode.setOnClickListener(this);
        btnVerify.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_send_code:
                textConfirmationCode.setEnabled(true);
                editConfirmationCode.setEnabled(true);
                btnVerify.setEnabled(true);
                btnVerify.setClickable(true);
                break;
            case R.id.btn_verify:
                progressDialog = ProgressDialog.show(this, "Verifying", "Just a second", true);
                Handler handler = new Handler();
                handler.postDelayed(this, 2000);
                break;
        }
    }

    @Override
    public void run() {
        progressDialog.dismiss();
        Intent newIntent = new Intent(this, MainActivity.class);
        newIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        this.startActivity(newIntent);
    }
}
