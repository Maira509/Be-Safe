package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button inform = (Button) findViewById(R.id.inform);
        inform.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.setPackage("com.whatsapp");
                intent.putExtra(Intent.EXTRA_TEXT, "Emergency! It's me Maira Malik. "+"\n I am in trouble. "+"My location  is : ");
                intent.putExtra("Kainy 2", "3367383656" + "@s.whatsapp.net");
                startActivity(intent);

            }
        }
        );
    }
}