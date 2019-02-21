package com.example.mverw.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://www.youtube.com/watch?v=Cv1RJTHf5fk&t=66s");


    //Click on shit to close it...
    final ImageView imageReebok =(ImageView) findViewById(R.id.imageReebok);
    final ImageView imageWarning =(ImageView) findViewById(R.id.imageWarning);
    final ImageView imageZeus =(ImageView) findViewById(R.id.imageZeus);
    final ImageView imageHome =(ImageView) findViewById(R.id.imageHome);
    final ImageView imageWinner =(ImageView) findViewById(R.id.imageWinner);


    imageReebok.setOnClickListener( new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            imageReebok.setVisibility(View.GONE);
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://trumpbutton.netlify.com"));
            startActivity(intent);
            counter++;

        }
    });

    imageWarning.setOnClickListener( new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            imageWarning.setVisibility(View.GONE);
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://trumpbutton.netlify.com"));
            startActivity(intent);
            counter++;
        }
    });

    imageZeus.setOnClickListener( new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            imageZeus.setVisibility(View.GONE);
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://trumpbutton.netlify.com"));
            startActivity(intent);
            counter++;
        }
    });

    imageHome.setOnClickListener( new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            imageHome.setVisibility(View.GONE);
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://trumpbutton.netlify.com"));
            startActivity(intent);
            counter++;
        }
    });

    imageWinner.setOnClickListener( new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            imageWinner.setVisibility(View.GONE);
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://trumpbutton.netlify.com"));
            startActivity(intent);
            counter++;
        }
    });

    myWebView.setOnClickListener( new View.OnClickListener ()
    {
        @Override
        public void onClick(View v) {

        }
    });

    if(counter >= 4 )
    {
        //Boss fight
        startActivity(new Intent(MainActivity.this , SecondWindow.class));

    }
}

}