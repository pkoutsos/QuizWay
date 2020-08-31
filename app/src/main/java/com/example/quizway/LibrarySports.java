package com.example.quizway;

public class LibrarySports
{
    public String[] question ={
            "Who has scored the most Premier League hat-tricks?",
            "The LA Lakers and New York Knicks play which sport?",
            "Who is the Premier League's all-time top scorer?",
            "How many F1 championships has Lewis Hamilton won?",
            "How many clubs did David Beckham play for during his career?"
    };

    private String[][] choices =
            {
                    {"Sergio Aguero","Thiery Henry","Van Nistelrooy","Wayne Rooney"},
                    {"Baseball","Football","Basketball","Ice hockey"},
                    {"Thiery Henry","Alan Shearer","Eric Cantona","Cristiano Ronaldo"},
                    {"4","5","6","7"},
                    {"5","6","7","8"}
            };

    private String[] correct_Answers ={"Sergio Aguero","Basketball","Alan Shearer","6","6"};

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
