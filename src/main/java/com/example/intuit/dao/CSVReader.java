package com.example.intuit.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    public static final String delimiter = ",";
    public static List<Player> read(String csvFile) {
        List<Player> players= new ArrayList<>();
        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] tempArr;
            while((line = br.readLine()) != null) {
                tempArr = line.split(delimiter);
           //     for(String tempStr : tempArr) {
             //       System.out.print(tempStr + " ");
              //      String[] fields = tempStr.split(",");
                Player player = null;
                try {
                    player = new Player(tempArr);
                    players.add(player);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("player"+player);
            //    }

            }
            br.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
        return players;
}



}
