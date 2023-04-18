package com.example.viikko12.fragments;

import com.example.viikko12.Storage;
import com.example.viikko12.Item;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ListAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import com.example.viikko12.R;

public class FragmentAdd extends Fragment {

    private EditText Item;
    private EditText Info;

    private CheckBox cbImportant;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add, container, false);
        Item = view.findViewById(R.id.idItem);
        Info = view.findViewById(R.id.idInfo);
        cbImportant = view.findViewById(R.id.cbTarkea);
        Button addButton = view.findViewById(R.id.idAddItem);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItem();
            }
        });
        return view;
    }

    public void addItem() {
        String itemName = Item.getText().toString();
        String itemInfo = Info.getText().toString();
        boolean isImportant = cbImportant.isChecked();
        Item item = new Item(itemName, itemInfo, isImportant);
        if (isImportant) {
            Storage.getInstance().addImportantItems(item);
        }
        Storage.getInstance().addItem(item);
        FragmentList.adapter.notifyDataSetChanged();
        FragmentImportant.importantAdapter.notifyDataSetChanged();
    }

}
