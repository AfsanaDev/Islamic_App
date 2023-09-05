package com.techsis.islamicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class viewQuaran extends AppCompatActivity {
    RecyclerView reView;
    myAdapter adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_quaran);

        reView =(RecyclerView) findViewById(R.id.reView);
        reView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new myAdapter(dataLists(),getApplicationContext());
        reView.setAdapter(adapter);
    }
    public ArrayList<model> dataLists()
    {
        ArrayList<model> holder = new ArrayList<>();
        model para1 = new model();
        para1.setParaName("Para 1 - Alif laam meem");
        holder.add(para1);

        model para2 = new model();
        para2.setParaName("Para 2 - Sayaqulu");
        holder.add(para2);

        model para3 = new model();
        para3.setParaName("Para 3 - Tilka r Rusulu");
        holder.add(para3);

        model para4 = new model();
        para4.setParaName("Para 4 - Lan Tana Loo");
        holder.add(para4);

        model para5 = new model();
        para5.setParaName("Para 5- Wal Mohsanat");
        holder.add(para5);

        model para6 = new model();
        para6.setParaName("Para 6 - La Yahubbullah");
        holder.add(para6);

        model para7 = new model();
        para7.setParaName("Para 7 - Wa Iza Samiu");
        holder.add(para7);

        model para8 = new model();
        para8.setParaName("Para 8 - Wa Lau Annana");
        holder.add(para8);

        model para9 = new model();
        para9.setParaName("Para 9 - Qalal Malao");
        holder.add(para9);

        model para10 = new model();
        para10.setParaName("Para 10 - Wa A’lamu");
        holder.add(para10);

        model para11 = new model();
        para11.setParaName("Para 11 - Yatazeroon");
        holder.add(para11);

        model para12 = new model();
        para12.setParaName("Para 12 - Wa Mamin Da’abat");
        holder.add(para12);

        model para13 = new model();
        para13.setParaName("Para 13 - Wa Ma Ubiroo");
        holder.add(para13);

        model para14 = new model();
        para14.setParaName("Para 14 - Rubama");
        holder.add(para14);

        model para15 = new model();
        para15.setParaName("Para 15 - Subhanallahzi");
        holder.add(para15);

        model para16 = new model();
        para16.setParaName("Para 16 - Qal Alam");
        holder.add(para16);

        model para17 = new model();
        para17.setParaName("Para 17 - Aqtarabo");
        holder.add(para17);

        model para18 = new model();
        para18.setParaName("Para 18 - Qadd Aflaha");
        holder.add(para18);

        model para19= new model();
        para19.setParaName("Para 19 - Wa Qalallazina");
        holder.add(para19);

        model para20 = new model();
        para20.setParaName("Para 20 - A’man Khalaq");
        holder.add(para20);

        model para21 = new model();
        para21.setParaName("Para 21 - Utlu Ma Oohi");
        holder.add(para21);

        model para22 = new model();
        para22.setParaName("Para 22 - Wa Manyaqnut");
        holder.add(para22);

        model para23 = new model();
        para23.setParaName("Para 23 - Wa Mali");
        holder.add(para23);

        model para24 = new model();
        para24.setParaName("Para 24 - Faman Azlam");
        holder.add(para24);

        model para25 = new model();
        para25.setParaName("Para 25 - Elahe Yuruddo");
        holder.add(para25);

        model para26 = new model();
        para26.setParaName("Para 26 - Ha’a Meem");
        holder.add(para26);

        model para27 = new model();
        para27.setParaName("Para 27 - Qala Fama Khatbukum");
        holder.add(para27);

        model para28 = new model();
        para28.setParaName("Para 28 - Qadd Sami Allah");
        holder.add(para28);

        model para29 = new model();
        para29.setParaName("Para 29 - Tabarakallazi");
        holder.add(para29);

        model para30 = new model();
        para30.setParaName("Para 30 - Amma Yatasa’aloon");
        holder.add(para30);

        return holder;
    }
}