/*
 * Sulwen de la Croix
 * 25/07/2017
 * Esport-Simulator.
 */
package esport.simulator;

import java.util.ArrayList;

/**
 *
 * @author Sulwen
 */
public class Team {
    
    //atributes
    
    private String name;
    private float budget;
    private ArrayList<TeamMember> memberList = new ArrayList();
    private Game[] schedule = new Game[365];
    private int fanbase;
    private ArrayList<Competition> wonComps = new ArrayList();
    private ArrayList<Company> sponsorList = new ArrayList();
    private int region;
    private int worldsElligibility;
    private int MsiElligibility;
    
    //Constructor

    public Team(String name, float budget, int fanbase, int region) {
        this.name = name;
        this.budget = budget;;
        this.fanbase = fanbase;
        this.region = region;
    }
    
    public void saveTeam(){
        
    }
    
    public void loadTeam(){
        
    }
    
    public void setWorldsElligibility(int elligibility){
        this.worldsElligibility = elligibility;
    }
    
    public void setMsiElligibility(int elligibility){
        this.MsiElligibility = elligibility;
    }
    
}
