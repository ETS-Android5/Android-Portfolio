package com.mkalegend.android_portfolio;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BeginnerFragment extends Fragment {

    public BeginnerFragment() {
        // Required empty public constructor
    }

    public static BeginnerFragment newInstance() {
        return new BeginnerFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_beginner, container, false);
        RecyclerView recyclerViewProjects = view.findViewById(R.id.recyclerBegineerProjects);
        ProjectsAdapter adapter = new ProjectsAdapter(Project.beginner_projects);
        recyclerViewProjects.setAdapter(adapter);
        return view;
    }
}