/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esport.simulator;

/**
 *
 * @author Sulwen
 */
class Match {
    private int matchId;
    private Team team1;
    private Team team2;
    private int winner;
    private int type; //bo1, bo2, bo3
    private int[] score = new int[2];
    private Game[] games = new Game[5];
    private int[] date = new int[5]; // Year/Month/Day/Hour/Minute

    public Match(Team team1, Team team2, int type) {
        this.team1 = team1;
        this.team2 = team2;
        this.type = type;
    }    
    
}
