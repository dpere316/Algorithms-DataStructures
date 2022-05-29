package com.AlgoExpert.Arrays;

import java.util.*;

public class TournamentWinner {
    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        // Write your code here.
        Map<String,Integer> winners = new HashMap<>();
        String bestTeam ="";
        for(int i = 0; i< competitions.size();i++)
        {
            ArrayList<String> game = competitions.get(i);
            if (results.get(i) == 0)
            {
                updateScores(game.get(1),1,winners);
            }
            else{
                updateScores(game.get(0),1,winners);
            }

        }
        for(Map.Entry<String,Integer> entry : winners.entrySet())
        {
            if(entry.getValue().equals(Collections.max(winners.values())))
            {
                return entry.getKey();
            }
        }

        return "";
    }

    public static void updateScores(String winner, int score, Map<String,Integer> winners){
        if(winners.containsKey(winner))
        {
            winners.put(winner, winners.get(winner)+1);
        }
        else {
            winners.put(winner, 1);
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        ArrayList<String> competition1 = new ArrayList<>(Arrays.asList("HTML", "C#"));
        ArrayList<String> competition2 = new ArrayList<>(Arrays.asList("C#", "Python"));
        ArrayList<String> competition3 = new ArrayList<>(Arrays.asList("Python", "HTML"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);
        ArrayList<Integer> results = new ArrayList<>(Arrays.asList(0, 0, 1));
        tournamentWinner(competitions,results);
    }

}
