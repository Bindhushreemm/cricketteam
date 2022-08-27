package org.cricketteam;

import collection.map;

import java.util.*;

import static java.lang.System.exit;

class SortByName implements Comparator<TeamDetails>{
    public int compare(TeamDetails name1, TeamDetails name2){
        return name1.getName().compareTo(name2.getName());
    }
}
public class Cricket {
   

    public static void main(String[] args) {
        Cricket ob=new Cricket();
        int id;
        String name = null;
        int matchplayed;
        int runs;
        int wicket;
        String playertype;
        int zeroscore ;
        Scanner sc=new Scanner(System.in);
        int x;

        List data=new ArrayList<>();
        for(int i=0;i<=1;i++){
            System.out.println("enter the id");
            id=sc.nextInt();

            System.out.println("enter the name");
            name=sc.next();
            System.out.println("enter the no of matchplayed");
            matchplayed=sc.nextInt();
            System.out.println("enter the no of runs");
            runs=sc.nextInt();
            System.out.println("enter the no of wickets taken");
            wicket=sc.nextInt();
            System.out.println("enter the playertype");
            playertype=sc.next();
            System.out.println("enter the zeroout");
            zeroscore=sc.nextInt();

            data.add(new TeamDetails(id,name,matchplayed,runs,wicket,playertype,zeroscore));


        }
        System.out.println("1.Display all players"+"  2.Update player information by name"+"  3.Display final team"+"  4.Add player information"+"  5.exit");
        System.out.println("enter the menu option");
        x=sc.nextInt();
        switch(x){
            case 1:
                 Collections.sort(data,new SortByName());
                 break;
            case 2:
                 Updation(data);
                 break;
            case 3:
                 displayfinalteam(data);
                 break;
            case 4:
                 AddDetails(data);
                 break;
            case 5:
                exit(0);
            default:
                System.out.println("enter the correct choice");


                 
        }




    }

    private static void AddDetails(List data) {
    }

    private static void displayfinalteam(List data) {
    }

    private static void Updation(List data) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name to be updated");
        String newname=sc.next();
        TeamDetails ob=data.get(newname);

    }


}
