package com.techsis.islamicapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myViewHolder extends RecyclerView.ViewHolder
{
    TextView paras;
    public myViewHolder(@NonNull View itemView)
    {
        super(itemView);
        paras =(TextView)itemView.findViewById(R.id.firstPara);
    }
}
