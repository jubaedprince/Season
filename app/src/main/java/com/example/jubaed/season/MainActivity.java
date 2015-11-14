package com.example.jubaed.season;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = (ImageView) findViewById(R.id.image);
    }

    public void changeSeason(View view){
        String [] seasons = {"Summer", "Rainy Season", "Autumn", "Spring" , "Winter"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Choose season:");
        builder.setItems(seasons, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which){
                    case 0:
                        image.setImageResource(R.drawable.summer);
                        break;

                    case 1:
                        image.setImageResource(R.drawable.rainyseason);
                        break;

                    case 2:
                        image.setImageResource(R.drawable.autumn);
                        break;

                    case 3:
                        image.setImageResource(R.drawable.spring);
                        break;

                    case 4:
                        image.setImageResource(R.drawable.winter);
                        Toast.makeText(MainActivity.this, "Winter is coming", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
        builder.create().show();
    }
}
