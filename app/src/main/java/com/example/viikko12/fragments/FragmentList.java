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

public class FragmentList extends Fragment {

    private Storage storage;
    private RecyclerView recyclerView;
    public static ListAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        storage = Storage.getInstance();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        recyclerView = view.findViewById(R.id.rvListItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        adapter = new ListAdapter(getActivity(), storage.getItems());
        recyclerView.setAdapter(adapter);

        return view;
    }
}
