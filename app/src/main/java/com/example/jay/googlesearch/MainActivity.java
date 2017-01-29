package com.example.jay.googlesearch;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mSearchButton;
    private EditText mEnterText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSearchButton = (Button) findViewById(R.id.searchbutton);
        mEnterText = (EditText) findViewById(R.id.enteredtext);

        mSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String etxt = mEnterText.getText().toString();
                if(etxt != null)
                {
                    Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                    intent.putExtra(SearchManager.QUERY, etxt);
                    startActivity(intent);
                }

                else
                {
                    Toast.makeText(MainActivity.this,"Not entered anything",Toast.LENGTH_LONG).show();
                }


            }
        });
    }
}
