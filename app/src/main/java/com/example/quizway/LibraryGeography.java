package com.example.quizway;

public class LibraryGeography
{
    public String[] question ={
            "What river flows through Paris?",
            "What is the smallest country it the world?",
            "How many countries are there in Africa?",
            "Vilnius is the capital of which country?",
            "What is the only sea on Earth with no coastline?"
    };

    private String[][] choices =
            {
                    {"River Seine","River Mississippi","River Nile","River Amazon"},
                    {"Barbados","Monaco","Malta","Vatican City"},
                    {"42","69","54","81"},
                    {"Finland","Lithuania","Norway","Iceland"},
                    {"Sargasso Sea","Black Sea","Aegean Sea","Adriatic Sea"}
            };

    private String[] correct_Answers ={"River Seine","Vatican City","54","Lithuania","Sargasso Sea"};

    public String getQuestion(int counter)
    {
        return question[counter];
    }

    public String getSelect1(int counter)
    {
        return choices[counter][0];
    }

    public String getSelect2(int counter)
    {
        return choices[counter][1];
    }

    public String getSelect3(int counter)
    {
        return choices[counter][2];
    }

    public String getSelect4(int counter)
    {
        return choices[counter][3];
    }

    public String correct(int counter)
    {
        return correct_Answers[counter];
    }





}
