package com.example.viikko12;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListViewHolder> {
    private Context context;
    private ArrayList<Item> items = new ArrayList<>();

    public ListAdapter(Context context, ArrayList<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ListViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_list_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        holder.Item.setText(items.get(position).getItem());
        holder.Info.setText(items.get(position).getInfo());
        if (items.get(position).isImportant()) {
            holder.Important.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int getItemCount() {return items.size();}

}
