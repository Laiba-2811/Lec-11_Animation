package com.example.mc_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Animation(View view)
    {
        ImageView imageView=findViewById(R.id.imageView);
       // imageView.animate().alpha(0).setDuration(500);
       // imageView.animate().translationYBy(300).setDuration(2000);
       // imageView.animate().translationXBy(-300).setDuration(2000);
        //imageView.animate().rotation(720).setDuration(1000);
        //imageView.animate().rotation(720).alpha(0).setDuration(1000);
        imageView.animate().rotation(750).scaleX(0.5f).scaleY(0.5f).setDuration(2000);

    }
    public void GoToVideo(View view)
    {
        Intent intent=new Intent(this,VideoActivity.class);
        //intent=findViewById();
        startActivity(intent);


    }
    public void GoToAudio(View view)
    {
        Intent intent=new Intent(this,AudioActivity.class);
        //intent=findViewById();
        startActivity(intent);


    }
}
