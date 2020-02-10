/*
 * Sulwen de la Croix
 * 25/07/2017
 * Esport-Simulator.
 */
package esport.simulator;

/**
 *
 * @author Sulwen
 */
public class Competition {
    
    //Attributes
    
    private String name;
    private int prize;
    private int region; //EUW, EUE, NA, KR, BR, TR, JP, OC, TW, WW
    private int type; //LCS, Worlds, MSI
    private Match[][] matches = new Match[10][10]; // Game[Round][Game]
    private int[][][] schedule = new int[365][24][];
    private int numberParticipants;
    private Team[] participants = new Team[numberParticipants];
    
    //Constructor

    public Competition(String name, int prize, int region, int type) {
        this.name = name;
        this.prize = prize;
        this.region = region;
        this.type = type;
    }
    
    public void saveCompetition(){
        
    }
    
    public void loadCompetition(){
        
    }
    
    public void setSchedule(){
        
    }
    
    public void setNumberParticipants(int type){
        switch(type){
            case 0:
                this.numberParticipants = 10;
                break;
            case 1:
                this.numberParticipants = 24;
                break;
            case 2:
                this.numberParticipants = 12;
                break;
            default:
                this.numberParticipants = 0;
        }
    }
    
    public void setParticipants(Team[] participants){
        this.participants = participants;
    }
    
    public void generateMatches(){
        switch(this.type){
            case 0:
                
        }
    }
    
    
    
    
}
