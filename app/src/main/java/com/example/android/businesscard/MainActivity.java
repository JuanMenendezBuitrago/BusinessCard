package com.example.android.businesscard;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView linkedin = (ImageView) findViewById(R.id.linkedin_icon);
        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View linkedin) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.linkedin.com/company/uab-enginyeria"));
                if (intent.resolveActivity(getPackageManager()) !=null) {
                    startActivity(intent);
                } else {
                    Context context = getApplicationContext();
                    Toast.makeText(context, "Unable to open.", Toast.LENGTH_SHORT).show();
                }
            }
        });


        ImageView twitter = (ImageView) findViewById(R.id.twitter_icon);
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View twitter) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://twitter.com/enginyeria_uab"));
                if (intent.resolveActivity(getPackageManager()) !=null) {
                    startActivity(intent);
                } else {
                    Context context = getApplicationContext();
                    Toast.makeText(context, "Unable to open.", Toast.LENGTH_SHORT).show();
                }
            }
        });


        ImageView youtube = (ImageView) findViewById(R.id.youtube_icon);
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View youtube) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/channel/UC-wXQ4g2dcwarxRQwMOt5gw"));
                if (intent.resolveActivity(getPackageManager()) !=null) {
                    startActivity(intent);
                } else {
                    Context context = getApplicationContext();
                    Toast.makeText(context, "Unable to open.", Toast.LENGTH_SHORT).show();
                }
            }
        });


        ImageView facebook = (ImageView) findViewById(R.id.facebook_icon);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View facebook) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/EscolaEnginyeriaUab"));
                if (intent.resolveActivity(getPackageManager()) !=null) {
                    startActivity(intent);
                } else {
                    Context context = getApplicationContext();
                    Toast.makeText(context, "Unable to open.", Toast.LENGTH_SHORT).show();
                }
            }
        });


        RelativeLayout etse = (RelativeLayout) findViewById(R.id.etse_link);
        etse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View etse) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.uab.cat/escola-enginyeria"));
                if (intent.resolveActivity(getPackageManager()) !=null) {
                    startActivity(intent);
                } else {
                    Context context = getApplicationContext();
                    Toast.makeText(context, "Unable to open.", Toast.LENGTH_SHORT).show();
                }
            }
        });


        RelativeLayout email = (RelativeLayout) findViewById(R.id.email_link);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View email) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("mailto:ga.enginyeria@uab.cat"));
                if (intent.resolveActivity(getPackageManager()) !=null) {
                    startActivity(intent);
                } else {
                    Context context = getApplicationContext();
                    Toast.makeText(context, "Unable to open.", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}
