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
public class Player extends TeamMember{
    
    //Attributes
    private Object[] schedule = new Object[365][24]; //String: sleep, travel, stream || Game: scrim, competition
    private int fanbase;
    private int position; //top,jg,mid,supp,adc
    private int teamSpirit;
    private int farming;
    private int oneVone;
    private int shotcalling;
    private int mapawareness;
    private int outplays;
    private int fun;
    private int gameknowledge;
    private int towerdiving;
    private int endurance;
    private int reactivity;
    private int kiting;
    private int focusing;
    private int itemisation;
    private int positioning;
    private int tiltproof;
    private int champVariety;
    private int tiredness = 0;
    private int moral = 50;
    
    //Constructor

    public Player(int fanbase, int position, int teamSpirit, int farming, int oneVone, int shotcalling, int mapawareness, int outplays, int fun, int gameknowledge, int towerdiving, int endurance, int reactivity, int kiting, int focusing, int itemisation, int positioning, int tiltproof, int champVariety, String firstName, String surrname,String nickname, int age, int[] languageSpoken, String nationality, int attachement,boolean gender, String hairColor, String eyeColor) {
        super(firstName, surrname, nickname, age, languageSpoken, nationality, attachement, gender, hairColor, eyeColor);
        this.fanbase = fanbase;
        this.position = position;
        this.teamSpirit = teamSpirit;
        this.farming = farming;
        this.oneVone = oneVone;
        this.shotcalling = shotcalling;
        this.mapawareness = mapawareness;
        this.outplays = outplays;
        this.fun = fun;
        this.gameknowledge = gameknowledge;
        this.towerdiving = towerdiving;
        this.endurance = endurance;
        this.reactivity = reactivity;
        this.kiting = kiting;
        this.focusing = focusing;
        this.itemisation = itemisation;
        this.positioning = positioning;
        this.tiltproof = tiltproof;
        this.champVariety = champVariety;
    }

    @Override
    public String toString() {
        return "Player{" + "schedule=" + schedule + ", fanbase=" + fanbase + ", position=" + position + ", teamSpirit=" + teamSpirit + ", farming=" + farming + ", oneVone=" + oneVone + ", shotcalling=" + shotcalling + ", mapawareness=" + mapawareness + ", outplays=" + outplays + ", fun=" + fun + ", gameknowledge=" + gameknowledge + ", towerdiving=" + towerdiving + ", endurance=" + endurance + ", reactivity=" + reactivity + ", kiting=" + kiting + ", focusing=" + focusing + ", itemisation=" + itemisation + ", positioning=" + positioning + ", tiltproof=" + tiltproof + ", champVariety=" + champVariety + '}';
    }
    
    public void savePlayer(){
        
    }
    
    public void loadPlayer(){
            }
    
    public void changeTeam(){
        
    }
    
    public void stream(){
        
    }
    
    public void train(){
        
    }
    

    public void setSchedule(Object[] schedule) {
        this.schedule = schedule;
    }

    public void setFanbase(int fanbase) {
        this.fanbase = fanbase;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setTeamSpirit(int teamSpirit) {
        this.teamSpirit = teamSpirit;
    }

    public void setFarming(int farming) {
        this.farming = farming;
    }

    public void setOneVone(int oneVone) {
        this.oneVone = oneVone;
    }

    public void setShotcalling(int shotcalling) {
        this.shotcalling = shotcalling;
    }

    public void setMapawareness(int mapawareness) {
        this.mapawareness = mapawareness;
    }

    public void setOutplays(int outplays) {
        this.outplays = outplays;
    }

    public void setFun(int fun) {
        this.fun = fun;
    }

    public void setGameknowledge(int gameknowledge) {
        this.gameknowledge = gameknowledge;
    }

    public void setTowerdiving(int towerdiving) {
        this.towerdiving = towerdiving;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public void setReactivity(int reactivity) {
        this.reactivity = reactivity;
    }

    public void setKiting(int kiting) {
        this.kiting = kiting;
    }

    public void setFocusing(int focusing) {
        this.focusing = focusing;
    }

    public void setItemisation(int itemisation) {
        this.itemisation = itemisation;
    }

    public void setPositioning(int positioning) {
        this.positioning = positioning;
    }

    public void setTiltproof(int tiltproof) {
        this.tiltproof = tiltproof;
    }

    public void setChampVariety(int champVariety) {
        this.champVariety = champVariety;
    }

    public void setTiredness(int tiredness) {
        this.tiredness = tiredness;
    }

    public void setMoral(int moral) {
        this.moral = moral;
    }

}
