package com.example.viikko12;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListViewHolder extends RecyclerView.ViewHolder {
    TextView Item, Info, Important;
    public ListViewHolder(@NonNull View itemView) {
        super(itemView);
        Item = itemView.findViewById(R.id.txtItem);
        Info = itemView.findViewById(R.id.txtInfo);
        Important = itemView.findViewById(R.id.txtTarkea);
    }
}