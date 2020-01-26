@file:Suppress("UnusedImport")

package com.example.fitapp101

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    var sampleImage: ImageView? = null
    var show: Button? = null, var hide:android.widget.Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    winImage = (ImageView)findViewById(R.id.imageView)
    show = (Button)findViewById(R.id.vuelta);
    hide = (Button)findViewById(R.id.reiniciar);

    show.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            sampleImage.setVisibility(View.VISIBLE);

        }
    });

    hide.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            sampleImage.setVisibility(View.INVISIBLE);

        }
    });

}


