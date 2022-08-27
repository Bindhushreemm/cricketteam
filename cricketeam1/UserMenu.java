package org.cricketeam1;


import java.util.Map;
        import java.util.Scanner;
        import java.util.TreeMap;

public class UserMenu {
    public static void main(String[] args) throws PlayerNotFoundException {


        Map<String,TeamDetails> allPlayers = new TreeMap<>();
        Map<String,TeamDetails> selectedTeam = new TreeMap<>();
        MenuOptions ob= new MenuOptions(allPlayers,selectedTeam);

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println(" 1: Display All Players \n 2: Update Player Information By Name \n 3: Display Final Team \n 4: Add Player Information \n 5: Exit");
            switch (sc.nextInt()){
                case 1:
                    MenuOptions.displayAllPlayers();
                    break;
                case 2:
                    MenuOptions.updatePlayerByName();
                    break;
                case 3:
                    MenuOptions.selectTeam();
                    break;
                case 4:
                    while(! MenuOptions.acceptAllPlayerDetails()){
                        System.out.println("3 bowlers and 1 wicketkeeper must be added");
                    }

                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("select valid choice from above menu");
            }
        }
    }
}