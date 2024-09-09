package com.example.id_card;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView image_fb = findViewById(R.id.img_fb);
        ImageView image_gmail = findViewById(R.id.gmail_id);
        ImageView image_phone = findViewById(R.id.phone_id);
        ImageView image_whatsapp = findViewById(R.id.whatsapp_id);
        ImageView image_github = findViewById(R.id.github_id);
        ImageView image_telegram = findViewById(R.id.telegram_id);

        image_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01812651029"));
                startActivity(intent2);
            }
        });
        image_fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/<Musfikus Salihin Sifat>"));
                startActivity(intent2);
            }
        });
        image_gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:musfikus.stu2019@juniv.edu?"));
                startActivity(intent2);
            }
        });
        image_whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNumber = "+8801812651029";
                Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/" + phoneNumber));
                startActivity(intent2);
            }
        });
        image_telegram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = "M_S_Sifat";  // Replace with the desired Telegram username
                Intent intent2 = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://t.me/" + username));
                startActivity(intent2);
            }
        });
        image_github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = "musfikussalihinsifat";  // Replace with the desired GitHub username
                Intent intent2 = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://github.com/" + username));
                startActivity(intent2);
            }
        });

    }
}