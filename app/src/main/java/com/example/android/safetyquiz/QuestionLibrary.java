package com.example.android.safetyquiz;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Question Choices and Answers library
 */

public class QuestionLibrary {

    private String mQuestions[] = {
            "1) How many seconds of space cushion should you have in front of your car?",
            "2) Why should you plan you route?",
            "3) What is G.O.A.L.?",
            "4) What is S.M.O.G.?",
            "5) What is the proper hand position on the wheel?",
            "6) The four-search techniques include?",
            "7) What should you always try and avoid?",
            "8) What is the last thing you should do before you put your vehicle in drive?",
            "9) Safety starts with?",
            "10) What is always #1?"
    };

    private String mChoices[][] = {
            {"2", "4", "5", "6"},
            {"Avoid an Accident", "Avoid Left Turns", "Avoid Dangerous Intersections", "All of the Above"},
            {"Go On And Leave", "Go Over Accident Letter", "Get Out And Look", "Get Over And Look"},
            {"Signal Mirror Only Go", "See Me Over Gain", "Supervisor Mentor Organizer Govenor", "Signal Mirror Over shoulder Go"},
            {"9 o'clock and 3 o'clock", "10 o'clock and 2 o'clock", "12 o'clock and 6 o'clock", "1 o'clock and 11 o'clock"},
            {"Mirror Check, Signal Check, Horn Check, Window Check", "Eye Lead Time, Constant Eye Movement, Mirror Check, Head Check", "Complete Stop, No Backing, Proper Parking, Be Aware of Surroundings", "Space Cushion, Eye Contact, Tailgating, Proper Eye Lead Time"},
            {"Work", "Driving", "Parking", "Backing"},
            {"Call Customer", "Circle of Safety", "Close Out Job", "Check Text Messages"},
            {"Your Supervisor", "Me", "Your Family", "Your Safety Coordinator"},
            {"Safety", "Quality", "Customer Service", "Metrics"}
    };

    private String mCorrectAnswer[] = {"4", "All of the Above", "Get Out And Look", "Signal Mirror Over shoulder Go", "9 o'clock and 3 o'clock", "Eye Lead Time, Constant Eye Movement, Mirror Check, Head Check", "Backing", "Circle of Safety", "Me", "Safety"
    };


    public String getQuestions(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswer[a];
        return answer;
    }

}
