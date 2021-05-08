package com.example.healingfeeling;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.healingfeeling.databinding.ActivityIslandBinding;

public class IslandActivity extends AppCompatActivity {

    ActivityIslandBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding= DataBindingUtil.setContentView(this,R.layout.activity_island);

        binding.happyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IslandActivity.this, MainActivity.class);
                intent.putExtra("emotion", "happy");
                startActivity(intent);
            }
        });
        binding.sadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(IslandActivity.this, MainActivity.class);
                intent.putExtra("emotion", "sad");
                startActivity(intent);
            }
        });
        binding.angryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IslandActivity.this, MainActivity.class);
                intent.putExtra("emotion", "angry");
                startActivity(intent);
            }
        });

        binding.myPage.setOnClickListener(v -> startActivity(new Intent(this,MypageActivity.class)));


    }
}
