package com.techsis.islamicapp;



import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class ShowTasbeehActivity extends AppCompatActivity {
    int count =0;
    EditText countTasbeeh;
    Button addBtn, resetBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        String[] items = {" سُبْحَانَ اللهِ، والحَمْدُ للهِ، وَ لاَ إِلَهَ إلاَّ اللهُ واللهُ أَكْبَرُ",
                "لَا حَوْلَ وَلَا قُوَّةَ إِلَّا بِاللهِ",
                " سُبْحَانَ اللهِ العَظِيمِ وبِحَمْدِهِ",
                "مَا شَاءَ اللَّهُ لَا قُوَّةَ إِلَّا بِاللَّهِ",
                "رَبَّنَا تَقَبَّلْ مِنَّا إِنَّكَ أَنْتَ السَّمِيعُ العَلِيمُ",
                "رَبَّنَآ اِنَّنَآ اٰمَنَّا فَاغْفِرْ لَنَا ذُنُوْبَنَا وَقِنَا عَذَابَ النَّارِ",
                "سُبْحَانَ اللهِ"
                ,"سُبْـحَانَ اللهِ وَبِحَمْدِهِ سُبْـحَانَ اللهِ العَظِيمِ"};

        ArrayAdapter<String> adapterItems;


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_tasbeeh);

        AutoCompleteTextView autoCompleteTxt  = findViewById(R.id.auto_complete_txt);
        adapterItems = new ArrayAdapter<String>(this,R.layout.tasbeeh_list,items);

        autoCompleteTxt.setAdapter(adapterItems);

        autoCompleteTxt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),"Tasbeeh:"+item, Toast.LENGTH_SHORT).show();
            }
        });



        //THIS CODE BELONGS TO CALCULATE TASBEEH TIMES

        countTasbeeh =findViewById(R.id.countTasbeeh);
        addBtn = findViewById(R.id.addBtn);
        resetBtn = findViewById(R.id.resetBtn);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count ++;
                countTasbeeh.setText(""+count);
            }
        });

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count =0;
                countTasbeeh.setText(""+count);
            }
        });
    }
}