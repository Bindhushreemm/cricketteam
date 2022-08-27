package org.cricketteam;

public class TeamDetails {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    int id;
    String name;
    int matchplayed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int runs;

    public int getMatchplayed() {
        return matchplayed;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public void setMatchplayed(int matchplayed) {
        this.matchplayed = matchplayed;
    }

    public String getPlayertype() {
        return playertype;
    }

    public void setPlayertype(String playertype) {
        this.playertype = playertype;
    }

    public int getWicket() {
        return wicket;
    }

    public int getZeroscore() {
        return zeroscore;
    }

    public void setZeroscore(int zeroscore) {
        this.zeroscore = zeroscore;
    }

    public void setWicket(int wicket) {
        this.wicket = wicket;
    }

    int wicket;
    String playertype;
    int zeroscore;
    public TeamDetails(int id, String name, int matchplayed, int runs, int wicket, String playertype, int zeroscore){
        this.id=id;
        this.name=name;
        this.matchplayed=matchplayed;
        this.runs=runs;
        this.wicket=wicket;
        this.playertype=playertype;
        this.zeroscore=zeroscore;

    }
}

}
