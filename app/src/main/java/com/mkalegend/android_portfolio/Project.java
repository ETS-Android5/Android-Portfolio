package com.mkalegend.android_portfolio;

public class Project {
    String pName;
    String pDescription;
    int pImages;

    public Project(String pName, String pDescription, int pImages) {
        this.pName = pName;
        this.pDescription = pDescription;
        this.pImages = pImages;
    }

    public static Project[] projects = {
            new Project("BMI Calculator",
                    "A real life working BMI Calculator, using Variables, Methods and Conditional Logics.",
                    R.drawable.bmi),
            new Project("Dream Steak",
                    "A menu app for a fictional restaurant, using Activities, Classes & Objects, Arrays, Intents and ListViews.",
                    R.drawable.dream_steak),
            new Project("Self Marketing",
                    "A self promoting app that helps a job hunter by messaging other contacts with a personalized text",
                    R.drawable.addressfind),
            new Project("Trip to BD",
                    "A visually stunning app for all of my activities during my trip in Bangladesh.",
                    R.drawable.restaurant)
    };
}
