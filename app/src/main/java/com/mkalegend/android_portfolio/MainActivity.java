package com.mkalegend.android_portfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerViewProjects = findViewById(R.id.recyclerViewProjects);
        ProjectsAdapter adapter = new ProjectsAdapter(Project.projects);
        recyclerViewProjects.setAdapter(adapter);

    }
}