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
            new Project("Addresss Finder (College)",
                    "A beginner app that uses firebase to recover user address once they input their name.",
                    R.drawable.addressfind,
                    "https://github.com/mufratkarim/Programming/tree/master/Android/Address%20Finder"),
            new Project("BMI Calculator",
                    "A real life working BMI Calculator, using Variables, Methods and Conditional Logics.",
                    R.drawable.bmi,
                    "https://github.com/mufratkarim/BMI-Calculator"),
            new Project("Dream Steak",
                    "A menu app for a fictional restaurant, using Activities, Classes & Objects, Arrays, Intents and ListViews.",
                    R.drawable.dream_steak,
                    "https://github.com/mufratkarim/Dream-Steak-Restaurant"),
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
            new Project("Restuarant Ratings (College)",
                    "A review app of all the Firebase restaurants in realtime.",
                    R.drawable.rest_ratings,
                    "https://github.com/mufratkarim/Programming/tree/master/Android/Restaurant%20Ratings"),
            new Project("Ultimate Map Markers (College)",
                    "A Marker Storage that helps users to create their favorite locations on Google Maps and stores them using Firebase.",
                    R.drawable.ult_marker,
                    "https://github.com/mufratkarim/Programming/tree/master/Android/Ultimate%20Map%20Markers"),
            new Project("Self Marketing",
                    "A self promoting app developed in Kotlin that helps a job hunter by automatically messaging other contacts with a personalized text",
                    R.drawable.self,
                    "https://github.com/mufratkarim/Self-Marketing"),
            new Project("Meta API Weather Forecast",
                    "A Weather Forecast Application that uses Meta Weather's RESTful API with JSON to display weather of any cities in the world.",
                    R.drawable.weather_forecast,
                    "https://github.com/mufratkarim/Meta-API-Weather-Forecast"),
            new Project("Trivia",
                    "An app that retrieves 913 true/false questions (trivia) from a remote JSON file and showcases them in an attractive quiz UI.",
                    R.drawable.address_finder,
                    "https://github.com/mufratkarim/Trivia")
    };
}
