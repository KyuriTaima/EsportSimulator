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
class Game {
    private Team team1;
    private Team team2;
    private int winner;
    private int[] kills = new int[2];
    private int timeSeconds; //in seconds then formated into minutes:seconds
    private int[] timeMinSec = new int[2];

    public Game(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }
    
    
       
}
