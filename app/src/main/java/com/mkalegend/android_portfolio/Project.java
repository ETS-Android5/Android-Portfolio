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

    public static Project[] beginner_projects = {
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
                    "https://github.com/mufratkarim/Trip-Planner-BD"),
            new Project("Workouts with Stopwatch",
                    "An android app that uses REST API with Volley and JSON to display 200 remote workout information in phone and tablet sizes.",
                    R.drawable.workouts,
                    "https://github.com/mufratkarim/Workouts-with-Stopwatch"),
    };

    public static Project[] intermediate_projects = {
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

            new Project("All Countries",
                    "A Country Directory Application that retrieves a list of all the countries in the world by applying MVVM architecture, Retrofit2, RxJava, Dependency Injection, Unit Testing with Mockito.",
                    R.drawable.countries_all,
                    "https://github.com/mufratkarim/All-Countries"),
            new Project("Meta API Weather Forecast",
                    "A Weather Forecast Application that uses Meta Weather's RESTful API with JSON to display weather of any cities in the world.",
                    R.drawable.weather_forecast,
                    "https://github.com/mufratkarim/Meta-API-Weather-Forecast")
    };
}
