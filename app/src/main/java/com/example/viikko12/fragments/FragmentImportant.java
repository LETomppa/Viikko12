package com.example.viikko12.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.viikko12.ListAdapter;
import com.example.viikko12.R;
import com.example.viikko12.Storage;


public class FragmentImportant extends Fragment {

    private Storage storage;
    private RecyclerView recyclerView;
    public static ListAdapter importantAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        storage = Storage.getInstance();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_important, container, false);

        recyclerView = view.findViewById(R.id.rvTarkea);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        importantAdapter = new ListAdapter(getActivity(), storage.getImportantItems());
        recyclerView.setAdapter(importantAdapter);

        return view;
    }
}