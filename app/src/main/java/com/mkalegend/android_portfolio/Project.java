package com.mkalegend.android_portfolio;

public class Project {
    String pName;
    String pDescription;
    int pImages;
    String pLink;

    public Project(String pName, String pDescription, int pImages, String pLink) {
        this.pName = pName;
        this.pDescription = pDescription;
        this.pImages = pImages;
        this.pLink = pLink;
    }

    public static Project[] projects = {
            new Project("Fast Tasks",
                    "A task manager application, published on Playstore with extensive User Interface design. ",
                    R.drawable.fast,
                    "https://play.google.com/store/apps/details?id=com.todolist.fasttasks"),
            new Project("NPS American Parks",
                    "A National Park Service (NPS) app that uses the official developer API to visualize 420+ national parks of USA.",
                    R.drawable.npsparks,
                    "https://github.com/mufratkarim/NPS-American-Parks"),
            new Project("Memory Locker",
                    "A timeline locker that stores and shares photo memories.",
                    R.drawable.memorylocker,
                    "https://github.com/mufratkarim/Memory-Locker"),
            new Project("Workouts with Stopwatch",
                    "An android app that retrieves 200 workouts from an online json and shows them in an orderly manner in both phone and tablet sizes",
                    R.drawable.workouts,
                    "https://github.com/mufratkarim/Workouts-with-Stopwatch"),
            new Project("BMI Calculator",
                    "A real life working BMI Calculator, using Variables, Methods and Conditional Logics.",
                    R.drawable.bmi,
                    "https://github.com/mufratkarim/BMI-Calculator"),
            new Project("Dream Steak",
                    "A menu app for a fictional restaurant, using Activities, Classes & Objects, Arrays, Intents and ListViews.",
                    R.drawable.dream_steak,
                    "https://github.com/mufratkarim/Dream-Steak-Restaurant"),
            new Project("Self Marketing",
                    "A self promoting app that helps a job hunter by automatically messaging other contacts with a personalized text",
                    R.drawable.self,
                    "https://github.com/mufratkarim/Self-Marketing"),
            new Project("Trip to BD",
                    "A visually stunning app for all of my activities during my trip in Bangladesh.",
                    R.drawable.restaurant,
                    "https://github.com/mufratkarim/Trip-Planner-BD")
    };
}
