package org.cricketeam1;


import java.util.*;
import java.util.stream.Collectors;
class SortByName implements Comparator<TeamDetails> {
    public int compare(TeamDetails name1, TeamDetails name2){
        return name1.getName().compareTo(name2.getName());
    }
}
class AverageScore implements Comparator<TeamDetails>{

    @Override
    public int compare(TeamDetails player1, TeamDetails player2) {
        return (int) (player1.getAverageScore() - player2.getAverageScore());
    }
}
public class MenuOptions {
    static Map<String,TeamDetails> allPlayers;
    static Map<String,TeamDetails> selectedTeam;

    public MenuOptions(Map<String, TeamDetails> allPlayers, Map<String, TeamDetails> selectedTeam) {
        this.allPlayers = allPlayers;
        this.selectedTeam = selectedTeam;
    }

    public static void displaySinglePlayer(TeamDetails ob){
        System.out.println(ob.getId() + "\t" + ob.getName() + "\t" + ob.getMatchplayed() + "\t" + ob.getRuns() + "\t" + ob.getWicket() +"\t" + ob.getZeroscore() + "\t" + ob.getPlayertype());
    }

    public static void displayAllPlayers(){
        System.out.println("All Players: ");
        System.out.println("Jersey-Number\tName\tMatches-Played\tRuns-Scored\tWickets-Taken\tDucks\tPlayer-type");
        allPlayers.values().stream().collect(Collectors.toList()).stream().sorted(new SortByName()).forEach(player -> displaySinglePlayer(player));
    }

    public static boolean acceptAllPlayerDetails(){

        allPlayers.clear();
        selectedTeam.clear();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 20 players information ensuring at least 3 bowlers and 1 wicketkeeper.");
        int numberOfBowlers = 0;
        int numberOfWicketkeeper = 0;
        for(int i =0 ; i < 20; i++)
        {
            TeamDetails t = new TeamDetails();
            System.out.println("Enter player jersey number.");
            t.setId(sc.nextInt());
            sc.nextLine();
            System.out.println("Enter player name.");
            t.setName(sc.nextLine());
            System.out.println("Enter number of matches played.");
            t.setMatchplayed(sc.nextInt());
            System.out.println("Enter number of runs scored.");t.setRuns(sc.nextInt());
            t.setAverageScore((double) (t.getRuns()/ t.getMatchplayed()));
            System.out.println("Enter number of wickets taken.");
            t.setWicket(sc.nextInt());
            System.out.println("Enter number of outs on zero.");
            t.setZeroscore(sc.nextInt());
            System.out.println("Enter type of player-  1: Bowler , 2: Batsman , 3:Wicket-Keeper , 4: All-Rounder");
            switch (sc.nextInt()){
                case 1:
                    t.setPlayertype("Bowler");
                    numberOfBowlers++;
                    break;
                case 2:
                    t.setPlayertype("Batsman");
                    break;
                case 3:
                    t.setPlayertype("Wicket-Keeper");
                    numberOfWicketkeeper++;
                    break;
                case 4:
                    t.setPlayertype("All-Rounder");
                    break;
                default:
                    System.out.println("Player is set as batsman.");
                    t.setPlayertype("Batsman");
                    break;

            }
            allPlayers.put(t.getName(),t);
        }

        if(numberOfBowlers>=3 && numberOfWicketkeeper>=1)
            return true;
        else
            return false;
    }

    public void setAllPlayers(){
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


        allPlayers.put(p1.getName(),p1);
        allPlayers.put(p2.getName(),p2);
        allPlayers.put(p3.getName(),p3);
        allPlayers.put(p4.getName(),p4);
        allPlayers.put(p5.getName(),p5);
        allPlayers.put(p6.getName(),p6);
        allPlayers.put(p7.getName(),p7);
        allPlayers.put(p8.getName(),p8);
        allPlayers.put(p9.getName(),p9);
        allPlayers.put(p10.getName(),p10);
        allPlayers.put(p11.getName(),p11);
        allPlayers.put(p12.getName(),p12);
        allPlayers.put(p13.getName(),p13);
        allPlayers.put(p14.getName(),p14);
        allPlayers.put(p15.getName(),p15);
        allPlayers.put(p16.getName(),p16);
        allPlayers.put(p17.getName(),p17);
        allPlayers.put(p18.getName(),p18);
        allPlayers.put(p19.getName(),p19);
        allPlayers.put(p20.getName(),p20);

        Iterator<Map.Entry<String,TeamDetails>> iterator = allPlayers.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,TeamDetails> data = iterator.next();
            TeamDetails ob = data.getValue();
            ob.setAverageScore((double) (ob.getRuns()/ob.getMatchplayed()));
        }

    }

    public static void updatePlayerByName() throws PlayerNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Player name to be updated.");
        String playerName = sc.nextLine();


        TeamDetails ob = allPlayers.get(playerName);
        if(ob == null){
            PlayerNotFoundException playerNotFoundException = new PlayerNotFoundException("Player with same name not found.");
            throw (playerNotFoundException);
        }

        allPlayers.remove(playerName);

        System.out.println("Enter updated number.");
        ob.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter updated player name.");
        ob.setName(sc.nextLine());
        System.out.println("Enter updated number of matches played.");
        ob.setMatchplayed(sc.nextInt());
        System.out.println("Enter updated number of runs scored.");
        ob.setRuns(sc.nextInt());
        System.out.println("Enter updated number of wickets taken.");
        ob.setWicket(sc.nextInt());
        System.out.println("Enter updated number of outs on zero.");
        ob.setZeroscore(sc.nextInt());
        System.out.println("Enter updated type of player-  1: Bowler , 2: Batsman , 3:Wicket-Keeper , 4: All-Rounder");
        switch (sc.nextInt()){
            case 1:
                ob.setPlayertype("Bowler");
                break;
            case 2:
                ob.setPlayertype("Batsman");
                break;
            case 3:
                ob.setPlayertype("Wicket-Keeper");
                break;
            case 4:
                ob.setPlayertype("All-Rounder");
                break;
            default:
                System.out.println("Player is set as batsman.");
                ob.setPlayertype("Batsman");
                break;
        }

        allPlayers.put(ob.getName(),ob);
    }

    public static void selectTeam(){
        int numberOfBowlers =0;
        int numberOfWicketkeeper = 0;
        int selectedPlayers = 0;
        List<   TeamDetails> playerList = allPlayers.values().stream().collect(Collectors.toList()).stream().sorted(new AverageScore()).collect(Collectors.toList());

        Iterator<TeamDetails> iterator = playerList.listIterator();
        while(iterator.hasNext() && selectedPlayers<=11){
            TeamDetails player = iterator.next();
            if(selectedPlayers<7){
                if(player.getPlayertype().equals("Wicket-Keeper"))
                    numberOfWicketkeeper++;
                if(player.getPlayertype().equals("Bowler"))
                    numberOfBowlers++;
                selectedTeam.put(player.getName(),player);
                selectedPlayers++;
            }
            else{
                if(numberOfBowlers>=3 && numberOfWicketkeeper>=1){
                    selectedTeam.put(player.getName(),player);
                    selectedPlayers++;
                }
                else if(numberOfWicketkeeper==0 && player.getPlayertype().equals("Wicket-Keeper")){
                    numberOfWicketkeeper++;
                    selectedPlayers++;
                    selectedTeam.put(player.getName(),player);
                }
                else if(numberOfBowlers<3 && player.getPlayertype().equals("Bowler")){
                    numberOfBowlers++;
                    selectedPlayers++;
                    selectedTeam.put(player.getName(),player);
                }
                else if(numberOfBowlers<3 && numberOfWicketkeeper==0 && (player.getPlayertype().equals("Wicket-Keeper") || player.getPlayertype().equals("Bowler")))
                {
                    selectedPlayers++;
                    selectedTeam.put(player.getName(),player);
                    if(player.getPlayertype().equals("Wicket-Keeper"))
                        numberOfWicketkeeper++;
                    if(player.getPlayertype().equals("Bowler"))
                        numberOfBowlers++;
                }
            }
        }

        displayFinalTeam();
    }

    public static void displayFinalTeam(){
        System.out.println("Final Players: ");
        System.out.println("Id\tName\tMatches-Played\tRuns-Scored\tWickets-Taken\tDucks\tPlayer-type");
        selectedTeam.values().stream().collect(Collectors.toList()).stream().sorted(new SortByName()).forEach(player -> displaySinglePlayer(player));
    }
}
