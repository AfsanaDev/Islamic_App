package com.techsis.islamicapp;

import static com.techsis.islamicapp.R.id.pdfView;
import static com.techsis.islamicapp.R.id.viewPara;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class viewQuran extends AppCompatActivity {
        String para_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_quran);
        PDFView pdfView = findViewById(R.id.pdfView);

        Intent intent = getIntent();
        para_name = intent.getStringExtra("paras");
        System.out.println("Data: " + para_name);
        pdfView.fromAsset("para 1.pdf").load();
//        if (para_name != null) {
//            pdfView.fromAsset("para 1.pdf").load();
//        }
//        pdfView.setText(getIntent().getStringExtra("paras"));


    }
}