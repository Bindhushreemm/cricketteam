package org.cricketteam;

import collection.Employee;

import java.util.*;

public class CricketTeam {
    /*public int id;
    public String name;
    public int matchplayed;
    public int runs;
    public int wicket;
    public static String playertype;
    public int zeroscore;
   /* public CricketTeam(int id,String name,int matchplayed,int runs,int wicket,String playertype,int zeroscore){
        this.id=id;
        this.name=name;
        this.matchplayed=matchplayed;
        this.runs=runs;
        this.wicket=wicket;
        this.playertype=playertype;
        this.zeroscore=zeroscore;
        System.out.println(id+name+matchplayed+runs+wicket+playertype+zeroscore);
    }*/

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Display all players"+"2.Update player information by name"+"3.Display final team"+"4.Addd player information"+"5.exit");

        TeamDetails p1=new TeamDetails(1,"Rahul",20,320,0,"Batsman",2);
        TeamDetails p2=new TeamDetails(2,"Rajesh",15,200,3,"batsman",4);
        TeamDetails p3=new TeamDetails(3,"Surya",20,350,0,"batsman",0);
        TeamDetails p4=new TeamDetails(4,"Manson",20,220,2,"batsman",0);
        TeamDetails p5=new TeamDetails(5,"Adithya",20,320,0,"batsman",0);
        TeamDetails p6=new TeamDetails(6,"Shashank",20,520,0,"batsman",0);
        TeamDetails p7=new TeamDetails(7,"Harish",20,120,4,"batsman",0);
        TeamDetails p8=new TeamDetails(8,"Ajay",20,220,0,"batsman",0);
        TeamDetails p9=new TeamDetails(9,"Vijay",20,120,6,"batsman",0);
        TeamDetails p10=new TeamDetails(10,"Keerthan",20,320,1,"batsman",0);
        TeamDetails p11=new TeamDetails(11,"David",20,280,0,"batsman",0);
        TeamDetails p12=new TeamDetails(12,"Ranjith",20,200,0,"batsman",0);
        TeamDetails p13=new TeamDetails(13,"Deepak",20,200,1,"batsman",0);
        TeamDetails p14=new TeamDetails(14,"Abishek",20,210,1,"batsman",0);
        TeamDetails p15=new TeamDetails(15,"Anjay",20,220,0,"batsman",0);
        TeamDetails p16=new TeamDetails(16,"Bharath",20,200,25,"wicketkeeper",2);
        TeamDetails p17=new TeamDetails(17,"Vijeth",20,20,12,"bowler",7);
        TeamDetails p18=new TeamDetails(18,"Shashi",20,30,20,"bowler",5);
        TeamDetails p19=new TeamDetails(19,"Sam",20,90,22,"bowler",8);
        TeamDetails p20=new TeamDetails(20,"Rakesh",20,30,8,"bowler",2);


        Map<String,TeamDetails> data=new HashMap<>();
        data.put("k1",p1);
        data.put("k2",p2);
        data.put("k3",p3);
        data.put("k4",p4);
        data.put("k5",p5);
        data.put("k6",p6);
        data.put("k7",p7);
        data.put("k8",p8);
        data.put("k9",p9);
        data.put("k10",p10);
        data.put("k11",p11);
        data.put("k12",p12);
        data.put("k13",p13);
        data.put("k14",p14);
        data.put("k15",p15);
        data.put("k16",p16);
        data.put("k17",p17);
        data.put("k18",p18);
        data.put("k19",p19);
        data.put("k20",p20);
        Iterator<Map.Entry<String,TeamDetails>> itr=data.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry<String, TeamDetails> et = itr.next();
            //Collections.sort();
            System.out.println("id:" + et.getValue().getId() + "name:" + et.getValue().getName() + "matchplayed:" + et.getValue().getMatchplayed() + "runs:" + et.getValue().getRuns() + "wickets:" + et.getValue().getWicket() + "playertype:" + et.getValue().getPlayertype() + "zeroscore:" + et.getValue().getZeroscore());
        }










    }


}
