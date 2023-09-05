package com.techsis.islamicapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class calender_activity extends AppCompatActivity {
    CalendarView calendar;
    TextView calenderHeader , calenderText ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);

        calenderHeader = findViewById(R.id.calenderHeader);
        calendar = findViewById(R.id.calender);
        calenderText = findViewById(R.id.calenderText);

        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String data = i2 + "/"+(i1+1)+"/"+ i;
                calenderText.setText(data);
            }
        });






    }
}