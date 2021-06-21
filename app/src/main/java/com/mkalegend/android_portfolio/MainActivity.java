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
        Project[] projects = {
                new Project("BMI Calculator",
                        "A real life working BMI Calculator, using Variables, Methods and Conditional Logics.",
                        R.drawable.bmi),
                new Project("Dream Steak",
                        "A menu app for a fictional restaurant, using Activities, Classes & Objects, Arrays, Intents and ListViews.",
                        R.drawable.dream_steak),
                new Project("Address Finder",
                        "A multilingual app for retrieving the user address, using FireStore Database, Firebase Query Intents and Internationalization.",
                        R.drawable.addressfind),
                new Project("All Star Restaurants",
                        "A review app of all the Firebase restaurants in realtime, using Application Lifecycle, Receivers, Intents and FireStore.",
                        R.drawable.restaurant),
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);
        recyclerViewProjects.setAdapter(adapter);

    }
}