package com.example.godara01.rakshak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProvideHelp extends AppCompatActivity implements View.OnClickListener {
    private Button iwillhelp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provide_help);

        iwillhelp = (Button) findViewById(R.id.I_help);

        iwillhelp.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(ProvideHelp.this, Chat_helpers.class);
        startActivity(intent);
        finish();
    }
}
